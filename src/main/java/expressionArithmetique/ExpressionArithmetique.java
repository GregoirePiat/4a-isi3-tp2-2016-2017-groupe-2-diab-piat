package expressionArithmetique;

import arbreBinaire.Noeud;
import visiteur.*;

import java.util.OptionalInt;

public class ExpressionArithmetique {
	private Noeud racine;
	
	public ExpressionArithmetique(Noeud racine){
		this.racine = racine;
	}

	public Noeud getRacine() {
		return racine;
	}

	public void afficherPostFixe() {
		System.out.println("\n postfixe:");

		VisiteurPostfixe visiteurPostfixe = new VisiteurPostfixe();
		this.getRacine().accept(visiteurPostfixe);
	}

	public void afficherPrefixe() {
		System.out.println("\n prefixe:");

		VisiteurPrefixe visiteurPrefixe = new VisiteurPrefixe();
		this.getRacine().accept(visiteurPrefixe);
	}

	public int calculerValeur() {
		VisiteurCalculerValeur visiteurCalculerValeur = new VisiteurCalculerValeur();
		OptionalInt optionalInt = this.getRacine().accept(visiteurCalculerValeur);
		return optionalInt.isPresent() ? optionalInt.getAsInt() : 0;
	}

	public int calculerHauteur() {
		VisiteurCalculerHauteur visiteurCalculerHauteur = new VisiteurCalculerHauteur();
		OptionalInt optionalInt = this.getRacine().accept(visiteurCalculerHauteur);
		return optionalInt.isPresent() ? optionalInt.getAsInt() : 0;
	}
	public void afficherInFixe() {
		System.out.println("\n infixe:");
		VisiteurInfixe visiteurInfixe = new VisiteurInfixe();
		this.getRacine().accept(visiteurInfixe);
		
	}
	
}
