package final_exam;

import java.util.Map;
import java.util.Scanner;

public class Bai1 {
    public static double trapezoidalInteger(double a, double b,int n){
        double h = (b-a)/n;
        double S = a+b/2,temp,x;

        for (int i = 1; i < n; i++) {
            x=a+i*h;
            temp= Math.sin(x)*Math.sin(x)*Math.cos(x);
            S+= temp;
        }

        return S*h;
    }

    public static void main(String[] args) {
        double b=Math.PI/2,a=0,I;
        int n=2;
        while (Math.abs(trapezoidalInteger(a,b,2*n)-trapezoidalInteger(a,b,n))>2*Math.pow(10,-6)){
            n*=2;
        }
        I=trapezoidalInteger(a,b,n);
        System.out.println("The result of trapezoidal :"+I);
    }
}
