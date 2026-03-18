package springwoboot.DemoSpringFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Dev obj = (Dev) context.getBean("dev"); // Autowire By name
        Dev obj =  context.getBean(Dev.class); // Autowire By Type
        obj.build();
        System.out.println(obj.getAge());
        obj.getLaptop();
    }
}
