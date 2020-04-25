package example1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StartUp {
    public static void main(String[] args) {
        ApplicationContext parentContext = new ClassPathXmlApplicationContext("app-context2.xml");
        ClassPathXmlApplicationContext childAppContext = new ClassPathXmlApplicationContext(parentContext);
        childAppContext.setConfigLocation("app-context.xml");
        childAppContext.refresh();
        childAppContext.getBean("parent",MessagePrint.class).printMessage();
        childAppContext.getBean("child",MessagePrint.class).printMessage();
        childAppContext.getBean("child-parent",MessagePrint.class).printMessage();
    }
}
