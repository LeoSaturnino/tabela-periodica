package br.edu.fcsl.lp3.entidade;

import java.awt.Color;

public enum ElementoQuimico {
	H(0,0,1,"H","Hidrog�nio","N�o-Metais",new Color(0,255,0),"Gasoso",1.00794),
	He(0,17,2,"He","H�lio","Gases nobres",new Color(0,139,139),"Gasoso",4.002602),
	Li(1,0,3,"Li","L�tio","Metais alcalinos",new Color(255,165,0),"S�lido",6.941),
	Be(1,1,4,"Be","Ber�lio","Metais alcalino-terrosos",new Color(255,255,0),"S�lido",9.012182),
	B(1,12,5,"B","Boro","Semi-Metais",new Color(60,179,113),"S�lido",10.811),
	C(1,13,6,"C","Carbono","N�o-Metais",new Color(0,255,0),"S�lido",12.0107),
	N(1,14,7,"N","Nitrog�nio","N�o-Metais",new Color(0,255,0),"Gasoso",14.0067),
	O(1,15,8,"O","Oxig�nio","N�o-Metais",new Color(0,255,0),"Gasoso",15.9994),
	F(1,16,9,"F","Fl�or","Halog�nios",new Color(0,191,255),"Gasoso",18.9984032),
	Ne(1,17,10,"Ne","Ne�nio","Gases nobres",new Color(0,139,139),"Gasoso",20.1797),
	Na(2,0,11,"Na","S�dio","Metais alcalinos",new Color(255,165,0),"S�lido",22.98976928),
	Mg(2,1,12,"Mg","Magn�sio","Metais alcalino-terrosos",new Color(255,255,0),"S�lido",24.3050),
	Al(2,12,13,"Al","Alum�nio","Metais representativos",new Color(169,169,169),"S�lido",26.9815386),
	Si(2,13,14,"Si","Sil�cio","Semi-Metais",new Color(60,179,113),"S�lido",28.0855),
	P(2,14,15,"P","F�sforo","N�o-Metais",new Color(0,255,0),"S�lido",30.973762),
	S(2,15,16,"S","Enxofre","N�o-Metais",new Color(0,255,0),"S�lido",32.065),
	Cl(2,16,17,"Cl","Cloro","Halog�nios",new Color(0,191,255),"Gasoso",35.453),
	Ar(2,17,18,"Ar","Arg�nio","Gases nobres",new Color(0,139,139),"Gasoso",39.948),
	K(3,0,19,"K","Pot�ssio","Metais alcalinos",new Color(255,165,0),"S�lido",39.0983),
	Ca(3,1,20,"Ca","C�lcio","Metais alcalino-terrosos",new Color(255,255,0),"S�lido",40.078),
	Sc(3,2,21,"Sc","Esc�ndio","Metais de transi��o",new Color(255,105,180),"S�lido",44.955912),
	Ti(3,3,22,"Ti","Tit�nio","Metais de transi��o",new Color(255,105,180),"S�lido",47.867),
	V(3,4,23,"V","Van�dio","Metais de transi��o",new Color(255,105,180),"S�lido",50.9415),
	Cr(3,5,24,"Cr","Cromo","Metais de transi��o",new Color(255,105,180),"S�lido",51.9961),
	Mn(3,6,25,"Mn","Mangan�s","Metais de transi��o",new Color(255,105,180),"S�lido",54.938045),
	Fe(3,7,26,"Fe","Ferro","Metais de transi��o",new Color(255,105,180),"S�lido",55.845),
	Co(3,8,27,"Co","Cobalto","Metais de transi��o",new Color(255,105,180),"S�lido",58.933195),
	Ni(3,9,28,"Ni","N�quel","Metais de transi��o",new Color(255,105,180),"S�lido",58.6934),
	Cu(3,10,29,"Cu","Cobre","Metais de transi��o",new Color(255,105,180),"S�lido",63.546),
	Zn(3,11,30,"Zn","Zinco","Metais de transi��o",new Color(255,105,180),"S�lido",65.409),
	Ga(3,12,31,"Ga","G�lio","Metais representativos",new Color(169,169,169),"S�lido",69.723),
	Ge(3,13,32,"Ge","Germ�nio","Semi-Metais",new Color(60,179,113),"S�lido",72.64),
	As(3,14,33,"As","Ars�nio","Semi-Metais",new Color(60,179,113),"S�lido",74.92160),
	Se(3,15,34,"Se","Sel�nio","N�o-Metais",new Color(0,255,0),"S�lido",78.96),
	Br(3,16,35,"Br","Bromo","Halog�nios",new Color(0,191,255),"L�quido",79.904),
	Kr(3,17,36,"Kr","Cript�nio","Gases nobres",new Color(0,139,139),"Gasoso",83.798),
	Rb(4,0,37,"Rb","Rub�dio","Metais alcalinos",new Color(255,165,0),"S�lido",85.4678),
	Sr(4,1,38,"Sr","Estr�ncio","Metais alcalino-terrosos",new Color(255,255,0),"S�lido",87.62),
	Y(4,2,39,"Y","�trio","Metais de transi��o",new Color(255,105,180),"S�lido",88.90585),
	Zr(4,3,40,"Zr","Zirc�nio","Metais de transi��o",new Color(255,105,180),"S�lido",91.224),
	Nb(4,4,41,"Nb","Ni�bio","Metais de transi��o",new Color(255,105,180),"S�lido",92.90638),
	Mo(4,5,42,"Mo","Molibd�nio","Metais de transi��o",new Color(255,105,180),"S�lido",95.94),
	Tc(4,6,43,"Tc","Tecn�cio","Metais de transi��o",new Color(255,105,180),"S�lido",98),
	Ru(4,7,44,"Ru","Rut�nio","Metais de transi��o",new Color(255,105,180),"S�lido",101.07),
	Rh(4,8,45,"Rh","Rh�dio","Metais de transi��o",new Color(255,105,180),"S�lido",102.90550),
	Pd(4,9,46,"Pd","Pal�dio","Metais de transi��o",new Color(255,105,180),"S�lido",106.42),
	Ag(4,10,47,"Ag","Prata","Metais de transi��o",new Color(255,105,180),"S�lido",107.8682),
	Cd(4,11,48,"Cd","C�dmio","Metais de transi��o",new Color(255,105,180),"S�lido",112.411),
	In(4,12,49,"In","�ndio","Metais representativos",new Color(169,169,169),"S�lido",114.818),
	Sn(4,13,50,"Sn","Estanho","Metais representativos",new Color(169,169,169),"S�lido",118.710),
	Sb(4,14,51,"Sb","Antim�nio","Semi-Metais",new Color(60,179,113),"S�lido",121.760),
	Te(4,15,52,"Te","Tel�rio","Semi-Metais",new Color(60,179,113),"S�lido",128.60),
	I(4,16,53,"I","Iodo","Halog�nios",new Color(0,191,255),"S�lido",126.90447),
	Xe(4,17,54,"Xe","Xen�nio","Gases nobres",new Color(0,139,139),"Gasoso",131.293),
	Cs(5,0,55,"Cs","C�sio","Metais alcalinos",new Color(255,165,0),"S�lido",132.905451),
	Ba(5,1,56,"Ba","B�rio","Metais alcalino-terrosos",new Color(255,255,0),"S�lido",137.327),
	Hf(5,3,72,"Hf","H�lnio","Metais de transi��o",new Color(255,105,180),"S�lido",178.49),
	Ta(5,4,73,"Ta","T�ntalo","Metais de transi��o",new Color(255,105,180),"S�lido",180.94788),
	W(5,5,74,"W","Tungst�nio","Metais de transi��o",new Color(255,105,180),"S�lido",183.84),
	Re(5,6,75,"Re","R�nio","Metais de transi��o",new Color(255,105,180),"S�lido",186.207),
	Os(5,7,76,"Os","�smio","Metais de transi��o",new Color(255,105,180),"S�lido",190.23),
	Ir(5,8,77,"Ir","Ir�dio","Metais de transi��o",new Color(255,105,180),"S�lido",192.217),
	Pt(5,9,78,"Pt","Platina","Metais de transi��o",new Color(255,105,180),"S�lido",195.084),
	Au(5,10,79,"Au","Ouro","Metais de transi��o",new Color(255,105,180),"S�lido",196.966569),
	Hg(5,11,80,"Hg","Merc�rio","Metais de transi��o",new Color(255,105,180),"L�quido",200.59),
	Tl(5,12,81,"Tl","T�lio","Metais representativos",new Color(169,169,169),"S�lido",204.3833),
	Pb(5,13,82,"Pb","Chumbo","Metais representativos",new Color(169,169,169),"S�lido",207.2),
	Bi(5,14,83,"Bi","Bismuto","Metais representativos",new Color(169,169,169),"S�lido",208.98040),
	Po(5,15,84,"Po","Pol�nio","Semi-Metais",new Color(60,179,113),"S�lido",209),
	At(5,16,85,"At","Astato","Halog�nios",new Color(0,191,255),"S�lido",210),
	Rn(5,17,86,"Rn","Rad�nio","Gases nobres",new Color(0,139,139),"Gasoso",222),
	Fr(6,0,87,"Fr","Fr�ncio","Metais alcalinos",new Color(255,165,0),"S�lido",223),
	Ra(6,1,88,"Ra","R�dio","Metais alcalino-terrosos",new Color(255,255,0),"S�lido",226),
	Rf(6,3,104,"Rf","Ruterf�dio","Metais de transi��o",new Color(255,105,180),"S�lido",261),
	Db(6,4,105,"Db","D�bnio","Metais de transi��o",new Color(255,105,180),"Desconhecido",268),
	Sg(6,5,106,"Sg","Seab�rgio","Metais de transi��o",new Color(255,105,180),"Desconhecido",271),
	Bh(6,6,107,"Bh","B�hrio","Metais de transi��o",new Color(255,105,180),"Desconhecido",272),
	Hs(6,7,108,"Hs","H�ssio","Metais de transi��o",new Color(255,105,180),"Desconhecido",270),
	Mt(6,8,109,"Mt","Meitn�rio","Metais de transi��o",new Color(255,105,180),"Desconhecido",276),
	Ds(6,9,110,"Ds","Darmst�dio","Metais de transi��o",new Color(255,105,180),"Desconhecido",281),
	Rg(6,10,111,"Rg","Roentg�nio","Metais de transi��o",new Color(255,105,180),"Desconhecido",280),
	Cn(6,11,112,"Cn","Copern�cio","Metais de transi��o",new Color(255,105,180),"Desconhecido",285),
	La(8,3,57,"La","Lant�nio","Lantan�deos",new Color(186,85,211),"S�lido",138.90547),
	Ce(8,4,58,"Ce","C�rio","Lantan�deos",new Color(186,85,211),"S�lido",140.116),
	Pr(8,5,59,"Pr","Praseod�mio","Lantan�deos",new Color(186,85,211),"S�lido",140.90765),
	Nd(8,6,60,"Nd","Neod�mio","Lantan�deos",new Color(186,85,211),"S�lido",144.242),
	Pm(8,7,61,"Pm","Prom�cio","Lantan�deos",new Color(186,85,211),"Desconhecido",145),
	Sm(8,8,62,"Sm","sam�rio","Lantan�deos",new Color(186,85,211),"S�lido",150.36),
	Eu(8,9,63,"Eu","Eur�pio","Lantan�deos",new Color(186,85,211),"S�lido",151.964),
	Gd(8,10,64,"Gd","Gadol�nio","Lantan�deos",new Color(186,85,211),"S�lido",157.25),
	Tb(8,11,65,"Tb","T�rbio","Lantan�deos",new Color(186,85,211),"S�lido",158.92535),
	Dy(8,12,66,"Dy","Dispr�sio","Lantan�deos",new Color(186,85,211),"S�lido",162.5),
	Ho(8,13,67,"Ho","H�lmio","Lantan�deos",new Color(186,85,211),"S�lido",164.93032),
	Er(8,14,68,"Er","�rbio","Lantan�deos",new Color(186,85,211),"S�lido",167.259),
	Tm(8,15,69,"Tm","T�lio","Lantan�deos",new Color(186,85,211),"S�lido",168.93421),
	Yb(8,16,70,"Yb","It�rbio","Lantan�deos",new Color(186,85,211),"S�lido",173.054),
	Lu(8,17,71,"Lu","Lut�cio","Lantan�deos",new Color(186,85,211),"S�lido",174.9668),
	Ac(9,3,89,"Ac","Act�nio","Actin�deos",new Color(238,130,238),"S�lido",227),
	Th(9,4,90,"Th","T�rio","Actin�deos",new Color(238,130,238),"S�lido",232.03806),
	Pa(9,5,91,"Pa","Protact�nio","Actin�deos",new Color(238,130,238),"S�lido",231.03588),
	U(9,6,92,"U","Ur�nio","Actin�deos",new Color(238,130,238),"S�lido",238.02891),
	Np(9,7,93,"Np","Nept�nio","Actin�deos",new Color(238,130,238),"Desconhecido",237),
	Pu(9,8,94,"Pu","Plut�nio","Actin�deos",new Color(238,130,238),"Desconhecido",244),
	Am(9,9,95,"Am","Amer�cio","Actin�deos",new Color(238,130,238),"Desconhecido",243),
	Cm(9,10,96,"Cm","C�rio","Actin�deos",new Color(238,130,238),"Desconhecido",247),
	Bk(9,11,97,"Bk","Berqu�lio","Actin�deos",new Color(238,130,238),"Desconhecido",247),
	Cf(9,12,98,"Cf","Calif�rnio","Actin�deos",new Color(238,130,238),"Desconhecido",251),
	Es(9,13,99,"Es","Einst�nio","Actin�deos",new Color(238,130,238),"Desconhecido",252),
	Fm(9,14,100,"Fm","F�rmio","Actin�deos",new Color(238,130,238),"Desconhecido",257),
	Md(9,15,101,"Md","Mendel�vio","Actin�deos",new Color(238,130,238),"Desconhecido",258),
	No(9,16,102,"No","Nob�lio","Actin�deos",new Color(238,130,238),"Desconhecido",259),
	Lr(9,17,103,"Lr","Laur�ncio","Actin�deos",new Color(238,130,238),"Desconhecido",262);


