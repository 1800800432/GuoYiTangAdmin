package guet.com.cn.guoyitangadmin.mapper;

import guet.com.cn.guoyitangadmin.bean.Tb_natmeha_chinese_medicine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CommonSenseMapper {
    List<Tb_natmeha_chinese_medicine> viewCommonSenseIndex();
    List<Tb_natmeha_chinese_medicine> searchCommonSense(Map<String, Object> param);

}
