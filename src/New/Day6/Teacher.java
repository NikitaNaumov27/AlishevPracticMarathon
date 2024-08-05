package New.Day6;

import java.util.Random;

public class Teacher {
    private String fio;
    private String subject;

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate (Student student){
        Random random = new Random();
        String grade = null;
        switch (random.nextInt(4) + 2){
            case 2 : grade = "Нудовлетворительно";
                break;
            case 3 : grade = "Удовлетворительно";
                break;
            case 4 : grade = "Хорошо";
                break;
            case 5 : grade = "Отлично";
                break;
        }
        System.out.println("Преподаватель " + fio + " оценил студента с именем " +
                student.getFio() + " по предмету " + subject + " на " + grade);
    }
}
