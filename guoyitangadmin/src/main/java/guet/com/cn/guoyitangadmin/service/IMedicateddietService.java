package guet.com.cn.guoyitangadmin.service;

import guet.com.cn.guoyitangadmin.bean.Medicateddiet;

import java.util.List;
import java.util.Map;

public interface IMedicateddietService {
    List<Medicateddiet> viewMedicateddiet();
    List<Medicateddiet> searchMedicateddiet(Map<String, Object> param);
    Medicateddiet selectById(String id);
    void addMedicateddiet(Map<String, Object> map);
    void modifyMedicateddiet(Map<String, Object> map);
    void deleteMedicateddiet(String id);

}