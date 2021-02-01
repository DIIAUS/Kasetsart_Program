//HW1 Fundamental II JAVA 

import java.util.Random;
import java.util.logging.Logger;

public class Random2methd {
    
    public static double randoms1() {
        double rangeMin = 0.0f;
        double rangeMax = 50.0f;
        Random r = new Random();
        double val1 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        return val1;
    
    }

    public static double randoms2() {
        double rangeMin = 0.0f;
        double rangeMax = 50.0f;
        Random r = new Random();
        double val1 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        return val1;
    }


    public static void main(String[] args) {
        double res = randoms1()+randoms2();
        System.out.printf("Sum of %.15f + %.15f = %.15f%n",randoms1(),randoms2(),res);
        
        if(res < 50.0f){
            System.out.println("NOT PASS");
        }
        else{
            System.out.println("PASS");
        }
    }
}
