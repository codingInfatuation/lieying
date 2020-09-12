package org.lieying.service;

import org.lieying.bean.Company;

import java.util.List;

public interface CompanyService {
    public Company queryCompanyById(int id);
    public List<Company> selectCompaniesByCriteria( Integer cityId,
                                                   Integer industryId,
                                                   Integer financingStageId,
                                                  Integer companyScaleId);
}
