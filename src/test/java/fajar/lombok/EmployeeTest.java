package fajar.lombok;

import org.junit.jupiter.api.Test;

public class EmployeeTest extends AbstractValidatorTest{



    @Test
    void testEmployee() {
        var employee = new Employee("","fajar");

        validate(employee);



    }
}
