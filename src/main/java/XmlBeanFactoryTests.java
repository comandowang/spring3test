import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by comando on 2017/10/13.
 */
public class XmlBeanFactoryTests {
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("XmlBeanFactoryTests-localCollectionsUsingXsd.xml");

        XmlBeanFactory factory = new XmlBeanFactory(resource);


        TestBean testBean = (TestBean)factory.getBean("testBean");

        System.out.println(testBean.getBeanName());

        System.out.println("这是在dev分支上");

    }
}
