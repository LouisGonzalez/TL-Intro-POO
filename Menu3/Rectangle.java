public class Rectangle extends Figure{
    
    private int base;
    private int height;

    public Rectangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    public int calculateArea(){
        return this.base * this.height;
    }

    @Override
    public int calculatePerimeter(){
        return (2 * this.base) + (2 * this.height);
    }

}
