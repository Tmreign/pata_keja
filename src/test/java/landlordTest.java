import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class landlordTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createNewLandlordInstanceSuccessful_true(){
        landlord testLandlord = new landlord("Westlands", "1 bed", "10k - 15k");
        assertEquals(true, testLandlord instanceof landlord);
    }

    @Test
    public void landlord_instantiatesWithLandlordLocation_String(){
        landlord testLandlord = new landlord("Westlands",  "1 bed", "10k - 15k");
        assertEquals("Westlands", testLandlord.getLocation());
    }

    @Test
    public void landlord_instantiatesWithLandlordRoom_String(){
        landlord testLandlord = new landlord("Westlands",  "1 bed", "10k - 15k");
        assertEquals("1 bed", testLandlord.getRoom());
    }

    @Test
    public void landlord_instantiatesWithLandlordPrice_String() {
        landlord testLandlord = new landlord("Westlands", "1 bed", "10k - 15k");
        assertEquals("10k - 15k", testLandlord.getPrice());
    }
}