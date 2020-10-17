package org.lieying.web.controller;

import org.lieying.bean.JobHunter;
import org.lieying.bean.JobHunterReport;
import org.lieying.bean.Position;
import org.lieying.bean.Resume;
import org.lieying.service.JobHunterReportService;
import org.lieying.service.JobHunterService;
import org.lieying.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/jobHunter")
public class JobHunterController {
    @Autowired
    private JobHunterService jobHunterService;
    @Autowired
    private JobHunterReportService jobHunterReportService;
    @Autowired
    private ResumeService resumeService;
    //所有求职者信息
    @RequestMapping("/all")
    public List<JobHunter> allJobHunter(HttpServletRequest httpServletRequest, HttpServletResponse response) throws Exception {
        return jobHunterService.queryAllJobHunter();
    }

    /*
     *   求职者所有简历
     *   @param  jobhunterId   简历id
     */
    @RequestMapping("/{jobHunterId}/resumes")
    public List<Resume> resumeList(@PathVariable int jobHunterId) {
        return resumeService.queryAllResumesByJobHunterId(jobHunterId);
    }


    /*
    * 简历详情
    * @param  resumeId  简历id
    */
    @RequestMapping("/resume/{resumeId}")
    public Resume getResumeById(@PathVariable int resumeId) {
        return resumeService.queryResumeById(resumeId);
    }

    @PostMapping("/resume/update")
    public Boolean updateResumeState(@RequestBody Resume resume){

        return resumeService.modifyResumeState(resume);
    }

    @RequestMapping("/login")
    public JobHunter jobHunterLogin(JobHunter jobHunter,HttpServletRequest request,HttpServletResponse response){
        System.out.println(jobHunter);
//        String token = request.getHeader("token");
//        jobHunter.setToken(token);
        JobHunter jobHunter1=jobHunterService.queryJobHunterByUsernameAndPassword(jobHunter.getUsername(),jobHunter.getPassword());
        if (jobHunter1!=null){
            String token=jobHunter1.getToken();
            System.out.println(token);
            System.out.println(token.length());
            response.setHeader("token",token);
        }
        return jobHunter1;
    }
    /*
    *  根据求职者id和职位id获取举报信息
    *  @param  jobHunterId  求职者id
    *  @param  positionId  职位id
    */
    @RequestMapping("/report/{jobHunterId}/{positionId}")
    public JobHunterReport getJobHunterReportByJobHunterIdAndPositionId(
            @PathVariable int jobHunterId,@PathVariable int positionId){
        return jobHunterReportService.queryJobHunterReportByJobHunterIdAndPositionId(jobHunterId,positionId);
    }

    //更新举报信息
    @PostMapping(value = "/report/update")
    public Boolean updateJobHunterReport(@RequestBody JobHunterReport jobHunterReport){
        System.out.println(jobHunterReport);
        return jobHunterReportService.updateJobHunterReport(jobHunterReport);
    }




}
