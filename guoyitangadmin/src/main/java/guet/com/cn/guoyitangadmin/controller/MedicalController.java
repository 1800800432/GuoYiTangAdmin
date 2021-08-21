package guet.com.cn.guoyitangadmin.controller;

import guet.com.cn.guoyitangadmin.bean.CreateID;
import guet.com.cn.guoyitangadmin.bean.Medicateddiet;
import guet.com.cn.guoyitangadmin.service.IMedicateddietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MedicalController {
    @Autowired
    IMedicateddietService iMedicateddietService;

    @ResponseBody
    @GetMapping("/vuewMedicateddiet")
    public List<Medicateddiet> viewMedicateddiet(String name) {

//        System.out.println(name);
        List<Medicateddiet> medicateddietList = iMedicateddietService.viewMedicateddiet();
        return medicateddietList;

    }

    @GetMapping("/searchMessageByAll")
    @ResponseBody
    public List<Medicateddiet> searchMessageByAll(String selectState, String searchInput, String timePickerStart, String timePickerEnd) {

        Map<String, Object> map = new HashMap<>();
        map.put("searchInput", searchInput);
        map.put("selectState", selectState);
        map.put("timePickerStart", timePickerStart);
        map.put("timePickerEnd", timePickerEnd);

        List<Medicateddiet> medicateddietList = iMedicateddietService.searchMedicateddiet(map);
        return medicateddietList;
    }

    @PostMapping("/addmedicateddiet")
    @ResponseBody
    public  List<Medicateddiet> AddMedicateddiet(@RequestBody Map<String, Object> map) {
        System.out.println(map.get("tittle"));
        System.out.println(map.get("origin"));
        System.out.println(map.get("author"));
        System.out.println(map.get("publictime"));
        Map<String, Object> addmap = new HashMap<>();
        boolean flag = true;
        CreateID createID = new CreateID();
        String str = createID.generate9();
        System.out.println(str);
        String status = "8";
        while (flag) {

            Medicateddiet medicateddiet = iMedicateddietService.selectById(str);
            if (medicateddiet == null) {
                flag = false;
                addmap.put("id", str);
            } else {
                str = createID.generate9();
                medicateddiet = iMedicateddietService.selectById(str);
            }
        }

//        addmap.put("id",str);
        addmap.put("tittle", map.get("tittle"));
        addmap.put("origin", map.get("origin"));
        addmap.put("author", map.get("author"));
        addmap.put("publictime", map.get("publictime"));
        addmap.put("status", status);
        iMedicateddietService.addMedicateddiet(addmap);
        List<Medicateddiet> medicateddietList =iMedicateddietService.viewMedicateddiet();
        return medicateddietList;
    }
    @PostMapping("/modifyMedicateddiet")
    @ResponseBody
    public  List<Medicateddiet> modifyMedicateddiet(@RequestBody Map<String,Object> map){
        System.out.println(map.get("tittle"));
        System.out.println(map.get("origin"));
        System.out.println(map.get("author"));
        System.out.println(map.get("publictime"));
        System.out.println(map.get("id"));
        iMedicateddietService.modifyMedicateddiet(map);
        List<Medicateddiet> medicateddietList =iMedicateddietService.viewMedicateddiet();
        return medicateddietList;
    }
    @GetMapping("/deleteMedicateddiet")
    @ResponseBody
    public List<Medicateddiet> deleteMedicateddiet(String id){
        iMedicateddietService.deleteMedicateddiet(id);
        List<Medicateddiet> medicateddietList =iMedicateddietService.viewMedicateddiet();
        return medicateddietList;
    }
}


