package com.example.demo.mapper;


import com.example.demo.pojo.ApplicantList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AddCompanyMapper{
    List<ApplicantList> getListCompany();
}
