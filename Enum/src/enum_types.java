
enum Shapes{
    SQUARE(10), rectangle(20), circle(30), trapezoid(40), rhombus(50),triangle(60), oval(70), hexagon(8);
    private int value;
    Shapes (int value){this.value=value;}
    int getValue()  {return value;}
}


public class enum_types {
    public static void main(String[] args) {
        System.out.println("Shape: ");


        for (Shapes i : Shapes.values()){
            System.out.println("ordinal value is: "+i.ordinal()+" Start value is: "+i.getValue()+" "+ "The shape is "+i);
        }
    }
}
