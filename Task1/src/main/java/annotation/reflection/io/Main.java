package annotation.reflection.io;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Reflection ref = new Reflection();
        DataContainer dataContainer = new DataContainer();
        ref.reflection(3, 15, dataContainer);
    }
}