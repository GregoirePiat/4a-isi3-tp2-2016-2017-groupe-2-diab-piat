public class VisiteurPostfixe implements Visiteur {

    public void visiterAddition(Addition addition) {

        addition.getOperateurGauche().accept(this);
        addition.getOperateurDroit().accept(this);
        addition.getOperateur();

    }

    public void visiterMultiplication(Multiplication multiplication) {

    }

    public void visiterNegation(Negation negation) {

    }

    public void visiterConstante(Constante constante) {

    }

    public void visiterUnaire(OperateurUnaire operateurUnaire) {

    }

    public void visiterBinaire(OperateurBinaire operateurBinaire) {

    }
}
