package me.piotrszmurlo.pepescookbook.api;

import me.piotrszmurlo.pepescookbook.model.Ingredient;
import me.piotrszmurlo.pepescookbook.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class IngredientController {

    private IngredientService ingredientService;

    @Autowired
    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping(path = "/ingredients")
    public List<Ingredient> findAll() {
        return ingredientService.findAll();
    }
}
