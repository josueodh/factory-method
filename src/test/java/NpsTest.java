import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NpsTest {
    @Test
    void returnSatisfactionNps() {
        ISatisfaction satisfaction = SatisfactionFactory.calculateCompanySatisfaction("Nps");
        assertEquals(80, satisfaction.calculateMetric());
    }
}