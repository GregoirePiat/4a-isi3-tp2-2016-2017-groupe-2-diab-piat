package arbreBinaire;

import visiteur.Visiteur;

import java.util.OptionalInt;

public class Negation extends OperateurUnaire {
	public Negation(Noeud n) {
		super("-", n);
	}

	public OptionalInt accept(Visiteur v){
		return v.visiterNegation(this);
	}
}
