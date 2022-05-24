package me.piotrszmurlo.pepescookbook.service;

import me.piotrszmurlo.pepescookbook.model.Recipe;
import me.piotrszmurlo.pepescookbook.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    public Optional<Recipe> findById(Long id) {
        return recipeRepository.findById(id);
    }

    public void save(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    public Optional<Recipe> findByName(String name) {
        return recipeRepository.findByName(name);
    }
}
