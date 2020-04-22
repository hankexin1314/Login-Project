package dao;

import bean.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.DataSourceUtils;

import java.sql.SQLException;

public class LoginDao {
    public User getUserByUsernameAndPwd(String username, String password) throws SQLException {

        // 创建QueryRunner
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
        // 编写sql
        String sql = "select * from user where username = ? and password = ?";;
        // 执行sql
        User user = qr.query(sql, new BeanHandler<User>(User.class), username, password);
        return user;
    }
}
