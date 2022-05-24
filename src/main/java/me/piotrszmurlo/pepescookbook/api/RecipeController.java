package me.piotrszmurlo.pepescookbook.api;

import me.piotrszmurlo.pepescookbook.model.Recipe;
import me.piotrszmurlo.pepescookbook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api")
public class RecipeController {

    private final RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping(value = "/recipes")
    public List<Recipe> findAll() {
        return recipeService.findAll();
    }

    @GetMapping(value = "/recipe/{id}")
    public Optional<Recipe> findById(@PathVariable("id") Long id) {
        return recipeService.findById(id);
    }

    @GetMapping(value = "/recipe")
    public Optional<Recipe> findByName(@RequestParam String name) {
        return recipeService.findByName(name);
    }
}
