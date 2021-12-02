import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RatingTest {
    @Test
    void returnSatisfactionRating() {
        ISatisfaction satisfaction = SatisfactionFactory.calculateCompanySatisfaction("Rating");
        assertEquals(4, satisfaction.calculateMetric());
    }
}