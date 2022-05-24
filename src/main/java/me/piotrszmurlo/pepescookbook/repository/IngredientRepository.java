package me.piotrszmurlo.pepescookbook.repository;


import me.piotrszmurlo.pepescookbook.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
