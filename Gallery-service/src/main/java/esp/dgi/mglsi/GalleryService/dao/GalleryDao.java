package esp.dgi.mglsi.GalleryService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import esp.dgi.mglsi.GalleryService.entities.Gallery;

import java.util.List;

@Repository
public interface GalleryDao extends JpaRepository<Gallery, Integer> {
	Gallery findById(int id);
}
