package org.lieying.web.controller;

import com.github.pagehelper.PageInfo;
import javafx.geometry.Pos;
import org.lieying.bean.Position;
import org.lieying.bean.PositionCategory;
import org.lieying.bean.Recruiter;
import org.lieying.service.PositionCategoryService;
import org.lieying.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@CrossOrigin
@RestController()
@RequestMapping(value = "/position")
public class PositionController {
    @Autowired
    private PositionService positionService;


    /*
     * 职位详情
     * @param  positionId   职位id
     */
    @RequestMapping("/{positionId}")
    public Position getPositionById(@PathVariable int positionId) {
        long before = System.currentTimeMillis();
        Position position = positionService.queryPositionById(positionId);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
        return position;
    }

    /*
     *  多条件搜索职位 每个条件非必选
     *  @param   keyword              职位关键字
     *  @param   cityId               城市id
     *  @param   positionCategoryId   职位分类id
     *  @param   industryId           行业id
     *  @param   positionEducation    学历
     *  @param   positionSalary       薪资
     *  @param   positionExperience   经验
     *  @param   financingStageId     融资阶段id
     *  @param   positionPublishTime  职位发布时间
     */
    @RequestMapping("")
    public PageInfo<Position> getPositionByKeyword(@RequestParam(value = "keyword", required = false) String keyword,
                                            @RequestParam(value = "cityId", required = false) Integer cityId,
                                            @RequestParam(value = "positionCategoryId", required = false) Integer positionCategoryId,
                                            @RequestParam(value = "industryId", required = false) Integer industryId,
                                            @RequestParam(value = "positionEducation", required = false) String positionEducation,
                                            @RequestParam(value = "positionSalary", required = false) String positionSalary,
                                            @RequestParam(value = "positionExperience", required = false) String positionExperience,
                                            @RequestParam(value = "financingStageId", required = false) Integer financingStageId,
                                            @RequestParam(value = "positionPublishTime", required = false) String positionPublishTime,
                                            @RequestParam(value = "page", required = false) Integer page ) {
//        System.out.println("keyword:" + keyword + " cityId:" + cityId + " positionCategoryId:" + positionCategoryId + " industryId:" + industryId +
//                " financingStageId:" + financingStageId);
        return positionService.queryPositionsByCriteria(
                keyword,
                cityId,
                positionCategoryId,
                industryId,
                positionEducation,
                positionSalary,
                positionExperience,
                financingStageId,
                positionPublishTime,page);
    }

    /*
    *  添加职位
    *   @param   name      职位名称
    *   @param   salary    职位薪资
    *   @param   address   地址
    *   @param   education 学历
    *   @param   detail    详情
    *   @param
    * */
    @RequestMapping("/add")
    public Boolean addPosition(String name, String salary, String address, String education,
                               String experience, String detail,
                               Integer recruiterId) {
        Position position = new Position();
        position.setName(name);
        position.setSalary(salary);
        position.setAddress(address);
        position.setEducation(education);
        position.setExperience(experience);
        position.setDetail(detail);
        position.setPublishTime(new Date());

        return positionService.addPosition(position,recruiterId);
    }

    /*
    * 热门职位
    * @param cityId             城市id
    * @param positionCategoryId 职位类型id
     */
    @RequestMapping("/hot")
    public List<Position> hotPositions(@RequestParam("cityId") int cityId,@RequestParam("positionCategoryId")int positionCategoryId){
        return positionService.selectHotPositionsByCriteria(cityId,positionCategoryId);
    }
}
