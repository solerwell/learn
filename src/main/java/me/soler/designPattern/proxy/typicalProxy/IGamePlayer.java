package me.soler.designPattern.proxy.typicalProxy;/**
 * Created by soler on 2017/4/18.
 */

/**
 * <p>游戏玩家接口 </p>
 *
 * @author weizengjie
 * @since 2017/4/18
 */
public interface IGamePlayer {
    /**
     * 登录
     * @param name
     * @param pwd
     */
    void login(String name,String pwd);

    /**
     * 打怪
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();
}
