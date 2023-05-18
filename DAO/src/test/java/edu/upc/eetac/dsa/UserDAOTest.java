package edu.upc.eetac.dsa;

import org.junit.Assert;
import org.junit.Test;

public class UserDAOTest {

    @Test
    public void addUserTest() {
        IUserDAO userDAO = new UserDAOImpl();
        userDAO.addUser("aaaaa", "wdw",1314);
    }

    @Test
    public void getUserTest() {
        IUserDAO userDAO = new UserDAOImpl();
        edu.upc.eetac.dsa.model.User user = userDAO.getUser(5);

        Assert.assertEquals("Jordi", user.getName());

    }
/*
    @Test
    public void getUserTest2() {
        IUserDAO userDAO = new UserDAOImpl();
        edu.upc.eetac.dsa.model.User user = userDAO.getUserByName("Jordi");

        Assert.assertEquals("Jordi", user.getName());

    }
*/
}
