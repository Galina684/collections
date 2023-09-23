package pro.sky.Homework25.Employees;

import org.springframework.stereotype.Service;
import pro.sky.Homework25.exceptions.EmployeeAlreadyAddedException;
import pro.sky.Homework25.exceptions.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
public class EmployeeService implements EmployeeServiceInterface {


    private final List<Employee> employees = new ArrayList<>();

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException();
        }
        employees.remove(employee);
        return employee;
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException();
        }
        return employee;
    }

    @Override
    public Collection<Employee> findAll() {
        return employees;
    }

}
