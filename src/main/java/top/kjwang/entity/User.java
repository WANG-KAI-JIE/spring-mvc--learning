package top.kjwang.entity;

/**
 * @author kjwang
 * @Date 2023/3/7 14:36
 */
public class User {
    String userName;
    String password;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String name) {
        this.userName = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
