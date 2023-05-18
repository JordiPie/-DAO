package edu.upc.eetac.dsa;

import edu.upc.eetac.dsa.model.User;
import edu.upc.eetac.dsa.util.ObjectHelper;
import org.junit.Assert;
import org.junit.Test;

public class ObjectHelperTest {


    @Test
    public void setterTest() {
        User u = new User();
        ObjectHelper.setter(u, "name", "Jordi");
        Assert.assertEquals("Jordi", u.getName());
    }

    @Test
    public void getMethodNameTest() {
        Assert.assertEquals("Name", ObjectHelper.getMethodName("name"));
    }
}
