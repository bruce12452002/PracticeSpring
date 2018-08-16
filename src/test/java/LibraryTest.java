
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import bean.Animal;
import bean.Bird;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Animal.class)
public class LibraryTest {
	@Autowired
	private Animal a;

	@Autowired
	private Bird b;

	@Test
	public void testAutowired() {
		System.out.println(a);
		System.out.println(b);
	}

	@Ignore
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
