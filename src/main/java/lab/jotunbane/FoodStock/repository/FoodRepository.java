package lab.jotunbane.FoodStock.repository;

import lab.jotunbane.FoodStock.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
}
