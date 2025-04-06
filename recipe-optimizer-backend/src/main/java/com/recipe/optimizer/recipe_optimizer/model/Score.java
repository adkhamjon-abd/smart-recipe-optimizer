package com.recipe.optimizer.recipe_optimizer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Score {
    private Integer protein;
    private Integer fat;
    private Integer calories;
}
