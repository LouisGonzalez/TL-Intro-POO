public class Square extends Figure{
    
    private int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public int calculateArea(){
        return this.side * this.side;
    }

    @Override
    public int calculatePerimeter(){
        return (this.side * 4);
    }


}
