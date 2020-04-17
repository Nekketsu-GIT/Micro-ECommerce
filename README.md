"# Micro-ECommerce" 

Il y a 4 microservices: le serveur Eureka permet d'enregister l'ensemble des informations des microservices en execution, les microservices gallerie et produits communique via le microservice zuul(gateway).

Chaque microservice,est un projet en soi. Ouvrir chaque microservices sur eclipse( n'importe quel IDE), executer tous les microservices. Le serveur Eureka est accessible alors à http://localhost:8761/, vous devriez voir les microservices executés.

Allez à l'adresse http://localhost:8762/gallery pour communiquer avec le microservice gallerie, pour acceder à une galerie http://localhost:8762/gallery/1

Voila c'est tout pour le moment, On accede par le gateway au microservice gallerie, qui communique avec le microservice produit pour afficher les produits dans une gallerie.