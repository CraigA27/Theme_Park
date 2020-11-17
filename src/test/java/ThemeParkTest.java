import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    Dodgems dodgems;
    TobaccoStall tobaccoStall;
    CandyflossStall candyflossStall;
    Visitor visitor;

    @Before
    public void before(){
        themePark = new ThemePark();
        rollerCoaster = new RollerCoaster("Coaster", 10);
        dodgems = new Dodgems("Dodger", 10);
        tobaccoStall = new TobaccoStall("Smokey Joe's", "Joe", ParkingSpot.B1, 10);
        candyflossStall = new CandyflossStall("Pete's Sweets", "Peter Pan", ParkingSpot.A4, 10);
        visitor = new Visitor(18, 170, 100);
    }

    @Test
    public void canAddToList(){
        themePark.addAttraction(rollerCoaster);
        assertEquals(1, themePark.getNumberOfAttractions());
    }

    @Test
    public void canGetReviewed(){
        themePark.addAttraction(rollerCoaster);
        themePark.addAttraction(dodgems);
        themePark.addStall(tobaccoStall);
        themePark.addStall(candyflossStall);
        assertEquals(4, themePark.getAllIReviewed().size());
    }

    @Test
    public void canAddVisit(){
        themePark.visit(visitor, dodgems);
        assertEquals(1, visitor.getVisitedAttractions().size());
        assertEquals(1, dodgems.getVisitCount());
    }
}
