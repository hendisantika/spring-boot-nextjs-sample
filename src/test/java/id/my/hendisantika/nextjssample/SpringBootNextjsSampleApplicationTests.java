package id.my.hendisantika.nextjssample;

import id.my.hendisantika.nextjssample.repository.UsedCarSalesRepository;
import id.my.hendisantika.nextjssample.repository.UsersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@Testcontainers
@SpringBootTest(
        properties = {
                "management.endpoint.health.show-details=always",
                "spring.datasource.url=jdbc:tc:mysql:9.1.0:///carsDB"
        },
        webEnvironment = RANDOM_PORT
)
class SpringBootNextjsSampleApplicationTests {

    @Autowired
    private UsedCarSalesRepository usedCarSalesRepository;

    @Autowired
    private UsersRepository usersRepository;

    @BeforeEach
    void deleteAll() {
        usedCarSalesRepository.deleteAll();
        usersRepository.deleteAll();
    }

}
