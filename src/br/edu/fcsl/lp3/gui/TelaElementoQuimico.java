package br.edu.fcsl.lp3.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import br.edu.fcsl.lp3.entidade.ElementoQuimico;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaElementoQuimico extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPanel panelNome;
	private JPanel panelInformacoes;
	private ElementoQuimico elementoQuimico;
	private JLabel lblNomeElemento;
	private JLabel lblMassaAtomica;
	private JLabel lblSimboloElemento;
	private JLabel lblNumeroElemento;
	private JLabel lblMassaAtomicaElemento;
	private JLabel lblSimbolo;
	private JLabel lblFamilia;
	private JLabel lblNumero;
	private JLabel lblFamiliaElemento;
	private JLabel lblEstadoFisico;
	private JLabel lblEstadoFisicoElemento;

	/**
	 * Create the dialog.
	 */
	public TelaElementoQuimico(ElementoQuimico element) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Leonardo\\Programa\u00E7\u00E3o\\Programa\u00E7\u00E3o Java\\Workspace\\LP3\\Tabela Peri\u00F3dica\\icon175x175.png"));
		setTitle("Elemento Qu\u00EDmico");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setBackground(new Color(220, 220, 220));

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

		elementoQuimico = element;

		panelNome = new JPanel();

		panelInformacoes = new JPanel();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(panelNome, GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
				.addGroup(gl_contentPanel.createSequentialGroup().addGap(10)
						.addComponent(panelInformacoes, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)
						.addGap(15)));
		gl_contentPanel
				.setVerticalGroup(
						gl_contentPanel.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
								gl_contentPanel.createSequentialGroup()
										.addComponent(panelNome, GroupLayout.PREFERRED_SIZE, 43,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panelInformacoes, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
										.addContainerGap()));
		panelInformacoes.setLayout(new GridLayout(0, 2, 0, 0));
		panelInformacoes.setBackground(contentPanel.getBackground());

		panelNome.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelNome.setBackground(contentPanel.getBackground());

		lblNomeElemento = new JLabel(elementoQuimico.getNome());
		lblNomeElemento.setFont(new Font("Tahoma", Font.BOLD, 20));
		panelNome.add(lblNomeElemento);

		lblNumero = new JLabel("N\u00FAmero At\u00F4mico");
		lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
		panelInformacoes.add(lblNumero);

		lblNumeroElemento = new JLabel(String.valueOf(elementoQuimico.getNumeroAtomico()));
		lblNumeroElemento.setHorizontalAlignment(SwingConstants.CENTER);
		panelInformacoes.add(lblNumeroElemento);

		lblSimbolo = new JLabel("S\u00EDmbolo");
		lblSimbolo.setHorizontalAlignment(SwingConstants.CENTER);
		panelInformacoes.add(lblSimbolo);

		lblSimboloElemento = new JLabel(elementoQuimico.getSimbolo());
		lblSimboloElemento.setHorizontalAlignment(SwingConstants.CENTER);
		panelInformacoes.add(lblSimboloElemento);

		lblMassaAtomica = new JLabel("Massa At\u00F4mica");
		lblMassaAtomica.setHorizontalAlignment(SwingConstants.CENTER);
		panelInformacoes.add(lblMassaAtomica);

		lblMassaAtomicaElemento = new JLabel(String.valueOf(elementoQuimico.getMassaAtomico()));
		lblMassaAtomicaElemento.setHorizontalAlignment(SwingConstants.CENTER);
		panelInformacoes.add(lblMassaAtomicaElemento);

		lblFamilia = new JLabel("Fam\u00EDlia");
		lblFamilia.setHorizontalAlignment(SwingConstants.CENTER);
		panelInformacoes.add(lblFamilia);

		lblFamiliaElemento = new JLabel(elementoQuimico.getFamilia());
		lblFamiliaElemento.setHorizontalAlignment(SwingConstants.CENTER);
		panelInformacoes.add(lblFamiliaElemento);

		lblEstadoFisico = new JLabel("Estado F\u00EDsico");
		lblEstadoFisico.setHorizontalAlignment(SwingConstants.CENTER);
		panelInformacoes.add(lblEstadoFisico);

		lblEstadoFisicoElemento = new JLabel(elementoQuimico.getEstadoFisico());
		lblEstadoFisicoElemento.setHorizontalAlignment(SwingConstants.CENTER);
		panelInformacoes.add(lblEstadoFisicoElemento);

		contentPanel.setLayout(gl_contentPanel);
	}
}
