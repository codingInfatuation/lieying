package org.lieying.web.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor extends HandlerInterceptorAdapter {
    /**
     * 在业务处理器处理请求之前被调用
     * - 如果返回false
     * 从当前的拦截器往回执行所有拦截器的afterCompletion()方法，再退出拦截器链
     * - 如果返回true
     * 执行下一个拦截器，知道所有的拦截器都执行完毕
     * 再执行被拦截的Controller
     * 然后进入拦截器链，
     * 从最后一个拦截器往回执行所有的postHandel()方法
     * 接着再从最后一个拦截器往回执行所有的afterCompletion()方法*/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token=request.getHeader("token");
        System.out.println(token);
        if (token==null){
            response.setStatus(401);
            System.out.println(401);
            return false;
        } else{
            return true;
        }

    }
    /**
     * 在业务处理器处理请求执行完成后，生成视图之前执行的动作
     * 可在 modelAndView 中加入数据，比如当前的时间
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    /**
     * 在DispatcherServlet完全处理完请求后被调用，可用于清理资源等
     * 当有拦截器抛出异常时，会从当前拦截器往回执行所有的拦截器的afterCompletion()方法
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
}
