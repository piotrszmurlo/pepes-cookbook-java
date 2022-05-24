package me.piotrszmurlo.pepescookbook.model;

import javax.persistence.*;

@Entity
@Table(name = "recipe_ingredient")
public class RecipeIngredient {
    @Id
    @SequenceGenerator(name = "recipe_ingredient_sequence", sequenceName = "recipe_ingredient_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_ingredient_sequence")
    private Long recipeIngredientId;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "measure")
    private Measure measure;

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    Ingredient ingredient;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    Recipe recipe;

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public Long getRecipeIngredientId() {
        return recipeIngredientId;
    }

    public void setRecipeIngredientId(Long recipeIngredientId) {
        this.recipeIngredientId = recipeIngredientId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
