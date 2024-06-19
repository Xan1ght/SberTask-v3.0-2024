package annotation.reflection.io;

import lombok.NonNull;

@FirstAnnotation(dayWeek = 1)
abstract class Parent {
    abstract void method1(@NonNull DataContainer dataContainer);
    abstract void method2(@NonNull DataContainer dataContainer);
}


@FirstAnnotation(dayWeek = 1)
class Child0 extends Parent {
    @Override
    @SecondAnnotation(hour = 1, priority = 1, description = "Child0 m1")
    void method1(@NonNull DataContainer dataContainer) {
        dataContainer.setYear(2015);
        dataContainer.setName("Dima");
        dataContainer.setId(22);
    }

    @Override
    @SecondAnnotation(hour = 2, priority = 2, description = "Child0 m2")
    void method2(@NonNull DataContainer dataContainer) {
        dataContainer.setYear(2014);
        dataContainer.setName("DimaX");
        dataContainer.setId(22);
    }
}


@FirstAnnotation(dayWeek = 1)
class Child1 extends Parent {
    @Override
    @SecondAnnotation(hour = 2, priority = 1, description = "Child1 m1")
    void method1(@NonNull DataContainer dataContainer) {
        dataContainer.setYear(2015);
        dataContainer.setName("Ярик");
        dataContainer.setId(2);
    }

    @Override
    @SecondAnnotation(hour = 1, priority = 2, description = "Child1 m2")
    void method2(@NonNull DataContainer dataContainer) {
        dataContainer.setYear(2015);
        dataContainer.setName("Костя");
        dataContainer.setId(1);
    }
}


@FirstAnnotation(dayWeek = 3)
class Child2 extends Parent {
    @Override
    @SecondAnnotation(hour = 15, priority = 1, description = "Child2 m1")
    void method1(@NonNull DataContainer dataContainer) {
        dataContainer.setYear(2003);
        dataContainer.setName("Денис");
        dataContainer.setId(4);
    }

    @Override
    @SecondAnnotation(hour = 15, priority = 2, description = "Child2 m2")
    void method2(@NonNull DataContainer dataContainer) {
        dataContainer.setYear(2002);
        dataContainer.setName("Дима");
        dataContainer.setId(44);
    }
}