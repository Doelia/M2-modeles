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

### Séance 20/10

Mme. Huchard

- Cours de 1H30 sur OCL
  - Poly de 22 pages surligné avec les couleurs
- TP sur OCL : https://www.lirmm.fr/users/utilisateurs-lirmm/marianne-huchard/enseignement/idm-2015-2016/oclinecore
  - Fait sur mon PC
  - Tutoriel suivit à coup de clics
  - Plugin OCL pour créer des fichiers ".genmodel" et générer du Java
  - Manipulations :
    - new EMF Empty Project
    - new OCLinEcore file -> file.ecore
    - Modificatition avec d'éditeur EMF pour écrire du code et les contraintes
    - Clic droit sur Entry / Create Dynamic instance -> file.xmi
      - Quand on crée des instances, il test si les contraintes sont OK, fait des erreurs sinon
    - New / Other / EMF Generator Model -> fichier .genmodel
    - Clic droit sur .genmodel / Generate Model code pour générer le code java
      - Le code est très compliqué quand même...
  

### Séance du 03/11

Mme. Huchard

- Cours de 1H30 sur la suite de OCL (toujours le même poly)
- Suite TP OCL
  - Correction du modèle distribuée
  - Codage des contraintes des tortues

### Séance du 10/11
- TP3 sur la manipulation d'un modèle UML (http://www.lirmm.fr/~ferdjoukh/french/idm.html)
  - Export du code pour refactor à partir du métamodèle UML (fichier .ecore)
  - Manipulation d'un modèle UML : Déplacement de classes, ajout d'atributs...

### Séance du 17/11
- Direct TP4 (http://www.lirmm.fr/~ferdjoukh/french/idm.html)
  - Sur l'écriture d'un code qui transforme le modèle d'une state machine en modèle avec le patron State
  - Patron State : Instance générale avec un attribut de type "State" qui pointe vers le bon State
  - Réalisé à partir du refactor UML générée au TP3
  - TP terminé, fait dans le projet "TP3"

