import com.lx.spring.Blue;
import com.lx.spring.MyConfig;
import com.lx.spring.Person;
import com.lx.spring.Yellow;
import com.lx.spring.service.MyService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author leixin
 */
public class SpringDemoTest {

    @Test
    public void testMyConfig() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
//        Person bean = applicationContext.getBean(Person.class);
//        System.out.println("bean = " + bean);

        Object person = applicationContext.getBean("person1");
        System.out.println("person = " + person);

        MyService myService = applicationContext.getBean(MyService.class);
//        Person myServicePerson = myService.getPerson();
//        System.out.println("myServicePerson = " + myServicePerson);
        MyService myService2 = applicationContext.getBean(MyService.class);

        System.out.println(myService == myService2);

        String[] names = applicationContext.getBeanNamesForType(Person.class);
        Arrays.stream(names).forEach(System.out::println);

        Blue blue = applicationContext.getBean(Blue.class);
        System.out.println("blue = " + blue);

//        Yellow yellow = applicationContext.getBean(Yellow.class);
//        System.out.println("yellow = " + yellow);


//        Object person3 = applicationContext.getBean("person3");
//        System.out.println("person3 = " + person3);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }

}
