import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = applicationContext.getBean(HelloWorld.class);
        HelloWorld bean1 = applicationContext.getBean(HelloWorld.class);
        Cat bean2 = applicationContext.getBean(Cat.class);
        Cat bean3 = applicationContext.getBean(Cat.class);
        System.out.println(bean == bean1);
        System.out.println(bean2 == bean3);
        System.out.println(bean);

    }
}