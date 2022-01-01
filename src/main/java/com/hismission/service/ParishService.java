package com.hismission.service;

import com.hismission.bean.Parish;
import com.hismission.repositary.ParishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParishService {

    @Autowired
    private ParishRepository parishRepository;

    public Parish findById(final Long id) {
        return parishRepository.getById(id);
    }

    public List<Parish> findByName(String name) {
        return parishRepository.findByName(name);
    }

    public Parish saveParish(Parish parish){
        return parishRepository.save(parish);
    }
}
