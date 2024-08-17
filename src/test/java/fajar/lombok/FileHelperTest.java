package fajar.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class FileHelperTest {

    @Test
    void testPom() throws Exception{

        String text = FileHelper.loadFile("pom.xml");

        System.out.println(text);
    }


    @Test
    void testSneaky() {
        /**
         * dengan menggunakan SneakyThrow compiler akan mengakali error menjadi runtime sehingga tidak menghilangkan bawaan exception pada class FileReader, dimana bawaan dari class ini dapat menyebabkan error FileNotFoundException
         */

        Assertions.assertThrows(FileNotFoundException.class, () -> {//bernilai true jika benar jika FileHelper Throw FileNotFoundException
            FileHelper.loadFile("notFound.txt");
        });

    }
}
