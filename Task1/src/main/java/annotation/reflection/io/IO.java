package annotation.reflection.io;

public interface IO {
    void createLog();
    void writeFile(String str);
    void cleanLogDirectory(String filename);
    String readFile(String name);
}
