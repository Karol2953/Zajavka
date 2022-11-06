package Task_Objective_Programming.Task4;

public class Teacher extends Person implements Examiner {


    public Teacher(String name, String surname) {
        super(name, surname);
        System.out.println("Creating Teacher: " +name + " " + surname);
    }

    @Override
    public Exam[] createExam(int numberOfStudents) {
        Exam [] exams = new Exam[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            exams[i] = createExam();
        }
        System.out.println("Teacher created " + numberOfStudents + " exams");
        return exams;
    }

    private Exam createExam(){
        Exam exam = new Exam(5);
        exam.addQuestions(new Question(1,"1st Question content", new String[]{"1st answer", "2nd answer", "3rd answer"},1));
        exam.addQuestions(new Question(2,"2nd Question content", new String[]{"1st answer", "2nd answer", "3rd answer"},2));
        exam.addQuestions(new Question(3,"3rd Question content", new String[]{"1st answer", "2nd answer", "3rd answer"},0));
        exam.addQuestions(new Question(4,"4th Question content", new String[]{"1st answer", "2nd answer", "3rd answer"},1));
        exam.addQuestions(new Question(5,"5th Question content", new String[]{"1st answer", "2nd answer", "3rd answer"},0));
        return exam;
    }

    @Override
    public void evaluateExams(Exam[] exams) {
        for (Exam exam : exams) {
            System.out.println("Teacher evaluating "+ exam.getOwner() + " exam");
            exam.calculatePoints();
            System.out.println(exam.getOwner().toString()+ " points scored: " + exam.getPointsScored());
            System.out.println();
        }

    }
}
