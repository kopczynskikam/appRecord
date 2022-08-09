package com.example.apprecord;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrisonRepository extends JpaRepository<Prison, Long> {


}
