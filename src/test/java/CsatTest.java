import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CsatTest {
    @Test
    void returnSatisfactionCsat() {
        ISatisfaction satisfaction = SatisfactionFactory.calculateCompanySatisfaction("Csat");
        assertEquals(75, satisfaction.calculateMetric());
    }
}