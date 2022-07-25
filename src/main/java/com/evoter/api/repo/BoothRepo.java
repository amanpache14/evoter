package com.evoter.api.repo;


import com.evoter.api.entity.Booth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoothRepo extends JpaRepository<Booth, Long> {
}
