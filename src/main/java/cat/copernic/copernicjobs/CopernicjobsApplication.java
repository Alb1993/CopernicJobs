package cat.copernic.copernicjobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class CopernicjobsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CopernicjobsApplication.class, args);

    }
}
