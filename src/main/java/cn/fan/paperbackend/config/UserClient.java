package cn.fan.paperbackend.config;

/**
 * +TODO
 *
 * @author : lirongfan@bytedance.com
 * @since : 2020/10/22
 */
public class UserClient {
    private UserPorperties userPorperties;

    public UserClient() {
    }
    public UserClient(UserPorperties p) {
        this.userPorperties = p;
    }
    public String getName() {
        return userPorperties.getName();
    }
}
