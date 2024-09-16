import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AppTest {
    App app = new App();

    @Test
    public void addMeTest() {
        assertEquals(3, app.addMe(1,2));
    }

    @Test
    public void subbMeTest() {
        assertEquals(2,app.subbMe(3,1));
    }
}