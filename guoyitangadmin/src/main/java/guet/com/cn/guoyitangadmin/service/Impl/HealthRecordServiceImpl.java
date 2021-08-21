package guet.com.cn.guoyitangadmin.service.Impl;


import guet.com.cn.guoyitangadmin.bean.tb_natmeha_health_base;
import guet.com.cn.guoyitangadmin.mapper.HealthRecordMapper;
import guet.com.cn.guoyitangadmin.service.HealthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthRecordServiceImpl implements HealthRecordService {

    @Autowired
    private HealthRecordMapper healthRecordMapper;

    @Override
    public List<tb_natmeha_health_base> selectInformation(String persionId) {
        return healthRecordMapper.selectHealthRecord(persionId);
    }
}
