package lab.jotunbane.FoodStock;

import lab.jotunbane.FoodStock.configuration.SpringConfig;
import lab.jotunbane.FoodStock.models.Food;
import lab.jotunbane.FoodStock.repositories.FoodRepository;
import lab.jotunbane.FoodStock.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FoodStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodStockApplication.class, args);
		System.out.println("Screeaaaam!");

//		Food schnitzel = new Food();
//		schnitzel.setName("Schnitzel");
//		schnitzel.setQuantity(5);
//		schnitzel.setUnit("pcs");




	}

}
