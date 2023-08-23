package com.petproject.taco.controller;


import com.petproject.taco.model.Ingredient;
import com.petproject.taco.model.Taco;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestThymeleafController {
    @GetMapping
    public String example(Model model) {
        model.addAttribute("name", "Kiruxa");
        model.addAttribute("content", "Жили были три китайца");
        model.addAttribute("taco", testTaco());
        return "example";
    }

    private Taco testTaco() {
        Taco taco = new Taco();
        taco.setName("Burito");
        taco.setIngredient(List.of(
                new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP),
                new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP),
                new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN)
        ));
        return taco;
    }
}
