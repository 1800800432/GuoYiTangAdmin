package guet.com.cn.guoyitangadmin.bean;


import lombok.Data;

@Data
public class UserPersionInformation {

    private String user_id; //用户编号
    private String tcm_remark; //数据时间段（答题时间段）
    private String type1; //体质
    private String type2; //倾向体质
    private String characteristic; //特征表现
    private String method1; //情志调节的方法
    private String method2; //饮食调节的方法
    private String method3; //起居调节调节的方法
    private String method4; //运动保健的方法
    private String method5; //穴位调节的方法

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getTcm_remark() {
        return tcm_remark;
    }

    public void setTcm_remark(String tcm_remark) {
        this.tcm_remark = tcm_remark;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getMethod1() {
        return method1;
    }

    public void setMethod1(String method1) {
        this.method1 = method1;
    }

    public String getMethod2() {
        return method2;
    }

    public void setMethod2(String method2) {
        this.method2 = method2;
    }

    public String getMethod3() {
        return method3;
    }

    public void setMethod3(String method3) {
        this.method3 = method3;
    }

    public String getMethod4() {
        return method4;
    }

    public void setMethod4(String method4) {
        this.method4 = method4;
    }

    public String getMethod5() {
        return method5;
    }

    public void setMethod5(String method5) {
        this.method5 = method5;
    }

    @Override
    public String toString() {
        return "UserPersionInformation{" +
                "user_id='" + user_id + '\'' +
                ", tcm_remark='" + tcm_remark + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", characteristic='" + characteristic + '\'' +
                ", method1='" + method1 + '\'' +
                ", method2='" + method2 + '\'' +
                ", method3='" + method3 + '\'' +
                ", method4='" + method4 + '\'' +
                ", method5='" + method5 + '\'' +
                '}';
    }
}
