package com.recipe.optimizer.recipe_optimizer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OptimizeRequest {
    private List<String> ingredients = new ArrayList<>();
    private List<Integer> amounts = new ArrayList<>();
    private String goal;
    private Integer calorieLimit;
    private List<String> exclude = new ArrayList<>();
}
