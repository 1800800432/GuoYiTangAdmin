package guet.com.cn.guoyitangadmin.controller;

import guet.com.cn.guoyitangadmin.bean.tb_natmeha_hotspot;
import guet.com.cn.guoyitangadmin.service.hotspotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Self_careController {
    @Autowired
    private guet.com.cn.guoyitangadmin.service.hotspotService hotspotService;
    //自我保健
    @ResponseBody
    @RequestMapping("/getSelf_care")
    public List<tb_natmeha_hotspot> getSelf_care(){
        List<tb_natmeha_hotspot> Self_care=hotspotService.getSelf_care();
        return Self_care;
    }
    //删除文章
    @ResponseBody
    @RequestMapping("/deleteSelf_care")
    public List<tb_natmeha_hotspot> deleteData(String itemID){
        hotspotService.deleteData(itemID);
        List<tb_natmeha_hotspot> Self_care=hotspotService.getSelf_care();
        return Self_care;
    }

    @ResponseBody
    @RequestMapping("/mohuSearch")
    public List<tb_natmeha_hotspot> mohuSearch(String searchValue){
        if(searchValue==null||searchValue==""){
            List<tb_natmeha_hotspot> Self_care=hotspotService.getSelf_care();
            return Self_care;
        }else {
            hotspotService.mohuSearch(searchValue);
            return hotspotService.mohuSearch(searchValue);
        }
    }
}
