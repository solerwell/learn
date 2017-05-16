package me.soler.designPattern.proxy.dynamic;/**
 * Created by soler on 2017/5/16.
 */

import me.soler.designPattern.proxy.GamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>GameProxy对应的InvokeHandler,当Proxy对应方法被 </p>
 *
 * @author weizengjie
 * @since 2017/5/16
 */
public class GameInvocationHandler  implements InvocationHandler{
    private IAdvice advice;
    private GamePlayer target;
    GameInvocationHandler(IAdvice advice){
        this.advice = advice;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        ClassLoader loader =
        return Proxy.newProxyInstance();
    }
}
