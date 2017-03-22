public interface Visiteur {

    void visiterAddition(Addition addition);

    void visiterMultiplication(Multiplication multiplication);

    void visiterNegation(Negation negation);

    void visiterConstante(Constante constante);

    void visiterUnaire(OperateurUnaire operateurUnaire);

    void visiterBinaire(OperateurBinaire operateurBinaire);
}
