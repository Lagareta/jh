TP 2 :

- H2 Database SQL

H2 est une base de données qui peut être utilisée sur des applications Java. C'est une base de données qui ne persiste pas sur le disque.

- Spring Data JPA SQL

Spring Data JPA facilite l'implémentation des données JPA et donc la création d'applications Spring.

- Spring Web WEB

Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

- Spring Boot DevTools DEVELOPER TOOLS

Spring Boot Devtools permet de relancer rapidement les applications.

- Thymeleaf TEMPLATE ENGINES

Thymeleaf permet d'intégrer correctement de l'HTML au web.

- Validation I/O

Bean Validation with Hibernate validator.


Etape 13 :

1)  @GetMapping("/greeting")
    
   
2) @RequestParam( name =" nameGET ", required =false , defaultValue =" World ") String
   nameGET , Model com.tp.tp5.model )

3) com.tp.tp5.model.addAttribute("nomTemplate", nameGET )

Etape 17 : 

Une nouvelle table Address est apparue.

Etape 18 :

La nouvelle table a pu apparaître car on a utilisé les annotations @Entity, @Id et @GeneratedValue, permettant
d'utiliser hibernate pour gérer la base de données.

Etape 20 :

SELECT * FROM ADDRESS;

ID  	       CONTENT  	                                CREATION  
1	     57 boulevard demorieux 	               2021-11-12 15:30:49.041348
2	     51 allee du gamay , 34080 montpellier 	   2021-11-12 15:30:49.047332
(2 rows, 2 ms)


Etape 23 :

Le framework Spring permet l'injection automatique de dépendances. En d'autres termes, en déclarant toutes les
dépendances du bean dans un fichier de configuration Spring, le conteneur Spring peut lier automatiquement les
relations entre les beans collaborants.

Etape 30 :

Pour ajouter Bootstrap, j'ai suivi les étapes suivantes :

- Accédez à Bootstrap CDN et copiez le lien indiqué dans l'attribut href:
https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css
- Ouvrez le lien dans un nouvel onglet et copiez son contenu dans votre projet (de préférence dans un fichier sous 
resources/static)
- Ensuite, incluez ce fichier en utilisant la balise link dans les fichiers html:
link th:href="@{/CSS/bootstrap.min.css}" rel="stylesheet">


TP 4 :

Etape 6 :

- Il faut une clef API pour acceder à Meteo Concept car il nous est demandé de créer un compte.

- Il faut appeler : https://api.meteo-concept.com/api/forecast/daily?token=97ecc6007f7d58f4fe7d350e7409f973f549937a3d04e0971333a4c4fcb5fdc7&latlng=latitude,longitude"

- L'API fonctionne en GET, donc il faut utiliser cette méthode.

- Pour passer les paramètres d'appels, il faut les placer après le "=" dans l'url.

- Pour afficher la température du lieu visé par les coordonnées GPS, on va récupérer les températures min et max disponibles dans l'API Meteo Concepet. On établi une classe permettant de définir ces paramètres afin de pouvoir les afficher sur une page html en fonction de l'adresse (ville) rentrée par l'utilisateur.

- Pour afficher la prévision de météo du lieu visé par les coordonnées GPS, on va récupérer les jours et les prévisions météorologiques telle que la probabilité de pluie disponibles dans l'API Meteo Concepet. On établi une classe permettant de définir ces paramètres afin de pouvoir les afficher sur une page html en fonction de l'adresse (ville) rentrée par l'utilisateur.
