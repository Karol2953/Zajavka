package Task_Objective_Programming.Task4;

import java.util.Random;

public class Student extends Person implements Examinated {

    public Student (final String name, final String surname){
        super (name, surname);
        System.out.println("Creating student: " + name  + " " + surname);
    }

    @Override
    public void writeExam(final Exam exam) {
        exam.setOwner(this);

        Random rand = new Random();
        Question[] questions = exam.getQuestions();

        for (Question question : questions){
            int randomAnswerIndex = rand.nextInt(question.getPossibleAnswerSize());
            System.out.println("Student: " + getName() + " " + getSurname()
            + "answering question: " + question.getContent()
            + ", possible answers: " + question.getPossibleAnswers()
            + ", answered: " + question.getPossibleAnswer(randomAnswerIndex)
            + ", index: [" + randomAnswerIndex + "]"
            );

            question.answer(randomAnswerIndex);
        }

    }

    @Override
    public String toString() {
        return "Student" +getName() + " " + getSurname();
    }
}
