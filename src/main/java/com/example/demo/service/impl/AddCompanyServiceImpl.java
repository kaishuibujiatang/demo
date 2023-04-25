package com.example.demo.service.impl;


import com.example.demo.mapper.AddCompanyMapper;
import com.example.demo.pojo.ApplicantList;
import com.example.demo.service.AddCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddCompanyServiceImpl implements AddCompanyService {

    @Autowired
    private AddCompanyMapper addCompanyMapper;

    @Override
    public List<ApplicantList> list() {
        return addCompanyMapper.getListCompany();
    }
}
