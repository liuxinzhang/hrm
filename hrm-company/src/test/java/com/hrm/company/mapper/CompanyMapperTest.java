package com.hrm.company.mapper;

import com.hrm.domain.company.Company;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 刘新漳
 */
@SpringBootTest
class CompanyMapperTest {

    @Resource
    private CompanyMapper companyMapper;


    @Test
    void name() {
        List<Company> list = companyMapper.selectList(null);
        assertNotNull(list);
    }
}