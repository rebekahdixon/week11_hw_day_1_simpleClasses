public class Calculator {
    private int numberOne;
    private int numberTwo;

    public Calculator(int numberOne, int numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getNumberOne() {
        return this.numberOne;
    }

    public int getNumberTwo() {
        return this.numberTwo;
    }

    public int addNumbers(){
       return this.numberOne + this.numberTwo;
    }

    public int subtractNumbers(){
        return this.numberOne - this.numberTwo;
    }

    public int multiplyNumbers(){
        return this.numberOne * this.numberTwo;
    }

    public int divideNumbers(){
        return this.numberOne / this.numberTwo;
    }
}
//
//Create a Calculator class. This should have functions for
//        Add, Subtract, Multiply and Divide,
//        each taking in two integers to perform the calculations on.