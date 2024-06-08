public class CheckYear {
    static void CheckLeapYear(int nam){
        if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0){
            System.out.println("Day la nam nhuan");
        }
        else {
            System.out.println("Day khong phai la nam nhuan");
        }
    }
    
}
