package com.example.markting_test.Repository;

import com.example.markting_test.Model.Platform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformRepository extends JpaRepository<Platform, Integer> {
    Platform findPlatformById(Integer id);
}
