package top.kjwang.entity;

/**
 * @author kjwang
 * @Date 2023/3/8 12:36
 */
public class Orders {
    private Integer orderId;
    private User user;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
