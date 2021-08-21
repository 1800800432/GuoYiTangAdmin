package guet.com.cn.guoyitangadmin.controller;

import guet.com.cn.guoyitangadmin.bean.tb_natmeha_hotspot;
import guet.com.cn.guoyitangadmin.service.hotspotService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
@RequestMapping("/ChineseMedicine_culture")
public class ChineseMedicine_cultureController {
    @Autowired
    private guet.com.cn.guoyitangadmin.service.hotspotService hotspotService;
    String contant=null;
    //中医文化
    @RequestMapping("/getChineseMedicine_culture")
    @ResponseBody
    public List<tb_natmeha_hotspot> getChineseMedicine_culture(){
        List<tb_natmeha_hotspot> ChineseMedicine_cultureList=hotspotService.getChineseMedicine_cultureList();
        return ChineseMedicine_cultureList;
    }
    //搜索
    @RequestMapping("/basicSearch")
    @ResponseBody
    public List<tb_natmeha_hotspot> basicSearch(
            String searchValue,
            String top1Select,
            String top1StarDate,
            String top1StarTime,
            String top1EndDate,
            String top1EndTime){
        //时间拼接
        String starDate=null;
        String endDate=null;
        if (top1StarDate!="" || top1StarTime!=""){
            starDate=String.join(" ",top1StarDate,top1StarTime);
        }
        if (top1EndDate!="" || top1EndTime!=""){
            endDate=String.join(" ",top1EndDate,top1EndTime);
        }
        int select=0;
        //查询类型
        int dataType=3;
        if ((searchValue !="" && searchValue!=null)
                || (top1Select !="" && top1Select!=null)
                ||(starDate !="" && starDate!=null)
                ||(endDate !="" && endDate!=null)){
            //数据状态
            if (top1Select.equals("zhanshi")){
                select=8;
            }else if(top1Select.equals("xiajia")){
                select=9;
            }
            System.out.println(starDate);
            System.out.println(endDate);
            List<tb_natmeha_hotspot> basicSearchList=hotspotService.basicSearch(searchValue,dataType,select,starDate,endDate);
            System.out.println("数据"+basicSearchList);
            return basicSearchList;
        }else {
            System.out.println("为空");
            return null;
        }
    }
    @RequestMapping("/deleteChineseMedicine_culture")
    @ResponseBody
    public void delete(String itemID){
        hotspotService.delete(itemID);
    }
    @RequestMapping("/modifyChineseMedicine_culture")
    @ResponseBody
    public String modify(String mHotspot_TITLE,
                       String mHotspot_SOURCE,
                       String mHotspot_AUTHOR,
                       int itemID){
        hotspotService.modify(mHotspot_TITLE,mHotspot_SOURCE,mHotspot_AUTHOR,itemID,contant);
        return contant;
    }
    @PostMapping("/upload")
    @ResponseBody
    public void upload(@RequestParam MultipartFile  file) throws IOException {
        if (file.isEmpty()) {
            System.out.println("文件空");
        }else{
            System.out.println("成功");
        }
        InputStream in = file.getInputStream();
        try {
            ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
            byte[] buff = new byte[in.available()];
            int rc = 0;
            while ((rc = in.read(buff, 0, 100)) > 0) {
                swapStream.write(buff, 0, rc);
            }
            contant=swapStream.toString();
            System.out.println(contant);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @RequestMapping("/addChineseMedicine_culture")
    @ResponseBody
    public List<tb_natmeha_hotspot> add(String hotspot_TITLE, String hotspot_SOURCE, String hotspot_AUTHOR){
        String userCode="ChineseMedicine_culture1234";
        int dataType=3;
        hotspotService.add(hotspot_TITLE,hotspot_SOURCE,hotspot_AUTHOR,contant,userCode,dataType);
        return hotspotService.getChineseMedicine_cultureList();
    }
}
