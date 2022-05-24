package me.piotrszmurlo.pepescookbook.model;

import javax.persistence.*;

@Entity
@Table(name = "Ingredient")
public class Ingredient {
    @Id
    @SequenceGenerator(name = "ingredient_sequence", sequenceName = "ingredient_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingredient_sequence")
    @Column(updatable = false)
    private Long ingredientId;
    @Column(nullable = false)
    private String name;

    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
