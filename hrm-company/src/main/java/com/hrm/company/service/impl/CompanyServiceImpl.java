package com.hrm.company.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hrm.company.mapper.CompanyMapper;
import com.hrm.company.service.ICompanyService;
import com.hrm.domain.company.Company;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author elijah
 * @since 2022-08-24
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

}
