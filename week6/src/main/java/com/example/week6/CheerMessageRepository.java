package com.example.week6;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheerMessageRepository extends JpaRepository<CheerMessage, Integer> {
}
