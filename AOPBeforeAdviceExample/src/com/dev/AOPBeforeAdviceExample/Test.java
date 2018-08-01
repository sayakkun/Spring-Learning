package com.dev.AOPBeforeAdviceExample;

/*import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
*/
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
		/*Resource r = new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		BusinessLogic businessLogicObj = factory.getBean("proxy",BusinessLogic.class);
		businessLogicObj.display();*/
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		BusinessLogic businessLogicObj=context.getBean("proxy",BusinessLogic.class);
		/*string bean name
		 * arguments
		 */
		businessLogicObj.display();
	}
}
