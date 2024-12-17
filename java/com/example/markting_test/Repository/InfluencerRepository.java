package com.example.markting_test.Repository;

import com.example.markting_test.Model.Influencer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfluencerRepository extends JpaRepository<Influencer,Integer> {
    Influencer findInfluencerById(Integer id);
}
