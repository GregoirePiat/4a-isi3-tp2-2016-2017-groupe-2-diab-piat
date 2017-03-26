import java.util.OptionalInt;

public class VisiteurPostfixe implements Visiteur {

    public OptionalInt visiterAddition(Addition addition) {
        addition.getOperateurGauche().accept(this);
        addition.getOperateurDroit().accept(this);
        System.out.print(addition.getOperateur());
        return OptionalInt.empty();
    }

    public OptionalInt visiterMultiplication(Multiplication multiplication) {

        multiplication.getOperateurGauche().accept(this);
        multiplication.getOperateurDroit().accept(this);
        System.out.print(multiplication.getOperateur());
        return OptionalInt.empty();
    }

    public OptionalInt visiterNegation(Negation negation) {
        negation.getOperateurGauche().accept(this);
        System.out.print(negation.getOperateur());
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
