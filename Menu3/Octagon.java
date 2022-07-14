public class Octagon extends Figure{
    
    private int side;

    public Octagon(int side){
        this.side = side;
    }

    @Override
    public int calculateArea(){
        return (calculatePerimeter() / 2);
    }

    @Override
    public int calculatePerimeter(){
        return this.side * 8;
    }

}
