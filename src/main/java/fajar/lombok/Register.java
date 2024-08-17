package fajar.lombok;

import lombok.Value;
import lombok.With;

/** @Value
 * Kadang kita sering membuat sebuah class yang bersifat immutable (tidak bisa diubah lagi ketika sudah dibuat)
 * Biasanya yang kita lakukan adalah, menjadikan semua field nya final, tidak membuat setter method dan membuat constructor untuk semua field
 * Lombok memiliki fitur yang bisa kita gunakan untuk membuat immutable class, yaitu menggunakan annotation @Value
 */


@Value
@With//untuk memodifikasi field yang ada di class, dan mengcopy semua field lainnya
public class Register {


    String username;//tidak perlu menambahkan modifier final(private final) karna dengan annotation @Value kita dapat membuat sebuah class menjadi immutable

    String password;


}
