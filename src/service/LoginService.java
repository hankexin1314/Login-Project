package service;

import bean.User;
import dao.LoginDao;

import java.sql.SQLException;

public class LoginService {
    public User getUserByUsernameAndPwd(String username, String password) throws SQLException {

        // 创建LoginDao
        LoginDao ld = new LoginDao();

        return ld.getUserByUsernameAndPwd(username, password);
    }
}
