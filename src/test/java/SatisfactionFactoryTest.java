import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SatisfactionFactoryTest {
    @Test
    void returnNotFoundSatisfaction() {
        try {
            ISatisfaction satisfaction = SatisfactionFactory.calculateCompanySatisfaction("NotFoundClass");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Satisfaction type not found", e.getMessage());
        }
    }

    @Test
    void returnInvalidSatisfaction() {
        try {
            ISatisfaction satisfaction = SatisfactionFactory.calculateCompanySatisfaction("AnotherSatisfactionWithOutISatisfaction");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid satisfaction", e.getMessage());
        }
    }
}