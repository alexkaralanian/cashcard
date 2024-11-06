package example.cashcard;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CashCardJsonTests {

    @Test
    void myFirstTest() {
        System.out.println("HELLO WORLD");
        assertThat(42).isEqualTo(42);
    }
}

