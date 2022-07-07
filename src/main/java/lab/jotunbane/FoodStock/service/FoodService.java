package lab.jotunbane.FoodStock.service;

import lab.jotunbane.FoodStock.model.Food;
import lab.jotunbane.FoodStock.repository.FoodRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> list() {
        return foodRepository.findAll();
    }

    public void addFood(Food food) {
        foodRepository.save(food);
        System.out.println("Added: "+ food.toString());
    }


}
