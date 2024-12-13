package com.java.lambda;

interface Shape{
    void draw();
}
class Rectangle implements Shape{
    @Override
    public void draw() {

    }
}
class Square implements Shape{
    @Override
    public void draw() {

    }
}
class Circle implements Shape{
    @Override
    public void draw() {

    }
}

public class LambdaExample {
    public static void main(String[] args) {
        /*Shape rectangle=() -> System.out.println("Rectangle class: draw() method");
        rectangle.draw();

        Shape square=() -> System.out.println("Square class: draw() method");
        square.draw();

        Shape circle=() -> System.out.println("Circle class: draw() method");
        circle.draw();

        print(rectangle); //pass lambda exp to the method
        print(circle);
        print(square);*/

        print(() ->System.out.println("Rectangle class: draw() method"));
        print(() ->System.out.println("Square class: draw() method"));
        print(() ->System.out.println("Circle class: draw() method"));
    }
    //pass lambda exp as method parameter
    private static void print(Shape shape){
        shape.draw();
    }
}
