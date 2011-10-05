import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest 
{ 
    @Test
    public void creatandRetrieveCustomer()
    {
        new Customer("Will", "Shepherd", 0045).save();
        Customer will = Customer.find("bylastName", "Shepherd").first();
        
        assertNotNull(will);
        assertEquals("Will", will.firstName);
    }

}
