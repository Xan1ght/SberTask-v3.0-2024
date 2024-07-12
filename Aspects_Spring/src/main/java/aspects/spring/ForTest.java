package aspects.spring;

import org.springframework.stereotype.Component;
import java.util.Collection;

@Component
public class ForTest {
    @NotEmpty
    public String testOne(String s, Double d) {
        String str;
        str = s + ' ' + d.toString();
        return str;
    }

    @NotEmpty
    public String testTwo(Collection c, String s) {
        String str;
        str = c.toString() + ' ' + s;
        return str;
    }
}