package fajar.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonNullMemberTest {
    /** Non Null
     * Sebelumnya, saat kita membuat constructor dengan @RequiredArgsConstructor, Lombok akan menjadi final field. Hal ini membuat field tersebut tidak bisa diubah lagi
     * Lombok memiliki annotation @NonNull
     * Jika @NonNull ditempatkan di field, maka secara otomatis juga akan di generate di @RequiredArgsConstructor, sekaligus dilakukan pengecekan tidak boleh null. Selain itu semua setter method nya juga akan dilakukan pengecekan null
     * Jika @NonNull ditempatkan di parameter, maka parameter tersebut akan dilakukan pengecekan null
     * Jika parameternya null, maka otomatis akan throw NullPointerException
     */

    @Test
    void testNonNullConstructor() {

        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member(null,null);
        });

    }


    @Test
    void testNonNullParamater() {

        //cheking method with NullPointerException, expected must be NullPointer
        Member member = new Member("fajar","staff");
        Assertions.assertThrows(NullPointerException.class, () -> {
           member.sayHello(null);
        });

    }
}
