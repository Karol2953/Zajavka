public class Test {
    String value = "First";
    {
        value+= "two";
    }
    public Test(){
        value+= "three";
    }
    {
        value+= "four";
    }
    public  Test (String value){
        value +=value;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test = new Test("five");
        System.out.println(test.value);
    }

}
