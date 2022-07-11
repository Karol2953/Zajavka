package Objective_Programming;

public class EqualsMethodToComputers {
    public static void main(String[] args) {
        EqualsMethodToComputers.equalsComputers();
    }

    public static void equalsComputers() {
        Computers computer1 = new Computers("Asus", "AMD", "GeForce 1080", 16);
        Computers computer2 = new Computers("Asus", "AMD", "GeForce 1080", 16);
        Computers computer3 = new Computers("Asrock", "AMD", "GeForce 2060", 24);
        Computers computer4 = new Computers("Gigabyte", "Intel", "AMD 6700", 128);
        Computers computer5 = new Computers("SomeName", "Intel", "GeForce3060", 64);

        System.out.println(computer1.equals(computer2));
        System.out.println(computer1.equals(computer2));
    }
}
