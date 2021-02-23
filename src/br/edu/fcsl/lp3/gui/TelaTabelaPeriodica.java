package br.edu.fcsl.lp3.gui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import br.edu.fcsl.lp3.entidade.ElementoQuimico;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.ImageIcon;

public class TelaTabelaPeriodica extends JFrame {

	private static JPanel contentPane;
	private static JButton button;
	private static ElementoQuimico[] lista;
	private static JPanel panelGrade;
	private static JPanel panelInfo;
	private JPanel panelImagem;
	private JPanel panelLegenda;
	private JLabel lblLegenda;
	private JPanel panelMetaisTransi��o;
	private JPanel panelMetaisAlcalinos;
	private JPanel panelMetaisRepresentativos;
	private JPanel panelSemiMetais;
	private JPanel panelN�oMetais;
	private JPanel panelHalog�nios;
	private JPanel panelGasesNobres;
	private JPanel panelLantan�deos;
	private JPanel panelActin�deos;
	private JLabel lblLantan�deos;
	private JLabel lblGasesNobres;
	private JLabel lblHalog�nios;
	private JLabel lblN�oMetais;
	private JLabel lblSemiMetais;
	private JLabel lblActin�deos;
	private JLabel lblMetaisRepresentativos;
	private JLabel lblMetaisTransi��o;
	private JLabel lblMetaisAlcalinoterrosos;
	private JLabel lblMetaisAlcalinos;
	private JPanel panelAlcalinosTerrosos;
	private JLabel lblInformacoes;
	private JLabel label;

