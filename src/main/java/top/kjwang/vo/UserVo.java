package top.kjwang.vo;

import top.kjwang.entity.LoginUser;

import java.util.List;

/**
 * @author kjwang
 * @Date 2023/3/8 15:15
 */
public class UserVo {
    private List<LoginUser> users;

    public List<LoginUser> getUsers() {
        return users;
    }

    public void setUsers(List<LoginUser> users){
        this.users = users;
    }
}
