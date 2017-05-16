package me.soler.designPattern.proxy.dynamic;/**
 * Created by soler on 2017/5/16.
 */

import me.soler.designPattern.proxy.IGamePlayer;

import java.lang.reflect.Proxy;

/**
 * <p>动态代理工厂类 </p>
 *
 * @author weizengjie
 * @since 2017/5/16
 */
public class DynamicProxyFactory {
    public static IGamePlayer getGameProxy(IGamePlayer concrete, IAdvice advice) {
        ClassLoader loader = concrete.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(loader, concrete.getClass().getInterfaces(),
                new GameInvocationHandler(advice, concrete));
        return proxy;
    }
}
