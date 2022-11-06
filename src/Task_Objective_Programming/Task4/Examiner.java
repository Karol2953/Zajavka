package Task_Objective_Programming.Task4;

public interface Examiner {
    Exam[] createExam (int numberOfStudents);

    void evaluateExams(Exam[] exams);
}
