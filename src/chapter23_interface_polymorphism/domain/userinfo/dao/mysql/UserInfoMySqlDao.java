package chapter23_interface_polymorphism.domain.userinfo.dao.mysql;

import chapter23_interface_polymorphism.domain.userinfo.UserInfo;
import chapter23_interface_polymorphism.domain.userinfo.dao.UserInfoDao;

// UserInfoDao 인터페이스를 구현한 MySql 버전 dao
public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MYSQL DB userId =" + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MYSQL DB userId =" + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from MYSQL DB userId =" + userInfo.getUserId());
    }
}
