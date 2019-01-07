public class Runner {
    public static void main(String[] args) {
        Calculator calc = new Calculator(6, 3);
        System.out.println(calc.getNumberOne());
        System.out.println(calc.getNumberTwo());
        System.out.println(calc.addNumbers());
        System.out.println(calc.subtractNumbers());
        System.out.println(calc.multiplyNumbers());
        System.out.println(calc.divideNumbers());
    }
}
