package pro.sky.Homework25;

public class EmployeeStorageIsFullException extends RuntimeException {
    public EmployeeStorageIsFullException() {
    }

    public EmployeeStorageIsFullException(String message) {
        super(message);
    }
}
