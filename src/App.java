public class App {
    public static void main(String[] args) throws Exception {
        //Bai 1
        CheckYear.CheckLeapYear(2024);
        CheckYear.CheckLeapYear(2015);
        CheckYear.CheckLeapYear(800);
        //Bai 2
        System.out.println("");
        Calculator.CalculatorInteger("+", 4, 5);
        Calculator.CalculatorInteger("-", 4, 5);
        Calculator.CalculatorInteger("*", 4, 5);
        Calculator.CalculatorInteger("/", 4, 5);    
        //Bai 3
        MaxInteger.FindMax();
        //Bai 4
        Equation.CalculateQuadratic(4, 5, 6); 
        Equation.CalculateQuadratic(0, 5, 6);  
        Equation.CalculateQuadratic(0, 0, 6);  
        Equation.CalculateQuadratic(0, 0, 0);  
        Equation.CalculateQuadratic(4, 8, 3);   
    }
}