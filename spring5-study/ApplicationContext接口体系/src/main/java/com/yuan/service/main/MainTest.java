package com.epichust.service.main;

import com.epichust.controller.UserController;
import com.epichust.service.config.RootConfig;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.HashMap;

public class MainTest
{
    /**
     *  AbstractRefreshableApplicationContext 类型和 GenericApplicationContext 最大的区别就是：
     *  1.GenericApplicationContext 在构造方法内就创建了`beanfactory`，并且后面不能再刷新，刷新就抛异常
     *  2.AbstractRefreshableApplicationContext 构造方法内均不会创建`BeanFactory`，在`refreshBeanFactory()`方法内
     *    先判断`BeanFactory`是否已创建，一般情况下没有创建，如果有创建，关闭它，然后创建一个新的。
     *  3.GenericApplicationContext需要手动刷新，AbstractRefreshableApplicationContext会自动刷新
     */
    public static void main(String[] args)
    {
        //需要web环境
        //AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.epichust");

        /**
         * register操作将class对象添加到beanFactory的beanDefinitionMap中
         * 在后面的refresh操作中只会解析@Component注解的对象，所以该类一定要加上个@Component注解
         */
        context.register(RootConfig.class);
        context.refresh();
        UserController userController = context.getBean("userController", UserController.class);
        userController.test();
    }
}
