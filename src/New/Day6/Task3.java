package New.Day6;



public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванов Иван Иванович", "Математика");
        Student student = new Student("Бородач Саня Иванович");

        teacher.evaluate(student);
    }
}
