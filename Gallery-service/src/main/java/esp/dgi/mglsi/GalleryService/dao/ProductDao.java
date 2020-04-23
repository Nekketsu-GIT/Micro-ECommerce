package esp.dgi.mglsi.GalleryService.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import esp.dgi.mglsi.GalleryService.entities.Product;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	Product findById(int id);
	List<Product> findByIdGallery(int idGallery);
	Long deleteById(int id);
}
