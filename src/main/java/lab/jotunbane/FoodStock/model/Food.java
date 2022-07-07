package lab.jotunbane.FoodStock.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Food {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int quantity;
    private String unit;
}
