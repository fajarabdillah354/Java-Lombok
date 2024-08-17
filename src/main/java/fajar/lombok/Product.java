package fajar.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/** @Data
 * Saat membuat sebuah class Data/Model/Entity, kadang kita sering menggunakan annotation @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
 * Lombok memiliki annotation khusus untuk mempersingkatnya, yaitu menggunakan @Data
 */


/** Override Annotation
 * Jika kita ingin mengubah annotation atau menambah annotation setelah menggunakan Data, kita juga bisa lakukan
 * Misal menambah @AllArgsContructor atau mengubah @ToString
 */

@Data
@AllArgsConstructor//membuat constructor dari semua field
@RequiredArgsConstructor//membuat constructor dari final field
@ToString(exclude = "price")//tidak hanya menggunakan @Data kita juga bisa meng Override annotation lainnya dibawahnya @Data. Seperti ini contohnya
public class Product {

    private final String id; //akan membuat constructor yang ada parameter yang bersifat final, jika ada field final makan kita harus set dengan constructor tidak boleh kosong

    private String username;

    private Long price;

}
