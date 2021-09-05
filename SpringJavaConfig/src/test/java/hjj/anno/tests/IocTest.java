package hjj.anno.tests;

import com.alibaba.druid.pool.DruidDataSource;
import com.hjj.IocJavaConfig;
import com.hjj.controller.StudentController;
import com.hjj.model.Student;
import com.hjj.model.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class IocTest {

	private AbstractApplicationContext context;

	@BeforeEach
	public void before() {
		// 注解 根据javaConfig 实例化spring容器
		// ApplicationContext context = new AnnotationConfigApplicationContext();
		// xml 根据项目路径的xml 实例化spring容器
		// 容器实例化时，会加载所有的bean
		context = new AnnotationConfigApplicationContext(IocJavaConfig.class);
		System.out.println("加载Spring容器");
	}

	@Test
	public void test01() {
		StudentController controller = context.getBean("studentController", StudentController.class);
		controller.getStudent();
	}

	@Test
	public void test02() {
		DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
		System.out.println(dataSource);
	}

	@Test
	public void test03() {
		Student student = context.getBean("student01", Student.class);
		System.out.println(student);
	}

	@Test
	public void test04() {
		Teacher teacher = context.getBean(Teacher.class);
		System.out.println(teacher);
	}

	@Test
	public void test05() {
		Student student = context.getBean("student03", Student.class);
		System.out.println(student);
	}
}
