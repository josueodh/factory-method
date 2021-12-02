import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LikeDislikeTest {
    @Test
    void returnSatisfactionLikeDislike() {
        ISatisfaction satisfaction = SatisfactionFactory.calculateCompanySatisfaction("LikeDislike");
        assertEquals(98, satisfaction.calculateMetric());
    }
}