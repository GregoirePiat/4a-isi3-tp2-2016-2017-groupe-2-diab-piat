package arbreBinaire;

import visiteur.Visiteur;

import java.util.OptionalInt;

public class Constante implements Noeud {
	private int valeur;
	public Constante(int v){
		valeur = v;
	}
	public int getValeur(){return valeur;}

	public OptionalInt accept(Visiteur v){
		return v.visiterConstante(this);
	}

}
