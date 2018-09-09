package coid.bca.IbankKevin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@ComponentScan({"coid.bca.IbankKevin","controller"})
@Import({SecurityConfig.class})
public class IbankKevin {

	public static void main(String[] args) {
		SpringApplication.run(IbankKevin.class, args);
	}
}
