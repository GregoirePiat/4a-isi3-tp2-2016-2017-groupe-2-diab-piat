public class Multiplication extends OperateurBinaire{

	public Multiplication( Noeud ng, Noeud nd) {
		super("*", ng, nd);
	}

	public void Accept(Visiteur v){
		v.visiterMultiplication(this);
	}
}
