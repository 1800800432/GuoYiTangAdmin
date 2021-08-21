package guet.com.cn.guoyitangadmin.bean;


import lombok.Data;

@Data
public class t_user_answer {
    // 用户—体质测评结果 关联表

    private int itemID;
    private String itemCode;
    private String user_id;
    private String q_id;
    private String q_option;
    private String tcm_remark;
    private String type_id;
    private String seq;
    private String useflag;
    private String flag1;
    private String flag2;
    private String flag3;
    private String uptFlag;
    private String result_itemcode;
}
