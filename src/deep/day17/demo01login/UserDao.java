package deep.day17.demo01login;

/**
 * @program: study
 * @description: 用户操作接口
 * @author: Feng
 * @create: 2018-12-25 19:00
 */
public interface UserDao {

    /**
     * @param username
     * @param password
     * @return
     */
    public abstract boolean isLogin(String username, String password);

    /**
     * @param user
     */
    public abstract void regist(User user);
}
