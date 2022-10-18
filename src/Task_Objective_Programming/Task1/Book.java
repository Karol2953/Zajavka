package Task_Objective_Programming.Task1;

public class Book {

    private int numberISBN;
    private String nameOfAuthor;

    private String title;

    public Book (String title, int numberISBN, String nameOfAuthor){

        this.nameOfAuthor = nameOfAuthor;
        this.numberISBN = numberISBN;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberISBN=" + numberISBN +
                ", nameOfAuthor='" + nameOfAuthor + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
