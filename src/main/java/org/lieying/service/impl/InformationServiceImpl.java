package org.lieying.service.impl;

import org.lieying.bean.Information;
import org.lieying.dao.InformationMapper;
import org.lieying.service.InformationService;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("informationService")
public class InformationServiceImpl implements InformationService {
    @Autowired
    private InformationMapper informationMapper;
    @Override
    public List<Information> queryAllInformations() {

        return informationMapper.selectAllInformations();
    }
}
