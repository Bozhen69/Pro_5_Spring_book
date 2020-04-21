import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartUp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-context.xml");
        MessageRender mr = applicationContext.getBean("renderer",MessageRender.class);
        mr.RenderMessage("Pavel, we wait your opinion.");
    }
}
