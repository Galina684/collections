package pro.sky.Homework25.Employees;

import java.util.Collection;

public interface EmployeeServiceInterface {
   Employee add(String firstName, String lastName);
   Employee remove(String firstName, String lastName);
   Employee find(String firstName, String lastName);
   Collection<Employee> findAll();

}
