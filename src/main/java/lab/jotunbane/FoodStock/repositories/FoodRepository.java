package lab.jotunbane.FoodStock.repositories;

import lab.jotunbane.FoodStock.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
}
