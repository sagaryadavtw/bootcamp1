package org.example;

public class Rectangle {

    private final int length;

    private final  int breadth;

    public Rectangle(int length, int breadth) {
        isValidParameters(length, breadth);
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2*(length + breadth);
    }

    private static void isValidParameters(int length, int breadth) {
        if( length < 0 || breadth <0){
            throw new IllegalArgumentException("Length or Breadth cannot be negative");
        }
    }
}
