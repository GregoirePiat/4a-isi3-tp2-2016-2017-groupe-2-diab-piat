public abstract class OperateurUnaire implements Noeud{
	private String op;
	private Noeud opG;
	
	OperateurUnaire(String s,Noeud n){
		op=s;
		opG=n;
	}
	public String getOperateur(){
		return op;
	}
	public Noeud getOperateurGauche(){
		return opG;
	}

	public void accept(Visiteur v){
		v.visiterUnaire(this);
	}

}
