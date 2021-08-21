package guet.com.cn.guoyitangadmin.service.Impl;

import guet.com.cn.guoyitangadmin.bean.UserPersionInformation;
import guet.com.cn.guoyitangadmin.mapper.UserPersionInformationMapper;
import guet.com.cn.guoyitangadmin.service.UserPersionInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPersionInformationServiceImpl implements UserPersionInformationService {

    @Autowired
    UserPersionInformationMapper userPersionInformationMapper;

    @Override
    public List<UserPersionInformation> selectUser(String userId) {
        return userPersionInformationMapper.selectPersion(userId);
    }

    @Override
    public String testTime(String userId) {
        System.out.println(userId);
        System.out.println(userPersionInformationMapper.testTime(userId));
        return userPersionInformationMapper.testTime(userId);
    }

    @Override
    public String isBody(String userId) {
        return userPersionInformationMapper.isBody(userId);
    }

    @Override
    public String turnToBody(String userId) {
        return userPersionInformationMapper.turnToBody(userId);
    }
}
