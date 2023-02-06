import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean = (Cat) applicationContext.getBean("Lutic");
        Cat catBean2 = (Cat) applicationContext.getBean("Lutic");

        System.out.println(bean.equals(bean2));
        System.out.println(catBean.equals(catBean2));
        System.out.println(bean.getMessage());
        System.out.println(catBean.getName());
    }
}