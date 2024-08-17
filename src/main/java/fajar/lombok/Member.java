package fajar.lombok;

import lombok.Data;
import lombok.NonNull;

@Data
public class Member {
    @NonNull
    private String name;

    @NonNull
    private String position;

    private String namePerson;
    public void sayHello(@NonNull String name){
        System.out.println("hello "+ name +" , my name is "+this.namePerson);
    }

}
