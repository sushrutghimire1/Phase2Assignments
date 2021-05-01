package com.example;

import com.example.repository.SpeakerRepository;
import com.example.repository.SpeakerRepositoryImpl;
import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//1. @Component- CLass level
//2. @Bean - Method Level
//3. @Repository
//4. @Service
//5. @Controller
//6. @Scope- Singleton and Prototype
//7. @Configuration
//8. @Autowired- By type, By name, Spring automatically wires beans
//9. @ComponentScan("{}")
//10. SpEL- @Value("#{T(java.lang.Math).random}")
//11. @Profile("dev") VM Options: -D spring.profiles.active=dev
//12. FactoryBeans
//13. ApplicationContext.xml

@Configuration
public class AppConfig {
    @Bean(name = "speakerService")
    @Scope(value = "singleton")
    public SpeakerService getSpeakerService() {
        return new SpeakerServiceImpl();
    }

    @Bean(name = "serviceRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new SpeakerRepositoryImpl();
    }

}
