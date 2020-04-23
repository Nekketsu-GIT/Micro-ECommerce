package esp.dgi.mglsi.GalleryService.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import esp.dgi.mglsi.GalleryService.dao.GalleryDao;
import esp.dgi.mglsi.GalleryService.dao.ProductDao;
import esp.dgi.mglsi.GalleryService.entities.Gallery;
import esp.dgi.mglsi.GalleryService.entities.Product;



@RestController
public class HomeController {
	
	@Autowired
    private ProductDao productDao;
	
	@Autowired
    private GalleryDao galleryDao;
	
	@GetMapping("/")
	public List<Gallery> listGallery() {
		return galleryDao.findAll();
		
	}
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return productDao.findAll();
	}
	
    //Récupérer un produit par son Id
    @GetMapping(value = "/Products/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        return productDao.findById(id);
    }
    
  //ajouter un produit
    @PostMapping(value = "/Products")
    public ResponseEntity<Void> ajouterProduit(@RequestBody Product product) {
        Product productAdded =  productDao.save(product);
        if (productAdded == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(productAdded.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
    
    //supprimer produit
    @DeleteMapping (value = "/Products/{id}")
    public void supprimerProduit(@PathVariable int id) {
        productDao.deleteById(id);
    }
    
    //mettre à jour produit
    @PutMapping (value = "/Products")
    public void updateProduit(@RequestBody Product product) {
        productDao.save(product);
    }
    
    //Récupérer les produits d'une gallerie
    @GetMapping(value = "{idGallery}")
    public List<Product> afficherProduitGallery(@PathVariable int idGallery) {
        return productDao.findByIdGallery(idGallery);
    }
}
