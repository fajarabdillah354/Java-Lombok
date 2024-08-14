package fajar.lombok;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.Range;

/** Static Method
 * Beberapa Class kadang ada yang menggunakan static method untuk membuat objectnya, contohnya Calendar, biasanya kita gunakan Calendar.getInstance()
 * Lombok juga bisa digunakan untuk membuat object dengan static object, kita bisa gunakan annotation yang sama, namun kita bisa tambahkan method() staticName pada annotation nya
 * Secara otomatis constructornya akan menjadi private, sehingga dipaksa untuk menggunakan static method ketika membuat object nya
 */


@Getter
@NoArgsConstructor(staticName = "createEmpty")// penambahan staticName untuk memberi tahu kalo ini adalah static method dari constructor sehingga kita tidak perlu menambahkan new ClassName saat pemanggilannya cukup .createEmpty untuk menggunakan constructor yang kosong tanpa parameter
@AllArgsConstructor(staticName = "create")// untuk constructor yang mempunyai parameter, secara otomatis akan mengakses semua field yang dijadikan constructor
@ToString(exclude = {
        "password"
})
@EqualsAndHashCode(exclude = {
        "password"
})
public class Login {

    /** Equals dan HashCode @EqualsAndHashCode
     * Lombok juga bisa digunakan untuk membuat method equals dan hashCode secara otomatis
     * Seperti yang pernah dijelaskan di kelas Java OOP, kedua method ini akan selalu diimplementasikan berbarengan
     * Untuk membuat Equals dan HashCode secara otomatis, kita bisa gunakan annotation @EqualsAndHashCode

     Exclude Field
     * Saat membuat equals() dan hashCode() method, Lombok akan selalu menyamakan field mana yang dibandingkan
     * Secara default, Lombok akan menggunakan semua field yang ada di class tersebut
     * Jika kita tidak ingin menggunakan salah satu field, kita bisa gunakan exclude() method di annotation nya

     */


    /** ToString()
     * adalah sebuat annotation yang digunakan untuk menambahkan method toString() secara otomatis ke dalam program, dengan begini kita tidak perlu mengenerate toString() lagi secara manul
     * @ToString() akan membaca semua field yang ada pada class tersebut lalu dimasukkan kedalam method toString()
     * kita bisa menambahkan parameter exclude yang bertujuan untuk menyembunyikan field yang sensitif seperti password atau NIK
     */


    /** Access Level
     * Saat menggunakan @Getter dan @Setter, secara default method getter dan setter nya akan dibuat public
     * Namun jika kita ingin ubah, kita juga bisa ubah visibility nya menggunakan method value() di @Gettter atau @Setter
     */
    @Setter(value = AccessLevel.PROTECTED)
    @NotBlank(message = "USERNAME CAN NOT BLANK")
    private String Username;

    @Setter(value = AccessLevel.PROTECTED)
    @NotBlank(message = "PASSWORD CAN NOT BLANK")
    @Range(min = 6, max = 15, message = "LENGTH PASSWORD MUST BETWEEN {min} AND {max} ")
    private String password;



}
