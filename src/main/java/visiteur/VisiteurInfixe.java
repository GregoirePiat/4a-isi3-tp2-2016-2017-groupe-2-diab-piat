package visiteur;

import arbreBinaire.*;
import visiteur.Visiteur;

import java.util.OptionalInt;

public class VisiteurInfixe implements Visiteur {

    public OptionalInt visiterAddition(Addition addition) {
        addition.getOperateurGauche().accept(this);
        System.out.print(addition.getOperateur());
        addition.getOperateurDroit().accept(this);
        return OptionalInt.empty();
    }

    public OptionalInt visiterMultiplication(Multiplication multiplication) {
        System.out.print("(");
        multiplication.getOperateurGauche().accept(this);
        System.out.print(")");

        System.out.print(multiplication.getOperateur());

        System.out.print("(");
        multiplication.getOperateurDroit().accept(this);
        System.out.print(")");
        return OptionalInt.empty();
    }

    public OptionalInt visiterNegation(Negation negation) {
        System.out.print("(");
        System.out.print(negation.getOperateur());
        negation.getOperateurGauche().accept(this);
        System.out.print(")");
        return OptionalInt.empty();
    }

    public OptionalInt visiterConstante(Constante constante) {

        System.out.print(constante.getValeur());
        return OptionalInt.empty();
    }

    public OptionalInt visiterUnaire(OperateurUnaire operateurUnaire) {

        operateurUnaire.getOperateurGauche().accept(this);
        System.out.print(operateurUnaire.getOperateur());
        return OptionalInt.empty();
    }

    public OptionalInt visiterBinaire(OperateurBinaire operateurBinaire) {

        operateurBinaire.getOperateurGauche().accept(this);
        operateurBinaire.getOperateurDroit().accept(this);
        System.out.print(operateurBinaire.getOperateur());
        return OptionalInt.empty();

    }
}
