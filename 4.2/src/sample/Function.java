package sample;

import static java.lang.Math.*;

public class Function {

    static double f1(double x, double y, double z) {
        double res = (sin(PI*y*y)+ log(y*y));
        res/= sin(PI*z*z)+ sin(x)+ log(z*z)+x*x+ exp(cos(z*x));
        return res;
    }

    static double f2(double x, double y, double z) {
        double res = y*x*x;
        res/= log10(pow(z,y))+pow(cos(pow(x,1.0/3)),2);
        return res;
    }

}