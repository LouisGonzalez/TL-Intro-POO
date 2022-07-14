public class Initializers {
    
    public Square initializeSquare(){
        int side = Terminal.askNumber("Enter a side");
        return new Square(side);
    }

    public Circle initializeCircle(){
        int radio = Terminal.askNumber("Enter a radio");
        return new Circle(radio);
    }

    public Rectangle initializeRectangle(){
        int base = Terminal.askNumber("Enter a base");
        int height = Terminal.askNumber("Enter a height");
        return new Rectangle(base, height);
    }

    public Octagon initializeOctagon(){
        int side = Terminal.askNumber("Enter a side");
        return new Octagon(side);
    }

}
