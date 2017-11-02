package ru.itis;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle rectangle = new Rectangle(0,0,2,4);
        Square square = new Square(5,5, 10);
        Ellips ellips = new Ellips(-2, -2 , 3,7);
        Circle circle = new Circle(5,5, 3);

        Shape shape[] = new Shape[4];
        shape[0] = rectangle;
        shape[1] = square;
        shape[2] = ellips;
        shape[3] = circle;

        for (int i = 0; i < shape.length; i++){
            System.out.print(shape[i].calcArea()+ " ");
            System.out.println(shape[i].calcPerimeter());

        }
        

    }
}
