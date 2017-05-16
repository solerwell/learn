package me.soler.designPattern.proxy.dynamic;/**
 * Created by soler on 2017/5/16.
 */

/**
 * <p> </p>
 *
 * @author weizengjie
 * @since 2017/5/16
 */
public class GameAdvice implements IAdvice {
    public void exec() {
        System.out.println("game is adviced");
    }
}
