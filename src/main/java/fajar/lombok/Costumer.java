package fajar.lombok;

import lombok.*;

@Getter //otomatis akan memberi getter pada variabel yang non static pada class ini
@Setter //otomatis akan memberi setter pada variabel yang non static pada class ini
@NoArgsConstructor
@AllArgsConstructor
public class Costumer {

    /** Constructor
     * Lombok juga bisa digunakan untuk membuat constructor secara otomatis
     * @NoArgsConstructor digunakan untuk membuat constructor tanpa parameter
     * @AllArgsConstructor digunakan untuk membuat constructor dengan semua parameter yang diambil dari field nya, urutannya sesuai dengan urutan field nya
     * kita bisa menambahkan key final sebagai tanda bahwa field akan menjadi required pada constructor, contoh kita menambahkan final pada field id maka pada constructor hanya akan ada parameter final id saja sementara field lain tidak dimasukkan kedalam paramater
     * Hati2 jika kita menukar posisi field yang ada di class Costumer maka akan terjadi error
     */
    private String id;

    private String name;

}




