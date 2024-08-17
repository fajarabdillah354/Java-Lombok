package fajar.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StaticNameLoginTest extends AbstractValidatorTest{

    public static final Logger log = LoggerFactory.getLogger(StaticNameLoginTest.class);


    @Test
    void testLoginWithotStaticName() {

//        var login = new Login();
//        login.setPassword();

    }


    @Test
    void testLoginWithStaticName() {

        var login = Login.create("fajar","fajar123");

        var login2 = Login.create("", "adaNi354etwygwegg");

        Assertions.assertEquals("fajar",login.getUsername());
        Assertions.assertEquals("fajar123",login.getPassword());

        log.info("{} ",login.getUsername());
        log.info("{} ",login.getPassword());

        validate(login);

    }

    @Test
    void testToString() {
        var login = Login.create("fajar", "rahasia");// karna pada class login sudah ditambahkan parameter exclude lalu diberi value password maka field password akan hide atau disembunyikan

        log.warn("{} ",login);

    }

    @Test
    void testEqualsAndHashcode() {

        var login1 = Login.create("fajar", "rahasia");
        var login2 = Login.create("fajar", "rahasia");


        Assertions.assertEquals(login1,login2);
        Assertions.assertEquals(login1.hashCode(), login2.hashCode());

        log.info("{} dan {} ",login1,login2);



    }
}
