package lab.jotunbane.FoodStock.service;

import lab.jotunbane.FoodStock.model.Food;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class FoodServiceUnitTest {

    @Autowired
    private FoodService foodService;

    @Test
    public void whenAppStarts_thenHibCreatesInitialRecords(){
        List<Food> foods = foodService.list();

        Assert.assertEquals(foods.size(),3);
    }
}