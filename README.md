# M2-modeles
FMIN310 - Ingénierie dirigée par les modèles


## Résumé des cours

### Séance 15/09

- Cours d'introduction sur les méta modèles : http://www.lirmm.fr/content/download/9987/141059/file/cours1-M%C3%A9tamod%C3%A8les.pdf
- Pas de TD/TP

### Séance 22/09

- TD sur les méta modèles sur 3h (automates)
  - Méta modéle d'un automate depuis un texte
  - Instance du méta modèle (= représentation abstraite) depuis un automate (= représentation concrète)
  - [Méta méta modèle](https://raw.githubusercontent.com/Doelia/M2-modeles/master/cours/images/td1_metameta.png) (façon eCore à partir d'un [extrait du méta modèle](https://github.com/Doelia/M2-modeles/blob/master/cours/images/td1_metasimplified.png?raw=true) réalisé en 1.
- TP sur EMF sur la State Machine, avec un intervenant
  - Support de cours http://www.lirmm.fr/~ferdjoukh/docs/publis/IDM/coursEMF.pdf
  - TP : http://www.lirmm.fr/~ferdjoukh/docs/publis/IDM/tp1.pdf
    - Etapes principales
      - Installation de Eclipse Mars edition Modeling Tools + Extention Papyrus
      - Créer un nouveau projet "Modeling project"
      - Note : Vérifier la Perspective
      - Création d'un fichier ECore Diagramme en reprodusant le méta modél des automates
        - Create New / File / Other / ECore Model
        - Clic droit My.ecore -> Init. ECore Diagramm pour générer un My.aidr (représentation graphique)
      - Instantiation d'un exemple d'automate dans un fichier xmi (question 1.3)
        - Appeler le node vide (violet) "package" et mettre Uri à null
        - Clic droit sur Machine / Create dynamic Instance
        - Faire des clics droits sur les objets pour en créer d'autres

### Séance 29/09

Changement d'intervenant : Mme Huchard

- Mini cours résumé sur les méta models
  - Présentation du document descriptif du MM UML
- TD "Introduction au méta-modèle UML"
  - Création de modèles, transformation en méta modeles, instansation...
    - Exemple utilisé : Elements, packages, namespaces
  - Apprentissage des notations des MM
    - Subsets
    - Union
    - Redefine
- TD sur la multiplicité


### Séance 6/10

- TD de 1h30 avec Mme Nebut (type partiel)
  - Instantiation en synthaxe abstraite d'un automate à partir du méta modèle UML des machines à état
- Suite et fin TP2


### Séance 13/10

- [TP2 Manipulation de modèles en EMF/Java](http://www.lirmm.fr/~ferdjoukh/docs/publis/IDM/tp2.pdf) directement, sans cours
  - Génération de code Java à partir d'un modéle et utilisation
  - TP terminé en 1 heure

