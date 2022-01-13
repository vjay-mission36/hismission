package com.hismission.service;

import com.hismission.bean.Parishnor;
import com.hismission.repositary.ParishonorRepositary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParishnerService {

    private static final Logger LOG = LoggerFactory.getLogger(ParishnerService.class);

    @Autowired
    private ParishonorRepositary parishonorRepositary;

    public List<Parishnor> saveParishnor(Parishnor parishnor){
        LOG.info("saving another soul: "+parishnor.getFirstName() + " "+parishnor.getLastName());
        Parishnor parishnor_new = parishonorRepositary.save(parishnor);
        return parishonorRepositary.findAll();
    }
}
