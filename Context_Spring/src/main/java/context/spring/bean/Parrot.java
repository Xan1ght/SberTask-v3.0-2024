package context.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parrot {
    private String name;
}