package me.soler.designPattern.proxy;/**
 * Created by soler on 2017/4/18.
 */

/**
 * <p>游戏玩家代理类 </p>
 *
 * @author weizengjie
 * @since 2017/4/18
 */
public class GamePlayerProxy implements IGamePlayer, Countable{

    private IGamePlayer target;

    public GamePlayerProxy(IGamePlayer target) {
        this.target = target;
    }

    public GamePlayerProxy(String user,String name) {
    }

    public void count() {
        System.out.println("is going to count...");
    }

    public void login(String name, String pwd) {
        target.login(name,pwd);
    }

    public void killBoss() {
        target.killBoss();
    }

    public void upgrade() {
        target.upgrade();
        count();
    }
}
