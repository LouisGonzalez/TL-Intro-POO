public class Operations {
    
    /* FIRST OPERATION */

    public void divisibleNumbers(){
        int number1 = Terminal.askNumber("Type the first number");
        int number2 = Terminal.askNumber("Type the second number");
        if(number1 % number2 != 0) Terminal.showMessage("The numbers are not divisible");
        else Terminal.showMessage("The numbers are divisible");
    }

    /* SECOND OPERATION */

    public void breakDownNumbers(){
        int number = Terminal.askNumber("Type a number");
        int[] arrayNumbers = new int[4];
        if(number > 0 && number < 9999){
            arrayNumbers = returnValues(arrayNumbers, number);
            int result = addNumbers(arrayNumbers);
            Terminal.showMessage("N1: " + arrayNumbers[0] + " N2: " + arrayNumbers[1] + " N3: " + arrayNumbers[2] + " N4: " + arrayNumbers[3] + " ; Sum of the numbers: " + result);
        } else {
            Terminal.showMessage("Invalid number");
        }
    }

    public int[] returnValues(int[] arrayNumbers, int number){
        arrayNumbers[0] = number%10000/1000;
        arrayNumbers[1] = number%1000/100;
        arrayNumbers[2] = number%100/10;
        arrayNumbers[3] = number%10/1;
        return arrayNumbers;
    }

    public int addNumbers(int[] arrayNumbers){
        int result = 0;
        for(int i = 0; i < arrayNumbers.length; i++){
            result += arrayNumbers[i];
        }
        return result;
    }

    /* THIRD OPERATION */

    public void capicuaNumber(){
        int number =  Terminal.askNumber("Type a number");
        if(number > 9999 && number < 99999){
            if(algorithmCapicua(number)) Terminal.showMessage("Is capicua");
            else Terminal.showMessage("Not capicua");
        } else Terminal.showMessage("Invalid number");
    }

    public boolean algorithmCapicua(int number){
        int[] arrayNumbers = new int[5];
        int large = 5;
        for(int i = 0; i < large; i++){
            arrayNumbers = returnValues2(arrayNumbers, number);
            if(arrayNumbers[i] != arrayNumbers[large - i - 1]) return false;
        }
        return true;
    }

    public int[] returnValues2(int[] arrayNumbers, int number){
        arrayNumbers[0] = number%100000/10000;
        arrayNumbers[1] = number%10000/1000;
        arrayNumbers[2] = number%1000/100;
        arrayNumbers[3] = number%100/10;
        arrayNumbers[4] = number%10/1;
        return arrayNumbers;
    } 

}
