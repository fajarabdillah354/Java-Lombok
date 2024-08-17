package fajar.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WithRegisterTest {

    @Test
    void testWithModifyField() {
        //terkadang kita ingin membuat object yang sama namun value fieldnya berbeda

        var register1 = new Register("fajar","rahasia");

        //untuk membuatnya kita bisa berikan annotation @With pada field(jika mau hanya field tertentu) atau pada classnya(untuk semua field yang ada di class tersebut).

        var register2 = register1.withUsername("fahmi");//membuat object baru dari class Register hanya saja passwordnya sama dengan object pertama yang beda hanya usernamenya


        Assertions.assertEquals(register1.getPassword(), register2.getPassword());//jika passwordnya beda pada akan throw Exception

        Assertions.assertNotEquals(register1.getUsername(), register2.getUsername());//akan Error jika username dari object register1 dan register2 sama


    }
}
