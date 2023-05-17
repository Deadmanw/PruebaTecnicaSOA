package com.example.tecnical.test.repository;

import com.example.tecnical.test.entity.TestData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDataRepository extends JpaRepository<TestData, Integer> {

}
