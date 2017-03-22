public class Addition extends OperateurBinaire{
	public Addition(Noeud ng, Noeud nd) {
		super("+", ng, nd);
	}

	public void Accept(Visiteur v){
		v.visiterAddition(this);
	}
	

}
