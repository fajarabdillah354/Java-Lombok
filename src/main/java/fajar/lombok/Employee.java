package fajar.lombok;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Employee {
    @NotBlank(message = "id must not blank")//contoh combinasi dengan java Validation
    private String id;

    @NotBlank(message = "name must not blank")
    private String name;



}
