package com.merry.meal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.merry.meal.data.Session;

public interface SessionRepository extends JpaRepository<Session,Integer> {

}
