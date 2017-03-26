package visiteur;

import arbreBinaire.*;
import visiteur.Visiteur;

import java.util.OptionalInt;

public class VisiteurPrefixe implements Visiteur {

    public OptionalInt visiterAddition(Addition addition) {
        System.out.print(addition.getOperateur());
        addition.getOperateurGauche().accept(this);
        addition.getOperateurDroit().accept(this);
        return OptionalInt.empty();
    }

    public OptionalInt visiterMultiplication(Multiplication multiplication) {

        System.out.print(multiplication.getOperateur());
        multiplication.getOperateurGauche().accept(this);
        multiplication.getOperateurDroit().accept(this);
        return OptionalInt.empty();
    }

    public OptionalInt visiterNegation(Negation negation) {
        System.out.print(negation.getOperateur());
        negation.getOperateurGauche().accept(this);
        return OptionalInt.empty();
    }

    public OptionalInt visiterConstante(Constante constante) {

        System.out.print(constante.getValeur());
        return OptionalInt.empty();
    }

    public OptionalInt visiterUnaire(OperateurUnaire operateurUnaire) {

        System.out.print(operateurUnaire.getOperateur());
        operateurUnaire.getOperateurGauche().accept(this);
        return OptionalInt.empty();
    }

    public OptionalInt visiterBinaire(OperateurBinaire operateurBinaire) {

        System.out.print(operateurBinaire.getOperateur());
        operateurBinaire.getOperateurGauche().accept(this);
        operateurBinaire.getOperateurDroit().accept(this);
        return OptionalInt.empty();

    }
}
