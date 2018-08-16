
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bean.Animal;

public class LibraryTest {
	@Test
	public void testSpring() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Animal.class);
		for (String s : app.getBeanDefinitionNames()) {
			System.out.println(s);
		}
		Animal a = app.getBean(Animal.class);
		System.out.println(a.getB());
		app.close();
	}
}
