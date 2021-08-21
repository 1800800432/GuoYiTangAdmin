package guet.com.cn.guoyitangadmin.service.Impl;

import guet.com.cn.guoyitangadmin.bean.Tb_natmeha_chinese_medicine;
import guet.com.cn.guoyitangadmin.mapper.CommonSenseMapper;
import guet.com.cn.guoyitangadmin.service.ICommonSenseService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ICommonSenseServiceImp implements ICommonSenseService {
    @Autowired
    CommonSenseMapper commonSenseMapper;
    @Override
    public List<Tb_natmeha_chinese_medicine> viewCommonSenseIndex() {
        return commonSenseMapper.viewCommonSenseIndex();
    }

    @Override
    public List<Tb_natmeha_chinese_medicine> searchCommonSense(Map<String, Object> map) {
        return commonSenseMapper.searchCommonSense(map);
    }
}
