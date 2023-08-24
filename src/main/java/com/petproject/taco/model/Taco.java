package com.petproject.taco.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min = 1, max = 10, message = "min siz 1 letter")
    private String name;

    @NotNull
    @Size(min = 1, message = "minimum ingredient 1")
    private List<Ingredient> ingredient;
}
