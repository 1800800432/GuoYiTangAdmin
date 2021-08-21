package guet.com.cn.guoyitangadmin.mapper;

import guet.com.cn.guoyitangadmin.bean.UserPersionInformation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserPersionInformationMapper {
    List<UserPersionInformation> selectPersion(String userId);
    String testTime(String userId);
    String isBody(String userId);
    String turnToBody(String userId);
}
