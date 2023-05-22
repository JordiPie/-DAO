package edu.upc.eetac.dsa;

import org.junit.Assert;
import org.junit.Test;

public class UserDAOTest {

    @Test
    public void addUserTest() {
        IUserDAO userDAO = new UserDAOImpl();
        userDAO.addUser("anna", "sabater","anna@upc","1234" );
    }

    @Test
    public void getUserTest() {
        IUserDAO userDAO = new UserDAOImpl();
        edu.upc.eetac.dsa.model.User user = userDAO.getUser(1);

        Assert.assertEquals("Jordi", user.getName());

    }



    @Test
    public void getUserTest2() {
        IUserDAO userDAO = new UserDAOImpl();
        edu.upc.eetac.dsa.model.User user = userDAO.getUserByName("Jordi");

        Assert.assertEquals("Jordi", user.getName());

    }

}
