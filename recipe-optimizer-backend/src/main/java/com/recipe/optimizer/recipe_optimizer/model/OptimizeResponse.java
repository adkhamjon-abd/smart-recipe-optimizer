package com.recipe.optimizer.recipe_optimizer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OptimizeResponse {
    private List<String> optimizedIngredients = new ArrayList<>();
    private List<Integer> amounts = new ArrayList<>();
    private Score score;
    private List<String> recommendations = new ArrayList<>();
}