	/**
	 * Create the frame.
	 */
	public TelaTabelaPeriodica() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Leonardo\\Programa\u00E7\u00E3o\\Programa\u00E7\u00E3o Java\\Workspace\\LP3\\Tabela Peri\u00F3dica\\icon175x175.png"));
		setTitle("Tabela Peri\u00F3dica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 0, 1200, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setBackground(SystemColor.controlHighlight);

		panelGrade = new JPanel();
		panelGrade.setLayout(new GridLayout(10, 18));
		panelGrade.setBackground(contentPane.getBackground());

		panelInfo = new JPanel();
		panelInfo.setBackground(contentPane.getBackground());

		panelImagem = new JPanel();
		panelImagem.setBackground(contentPane.getBackground());

		panelLegenda = new JPanel();
		panelLegenda.setBackground(contentPane.getBackground());
		GroupLayout gl_panelInfo = new GroupLayout(panelInfo);
		gl_panelInfo
				.setHorizontalGroup(
						gl_panelInfo.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelInfo.createSequentialGroup().addGap(2)
										.addComponent(panelImagem, GroupLayout.PREFERRED_SIZE, 296,
												GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panelLegenda, GroupLayout.PREFERRED_SIZE, 841, GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		gl_panelInfo
				.setVerticalGroup(gl_panelInfo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelInfo.createSequentialGroup()
								.addGroup(gl_panelInfo.createParallelGroup(Alignment.TRAILING)
										.addComponent(panelLegenda, GroupLayout.PREFERRED_SIZE, 174,
												GroupLayout.PREFERRED_SIZE)
								.addComponent(panelImagem, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		// cria o panel com informa��es
		lblInformacoes = new JLabel("Informa\u00E7\u00F5es");
		lblInformacoes.setFont(new Font("Tahoma", Font.PLAIN, 15));

		label = new JLabel("");
		label.setIcon(new ImageIcon(
				"C:\\Users\\Leonardo\\Programa\u00E7\u00E3o\\Programa\u00E7\u00E3o Java\\Workspace\\LP3\\Tabela Peri\u00F3dica\\e.png"));
		GroupLayout gl_panelImagem = new GroupLayout(panelImagem);
		gl_panelImagem.setHorizontalGroup(gl_panelImagem.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelImagem.createSequentialGroup().addGap(106)
						.addComponent(lblInformacoes, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE).addGap(127))
				.addGroup(gl_panelImagem.createSequentialGroup().addGap(22)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(52, Short.MAX_VALUE)));
		gl_panelImagem.setVerticalGroup(gl_panelImagem.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelImagem.createSequentialGroup().addGap(5).addComponent(lblInformacoes)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 189, Short.MAX_VALUE).addContainerGap()));
		panelImagem.setLayout(gl_panelImagem);

		panelInfo.setLayout(gl_panelInfo);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(panelInfo, 0,
										0, Short.MAX_VALUE))
								.addComponent(panelGrade, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1164,
										GroupLayout.PREFERRED_SIZE))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(panelGrade, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelInfo, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		contentPane.setLayout(gl_contentPane);

		// muda o look and feel da tela para o nimbus
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		lista = ElementoQuimico.values();

		inicializarBotoes();

		criarLegenda();

	}

	// inicializa os bot�es com os elementos
	public static void inicializarBotoes() {
		// verifica cada posicao da grade
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 18; coluna++) {

				// controle de posicao
				boolean add = false;

				// percorre a lista de elementos quimicos
				for (ElementoQuimico elementoQuimico : lista) {
					final ElementoQuimico copiaElemento = elementoQuimico;
					// verifica se existe elemento nessa posicao da grade
					if (elementoQuimico.getLinha() == linha && elementoQuimico.getColuna() == coluna) {

						// add um button com informa��es do elemento quimico
						button = new JButton();
						button.setText("<html><center><h3>" + elementoQuimico.getNumeroAtomico() + "<br/>"
								+ elementoQuimico.getSimbolo() + "</h3></center></html>");
						button.setBackground(elementoQuimico.getCorFamilia());
						panelGrade.add(button);

						// funcao para pegar o elemento clicado
						button.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent arg0) {

								// exibir uma tela com informacoes do elemento
								TelaElementoQuimico tela = new TelaElementoQuimico(copiaElemento);
								tela.setVisible(true);
							}
						});

						// altera variavel de controle e finaliza la�o elementos
						add = true;
						break;
					}
				}
				// verifica se achou elemento nessa posicao
				if (add == false) {
					// verifica se � posicao dos Lantan�deos ou dos Actin�deos
					if (coluna == 2 && linha == 5) {
						JButton buttonL = new JButton("<html><center><b>57-71<br/>*</b></center></html>");
						buttonL.setBackground(new Color(186, 85, 211));
						panelGrade.add(buttonL);
					} else if (coluna == 2 && linha == 6) {
						JButton buttonA = new JButton("<html><center><b>89-103<br/>**</b></center></html>");
						buttonA.setBackground(new Color(238, 130, 238));
						panelGrade.add(buttonA);
					} else {
						// senao add um Jpanel
						JPanel panel = new JPanel();
						panel.setBackground(contentPane.getBackground());
						panelGrade.add(panel);
					}
				}
			}
		}
	}

	// cria o painel da legenda
	public void criarLegenda() {

		lblLegenda = new JLabel("Legenda:");
		lblLegenda.setFont(new Font("Tahoma", Font.BOLD, 20));

		// cria os paineis e seta as cores do tipos dos elementos
		panelMetaisTransi��o = new JPanel();
		panelMetaisTransi��o.setBackground(new Color(255, 105, 180));

		panelAlcalinosTerrosos = new JPanel();
		panelAlcalinosTerrosos.setBackground(Color.YELLOW);

		panelMetaisAlcalinos = new JPanel();
		panelMetaisAlcalinos.setBackground(new Color(255, 165, 0));

		panelMetaisRepresentativos = new JPanel();
		panelMetaisRepresentativos.setBackground(new Color(169, 169, 169));

		panelSemiMetais = new JPanel();
		panelSemiMetais.setBackground(new Color(60, 179, 113));

		panelN�oMetais = new JPanel();
		panelN�oMetais.setBackground(new Color(0, 255, 0));

		panelHalog�nios = new JPanel();
		panelHalog�nios.setBackground(new Color(0, 191, 255));

		panelGasesNobres = new JPanel();
		panelGasesNobres.setBackground(new Color(0, 139, 139));

		panelLantan�deos = new JPanel();
		panelLantan�deos.setBackground(new Color(186, 85, 211));

		panelActin�deos = new JPanel();
		panelActin�deos.setBackground(new Color(238, 130, 238));

		// cria os labels com os nomes dos tipos dos elementos
		lblLantan�deos = new JLabel("Lantan\u00EDdeos");

		lblGasesNobres = new JLabel("Gases nobres");

		lblHalog�nios = new JLabel("Halog\u00EAnios");

		lblN�oMetais = new JLabel("N\u00E3o-Metais");

		lblSemiMetais = new JLabel("Semi-Metais");

		lblActin�deos = new JLabel("Actin\u00EDdeos");

		lblMetaisRepresentativos = new JLabel("Metais Representativos");

		lblMetaisTransi��o = new JLabel("Metais de Transi\u00E7\u00E3o");

		lblMetaisAlcalinoterrosos = new JLabel("Metais Alcalino-terrosos");

		lblMetaisAlcalinos = new JLabel("Metais Alcalinos");

		GroupLayout gl_panelLegenda = new GroupLayout(panelLegenda);
		gl_panelLegenda.setHorizontalGroup(gl_panelLegenda.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLegenda.createSequentialGroup().addContainerGap().addGroup(gl_panelLegenda
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelLegenda.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelLegenda.createSequentialGroup()
										.addGroup(gl_panelLegenda.createParallelGroup(Alignment.LEADING)
												.addComponent(lblLegenda)
												.addGroup(gl_panelLegenda.createSequentialGroup()
														.addComponent(panelActin�deos, GroupLayout.PREFERRED_SIZE, 47,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(lblActin�deos, GroupLayout.PREFERRED_SIZE, 198,
																GroupLayout.PREFERRED_SIZE)))
										.addGap(38)
										.addGroup(gl_panelLegenda.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_panelLegenda.createParallelGroup(Alignment.LEADING)
														.addComponent(panelMetaisAlcalinos, GroupLayout.PREFERRED_SIZE,
																47, GroupLayout.PREFERRED_SIZE)
														.addComponent(panelMetaisTransi��o, GroupLayout.PREFERRED_SIZE,
																47, GroupLayout.PREFERRED_SIZE))
												.addComponent(panelMetaisRepresentativos, GroupLayout.PREFERRED_SIZE,
														47, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panelLegenda.createSequentialGroup()
										.addComponent(panelLantan�deos, GroupLayout.PREFERRED_SIZE, 47,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblLantan�deos,
												GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)))
						.addComponent(panelAlcalinosTerrosos, GroupLayout.PREFERRED_SIZE, 47,
								GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panelLegenda.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMetaisRepresentativos, GroupLayout.PREFERRED_SIZE, 198,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMetaisTransi��o, GroupLayout.PREFERRED_SIZE, 198,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMetaisAlcalinos, GroupLayout.PREFERRED_SIZE, 198,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMetaisAlcalinoterrosos, GroupLayout.PREFERRED_SIZE, 198,
										GroupLayout.PREFERRED_SIZE))
						.addGap(47)
						.addGroup(gl_panelLegenda.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelLegenda.createSequentialGroup()
										.addComponent(panelGasesNobres, GroupLayout.PREFERRED_SIZE, 47,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblGasesNobres,
												GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelLegenda.createSequentialGroup()
										.addComponent(panelHalog�nios, GroupLayout.PREFERRED_SIZE, 47,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblHalog�nios,
												GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelLegenda.createSequentialGroup()
										.addComponent(panelN�oMetais, GroupLayout.PREFERRED_SIZE, 47,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblN�oMetais,
												GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelLegenda.createSequentialGroup()
										.addComponent(panelSemiMetais, GroupLayout.PREFERRED_SIZE, 47,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblSemiMetais,
												GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_panelLegenda.setVerticalGroup(gl_panelLegenda.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelLegenda.createSequentialGroup().addContainerGap().addGroup(gl_panelLegenda
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelLegenda.createSequentialGroup()
								.addGroup(gl_panelLegenda.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblSemiMetais, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(panelSemiMetais, GroupLayout.PREFERRED_SIZE, 21,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
								.addGroup(gl_panelLegenda.createParallelGroup(Alignment.LEADING)
										.addComponent(panelN�oMetais, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE,
												21, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblN�oMetais, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelLegenda.createSequentialGroup()
								.addGroup(gl_panelLegenda.createParallelGroup(Alignment.LEADING)
										.addComponent(lblLegenda)
										.addGroup(gl_panelLegenda.createSequentialGroup().addGap(1)
												.addGroup(gl_panelLegenda.createParallelGroup(Alignment.LEADING)
														.addComponent(lblMetaisAlcalinos, GroupLayout.PREFERRED_SIZE,
																22, GroupLayout.PREFERRED_SIZE)
												.addComponent(panelMetaisAlcalinos, GroupLayout.PREFERRED_SIZE, 21,
														GroupLayout.PREFERRED_SIZE))))
								.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
								.addGroup(gl_panelLegenda.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblMetaisAlcalinoterrosos, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(panelAlcalinosTerrosos, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE))))
						.addGap(1)
						.addGroup(gl_panelLegenda.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLantan�deos, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panelLegenda.createSequentialGroup().addComponent(panelLantan�deos,
										GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panelLegenda.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panelLegenda.createSequentialGroup().addGap(5)
														.addGroup(gl_panelLegenda.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panelLegenda.createSequentialGroup()
																		.addGroup(gl_panelLegenda
																				.createParallelGroup(Alignment.TRAILING)
																				.addComponent(panelHalog�nios,
																						GroupLayout.PREFERRED_SIZE, 21,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(lblHalog�nios,
																						GroupLayout.PREFERRED_SIZE, 22,
																						GroupLayout.PREFERRED_SIZE))
																		.addGap(17)
																		.addGroup(gl_panelLegenda
																				.createParallelGroup(Alignment.TRAILING)
																				.addComponent(panelGasesNobres,
																						GroupLayout.PREFERRED_SIZE, 21,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(lblGasesNobres,
																						GroupLayout.PREFERRED_SIZE, 22,
																						GroupLayout.PREFERRED_SIZE)))
																.addGroup(gl_panelLegenda
																		.createParallelGroup(Alignment.TRAILING, false)
																		.addGroup(gl_panelLegenda
																				.createSequentialGroup()
																				.addComponent(lblMetaisTransi��o,
																						GroupLayout.PREFERRED_SIZE, 22,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.RELATED,
																						GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(lblMetaisRepresentativos,
																						GroupLayout.PREFERRED_SIZE, 22,
																						GroupLayout.PREFERRED_SIZE))
																		.addGroup(gl_panelLegenda
																				.createSequentialGroup()
																				.addComponent(panelMetaisTransi��o,
																						GroupLayout.PREFERRED_SIZE, 21,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(18).addComponent(
																						panelMetaisRepresentativos,
																						GroupLayout.PREFERRED_SIZE, 21,
																						GroupLayout.PREFERRED_SIZE)))))
												.addGroup(gl_panelLegenda.createSequentialGroup().addGap(33)
														.addGroup(gl_panelLegenda.createParallelGroup(Alignment.LEADING)
																.addComponent(lblActin�deos, GroupLayout.PREFERRED_SIZE,
																		22, GroupLayout.PREFERRED_SIZE)
																.addComponent(panelActin�deos,
																		GroupLayout.PREFERRED_SIZE, 21,
																		GroupLayout.PREFERRED_SIZE))))))
						.addGap(10)));
		panelLegenda.setLayout(gl_panelLegenda);
	}
}
