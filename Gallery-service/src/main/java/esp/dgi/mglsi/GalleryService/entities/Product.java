package esp.dgi.mglsi.GalleryService.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import esp.dgi.mglsi.GalleryService.entities.Gallery;

@Entity
public class Product {
	
	@Id
    @GeneratedValue
	private int id;
	private int idGallery;
	private String name;
	private String image;
	private float prix;
	public int getId() {
		return id;
	}
	public Product() {
		
	}
	
	public Product(int id, int idGallery, String name, String image, float prix) {
		super();
		this.id = id;
		this.idGallery = idGallery;
		this.name = name;
		this.image = image;
		this.prix = prix;
	}
	public int getIdGallery() {
		return idGallery;
	}
	public void setIdGallery(int idGallery) {
		this.idGallery = idGallery;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public void setId(int id) {
		this.id = id;
	}
			
}


