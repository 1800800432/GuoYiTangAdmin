package guet.com.cn.guoyitangadmin.mapper;


import guet.com.cn.guoyitangadmin.bean.KaiZhanXiangMu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface KaiZhanXiangMuMapper {

    List<KaiZhanXiangMu> AllData();
    List<KaiZhanXiangMu> SelectData(String name);
    List<KaiZhanXiangMu> SelectDataType(String dataType);
    void AddInformation(String name,String content,String idCode);



    void AddInformationFeature(String name,int money,String xontent,String idCode);
}
