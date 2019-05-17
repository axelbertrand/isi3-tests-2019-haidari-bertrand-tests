Nom Etudiant 1: Axel BERTRAND

Nom Etudiant 2: Omran Haidari

# **ISI 3 : Tests Unitaires** #


## **Exercice 1: L'approche TDD sur le Fizz Buzz Kata** ##

> Qu'est ce qu'un test boite noire ?

Un test boîte noire est un test qui permet de tester uniquement les fonctionnalités d'une application, notamment lorsque
l'on ne connaît pas son implémentation. C'est-à-dire qu'il permet de savoir si l'application "fait ce qu'elle est censée 
faire".

> Qu'est ce qu'un test boite blanche ?

Un test boîte blanche est un test qui examine le fonctionnement d'une application, mais également sa structure interne.
Autrement dit, ce sont l'ensemble des composants (instructions, exceptions, erreurs) qui sont testés avec des tests 
structurels, et donc en connaissance de son implémentation. De plus, cette méthode peut être appliquée pour les tests 
unitaires, les tests d’intégration et les tests système.

> Comment pourriez vous définir l'approche TDD ? Comment avez-vous travaillé ? Qu'en pensez-vous ?

L'approche TDD est une méthode de développement qui consiste, de manière itérative, à écrire chaque test (souvent 
unitaire) avant d'écrire le code source lui-même. Elle impose d'aller vers des éléments très "micro", c'est-à-dire penser
à tous les sous-éléments nécessaires pour développer une fonctionnalité.

Pour ce TP, nous avons tenté l'approche TDD. En effet, nous avons créé une fonction qui teste notre méthode fizzBuzz() 
puis nous avons appliqué les règles définies ci-dessus, une par une, en faisant évoluer la fonction de test. 

Cette méthode permet de prendre en compte les différentes règles une par une, puis tester chaque règle et enfin de faire 
passer le test.

> Qu'apporte l'usage de tests dans cet exercice ?

Cet exercice permet de s'assurer que pour chaque valeur, la bonne règle est appliquée.


## **Exercice 2 : Tests unitaires et mock** ##

>Si on a la volonté de faire des tests unitaires, cette situation est-elle normale ? Pourquoi ?

Non, car on ne veut pas tester si la classe Vector fonctionne bien dans les tests de la classe Person, mais on veut tester si la classe Person appelle les méthodes de Vector.

>Mockito permet de faire ici trois choses, lesquels ?

Mock : Crée une instance fictive d'un objet avec des valeurs nulles.

When : Définit une valeur (factice ou non) de retour de fonction pour une classe mockée.

Verify : Vérifie qu’une méthode a bien été appelée et que les interactions avec le mock sont celles attendues.