import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld helloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat matroskin = (Cat) applicationContext.getBean("cat");
        Cat tihon = (Cat) applicationContext.getBean("cat");
        System.out.println(bean == helloWorld);
        System.out.println(matroskin == tihon);
    }
}