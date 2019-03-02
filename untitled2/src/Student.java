public class Student {
    String name;
    int age;
    int schoolNumber;
    int classNumber;
    char classLetter;
    double point;

    public void study() {
        System.out.println("Я учусь в "+ classNumber+classLetter+" классе");
        System.out.println("Мой средний балл: "+ point);
    }
}