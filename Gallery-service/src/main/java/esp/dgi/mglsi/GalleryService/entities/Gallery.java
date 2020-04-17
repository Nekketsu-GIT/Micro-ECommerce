package esp.dgi.mglsi.GalleryService.entities;

import java.util.List;

public class Gallery {
	private int id;
	private List<Object> produits;
	
	public Gallery() {
	}

	public Gallery(int galleryId) {
		this.id = galleryId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Object> getProduits() {
		return produits;
	}

	public void setProduits(List<Object> produits) {
		this.produits = produits;
	}

	
}
