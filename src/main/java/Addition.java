import java.util.OptionalInt;

public class Addition extends OperateurBinaire{
	public Addition(Noeud ng, Noeud nd) {
		super("+", ng, nd);
	}

	public OptionalInt accept(Visiteur v){ return v.visiterAddition(this); }
	

}
