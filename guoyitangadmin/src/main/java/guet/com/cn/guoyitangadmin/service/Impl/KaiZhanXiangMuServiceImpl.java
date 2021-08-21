package guet.com.cn.guoyitangadmin.service.Impl;

import guet.com.cn.guoyitangadmin.bean.KaiZhanXiangMu;
import guet.com.cn.guoyitangadmin.mapper.KaiZhanXiangMuMapper;
import guet.com.cn.guoyitangadmin.service.KaiZhanXiangMuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaiZhanXiangMuServiceImpl implements KaiZhanXiangMuService {

    @Autowired
    KaiZhanXiangMuMapper kaiZhanXiangMuMapper;
    @Override
    public List<KaiZhanXiangMu> AllData() {
        return kaiZhanXiangMuMapper.AllData();
    }

    @Override
    public List<KaiZhanXiangMu> SelectData(String name) {
        return kaiZhanXiangMuMapper.SelectData(name);
    }

    @Override
    public List<KaiZhanXiangMu> SelectDataType(String dataType) {
        return kaiZhanXiangMuMapper.SelectDataType(dataType);
    }

    @Override
    public void AddInformation(String name, String content, String idCode) {
        kaiZhanXiangMuMapper.AddInformation(name,content,idCode);
    }


    @Override
    public void AddInformationFeature(String name, int money, String content, String idCode) {
        kaiZhanXiangMuMapper.AddInformationFeature(name,money,content,idCode);
    }
}
