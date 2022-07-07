package lab.jotunbane.FoodStock.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Food")
@Table(name = "food")
public class Food {

    @Id
    @SequenceGenerator(
            name = "food_sequence",
            sequenceName = "food_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "food_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private long id;
    @Column(
            name = "name",
            nullable = false
    )
    private String name;
    @Column(
            name = "quantity",
            nullable = false
    )
    private int quantity;
    @Column(
            name = "unit"
    )
    private String unit;
}
