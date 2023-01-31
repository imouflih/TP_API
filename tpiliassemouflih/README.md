# TP - Iliasse MOUFLIH

## Spring Web

C'est un module de Spring Framework qui facilite la création d'applications web en utilisant des technologies telles que JavaServer Faces, Spring MVC, en offrant des outils pour simplifier la configuration et l'intégration de différentes technologies web.

## Spring Data JPA

C'est un module de Spring Framework qui simplifie la gestion des données en utilisant JPA, fournit des outils pour les requêtes automatisées et la persistance des données en utilisant des objets Java plutôt que du code SQL manuel.

## Hibernate

C'est un framework ORM pour Java qui permet de gérer la persistance des données en utilisant JPA. Il facilite l'accès aux données en mappant les objets Java aux tables de la base de données, en générant automatiquement les requêtes SQL et en gérant les transactions de manière transparente.

## Thymeleaf

C'est un moteur de template pour les applications web qui permet de créer des vues en combinant des fichiers HTML et des expressions Java pour générer du contenu dynamique.

## H2 database

C'est un système de gestion de bases de données relationnelles écrit en Java qui peut être utilisé comme une base de données embarquée pour des applications web.

## DevTools

C'est un ensemble d'outils pour les développeurs Spring qui facilite le développement et le débogage d'applications web en fournissant des fonctionnalités telles que rechargement automatique, détection automatique des modifications et prise en charge de l'environnement de développement.

## Questions TP 3:

### Etape 13

1. Nous avons paramétré l'url d'appel /greeting dans : @GetMapping("/greeting")
2. Nous avons choisi le fichier HTML à afficher dans : return "greeting";
3. Nous envoyons le nom à qui nous disons bonjour avec le second lien à travers l'URL et après c'est passé à la vue grace au Model.addAttribute() qui remplace ${nomTemplate} par name

### Etape 17

Au démarrage de l'application, Hibernate utilise ces annotations pour générer un script SQL qui crée la table avec les colonnes et les contraintes de clé étrangère adéquates, puis exécute ce script pour la créer effectivement dans la base de données.

### Etape 20

Je peux voir tout le contenu de data.sql

### Etape 22

L'annotation @Autowired de Spring automatise l'injection de dépendance des répositories en créant automatiquement une instance de la classe correspondante et en l'injectant dans la variable déclarée avec cette annotation.

### Etape 30

Pour utiliser Bootstrap, j'ai intégré les fichiers de feuilles de styles et de scripts Bootstrap en provenance de la page officielle, dans les pages où j'ai besoin de Bootstrap.