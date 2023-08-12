package net.javatest.springbackend;
import net.javatest.springbackend.model.Employee;
import net.javatest.springbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SpringBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Shubhmam");
//		employee.setLastName("Hatagale");
//		employee.setEmailId("shubhamhatagale02@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Mr");
//		employee1.setLastName("bean");
//		employee1.setEmailId("bean@gmail.com");
//		employeeRepository.save(employee1);
	}
}
