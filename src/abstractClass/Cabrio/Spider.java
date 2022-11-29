package abstractClass.Cabrio;

public class Spider extends Animal{
    public void printName (boolean input){
        System.out.println("Spider");
    }

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.printName("Name");
        spider.printName(true);
    }
}
