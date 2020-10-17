package org.lieying.service.impl;

import org.lieying.bean.JobHunterReport;
import org.lieying.dao.JobHunterReportMapper;
import org.lieying.exception.NullObjectAttributeException;
import org.lieying.service.JobHunterReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobHunterReportServiceImpl implements JobHunterReportService {

    @Autowired
    private JobHunterReportMapper jobHunterReportMapper;

    @Override
    public JobHunterReport queryJobHunterReportByJobHunterIdAndPositionId(int jobHunterId, int positionId) {
        return jobHunterReportMapper.selectJobHunterReportByJobHunterIdAndPositionId(jobHunterId, positionId);
    }

    @Override
    public Boolean updateJobHunterReport(JobHunterReport jobHunterReport) {
        if (jobHunterReport.getPosition() == null) {
            throw new NullObjectAttributeException("jobHunterReport object has null position object attribute");
        } else if (jobHunterReport.getJobHunter() == null) {
            throw new NullObjectAttributeException("jobHunterReport object has  null position object attribute");
        } else {
            return jobHunterReportMapper.updateJobHunterReport(jobHunterReport.getReason(),
                    jobHunterReport.getFootnote(), jobHunterReport.getEvidenceScreenShot(),
                    jobHunterReport.getJobHunter().getId(), jobHunterReport.getPosition().getId()) == 1;

        }

    }
}
