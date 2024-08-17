package fajar.lombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BuilderPersonTest extends AbstractValidatorTest {


    @Test
    void testCreateViaConstructor() {

        // membuat dan mengisi object via constructor

        var list = new ArrayList<String>();
        list.add("game");
        list.add("read");
        list.add("traveling");


        var person = new Person("id","name", 30, list);

        //contoh menggunakan Setter

        var personSet = new Person();
        personSet.setId("p");//ini contoh menggunakan Setter
        
        

    }


    @Test
    void testCreateViaBuilder() {

        var hobbies = new ArrayList<String>();
        hobbies.add("Swimming");
        hobbies.add("playing game");
        hobbies.add("slepp");




        // ini contoh penggunaan dari builder() kita bisa tinggal memanggil fieldnya saja lalu diakhir statement panggil method build()
        var person = Person.builder()
                .id("id")
                .name("name")
                .age(21)
                .hobby("Coding")
                .hobby("Reading")
                .hobby("Fishing")
                .build();
        log.info("{} ",person);



    }
}
