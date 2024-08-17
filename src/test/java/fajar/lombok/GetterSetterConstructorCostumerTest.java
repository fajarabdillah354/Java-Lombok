package fajar.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetterSetterConstructorCostumerTest {

    /** Getter dan Setter
     * Lombok bisa kita gunakan untuk membuat Getter dan Setter method secara otomatis dengan menggunakan annotation @Getter dan @Setter
     * Jika ditempatkan pada field, secara otomatis akan membuat getter atau setter untuk field tersebut
     * Jika ditempatkan pada class, semua field yang tidak static akan otomatis dibuatkan getter atau setter nya
     */

    public static final Logger log = LoggerFactory.getLogger(GetterSetterConstructorCostumerTest.class);


    @Test
    void testCostumerGetterSetter() {



        var costumer = new Costumer();
        costumer.setId("CS-001");
        costumer.setName("fajar abdillah ahmad");

        log.info("{} ",costumer.getId());
        log.info("{} ",costumer.getName());

//        costumer.getId();
//        costumer.getName();

    }


    @Test
    void testCostumerConstructor() {

        /** Constructor
         * Lombok juga bisa digunakan untuk membuat constructor secara otomatis
         * @NoArgsConstructor digunakan untuk membuat constructor tanpa parameter
         * @AllArgsConstructor digunakan untuk membuat constructor dengan semua parameter yang diambil dari field nya, urutannya sesuai dengan urutan field nya
         * Hati2 jika kita menukar posisi field yang ada di class Costumer maka akan terjadi error
         */


        var costumer = new Costumer("J-001", "Fajar Abdillah Ahmad");
        Assertions.assertEquals("J-001",costumer.getId());
        Assertions.assertEquals("Fajar Abdillah Ahmad",costumer.getName());


    }
}
