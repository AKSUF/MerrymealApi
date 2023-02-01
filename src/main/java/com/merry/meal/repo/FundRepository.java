package com.merry.meal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.merry.meal.data.Fund;

public interface FundRepository extends JpaRepository<Fund,Integer> {

}
