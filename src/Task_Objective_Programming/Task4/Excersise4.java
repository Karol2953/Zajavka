package Task_Objective_Programming.Task4;

public class Excersise4 {
    public static void main(String[] args) {
        excersise4();
    }

    private static void excersise4() {
        Examiner teacher = new Teacher("Nauczyciel", "Nauczycielski");

        Examinated [] students = new Student[]{
                new Student("Rafał", "Rafalski"),
                new Student("Karol", "Karowiski"),
                new Student("Łukasz", "Łukaszewski")
        };
        System.out.println();

        Exam[] exams = teacher.createExam(students.length);
        for (int i = 0; i < students.length; i++) {
            students[i].writeExam(exams[i]);
        }
        System.out.println();

        teacher.evaluateExams(exams);
    }
}
