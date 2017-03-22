**Nom/Prénom Etudiant 1 :** DIAB Nicolas
**Nom/Prénom Etudiant 2 :** PIAT Grégoire

# Rapport TP2

## Question 1
*Insérer un schéma du patron de conception mis en place*
![Graph](images/ClassDiagram.png)

## Question 2
*Expliquer le code ajouté*

’’’java
public class VisiteurPostfixe implements Visiteur {

    public void visiterAddition(Addition addition) {
        addition.getOperateurGauche().accept(this);
        addition.getOperateurDroit().accept(this);
        System.out.print(addition.getOperateur());
    }

    public void visiterMultiplication(Multiplication multiplication) {

        multiplication.getOperateurGauche().accept(this);
        multiplication.getOperateurDroit().accept(this);
        System.out.print(multiplication.getOperateur());
    }

    public void visiterNegation(Negation negation) {
        negation.getOperateurGauche().accept(this);
        System.out.print(negation.getOperateur());
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
’’’

## Question 3
*Expliquer le code ajouté*

## Question 4
*Expliquer le code ajouté*

## Question 5
*Expliquer le code ajouté*

## Question 6
*Expliquer le code ajouté*
