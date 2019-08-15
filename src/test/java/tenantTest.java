import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class tenantTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createNewTenantInstanceSuccessful_true(){
        tenant testTenant = new tenant("Westlands", "1 bed", "10k - 15k");
        assertEquals(true, testTenant instanceof tenant);
    }

    @Test
    public void tenant_instantiatesWithTenantLocation_String(){
        tenant testTenant = new tenant("Westlands",  "1 bed", "10k - 15k");
        assertEquals("Westlands", testTenant.getLocation());
    }

    @Test
    public void tenant_instantiatesWithTenantRoom_String(){
        tenant testTenant = new tenant("Westlands",  "1 bed", "10k - 15k");
        assertEquals("1 bed", testTenant.getRoom());
    }

    @Test
    public void tenant_instantiatesWithTenantPrice_String(){
        tenant testTenant = new tenant("Westlands",  "1 bed", "10k - 15k");
        assertEquals("10k - 15k", testTenant.getPrice());
    }
}