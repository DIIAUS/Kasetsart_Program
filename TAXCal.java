// HW2 TAX CALCULATOR FUND2

import java.util.Scanner;

public class Main
{
    private static int multiply;
    private static char Y_N;

    public static int persen(int sum) {
        if (sum >= 0.0 && sum <= 150000.0f) {
            return 0;
        } else if (sum > 150000.0f && sum <= 300000.0f) {
            multiply = 1;
            return 5;

        } else if (sum > 300000.0f && sum <= 500000.0f) {
            multiply = 2;
            return 10;
        } else if (sum > 500000.0f && sum <= 750000.0f) {
            multiply = 3;
            return 15;
        } else if (sum > 750000.0f && sum <= 1000000.0f) {
            multiply = 4;
            return 20;
        } else if (sum > 1000000.0f && sum <= 2000000.0f) {
            multiply = 5;
            return 25;
        } else if (sum > 2000000.0f && sum <= 5000000.0f) {
            multiply = 6;
            return 30;
        } else if (sum > 5000000.0f && sum <= 9999999999.99f) {
            multiply = 7;
            return 35;
        }
        return 0;
    }

    public static void step(int multiply, int sum) {
        int step1, step2, step3, step4, step5, step6, step7, last;

        step1 = (sum - 150000);
        step2 = (step1 - 150000);
        step3 = (step2 - 150000);
        step4 = (step3 - 150000);
        step5 = (step4 - 150000);
        step6 = (step5 - 150000);
        step7 = (step6 - 150000);
        last = (150000 * 5 / 100);

        if (multiply == 1) {
            System.out.printf("Cal Tax %d - 150000 = %d * 5%s = %d\n", sum, step1, '%', (step1 * 5 / 100));
            System.out.printf("Your Tax = %d BTH", (step1 * 5 / 100));
        } 
        else if (multiply == 2) {
                System.out.printf("\nStep 2%nCal Tax %d- 150000 = %d - 150000 = %d * 10%s = %d%n", sum, step1, step2,'%', (step2 * 10 / 100));
                System.out.printf("Step 1%nCal Tax %d * 10%s = %d%n", 150000, '%', last);
                System.out.printf("Your Tax = %d BTH", ((step2 * 10 / 100) + last));      
        } 
        else if (multiply == 3){
                System.out.printf("\nStep 2\nCal Tax %d - 150000 = %d 150000 = %d - 150000 = %d * 15%s = %d\n", sum, step1,step2, step3, '%', (step3 * 15 / 100));
                System.out.printf("Step 1%nCal Tax %d * 5%s = %d%n", 150000, '%', last);
                System.out.printf("Your Tax = %d BTH", ((step3 * 15 / 100) + last));
        } 
        else if (multiply == 4) {
                System.out.printf("\nStep 2\n Cal Tax %d - 150000 = %d - 150000 = %d  - 150000 = %d - 150000 = %d * 20%s = %d\n", sum,step1, step2, step3, step4, '%', (step4 * 20 / 100));
                System.out.printf("Step 1%nCal Tax %d * 5%s = %d%n", 150000, '%', last);
                System.out.printf("Your Tax = %d BTH", ((step4 * 20 / 100) + last)); 
        } 
        else if (multiply == 5) {
                System.out.printf("\nStep 2\n Cal Tax %d - 150000 = %d - 150000 = %d  - 150000 = %d - 150000 = %d - 150000 = %d * 25%s = %d\n",sum, step1, step2, step3, step4, step5, '%', (step5 * 25 / 100));
                System.out.printf("Step 1%nCal Tax %d * 5%s = %d%n", 150000, '%', last);
                System.out.printf("Your Tax = %d BTH", ((step5 * 25 / 100) + last));
        }
        else if (multiply == 6) {
                System.out.printf("\nStep 2\n Cal Tax %d - 150000 = %d - 150000 = %d  - 150000 = %d - 150000 = %d - 150000 = %d - 150000 = %d * 30%s = %d\n",sum, step1, step2, step3, step4, step5, step6, '%', (step6 * 30 / 100));
                System.out.printf("Step 1%nCal Tax %d * 5%s = %d%n", 150000, '%', last);
                System.out.printf("Your Tax = %d BTH", ((step6 * 30 / 100) + last)); 
        }
        else if (multiply == 7) {
                System.out.printf("\nStep 2\n Cal Tax %d - 150000 = %d - 150000 = %d  - 150000 = %d - 150000 = %d - 150000 = %d - 150000 =%d - 150000 = %d * 35%s = %d\n",sum, step1, step2, step3, step4, step5, step6, step7, '%', (step7 * 35 / 100));
                System.out.printf("Step 1%nCal Tax %d * 5%s = %d%n", 150000, '%', last);
                System.out.printf("Your Tax = %d BTH", ((step7 * 35 / 100) + last));
        
        }   
    }

    public static void main(String[] args) 
    {
        
        int sum ;
        Scanner in = new Scanner(System.in);
         
        System.out.print("Enter Salary: "); 
        int slr = in.nextInt();
        
        System.out.print("Enter Year cost: ");
        int YearCost = in.nextInt();

        System.out.print("Enter Tax deduction: ");
        int Tax = in.nextInt(); 


        System.out.print("\nYou have other income? ");
        char y_n= in.next().charAt(0);
        Y_N = Character.toUpperCase(y_n); 
        switch(Y_N) 
        { 
            case ('N'):
                sum = ((slr*12) - YearCost - Tax);
                System.out.printf("%nIncome : (%dx12) - %d - %d = %d%nTax is %d%s%n%n",slr,YearCost,Tax,sum,persen(sum),'%');
                if(multiply==0)
                {
                    System.out.println("Your Tax = Free Tax");
                }
                else 
                {
                    step(multiply, sum);
                }
                break;
            case ('Y'):
                System.out.print("Input other income: ");
                int otherIncome = in.nextInt();
                sum = ((slr*12)-YearCost-Tax+otherIncome) ;
                System.out.printf("\nIncome : (%dx12) - %d - %d + %d = %d%nTax is %d%s%n",slr,YearCost,Tax,otherIncome,sum,persen(sum),'%');
                step(multiply, sum);
                break;
        }


    
    }
    
}
    
