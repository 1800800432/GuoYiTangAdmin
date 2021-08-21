package guet.com.cn.guoyitangadmin.service.Impl;

import guet.com.cn.guoyitangadmin.bean.Medicateddiet;
import guet.com.cn.guoyitangadmin.mapper.MedicateddietMapper;
import guet.com.cn.guoyitangadmin.service.IMedicateddietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IMedicateddietImp implements IMedicateddietService {
    @Autowired
    MedicateddietMapper medicateddietMapper;
    @Override
    public List<Medicateddiet> viewMedicateddiet() {
        return medicateddietMapper.viewMedicateddiet();
    }

    @Override
    public List<Medicateddiet> searchMedicateddiet(Map<String, Object> param) {
        return medicateddietMapper.searchMedicateddiet(param);
    }

    @Override
    public Medicateddiet selectById(String id) {
        return medicateddietMapper.selectById(id);
    }

    @Override
    public void addMedicateddiet(Map<String, Object> map) {
        medicateddietMapper.addMedicateddiet(map);
    }

    @Override
    public void modifyMedicateddiet(Map<String, Object> map) {
        medicateddietMapper.modifyMedicateddiet(map);
    }

    @Override
    public void deleteMedicateddiet(String id) {
        medicateddietMapper.deleteMedicateddiet(id);
    }


}
