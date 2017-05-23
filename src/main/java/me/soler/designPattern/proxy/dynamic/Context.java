package me.soler.designPattern.proxy.dynamic;/**
 * Created by soler on 2017/5/23.
 */

import me.soler.designPattern.proxy.GamePlayer;
import me.soler.designPattern.proxy.IGamePlayer;

/**
 * <p>动态代理上下文 </p>
 *
 * @author weizengjie
 * @since 2017/5/23
 */
public class Context {
    public static void main(String[] args) {
        String user = "soler";
        String name = "自来卷儿";
        String pwd = "123456";
        IGamePlayer player = new GamePlayer(user, name);
        IGamePlayer proxy = DynamicProxyFactory.getGameProxy(player, () -> System.out.println("game is proxyed"));
        proxy.login(name, pwd);
        proxy.killBoss();
        proxy.upgrade();
    }

}
