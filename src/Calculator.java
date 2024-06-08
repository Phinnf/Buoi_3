public class Calculator {
    static  void CalculatorInteger(String operator, int x, int y){
        switch (operator) {
            case "+":
            System.out.printf("\nKet qua la: %d + %d = %d", x, y, (x + y));
                break;
            case "-":
            System.out.printf("\nKet qua la: %d - %d = %d ",x ,y , (x - y));
                break;
            case "*":
            System.out.printf("\nKet qua la: %d * %d = %d", x, y, (x * y) );
                break;
            case "/":
                if (y == 0) {
                    System.out.println("\nKhong the chia cho 0");
                }
            else {
            System.out.printf("\nKet qua la: %d / %d = %d", x, y, (x / y));
            }      
            default:
            System.out.println("\nPhep toan khong hop le");
                break;
        }
    }
    
}
