package chapter23_interface_polymorphism.domain.userinfo.dao;

import chapter23_interface_polymorphism.domain.userinfo.UserInfo;

// dao 에서 제공되어야 할 메서드를 선언한 인터페이스
public interface UserInfoDao {
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
