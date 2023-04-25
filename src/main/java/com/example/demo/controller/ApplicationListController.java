package com.example.demo.controller;


import com.example.demo.pojo.ApplicantList;
import com.example.demo.service.AddCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class ApplicationListController {

    @Autowired
    private AddCompanyService addCompanyService;

    @RequestMapping("/list1")
    public List getApplicantList(){
        List<ApplicantList> list = addCompanyService.list();
        return list;
    }
}
