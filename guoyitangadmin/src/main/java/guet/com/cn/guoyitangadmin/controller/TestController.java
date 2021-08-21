package guet.com.cn.guoyitangadmin.controller;


import com.alibaba.fastjson.JSON;
import guet.com.cn.guoyitangadmin.bean.KaiZhanXiangMu;
import guet.com.cn.guoyitangadmin.bean.UserPersionInformation;
import guet.com.cn.guoyitangadmin.bean.tb_natmeha_health_base;
import guet.com.cn.guoyitangadmin.service.HealthRecordService;

import guet.com.cn.guoyitangadmin.service.KaiZhanXiangMuService;
import guet.com.cn.guoyitangadmin.service.UserPersionInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@CrossOrigin
@Controller
public class TestController {

    @Autowired
   private HealthRecordService healthRecordService;
    @Autowired
    private UserPersionInformationService userPersionInformationService;
    @Autowired
    private KaiZhanXiangMuService kaiZhanXiangMuService;

    @RequestMapping("/test")
    public String test(String name,String id){
        System.out.println(name);
        System.out.println(id);
        return "test";
    }


    @RequestMapping("/api")
    public void operation( HttpServletResponse httpServletResponse,String persionId) throws IOException {
        List<tb_natmeha_health_base> informations=healthRecordService.selectInformation(persionId);
        httpServletResponse.setCharacterEncoding("utf-8");
        System.out.println(informations);
        String str= JSON.toJSONString(informations);
        httpServletResponse.getWriter();
        PrintWriter printWriter=httpServletResponse.getWriter();
        printWriter.println(str);
        printWriter.flush();
        printWriter.close();
    }
    @RequestMapping("/userInformation")
    public void persionInformation(HttpServletResponse httpServletResponse,String persionId) throws IOException {
        List<UserPersionInformation> userPersionInformationList=userPersionInformationService.selectUser(persionId);
        httpServletResponse.setCharacterEncoding("utf-8");
        String str= JSON.toJSONString(userPersionInformationList);
        httpServletResponse.getWriter();
        PrintWriter printWriter=httpServletResponse.getWriter();
        printWriter.println(str);
        printWriter.flush();
        printWriter.close();
    }
    /////////////////////////////////////////page1 Admin
    @RequestMapping("/KaiZhanXiangMu")
    public void KaiZhanXiangMu(HttpServletResponse httpServletResponse) throws IOException {
        List<KaiZhanXiangMu> AllData = kaiZhanXiangMuService.AllData();
        httpServletResponse.setCharacterEncoding("utf-8");
        String str= JSON.toJSONString(AllData);
        httpServletResponse.getWriter();
        PrintWriter printWriter=httpServletResponse.getWriter();
        printWriter.println(str);
        printWriter.flush();
        printWriter.close();
    }
    @RequestMapping("/KaiZhanXiangMuName")
    public void KaiZhanXiangMuName(HttpServletResponse httpServletResponse,String name) throws IOException {
        System.out.println("This value is :"+name);
        List<KaiZhanXiangMu> SelectData = kaiZhanXiangMuService.SelectData(name);
        httpServletResponse.setCharacterEncoding("utf-8");
        String str= JSON.toJSONString(SelectData);
        System.out.println(str);
        httpServletResponse.getWriter();
        PrintWriter printWriter=httpServletResponse.getWriter();
        printWriter.println(str);
        printWriter.flush();
        printWriter.close();
    }
    @RequestMapping("/KaiZhanXiangMuNameDataType")
    public void KaiZhanXiangMuNameDataType(HttpServletResponse httpServletResponse,String dataType) throws IOException {
        List<KaiZhanXiangMu> SelectData = kaiZhanXiangMuService.SelectDataType(dataType);
        httpServletResponse.setCharacterEncoding("utf-8");
        String str= JSON.toJSONString(SelectData);
        System.out.println(str);
        httpServletResponse.getWriter();
        PrintWriter printWriter=httpServletResponse.getWriter();
        printWriter.println(str);
        printWriter.flush();
        printWriter.close();
    }


    @RequestMapping("/KaiZhanXiangMuAddInformation")
    public void KKaiZhanXiangMuAddInformation(HttpServletResponse httpServletResponse,String value1,String value2,String value3) throws IOException {
        kaiZhanXiangMuService.AddInformation(value1,value2,value3);
        httpServletResponse.setCharacterEncoding("utf-8");
        String str= JSON.toJSONString("添加成功");
        httpServletResponse.getWriter();
        PrintWriter printWriter=httpServletResponse.getWriter();
        printWriter.println(str);
        printWriter.flush();
        printWriter.close();
    }

    /////////////////////////////////////////page2  Admin
    @RequestMapping("/KaiZhanXiangMuAddInformationFeature")
    public void KaiZhanXiangMuAddInformationFeature(HttpServletResponse httpServletResponse,String value1,int value2,String value3,String value4) throws IOException {
        kaiZhanXiangMuService.AddInformationFeature(value1,value2,value3,value4);
        httpServletResponse.setCharacterEncoding("utf-8");
        String str= JSON.toJSONString("添加成功");
        httpServletResponse.getWriter();
        PrintWriter printWriter=httpServletResponse.getWriter();
        printWriter.println(str);
        printWriter.flush();
        printWriter.close();
    }

}
