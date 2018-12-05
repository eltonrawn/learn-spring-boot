package com.rokomari.demo.service;

import com.rokomari.demo.entity.Problem;
import com.rokomari.demo.repository.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProblemService {

    @Autowired
    ProblemRepository problemRepository;

    public List<Problem> getAllProblems()   {
        List<Problem> problems = new ArrayList<>();

        for(Problem problem : problemRepository.findAll())   {
            problems.add(problem);
        }
        return problems;
    }

    public void createProblem(Problem problem) {
        problemRepository.save(problem);
    }

    public void updateProblem(Problem problem) {
        problemRepository.save(problem);
    }

    public void deleteProblem(Long id) {
        problemRepository.deleteById(id);
    }
}
