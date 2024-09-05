import org.springframework.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.model.User;

public class Test {
	public static void main(String[] args) {
		System.out.println("hello");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
	}
}
