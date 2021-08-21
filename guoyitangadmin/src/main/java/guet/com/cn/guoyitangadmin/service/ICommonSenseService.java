package guet.com.cn.guoyitangadmin.service;

import guet.com.cn.guoyitangadmin.bean.Medicateddiet;
import guet.com.cn.guoyitangadmin.bean.Tb_natmeha_chinese_medicine;

import java.util.List;
import java.util.Map;

public interface ICommonSenseService {
    List<Tb_natmeha_chinese_medicine> viewCommonSenseIndex();
    List<Tb_natmeha_chinese_medicine> searchCommonSense(Map<String, Object> param);

}
