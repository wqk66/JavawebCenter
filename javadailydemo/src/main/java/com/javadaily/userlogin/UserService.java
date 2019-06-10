package com.javadaily.userlogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 业务逻辑类
 */
@Service
public class UserService {
    //AutoWired自动装配UserRepository
    @Resource
    UserRepositorys userRepositorys;

    public Result<Long> login(String userName, String password) {
        Result<Long> result = new Result<Long>();
        User u = userRepositorys.getByUserName(userName).get();
        if (u == null) {
            result.setErrCode(-1);
            result.setErrMessage("用户不存在");

        } else if (u.getPassword().equals(password)) {
            System.out.println(u.toString());
            result.setErrCode(0);
            result.setData(u.getId());

        } else {
            result.setErrCode(1);
            result.setErrMessage("密码错误");
        }
        return result;
    }

    public Result<User> add(User user) {
        Result<User> result = new Result<>();
        User u = userRepositorys.save(user);
        if (u != null) {
            result.setErrCode(0);
            result.setData(u);
        }else{
            result.setErrCode(-1);
            result.setErrMessage("发生错误");
        }
        return result;
    }

    public void initUserData() {
        Iterable<User> users = userRepositorys.findAll();
        int sum = 0;
        while (users.iterator().hasNext()) {
            users.iterator().next();
            sum++;
        }
        if (sum == 0) {
            for(int i=0;i<5;i++) {
                User user = new User();
                user.setUserName("Admin"+1);
            }
        }
    }

}
