package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedTo(){
        visitor = new Visitor(14, 140, 100);
        visitor.getAge();
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void canChargeDouble(){
        visitor = new Visitor(20, 200, 100);
        visitor.getHeight();
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.01);
    }
}
