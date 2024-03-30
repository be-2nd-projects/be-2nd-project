package com.example.be2ndproject.shopping_mall.repository.Review;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewJpaRepository extends JpaRepository<Reviews,Integer> {

    void deleteByUserId(Integer userId);
}