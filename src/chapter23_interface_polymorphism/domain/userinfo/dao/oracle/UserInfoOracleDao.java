package chapter23_interface_polymorphism.domain.userinfo.dao.oracle;

import chapter23_interface_polymorphism.domain.userinfo.UserInfo;
import chapter23_interface_polymorphism.domain.userinfo.dao.UserInfoDao;

// UserInfoDao 인터페이스를 구현한 Oracle 버전 dao
public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into ORACLE DB userId =" + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into ORACLE DB userId =" + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from ORACLE DB userId =" + userInfo.getUserId());
    }
}
