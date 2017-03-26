package visiteur;

import arbreBinaire.*;

import java.util.OptionalInt;

public class VisiteurCalculerHauteur implements Visiteur {
    public OptionalInt visiterAddition(Addition addition) {
        return this.visiterBinaire(addition);
    }

    public OptionalInt visiterMultiplication(Multiplication multiplication) {
        return this.visiterBinaire(multiplication);
    }

    public OptionalInt visiterNegation(Negation negation) {
        return this.visiterUnaire(negation);
    }

    public OptionalInt visiterConstante(Constante constante) {
        return OptionalInt.of(1);
    }

    public OptionalInt visiterUnaire(OperateurUnaire operateurUnaire) {
        OptionalInt hauteur = operateurUnaire.getOperateurGauche().accept(this);
        if (hauteur.isPresent())
            return OptionalInt.of(hauteur.getAsInt() + 1);
        return OptionalInt.empty();
    }

    public OptionalInt visiterBinaire(OperateurBinaire operateurBinaire) {
        OptionalInt hauteurGauche = operateurBinaire.getOperateurGauche().accept(this);
        OptionalInt hauteurDroit = operateurBinaire.getOperateurDroit().accept(this);

        if (hauteurGauche.isPresent() && hauteurDroit.isPresent())
            return OptionalInt.of(Math.max(hauteurGauche.getAsInt(), hauteurDroit.getAsInt()) + 1);
        return OptionalInt.empty();
    }
}
