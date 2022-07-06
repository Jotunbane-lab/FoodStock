package lab.jotunbane.FoodStock.services;

import lab.jotunbane.FoodStock.models.Food;
import lab.jotunbane.FoodStock.repositories.FoodRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class FoodService {


    private FoodRepository foodRepository;

    public List<Food> list() {
        return foodRepository.findAll();
    }

    public void addFood(Food food) {
        foodRepository.save(food);
        System.out.println("Added: "+ food.toString());
    }


}