	private int coluna;
	private int linha;
	private int numeroAtomico;
	private String simbolo;
	private String nome;
	private String familia;
	private Color corFamilia;
	private String estadoFisico;
	private double massaAtomico;

	private ElementoQuimico(int linha, int coluna, int numeroAtomico, String simbolo, String nome, String familia,
			Color corFamilia, String estadoFisico, double massaAtomico) {
		this.coluna = coluna;
		this.linha = linha;
		this.numeroAtomico = numeroAtomico;
		this.simbolo = simbolo;
		this.nome = nome;
		this.familia = familia;
		this.corFamilia = corFamilia;
		this.estadoFisico = estadoFisico;
		this.massaAtomico = massaAtomico;
	}

	public int getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	public int getNumeroAtomico() {
		return numeroAtomico;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public String getNome() {
		return nome;
	}

	public String getFamilia() {
		return familia;
	}

	public Color getCorFamilia() {
		return corFamilia;
	}

	public String getEstadoFisico() {
		return estadoFisico;
	}

	public double getMassaAtomico() {
		return massaAtomico;
	}

	@Override
	public String toString() {
		return "ElementoQuimico [coluna=" + coluna + ", linha=" + linha + ", numeroAtomico=" + numeroAtomico
				+ ", simbolo=" + simbolo + ", nome=" + nome + ", familia=" + familia + ", corFamilia="
				+corFamilia + ", estadoFisico=" + estadoFisico + ", massaAtomico=" + massaAtomico
				+ "]";
	}
}
