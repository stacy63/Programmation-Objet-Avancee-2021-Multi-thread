# isima-poa-2021-TP7-Varloteaux

Ce TP consistera à créer un générateur automatique et multi-threadé de données.
Les threads sont couramment utilisés dans le développement. Ils servent à paralléliser 
les traitements pour gagner en vitesse d’exécution et rendre plus réactifs les 
programmes. C’est donc une notion fondamentale à maîtriser. Ce concept sera illustré par
des étudiants. On va générer des étudiant aléatoirement de manière séquentielle, 
puis de manière multi-threadé à hauteur de trois thread pour comparer le 
temps d'execution entre les deux méthodes.

# Projet

Il s'agit d'un projet maven. openjdk-17 est utilisé pour ce projet.

# Détails

## model

Etudiant possédant plusieurs champs : identifiant national étudiant, nom, prénom, date de
naissance, lieu de naissance et un petit descriptif de leur parcours.

## utils

GenerateurUtils contient les outils pemettant de générer aléatoirement un 
nombre d'étudiant donnée. Elle possède donc un attribut liste des etudiants
dans laquelle on va stocker les étudiants générés. Pour simplifier la génération 
aléatoire, seul l'id de l'étudiant est changeant et aléatoire positif pour
chaque étudiant. Contient également une méthode de calcul de temps moyen 
d'exécution pour la version séquentielle. Concernant la version 
multi-threadée, on pourra voir l'utilisation de synchronized pour l'accès 
à l'attribut pour son remplissage.

## application

Execution de la génération aléatoire séquentielle puis multi-threadée avec affichage
des temps d'execution pour comparaison.
