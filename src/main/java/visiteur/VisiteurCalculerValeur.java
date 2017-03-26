package visiteur;

import arbreBinaire.*;
import visiteur.Visiteur;

import java.util.OptionalInt;

public class VisiteurCalculerValeur implements Visiteur {

    public OptionalInt visiterAddition(Addition addition) {
        OptionalInt optionalIntGauche = addition.getOperateurGauche().accept(this);
        OptionalInt optionalIntDroit = addition.getOperateurDroit().accept(this);

        if (optionalIntGauche.isPresent() && optionalIntDroit.isPresent())
            return OptionalInt.of(optionalIntGauche.getAsInt() + optionalIntDroit.getAsInt());
        return  OptionalInt.empty();
    }

    public OptionalInt visiterMultiplication(Multiplication multiplication) {
        OptionalInt optionalIntGauche = multiplication.getOperateurGauche().accept(this);
        OptionalInt optionalIntDroit = multiplication.getOperateurDroit().accept(this);

        if (optionalIntGauche.isPresent() && optionalIntDroit.isPresent())
            return OptionalInt.of(optionalIntGauche.getAsInt() * optionalIntDroit.getAsInt());
        return  OptionalInt.empty();
    }

    public OptionalInt visiterNegation(Negation negation) {
        OptionalInt optionalIntGauche = negation.getOperateurGauche().accept(this);

        if (optionalIntGauche.isPresent())
            return OptionalInt.of(- optionalIntGauche.getAsInt());
        return OptionalInt.empty();
    }

    public OptionalInt visiterConstante(Constante constante) {
        return OptionalInt.of(constante.getValeur());
    }

    public OptionalInt visiterUnaire(OperateurUnaire operateurUnaire) {
        return OptionalInt.empty();
    }

    public OptionalInt visiterBinaire(OperateurBinaire operateurBinaire) {
        return OptionalInt.empty();
    }
}
