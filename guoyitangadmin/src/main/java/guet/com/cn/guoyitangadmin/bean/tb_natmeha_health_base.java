package guet.com.cn.guoyitangadmin.bean;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import sun.dc.pr.PRError;

import java.util.Date;

@Data
public class tb_natmeha_health_base {

    //自增逐渐ID数目编号
    private int itemID;

    //编号
    private String PATIENT_ID;

    //姓名
    private String NAME;

    //证件类型
    private String ID_TYPE;

    //证件号码
    private String ID_NO;

    //性别
    private String SEX;

    //出生日期
    private String BIRTH_DATE;

    //文化程度
    private String EDUCATION;

    //户口性质
    private String ACCO_PROPERTY;

    //婚姻状况
    private String MARRIAGE;

    //移动电话
    private String MOBILE_PHONE;

    //民族
    private String NATIONALITY;

    //出生地
    private String BIRTH_PLACE;

    //既往病史
    private String PAST_SICKNESS_TYPE;

    //家族病史
    private String FAMILY_DISEASE;

    //患者与本人关系
    private String PATIENT_RELATION;

    //创建人
    private String CREATER;

    //创建时间
    private String itemCreateAt;

    //修改人
    private String UPDATER;

    //修改时间
    private String itemUpdateAt;
}
