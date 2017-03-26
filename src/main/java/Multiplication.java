import java.util.OptionalInt;

public class Multiplication extends OperateurBinaire{

	public Multiplication( Noeud ng, Noeud nd) {
		super("*", ng, nd);
	}

	public OptionalInt accept(Visiteur v){
		return v.visiterMultiplication(this);
	}
}
