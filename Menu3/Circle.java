public class Circle extends Figure {

    private int radio;

    public Circle(int radio){
        this.radio = radio;
    }
    
    @Override
    public int calculateArea(){
        return (int) ((3.14) * this.radio * this.radio);
    }

    @Override
    public int calculatePerimeter(){
        return (int) (2 * 3.14 * this.radio);
    }

}
