package guet.com.cn.guoyitangadmin.mapper;


import guet.com.cn.guoyitangadmin.bean.tb_natmeha_health_base;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface HealthRecordMapper {
    List<tb_natmeha_health_base> selectHealthRecord(String persionId);

}
