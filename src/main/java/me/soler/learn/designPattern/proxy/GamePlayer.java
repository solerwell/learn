package me.soler.learn.designPattern.proxy;/**
 * Created by soler on 2017/4/18.
 */

/**
 * <p>游戏玩家实现 </p>
 *
 * @author weizengjie
 * @since 2017/4/18
 */
public class GamePlayer implements IGamePlayer {
    private String name;
    private static final String PASSWORD = "123456";

    public void login(String name, String pwd) {
        if (!PASSWORD.equals(pwd))
            System.out.println("password error!");
        this.name = name;
        System.out.println(name + "has login...");
    }

    public void killBoss() {
        System.out.println("boss is killed!");
    }

    public void upgrade() {
        System.out.println(name + "has upgraded...");
    }
}
