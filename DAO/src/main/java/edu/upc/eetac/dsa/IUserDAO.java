package edu.upc.eetac.dsa;

import edu.upc.eetac.dsa.model.User;

import java.util.List;

public interface IUserDAO {

    public int addUser(String name, String surname, int salary);
    public User getUser(int employeeID);
    public void updateEmployee(int employeeID, String name, String surname, int salary);
    public void deleteEmployee(int employeeID);
    public List<User> getEmployees();
    public List <User> getEmployeeByDept(int deptId);

    User getUserByName(String jordi);
}