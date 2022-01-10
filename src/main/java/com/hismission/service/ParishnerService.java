package com.hismission.service;

import com.hismission.bean.Parishnor;
import com.hismission.repositary.ParishonorRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParishnerService {

    @Autowired
    private ParishonorRepositary parishonorRepositary;

    public List<Parishnor> saveParishnor(Parishnor parishnor){
        return parishonorRepositary.findAll();
    }
}
