package com.recipe.optimizer.recipe_optimizer.controller;


import com.recipe.optimizer.recipe_optimizer.model.OptimizeRequest;
import com.recipe.optimizer.recipe_optimizer.model.OptimizeResponse;
import com.recipe.optimizer.recipe_optimizer.model.Score;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/optimize")
public class OptimizeController {
    @PostMapping()
    public OptimizeResponse optimize(@RequestBody OptimizeRequest optimizeRequest){
        OptimizeResponse optimizeResponse = new OptimizeResponse();
        optimizeResponse.setOptimizedIngredients(List.of("chickpeas", "oats"));

        optimizeResponse.setAmounts(List.of(100, 50, 200));

        Score score = new Score(30, 10, 450);
        optimizeResponse.setScore(score);

        optimizeResponse.setRecommendations(List.of("Replaced tofu with chickpeas", "Reduced oil to lower fat"));


        return optimizeResponse;
    }
}
