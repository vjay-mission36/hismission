package com.hismission.repositary;

import com.hismission.bean.Parishnor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParishonorRepositary extends JpaRepository<Parishnor, Long> {

}
