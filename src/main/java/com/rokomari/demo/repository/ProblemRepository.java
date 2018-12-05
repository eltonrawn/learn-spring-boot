package com.rokomari.demo.repository;

import com.rokomari.demo.entity.Problem;
import org.springframework.data.repository.CrudRepository;

public interface ProblemRepository extends CrudRepository<Problem, Long> {
}
