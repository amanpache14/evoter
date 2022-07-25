package com.evoter.api.repo;

import com.evoter.api.entity.Voter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoterRepo extends JpaRepository<Voter,Long> {
    List<Voter> findByBoothNoAndWardNo(int boothNo, int wardNo);
    List<Voter> findBySectionNoOrWardNoOrBoothNo(int sectionNo,int wardNo,int boothNo);
}

