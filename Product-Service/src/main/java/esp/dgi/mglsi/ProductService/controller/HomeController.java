package esp.dgi.mglsi.ProductService.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import esp.dgi.mglsi.ProductService.entities.*;

@RestController
@RequestMapping("/")
public class HomeController {
	@Autowired
	private Environment env;
		
	@RequestMapping("/products")
	public List<Product> getProducts() {
		List<Product> Products = Arrays.asList(
			new Product(1, "article 1","https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272", 3000),
			new Product(2, "article 2","https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272", 3500),
			new Product(3, "article 3","https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272", 2040));
		return Products;
	}
}
