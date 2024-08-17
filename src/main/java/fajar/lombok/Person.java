package fajar.lombok;

import ch.qos.logback.core.util.StringCollectionUtil;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {


    private String id;

    private String name;

    private Integer age;

    //untuk mengolah data Collection lombok menyediakan annotation @Singular, dengan ini kita tidak perlu membuat object Collectionnya lagi dalam artian kita bisa langsung embet ke dalam buildernya
    @Singular("hobby")
    private List<String> hobby;


}
