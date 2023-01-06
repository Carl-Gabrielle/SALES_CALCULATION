// ORFINADA, CARL GABRIELLE N. B.S.I.T. 2 - A
/*
  JMC enterprises has only 3 salesman  and  for the month of july 2011,
  these 3 salesman made 5 sales transaction combined. Make a program to input the 5 sales amount and 
  the salesman code denoting the salesman who made the sales.Use code 1 for salesman 1, code 2 for 
  salesman 2, and code 3 for salesman 3. The program should validate the value of the sales amount 
  (must be between 1000 and 99999) and salesman code (must be between 1 and 3). If invalid display the 
  message "INVALID ENTRY!" and then accept  another value to disregard the invalid entry. Output the total 
  sales using the format below: 
                    JMC ENTERPRISES 
            TOTAL SALES FOR THE MONTH OF JULY
            SALESMAN 1: (total number of salesman 1)
            SALESMAN 2: (total number of salesman 2)
            SALESMAN 3: (total number of salesman 3)
                        ---------------------------
                    TOTAL: (total sales for the month)
            SALESMAN WITH THE HIGHEST SALES : (salesman number)
 */
import java.util.Scanner; 
public class retrieve {
    public  static void  main ( String[] args) {
        Scanner input = new Scanner( System.in);
        int  man_One = 0, man_Two = 0, man_Three = 0, man_Four = 0, highest_Sales = 0,highest_Sales_Man = 0;
        for ( int i = 0; i <5; i++) {
            System.out.print("Enter sales amount: ");
            int sales_Amount =  input.nextInt();
            if (sales_Amount <1000 || sales_Amount > 99999) {
                System.out.println("INVALID ENTRY!");
                continue;
            }
            System.out.print("Enter  Salesman code[1-3]: ");
            int salesman_Code= input.nextInt();
             if (salesman_Code < 1 || salesman_Code > 3) {
                System.out.println("INVALID ENTRY");
                continue;
             }
             if (salesman_Code == 1) {
                man_One+=sales_Amount;
             }else if (salesman_Code == 2){
                man_Two+=sales_Amount;
             }else {
                man_Three+=sales_Amount;
             }
             if (sales_Amount > highest_Sales) {
                highest_Sales = sales_Amount;
                highest_Sales_Man =salesman_Code;
             }
        }
        System.out.println("======================== JMC ENTERPRISES ==================================");
        System.out.println("===================== TOTAL SALES FOR THE MONTH OF JULY ====================");
        System.out.println();
        System.out.println("SALESMAN 1: " + man_One);
        System.out.println("SALESMAN 2: " + man_Two);
        System.out.println("SALESMAN 3: " + man_Three);
        int total = man_One + man_Two + man_Three;
        System.out.println("\t\t----------------------------");
        System.out.println("\tTOTAL: " + " \t\t" + total);
        System.out.println();
        System.out.println("SALESMAN WITH THE HIGHEST SALES: " + highest_Sales_Man);
        System.out.println();
        System.out.println("======================== JMC ENTERPRISES =======================");
    }
}
