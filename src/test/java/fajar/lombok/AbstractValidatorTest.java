package fajar.lombok;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public abstract class AbstractValidatorTest {


    public static final Logger log = LoggerFactory.getLogger(AbstractValidatorTest.class);

    protected ValidatorFactory validatorFactory;

    protected Validator validator;

    @BeforeEach
    void beforeEach() {
        validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();

    }


    @AfterEach
    void tearDown() {
        validatorFactory.close();
    }



    void validate(Object o){
        Set<ConstraintViolation<Object>> violations = validator.validate(o);
        for (ConstraintViolation<Object> constraintViolation : violations) {
            log.info("{} ",constraintViolation.getMessage());
            log.info("{} ",constraintViolation.getPropertyPath());

        }
    }
}
