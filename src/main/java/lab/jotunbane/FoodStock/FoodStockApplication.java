package lab.jotunbane.FoodStock;

import lab.jotunbane.FoodStock.model.Food;
import lab.jotunbane.FoodStock.repository.FoodRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FoodStockApplication {


    public static void main(String[] args) {
        SpringApplication.run(FoodStockApplication.class, args);
        System.out.println("Screeaaaam!");
    }

    @Bean
    CommandLineRunner commandLineRunner(FoodRepository foodRepository) {
        return args -> {
            Food schnitzel = new Food("schnitzel",5,"pcs");
			foodRepository.save(schnitzel);
        };
    }


}
