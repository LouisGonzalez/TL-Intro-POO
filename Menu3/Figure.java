public abstract class Figure {

    public abstract int calculateArea();

    public abstract int calculatePerimeter();


    public String getType(){
        return this.getClass().getSimpleName();
    }
}