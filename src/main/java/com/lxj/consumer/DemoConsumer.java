package com.lxj.consumer;

import com.lxj.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixuejiao on 16/7/25.
 */
public class DemoConsumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();

        DemoService productService = (DemoService) context.getBean("demoService");
        System.out.println(productService.sayHello("world"));
        System.in.read();
    }
}
