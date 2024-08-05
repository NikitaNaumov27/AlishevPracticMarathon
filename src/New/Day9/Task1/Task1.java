package New.Day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Артем","130");
        Teacher teacher = new Teacher("Аркадий", "Математика");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubject());
        student.printInfo();
        teacher.printInfo();
    }
}
