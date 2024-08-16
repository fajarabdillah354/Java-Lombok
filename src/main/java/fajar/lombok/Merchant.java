package fajar.lombok;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/** Secara otomatis constructornya akan menjadi private, sehingga dipaksa untuk menggunakan static method ketika membuat object nya
 * Secara otomatis constructornya akan menjadi private, sehingga dipaksa untuk menggunakan static method ketika membuat object nya
 * Kadang-kadang kita hanya ingin membuat constructor untuk parameter yang memang wajib saja.
 * Pada kasus ini, kita bisa menggunakan @RequiredArgsConstructor
 * Secara otomatis Lombok hanya akan membuat constructor dengan parameter untuk field yang final
 */


@Getter
@Setter
@RequiredArgsConstructor
public class Merchant {

    final private String id;

    private String name;



}
