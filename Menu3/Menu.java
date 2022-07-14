public class Menu {
    
    private Initializers init;
    private Figure myFigure;

    public Menu(){
        this.init = new Initializers();
        this.myFigure = new FigureNull();
    }


    public void showMenu(){
        int menu = 0;
        do {
            menu = Terminal.askNumber("Select an option");
            switch(menu){
                case 1:
                    myFigure = init.initializeSquare();
                    break;
                case 2:
                    myFigure = init.initializeCircle();
                    break;
                case 3:
                    myFigure = init.initializeRectangle();
                    break;
                case 4:
                    myFigure = init.initializeOctagon();
                    break;
                case 5:
                    Terminal.showMessage("The perimeter is: " + myFigure.calculatePerimeter());
                    break;
                case 6:
                    Terminal.showMessage("The area is: " + myFigure.calculateArea());
                    break;
                case 7:
                    Terminal.showMessage(myFigure.getType());
                    break;
                case 8:
                    Terminal.showMessage("God bye!");
                    break;
            }
        } while(menu != 8);
        
    }



}
