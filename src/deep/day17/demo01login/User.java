package deep.day17.demo01login;

/**
 * @program: study
 * @description: user类
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-25 18:57
 */
public class User {
    //用户名
    private String username;
    //密码
    private String password;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
