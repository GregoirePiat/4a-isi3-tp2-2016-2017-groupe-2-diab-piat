public class VisiteurPostfixe implements Visiteur {

    public void visiterAddition(Addition addition) {

    }

    public void visiterMultiplication(Multiplication multiplication) {
        multiplication.getOperateurGauche().accept(this);
        multiplication.getOperateurDroit().accept(this);
        System.out.print(multiplication.getOperateur());
    }

    public void visiterNegation(Negation negation) {

    }

    public void visiterUnaire(OperateurUnaire operateurUnaire) {

        operateurUnaire.getOperateurGauche().accept(this);
        System.out.print(operateurUnaire.getOperateur());
    }

    public void visiterBinaire(OperateurBinaire operateurBinaire) {

        operateurBinaire.getOperateurGauche().accept(this);
        operateurBinaire.getOperateurDroit().accept(this);
        System.out.print(operateurBinaire.getOperateur());

    }
}
