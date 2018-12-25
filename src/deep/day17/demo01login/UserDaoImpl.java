package deep.day17.demo01login;

import java.util.ArrayList;

/**
 * @program: study
 * @description:用户操作具体实现类
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-25 19:16
 */
public class UserDaoImpl implements UserDao {
    private static ArrayList<User> arrayList = new ArrayList<>();

    @Override
    public boolean isLogin(String username, String password) {
        boolean flag = false;
        for (User u : arrayList) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void regist(User user) {

        arrayList.add(user);
    }
}
