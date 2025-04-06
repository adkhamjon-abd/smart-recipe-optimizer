package com.recipe.optimizer.recipe_optimizer.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.recipe.optimizer.recipe_optimizer.model.OptimizeRequest;
import com.recipe.optimizer.recipe_optimizer.model.OptimizeResponse;
import com.recipe.optimizer.recipe_optimizer.model.Score;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

@RestController
@RequestMapping("/optimize")
public class OptimizeController {
    @PostMapping()
    public OptimizeResponse optimize(@RequestBody OptimizeRequest optimizeRequest) {
/*
        OptimizeResponse optimizeResponse = new OptimizeResponse();
        optimizeResponse.setOptimizedIngredients(List.of("chickpeas", "oats"));
        optimizeResponse.setAmounts(List.of(100, 50, 200));
        Score score = new Score(30, 10, 450);
        optimizeResponse.setScore(score);
        optimizeResponse.setRecommendations(List.of("Replaced tofu with chickpeas", "Reduced oil to lower fat"));
*/
        ObjectMapper mapper = new ObjectMapper();


        String jsonInput = "";
        try {
            jsonInput = mapper.writeValueAsString(optimizeRequest);
        } catch(JsonProcessingException jsonProcessingException){
            System.out.println("Problem with json processing" + jsonProcessingException.getMessage());
        }

        ProcessBuilder pb = new ProcessBuilder("python", "../recipe-optimizer-py/main.py");

        Process process = null;
        try {
            process = pb.start(); // Handle to talk to the process. That object gives direct access to the new process's:
        } catch (IOException ioException){
            System.out.println("Error in running the command" + ioException.getMessage());
            return null;
        }

        OutputStream os = process.getOutputStream(); // get the pipe to talk to python code
        OutputStreamWriter osw = new OutputStreamWriter(os); // tool to translate the text to binary
        BufferedWriter writer = new BufferedWriter(osw); // makes the writing more efficient



        return optimizeResponse;
    }
}
