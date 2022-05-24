package me.piotrszmurlo.pepescookbook.model;

import javax.persistence.*;

@Entity
@Table(name = "Recipe")
public class Recipe {
    @Id
    @SequenceGenerator(name = "recipe_sequence", sequenceName = "recipe_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_sequence")
    @Column(updatable = false)
    private Long recipeId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    public Long getRecipeId() {
        return recipeId;

    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
