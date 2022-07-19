public class Menu {
    
    private final Operation op = new Operation();

    
    public void showMenu(){
        Terminal.showMessage("1. Next number\n2. Average numbers\n3. Operations with a rectangle\n4.Random number");
        int menu = Terminal.askNumber("Select an option");
        switch(menu){
            case 1:
                Terminal.showMessage("The number is: " + op.nextNumber());
                break;
            case 2:
                Terminal.showMessage("The average is: " + op.averageNumbers(3));
                break;
            case 3:
                op.rectangleOperations();
                break;
            case 4:
                Terminal.showMessage("The result is: " + op.randomNumber());
                break;
            default:
                Terminal.showMessage("Invalid option");
                break;
        }
    }

}
