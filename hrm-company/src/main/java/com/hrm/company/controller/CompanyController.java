package com.hrm.company.controller;


import com.hrm.common.entity.Result;
import com.hrm.common.entity.ResultCode;
import com.hrm.company.service.ICompanyService;
import com.hrm.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author elijah
 * @since 2022-08-24
 */
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private ICompanyService companyService;

    /**
     * 添加企业
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result add(@RequestBody Company company) throws Exception {
        company.setBalance(0.0);
        company.setCreateTime(LocalDateTime.now());
        companyService.save(company);
        return Result.SUCCESS();
    }

    /**
     * 根据id更新企业信息
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result update(@PathVariable(name = "id") String id, @RequestBody Company company) throws Exception {
        Company one = companyService.getById(id);
        one.setName(company.getName());
        one.setRemarks(company.getRemarks());
        one.setState(company.getState());
        one.setAuditState(company.getAuditState());
        companyService.updateById(company);
        return Result.SUCCESS();
    }

    /**
     * 根据id删除企业信息
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable(name = "id") String id) throws Exception {
        companyService.removeById(id);
        return Result.SUCCESS();
    }
    /**
     * 根据ID获取公司信息 */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result findById(@PathVariable(name = "id") String id) throws Exception {
        Company company = companyService.getById(id);
        return new Result(ResultCode.SUCCESS, company);
    }

    /**
     * 获取企业列表 */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public Result findAll() throws Exception {
        List<Company> companyList = companyService.list();
        return new Result(ResultCode.SUCCESS, companyList);
    }
}
