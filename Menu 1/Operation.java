public class Operation {
    
   
    public int nextNumber(){
        int number = Terminal.askNumber("Type a number:");
        return number + 1;
    }

    
    public int averageNumbers(int totalNumbers){
        int total = 0;
        for(int i = 0; i < totalNumbers; i++){
            total += Terminal.askNumber("Type a number: ");
        }
        return total / totalNumbers;
    }

    public void rectangleOperations(){
        int base = Terminal.askNumber("Enter the bas: ");
        int height = Terminal.askNumber("Enter the height");
        Terminal.showMessage("Area: " + areaRectangle(base, height) + " ; Perimeter: " + perimeterRectangle(base, height));
    }

    public int areaRectangle(int base, int height){
        return base * height;
    }

    public int perimeterRectangle(int base, int height){
        return (2 * base) + (2 * height);
    }

    public double randomNumber(){
        int myRandom = getRandom();
        Terminal.showMessage("The random number is: "+myRandom);
        return myRandom * 1.3;
    }

    public int getRandom(){
        return (int) (Math.floor(Math.random() * 200    + 1));
    }

}
