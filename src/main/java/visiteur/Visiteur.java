package visiteur;

import arbreBinaire.*;

import java.util.OptionalInt;

public interface Visiteur {

    OptionalInt visiterAddition(Addition addition);

    OptionalInt visiterMultiplication(Multiplication multiplication);

    OptionalInt visiterNegation(Negation negation);

    OptionalInt visiterConstante(Constante constante);

    OptionalInt visiterUnaire(OperateurUnaire operateurUnaire);

    OptionalInt visiterBinaire(OperateurBinaire operateurBinaire);
}
