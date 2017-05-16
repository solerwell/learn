package me.soler.designPattern.proxy.dynamic;/**
 * Created by soler on 2017/5/16.
 */

/**
 * <p>动态代理工厂类 </p>
 *
 * @author weizengjie
 * @since 2017/5/16
 */
public class DynamicProxyFactory<T> {
    public static <T> T getProxy(T concreate){

        return concreate;
    }
}
