import java.util.OptionalInt;

public class VisiteurCalculerHauteur implements Visiteur {
    public OptionalInt visiterAddition(Addition addition) {
        return OptionalInt.empty();
    }

    public OptionalInt visiterMultiplication(Multiplication multiplication) {
        return OptionalInt.empty();
    }

    public OptionalInt visiterNegation(Negation negation) {
        return OptionalInt.empty();
    }

    public OptionalInt visiterConstante(Constante constante) {
        return OptionalInt.empty();
    }

    public OptionalInt visiterUnaire(OperateurUnaire operateurUnaire) {
        return OptionalInt.empty();
    }

    public OptionalInt visiterBinaire(OperateurBinaire operateurBinaire) {
        return OptionalInt.empty();
    }
}
