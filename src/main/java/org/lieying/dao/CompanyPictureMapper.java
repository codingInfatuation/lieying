package org.lieying.dao;

import org.lieying.bean.CompanyPicture;

import java.util.List;

public interface CompanyPictureMapper {
    public List<CompanyPicture> selectCompanyPicturesByCompanyId(int companyId);
}
