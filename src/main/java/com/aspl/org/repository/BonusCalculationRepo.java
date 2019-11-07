package com.aspl.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aspl.org.entity.BonusCalculation;

@Repository

public interface BonusCalculationRepo extends JpaRepository<BonusCalculation, Integer> {

}
