package guet.com.cn.guoyitangadmin.service;

import guet.com.cn.guoyitangadmin.bean.UserPersionInformation;

import java.util.List;

public interface UserPersionInformationService {

    List<UserPersionInformation> selectUser(String userId);
    String testTime(String userId);
    String isBody(String userId);
    String turnToBody(String userId);
}
