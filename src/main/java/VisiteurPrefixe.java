public class VisiteurPrefixe implements Visiteur {

    public void visiterAddition(Addition addition) {
        System.out.print(addition.getOperateur());
        addition.getOperateurGauche().accept(this);
        addition.getOperateurDroit().accept(this);
    }

    public void visiterMultiplication(Multiplication multiplication) {

        System.out.print(multiplication.getOperateur());
        multiplication.getOperateurGauche().accept(this);
        multiplication.getOperateurDroit().accept(this);
    }

    public void visiterNegation(Negation negation) {
        System.out.print(negation.getOperateur());
        negation.getOperateurGauche().accept(this);
    }

    public void visiterConstante(Constante constante) {

        System.out.print(constante.getValeur());
    }

    public void visiterUnaire(OperateurUnaire operateurUnaire) {

        System.out.print(operateurUnaire.getOperateur());
        operateurUnaire.getOperateurGauche().accept(this);
    }

    public void visiterBinaire(OperateurBinaire operateurBinaire) {

        System.out.print(operateurBinaire.getOperateur());
        operateurBinaire.getOperateurGauche().accept(this);
        operateurBinaire.getOperateurDroit().accept(this);

    }
}
