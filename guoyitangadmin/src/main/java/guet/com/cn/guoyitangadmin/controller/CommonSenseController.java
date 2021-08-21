package guet.com.cn.guoyitangadmin.controller;

import guet.com.cn.guoyitangadmin.bean.Tb_natmeha_chinese_medicine;
import guet.com.cn.guoyitangadmin.service.ICommonSenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class CommonSenseController {
    @Autowired
    ICommonSenseService iCommonSenseService;

    @GetMapping("/viewCommonSense")
    @ResponseBody
    public List<Tb_natmeha_chinese_medicine> viewCommonSenseIndex(){
        List<Tb_natmeha_chinese_medicine> chinese_medicineList=iCommonSenseService.viewCommonSenseIndex();
        System.out.println(chinese_medicineList);
        return chinese_medicineList;
    }

    @PostMapping("/searchCommonSense")
    @ResponseBody
    public  List<Tb_natmeha_chinese_medicine> searchCommonSense(@RequestBody Map<String,Object> map){
        System.out.println(map.get("searchInput"));
        System.out.println(map.get("displayState"));
        System.out.println(map.get("EfState"));
        List<Tb_natmeha_chinese_medicine> chinese_medicineList=iCommonSenseService.searchCommonSense(map);
        System.out.println(chinese_medicineList);
        return chinese_medicineList;
    }
}
