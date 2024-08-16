package fajar.lombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true) //untuk memanggil super dari class Manajer yaitu class Employee
public class Manajer extends Employee{

    /** Super Class
     * Secara default, ketika membuat equals() dan hashCode() method, Lombok tidak akan memanggil super class method nya
     * Jika kita ingin Lombok memanggil juga super class method nya, kita perlu mengubah method callSuper() menjadi true di annotation nya, default nya adalah false
     */
    private Integer totalEmployee;

}
