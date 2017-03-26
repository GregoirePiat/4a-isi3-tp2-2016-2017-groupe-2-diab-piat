**Nom/Prénom Etudiant 1 :** DIAB Nicolas
**Nom/Prénom Etudiant 2 :** PIAT Grégoire

# Rapport TP2

## Question 1
*Insérer un schéma du patron de conception mis en place*
![Graph](images/ClassDiagram.png)

## Question 2
*Expliquer le code ajouté*

## Question 3
```java

public void visiterAddition(arbreBinaire.Addition addition) {
    addition.getOperateurGauche().accept(this);
    addition.getOperateurDroit().accept(this);
    System.out.print(addition.getOperateur());
}
```
Dans cette méthode du visiteur.VisiteurPostfixe, nous affichons d'abord les opérateurs autour de l'opérateur d'addition, puis nous affichons le "+". Une fois que le visiteur passera, l'affichage s'effectuera.
```java
public void visiterMultiplication(arbreBinaire.Multiplication multiplication) {

    multiplication.getOperateurGauche().accept(this);
    multiplication.getOperateurDroit().accept(this);
    System.out.print(multiplication.getOperateur());
}

public void visiterBinaire(arbreBinaire.OperateurBinaire operateurBinaire) {

    operateurBinaire.getOperateurGauche().accept(this);
    operateurBinaire.getOperateurDroit().accept(this);
    System.out.print(operateurBinaire.getOperateur());

}
```
Le fonctionnement des méthodes visiterMultiplication et visiterBinaire sont similaires à la méthode visiterAddition pour le visiteur.VisiteurPostfixe.
```java
public void visiterNegation(arbreBinaire.Negation negation) {
    negation.getOperateurGauche().accept(this);
    System.out.print(negation.getOperateur());
}

public void visiterUnaire(arbreBinaire.OperateurUnaire operateurUnaire) {

    operateurUnaire.getOperateurGauche().accept(this);
    System.out.print(operateurUnaire.getOperateur());
}
```
Pour les négations, nous affichons d'abord l'opérateur gauche avant d'afficher le signe "-".

```java
public void visiterConstante(arbreBinaire.Constante constante) {

    System.out.print(constante.getValeur());
}
```
Enfin, les constantes sont simplement affichées.

Les autres visiteurs sont disponibles ici : [visiteur.VisiteurPrefixe.java](/src/main/java/VisiteurPrefixe.java) et [visiteur.VisiteurInfixe.java](/src/main/java/VisiteurInfixe.java)


## Question 4
*Expliquer le code ajouté*

## Question 5
*Expliquer le code ajouté*

## Question 6
*Expliquer le code ajouté*
