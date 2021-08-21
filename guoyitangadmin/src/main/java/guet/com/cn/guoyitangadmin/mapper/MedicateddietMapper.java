package guet.com.cn.guoyitangadmin.mapper;

import guet.com.cn.guoyitangadmin.bean.Medicateddiet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MedicateddietMapper {
    List<Medicateddiet> viewMedicateddiet();
    List<Medicateddiet> searchMedicateddiet(Map<String, Object> param);
    Medicateddiet selectById(String id);
    void addMedicateddiet(Map<String, Object> map);
    void modifyMedicateddiet(Map<String, Object> map);
    void deleteMedicateddiet(String id);

}
