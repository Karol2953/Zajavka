package Objective_Programming;

public class Computers {

    private String Main_Board;
    private String Processor;
    private String Card_Graphic;
    private int GB_of_Ram;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computers computers = (Computers) o;

        if (GB_of_Ram != computers.GB_of_Ram) return false;
        if (!Main_Board.equals(computers.Main_Board)) return false;
        if (!Processor.equals(computers.Processor)) return false;
        return Card_Graphic.equals(computers.Card_Graphic);
    }

    @Override
    public int hashCode() {
        int result = Main_Board.hashCode();
        result = 31 * result + Processor.hashCode();
        result = 31 * result + Card_Graphic.hashCode();
        result = 31 * result + GB_of_Ram;
        return result;
    }

    public Computers(String Main_Board, String Processor, String Card_Graphic, int GB_of_Ram){
        this.Main_Board = Main_Board;
        this.Processor = Processor;
        this.Card_Graphic = Card_Graphic;
        this. GB_of_Ram = GB_of_Ram;
    }

}
