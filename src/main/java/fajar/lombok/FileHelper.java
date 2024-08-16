package fajar.lombok;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


/** Log
 * Saat membuat aplikasi, kita sering sekali membuat log, dan juga otomatis sering sekali membuat field untuk Logger nya
 * Lombok mendukung pembuatan field log secara otomatis menggunakan annotation log, ada banyak yang didukung oleh Lombok, seperti @Log untuk Java Logging, @Slf4j untuk SLF4J, @CommonsLog untuk apache commons log, @Flogger untuk Google Flogger, @Log4J untuk Log4J, @JbossLog untuk JBoss Log
 * Secara otomatis Lombok akan membuat field bernama log sesuai dengan logger library yang kita gunakan
 */


@Slf4j//penggunaan annotation Slf4j untuk fitur Logger dalam java, ini secara otomatis akan menambahkan Logger
public class FileHelper {


    /** @Cleanup
     * Saat kita menggunakan object resource di Java yang perlu di close (seperti misal koneksi ke database), biasanya kita akan menggunakan try finally
     * Lombok memiliki fitur yang bisa kita gunakan untuk membuat auto generate close resource, yaitu annotation @Cleanup
     * @param file
     * @return
     * @throws Exception
     */


    /** @Sneaky Throws
     * Secara default saat kita membuat kode yang memiliki checked exception, kita perlu menangkapnya dalam try-catch
     * Lombok bisa secara pindah mengubah checked exception menjadi runtime exception tanpa mengubah exception nya itu sendiri
     * Lombok hanya mengakali agar compiler Java tidak komplen ketika kita tidak menangkap checked exception
     * Untuk melakukan itu, kita bisa menggunakan annotation @SneakyThrows
     * @param file
     * @return
     */

    @SneakyThrows//dengan menggunakan ini kita bisa mengakali compiler agar bisa menerima checked exception padahal sebenarnya ini cuma fitur akal2 an lombok. INI SANGAT MEMBANTU SEKALI
    public static String loadFile(String file){

        //akan membaca lognya terlebih dahulu
        log.info("{} ", file);

        @Cleanup FileReader fileReader = new FileReader(file);

        @Cleanup Scanner scanner = new Scanner(fileReader);

        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()){
            builder.append(scanner.nextLine()).append("\n");
        }

        return builder.toString();

    }



}



