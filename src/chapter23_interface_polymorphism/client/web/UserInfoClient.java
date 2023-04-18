package chapter23_interface_polymorphism.client.web;

import chapter23_interface_polymorphism.domain.userinfo.UserInfo;
import chapter23_interface_polymorphism.domain.userinfo.dao.UserInfoDao;
import chapter23_interface_polymorphism.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import chapter23_interface_polymorphism.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


// 하나의 인터페이스를 여러 객체가 구현하게 되면 클라이언트 프로그램은 인터페이스의 메서드를 활용하여 여러 객체의 구현을 사용할 수 있음 (다형성)
// DB에 회원 정보를 넣는 dao(data access object)를 여러 DB 제품이 지원될 수 있게 구현함
// 환경파일(db.properties) 에서 database의 종류에 대한 정보를 읽고 그 정보에 맞게 dao 인스턴스를 생성하여 실행될 수 있게 함
public class UserInfoClient {
    public static void main(String[] args) throws IOException {
//        FileInputStream file = new FileInputStream("db.properties");
//        Properties prop = new Properties();
//        prop.load(file);
//
//        String dbType = prop.getProperty("DBTYPE");
        String dbType = "ORACLE";
        System.out.println(dbType);

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("user01");
        userInfo.setPasswd("1234");
        userInfo.setUserName("James");

        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        } else {
            System.out.println("not support");
        }

        if (userInfo != null) {
            userInfoDao.insertUserInfo(userInfo);
            userInfoDao.updateUserInfo(userInfo);
            userInfoDao.deleteUserInfo(userInfo);
        }

    }
}
