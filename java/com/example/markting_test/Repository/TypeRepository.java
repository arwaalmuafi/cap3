package com.example.markting_test.Repository;

import com.example.markting_test.Model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<Type, Integer> {
    Type findTypeById(Integer id);
}
