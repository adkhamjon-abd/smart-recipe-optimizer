package com.recipe.optimizer.recipe_optimizer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OptimizeResponse {
    private List<String> optimizedIngredients = new ArrayList<>();
    private List<Integer> amounts = new ArrayList<>();
    private Map<String, Integer> score = new HashMap<>();
    private List<String> recommendations = new ArrayList<>();
}
