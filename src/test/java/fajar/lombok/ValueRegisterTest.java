package fajar.lombok;

import org.junit.jupiter.api.Test;

public class ValueRegisterTest extends AbstractValidatorTest{


    @Test
    void testValueRegister() {

        //Saat kita menggunakan annotation @Value otomatis class menjadi immutable sehingga tidak ada method Setter di dalamnya
        var register = new Register("fajar","rahasia");

        log.info("{} ",register.getPassword());

    }
}
