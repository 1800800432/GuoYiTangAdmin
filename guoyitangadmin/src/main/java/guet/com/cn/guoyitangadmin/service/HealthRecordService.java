package guet.com.cn.guoyitangadmin.service;


import guet.com.cn.guoyitangadmin.bean.tb_natmeha_health_base;


import java.util.List;


public interface HealthRecordService {

    List<tb_natmeha_health_base> selectInformation(String persionId);
}
