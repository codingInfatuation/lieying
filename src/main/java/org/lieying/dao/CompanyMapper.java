package org.lieying.dao;

import org.apache.ibatis.annotations.Param;
import org.lieying.bean.Company;

import java.util.List;

public interface CompanyMapper {

    public Company selectCompanyById(int id);
    public List<Company> selectCompaniesByCriteria(@Param("city_id") Integer cityId,
                                                   @Param("industry_id")Integer industryId,
                                                   @Param("financing_stage_id")Integer financingStageId,
                                                   @Param("company_scale_id")Integer companyScaleId);
}
