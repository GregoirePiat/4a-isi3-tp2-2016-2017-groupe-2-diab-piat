**Nom/Prénom Etudiant 1 :** DIAB Nicolas
**Nom/Prénom Etudiant 2 :** PIAT Grégoire

# Rapport TP2

## Question 1
*Insérer un schéma du patron de conception mis en place*
![Graph](images/ClassDiagram.png)

## Question 2

```java

public void visiterAddition(Addition addition) {
    addition.getOperateurGauche().accept(this);
    addition.getOperateurDroit().accept(this);
    System.out.print(addition.getOperateur());
}
```
Dans cette méthode du VisiteurPostfixe, nous affichons d'abord les opérateurs autour de l'opérateur d'addition, puis nous affichons le "+". Une fois que le visiteur passera, l'affichage s'effectuera.
```java
public void visiterMultiplication(Multiplication multiplication) {

    multiplication.getOperateurGauche().accept(this);
    multiplication.getOperateurDroit().accept(this);
    System.out.print(multiplication.getOperateur());
}
```
Le fonctionnement de la méthode visiterMultiplication est similaire à la méthode visiterAddition pour le VisiteurPostfixe.
```java
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
```




## Question 3
*Expliquer le code ajouté*

## Question 4
*Expliquer le code ajouté*

## Question 5
*Expliquer le code ajouté*

## Question 6
*Expliquer le code ajouté*
