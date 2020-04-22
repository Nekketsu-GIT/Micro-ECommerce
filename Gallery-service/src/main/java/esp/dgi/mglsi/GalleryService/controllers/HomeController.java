package esp.dgi.mglsi.GalleryService.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import esp.dgi.mglsi.GalleryService.dao.GalleryDao;
import esp.dgi.mglsi.GalleryService.dao.ProductDao;
import esp.dgi.mglsi.GalleryService.entities.Gallery;
import esp.dgi.mglsi.GalleryService.entities.Product;



@RestController
public class HomeController {
	@Autowired
	private Environment env;
	
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
    @GetMapping(value = "/Product/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        return productDao.findById(id);
    }
    
    //Récupérer les produits d'une gallerie
    @GetMapping(value = "{idGallery}")
    public List<Product> afficherProduitGallery(@PathVariable int idGallery) {
        return productDao.findByIdGallery(idGallery);
    }
}
