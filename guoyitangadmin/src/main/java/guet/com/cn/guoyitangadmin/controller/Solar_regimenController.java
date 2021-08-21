package guet.com.cn.guoyitangadmin.controller;

import guet.com.cn.guoyitangadmin.bean.tb_natmeha_hotspot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Solar_regimenController {
    @Autowired
    private guet.com.cn.guoyitangadmin.service.hotspotService hotspotService;
    //节气养生
    @ResponseBody
    @RequestMapping("/getSolar_regimen")
    public List<tb_natmeha_hotspot> getSolar_regimen(){
        List<tb_natmeha_hotspot> Solar_regimenList=hotspotService.getSolar_regimen();
        return Solar_regimenList;
    }
    //删除文章
    @ResponseBody
    @RequestMapping("/deleteSolar_regimen")
    public List<tb_natmeha_hotspot> deleteData(String itemID){
        hotspotService.deleteData(itemID);
        List<tb_natmeha_hotspot> Solar_regimenList=hotspotService.getSolar_regimen();
        return Solar_regimenList;
    }
    //模糊查询
    @ResponseBody
    @RequestMapping("/mhSearch")
    public List<tb_natmeha_hotspot> mhSearch(String searchValue){
        if(searchValue==null||searchValue==""){
            List<tb_natmeha_hotspot> Solar_regimenList=hotspotService.getSolar_regimen();
            return Solar_regimenList;
        }else {
            hotspotService.mhSearch(searchValue);
            return hotspotService.mhSearch(searchValue);
        }
    }
}
