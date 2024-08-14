package fajar.lombok;

import lombok.Synchronized;

public class Counter {

    /** Synchronized
     * Saat belajar Java Thread, kita sudah tahu agar sebuat method aman dari race condition, kita biasanya menggunakan kata kunci synchronized, atau yang lebih baik adalah menggunakan Lock
     * Lombok memiliki fitur untuk mempermudah kita ketika membuat Lock agar method yang kita buat aman dari race condition
     * Kita bisa menggunakan annotation @Synchronized, dan jika kita ingin sharing lock dengan beberapa method, kita bisa gunakan value lock yang sama
     */



    //ini hanya untuk yang sederhana, jika menjumpai problem complex disarankan menggunakan race condition yanga ada di Java Thread
    private final Object counterLock = new Object();


    private Long counter = 0L;


    //kita bisa sharing dengan syarat valuenya sama
    @Synchronized(value = "counterLock")
    public void increment(){
        counter = counter+1;
    }


    @Synchronized(value = "counterLock")
    public Long getCounter(){
        return counter;
    }


}
