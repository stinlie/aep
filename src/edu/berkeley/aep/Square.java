package edu.berkeley.aep;

// Understands a shape with four sides of equal length and right angles

public class Square extends Rectangle {

    public Square(int side){
        super(side, side);
    }

   /* private final int length;

    public Square(int sides) {
        this.length = sides;
    }

    public int area(){
        return length * length;
    }

    public int perimeter() {
        return length *4;
    }*/
}
