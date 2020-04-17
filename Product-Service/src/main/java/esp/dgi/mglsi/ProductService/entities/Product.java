package esp.dgi.mglsi.ProductService.entities;

public class Product {
	
	private int id;
	private String name;
	private String image;
	private float prix;
	
	public Product(int id, String name, String image, float prix) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.prix = prix;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		
}
