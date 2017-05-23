package me.soler.designPattern.proxy.dynamic;/**
 * Created by soler on 2017/5/16.
 */

import me.soler.designPattern.proxy.GamePlayer;
import me.soler.designPattern.proxy.IGamePlayer;

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
    private IGamePlayer target;
    GameInvocationHandler(IAdvice advice,IGamePlayer target){
        this.advice = advice;
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        advice.exec();
        return method.invoke(target,args);
    }
}
