package org.lieying.web.controller;

import org.lieying.bean.JobHunter;
import org.lieying.bean.Resume;
import org.lieying.service.JobHunterService;
import org.lieying.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/jobHunter")
public class JobHunterController {
    @Autowired
    private JobHunterService jobHunterService;
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
    public Resume resumeDetail(@PathVariable int resumeId) {
        return resumeService.queryResumeById(resumeId);
    }

}
