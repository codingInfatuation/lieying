package org.lieying.web.controller;

import org.lieying.bean.*;
import org.lieying.service.CompanyScaleService;
import org.lieying.service.CompanyService;
import org.lieying.service.FinancingStageService;
import org.lieying.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;
    @Autowired
    private FinancingStageService financingStageService;
    @Autowired
    private CompanyScaleService companyScaleService;
    @Autowired
    private IndustryService industryService;
    /*
     * 公司详情
     * @param  id  公司id
     */
    @RequestMapping("/{id}")
    public Company getCompanyById(@PathVariable("id") int id) {
        return companyService.queryCompanyById(id);
    }
    /*
     * 多条件查询公司信息
     * @param   cityId             城市id
     * @param   industryId         公司行业id
     * @param   financingStageId   融资阶段id
     * @param   companyScaleId     公司规模id
     * */
    @RequestMapping("")
    public List<Company> getCompanyByCriteria(@RequestParam(value = "cityId", required = false) Integer cityId,
                                               @RequestParam(value = "industryId", required = false) Integer industryId,
                                               @RequestParam(value = "financingStageId", required = false) Integer financingStageId,
                                               @RequestParam(value = "companyScaleId", required = false) Integer companyScaleId) {
        return companyService.selectCompaniesByCriteria(cityId, industryId, financingStageId, companyScaleId);
    }
}
