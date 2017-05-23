package me.soler.designPattern.proxy.dynamic;/**
 * Created by soler on 2017/5/16.
 */

/**
 * <p>通知接口 </p>
 *
 * @author weizengjie
 * @since 2017/5/16
 */
@FunctionalInterface
public interface IAdvice {
    void exec();
}
