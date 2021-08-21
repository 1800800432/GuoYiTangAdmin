package guet.com.cn.guoyitangadmin.service;

import guet.com.cn.guoyitangadmin.bean.KaiZhanXiangMu;
import guet.com.cn.guoyitangadmin.mapper.KaiZhanXiangMuMapper;

import java.util.List;

public interface KaiZhanXiangMuService {

    List<KaiZhanXiangMu> AllData();
    List<KaiZhanXiangMu> SelectData(String name);
    List<KaiZhanXiangMu> SelectDataType(String dataType);
    void AddInformation(String name,String content,String idCode);




    void AddInformationFeature(String name,int money,String content,String idCode);
}
