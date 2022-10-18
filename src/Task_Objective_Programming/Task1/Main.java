package Task_Objective_Programming.Task1;

/*
Write book Class which will have number ISBN,tittle and author. Then create a few books, add them to array and then
create second array which will have elements from the firs array but only this one which title starts with "H".
Don't allow that new array have null
*/
 class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Predator", 156890, "Pablo Picasso");
        Book book2 = new Book("Harry Potter", 290876, "Pawarotti Marczello");
        Book book3 = new Book("HWomenOfMafia", 123567, "Krzysztof Krawczyk");
        Book book4 = new Book("Pinokio", 876542, "Maryla Rodowicz");
        Book book5 = new Book("Witcher", 943211, "Mona Lisa");

        Book[] books = new Book[5];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;


        int counter = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().startsWith("H")) {
                counter++;
            }
        }
        /*System.out.println(counter);*/


        Book[] NewBooks = new Book[counter];

        for (int i = 0, j = 0; i < books.length; i++) {
            if (books[i].getTitle().startsWith("H")) {
                NewBooks[j] = books[i];
                j++;
            }
        }
        //print first and second array
        System.out.println("First Array");
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        System.out.println();
        System.out.println("Second Array contains title starts with H");

        for (int i = 0; i < NewBooks.length; i++) {
            System.out.println(NewBooks[i]);
        }
    }
}
