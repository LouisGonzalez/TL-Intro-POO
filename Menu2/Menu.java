public class Menu {
    
    private final Operations op = new Operations();

    public void showMenu(){
        Terminal.showMessage("1. Divisible numbers\n2. Break down numbers\n3. Capicua number");
        int menu = Terminal.askNumber("Select an option");
        switch(menu){
            case 1:
                op.divisibleNumbers();
                break;
            case 2:
                op.breakDownNumbers();
                break;
            case 3:
                op.capicuaNumber();
                break;
            default:
                Terminal.showMessage("Invalid option");
                break;
        }
    }

}
