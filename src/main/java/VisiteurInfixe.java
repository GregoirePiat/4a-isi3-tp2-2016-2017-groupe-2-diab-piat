public class VisiteurInfixe implements Visiteur {

    public void visiterAddition(Addition addition) {
        addition.getOperateurGauche().accept(this);
        System.out.print(addition.getOperateur());
        addition.getOperateurDroit().accept(this);
    }

    public void visiterMultiplication(Multiplication multiplication) {

        multiplication.getOperateurGauche().accept(this);
        System.out.print(multiplication.getOperateur());
        multiplication.getOperateurDroit().accept(this);
    }

    public void visiterNegation(Negation negation) {
        System.out.print("(");
        System.out.print(negation.getOperateur());
        negation.getOperateurGauche().accept(this);
        System.out.print(")");
    }

    public void visiterConstante(Constante constante) {

        System.out.print(constante.getValeur());
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
