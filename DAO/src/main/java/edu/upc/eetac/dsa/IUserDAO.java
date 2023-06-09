package edu.upc.eetac.dsa;

import edu.upc.eetac.dsa.model.User;

import java.util.List;

public interface IUserDAO {

    public int addUser(String name, String surname, String email, String password);
    public User getUser(int userId);
    //public void updateEmployee(int employeeID, String name, String surname, int salary);
    public void deleteEmployee(int employeeID);
    public List<User> getEmployees();
    public List <User> getEmployeeByDept(int deptId);

    User getUserByEmail(String email);
}
