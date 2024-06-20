package annotation.reflection.io;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Reflection {
    IOC ioc = new IOC();
    String rider = "";

    public List<Class> init(List<Class> child) {
        child.add(Child0.class);
        child.add(Child1.class);
        child.add(Child2.class);
        return child;
    }

    public List<Class> searchNeed(List<Class> child, int day) {
        child = child.stream().filter(x -> ((FirstAnnotation) x.getAnnotation(FirstAnnotation.class)).dayWeek() == day).collect(Collectors.toList());
        return child;
    }

    public void invoke(List<Class> child, int hour, DataContainer dataContainer) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        for (Class sub : child) {
            Object s = sub.newInstance();
            List<Method> ms = List.of(sub.getDeclaredMethods());
            ms = ms.stream().filter(x -> ((SecondAnnotation)x.getAnnotation(SecondAnnotation.class)).hour() == hour).collect(Collectors.toList());
            ms = ms.stream().sorted(Comparator.comparingInt(x -> ((SecondAnnotation)x.getAnnotation(SecondAnnotation.class)).priority())).toList();
            for(Method m: ms){
                m.invoke(s, dataContainer);
                System.out.println(dataContainer.toString());
                rider = rider + dataContainer.toString() + '\n';
            }
        }
    }

    public void reflection(int day, int hour, DataContainer dataContainer) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        List<Class> child = new ArrayList<>();
        init(child);
        child = searchNeed(child, day);
        invoke(child, hour, dataContainer);
        ioc.writeFile(rider);
    }
}
