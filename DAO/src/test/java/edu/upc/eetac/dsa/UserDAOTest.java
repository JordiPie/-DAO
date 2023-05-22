package edu.upc.eetac.dsa;

import org.junit.Assert;
import org.junit.Test;

public class UserDAOTest {

    @Test
    public void addUserTest() {
        IUserDAO userDAO = new UserDAOImpl();
        userDAO.addUser("pep", "aa","pep@upc","12345" );
    }

    @Test
    public void getUserTest() {
        IUserDAO userDAO = new UserDAOImpl();
        edu.upc.eetac.dsa.model.User user = userDAO.getUser(14);

        Assert.assertEquals("jordi", user.getName());

    }



    @Test
    public void getUserTest2() {
        IUserDAO userDAO = new UserDAOImpl();
        edu.upc.eetac.dsa.model.User user = userDAO.getUserByEmail("pep@upc");

        Assert.assertEquals("12345", user.getPassword());

    }

}
