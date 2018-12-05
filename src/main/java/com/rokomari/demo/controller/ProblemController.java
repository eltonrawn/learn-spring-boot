package com.rokomari.demo.controller;

import com.rokomari.demo.entity.Problem;
import com.rokomari.demo.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProblemController {

    @Autowired
    private ProblemService problemService;

    @GetMapping("/problems")
    public List<Problem> getAllProblems()   {
        return problemService.getAllProblems();
    }

    @PostMapping("/problems")
    public void createProblem(@RequestBody Problem problem) {
        problemService.createProblem(problem);
    }

    @PutMapping("/problems")
    public void updateProblem(@RequestBody Problem problem) {
        problemService.updateProblem(problem);
    }

    @DeleteMapping("/problems/{id}")
    public void deleteProblem(@PathVariable Long id) {
        problemService.deleteProblem(id);
    }

}
