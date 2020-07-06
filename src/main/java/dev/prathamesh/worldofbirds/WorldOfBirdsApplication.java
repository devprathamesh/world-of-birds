package dev.prathamesh.worldofbirds;

import dev.prathamesh.worldofbirds.entity.Product;
import dev.prathamesh.worldofbirds.repository.ProductRepository;
import oracle.jrockit.jfr.openmbean.ProducerDescriptorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
public class WorldOfBirdsApplication implements CommandLineRunner {

	private ProductRepository productRepository;

	@Autowired
	public void productRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(WorldOfBirdsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Product testProduct01 = new Product();
		testProduct01.setName("TestProduct01");
		testProduct01.setSector("Household");
		testProduct01.setType("Gorcery");

		//productRepository.save(testProduct01); - Save Single Product

		Product testProduct02 = new Product();
		testProduct02.setName("TestProduct02");
		testProduct02.setSector("Household");
		testProduct02.setType("Pantry");

		Product testProduct03 = new Product();
		testProduct03.setName("TestProduct03");
		testProduct03.setSector("Industrial");
		testProduct03.setType("Heavy");

		productRepository.saveAll(Arrays.asList(testProduct01, testProduct02, testProduct03));

//		System.out.println("Find Product By Type : " + productRepository.findByType("Pantry"));

//        productRepository.findByTypeAndSector("Heavy", "Industrial").
//				forEach(System.out::println);

		Product testProduct04 = new Product();
		testProduct04.setName("TestProduct04");
		testProduct04.setSector("Sports");
		testProduct04.setType("Outdoor");

		productRepository.save(testProduct04);

		System.out.println("*************** Count of Product in DB : " + productRepository.count() + " ***************");

		//Search for Product 03 and Update it
		Product searchProduct03 = productRepository.findByType("Heavy");

		if(searchProduct03 != null) {
			searchProduct03.setSector("Heavy Industrial");
			productRepository.save(searchProduct03);
		}

		Product searchProduct02 = productRepository.findByName("TestProduct02");

		productRepository.delete(searchProduct02);


		System.out.println("*************** Count of Product in DB : " + productRepository.count() + " ***************");



	}
}