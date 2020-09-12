package org.lieying.web.controller;

import org.lieying.bean.Company;
import org.lieying.bean.Position;
import org.lieying.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    /*
     * 公司详情
     * @param  id  公司id
     */
    @RequestMapping("/{id}")
    public Company companyDetail(@PathVariable("id") int id) {

        Company company = companyService.queryCompanyById(id);
        return company;
    }
    /*
     * 多条件查询公司信息
     * @param   cityId             城市id
     * @param   industryId         公司行业id
     * @param   financingStageId   融资阶段id
     * @param   companyScaleId     公司规模id
     * */
    @RequestMapping("")
    public List<Company> findCompanyByCriteria(@RequestParam(value = "cityId", required = false) Integer cityId,
                                               @RequestParam(value = "industryId", required = false) Integer industryId,
                                               @RequestParam(value = "financingStageId", required = false) Integer financingStageId,
                                               @RequestParam(value = "companyScaleId", required = false) Integer companyScaleId) {
        return companyService.selectCompaniesByCriteria(cityId, industryId, financingStageId, companyScaleId);
    }
}
