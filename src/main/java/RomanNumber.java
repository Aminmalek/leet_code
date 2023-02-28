public class RomanNumber {
    //I  = 1
    //V =  5
    //X =  10
    //L =  50
    //C =  100
    //D =  500
    //M =  1000
    // IV = 4
    // IX = 9
    // XL = 4o
    // XC = 90
    // CD = 400
    // CM = 900
    public static int romanNumber() {
        String str = "MCMXCIV";

        int IV = (str.split("IV", -1).length - 1) * 4;
        int IX = (str.split("IX", -1).length - 1) * 9;
        int XL = (str.split("XL", -1).length - 1) * 40;
        int XC = (str.split("XC", -1).length - 1) * 90;
        int CD = (str.split("CD", -1).length - 1) * 400;
        int CM = (str.split("CM", -1).length - 1) * 900;

        str = str.replace("IV", " 4").
                replace("IX", " 9").
                replace("XL", " 40").
                replace("XC", " 90").
                replace("CD", " 400").
                replace("CM", " 900");


        int I = (str.split("I", -1).length - 1);
        int V = (str.split("V", -1).length - 1) * 5;
        int X = (str.split("X", -1).length - 1) * 10;
        int L = (str.split("L", -1).length - 1) * 50;
        int C = (str.split("C", -1).length - 1) * 100;
        int D = (str.split("D", -1).length - 1) * 500;
        int M = (str.split("M", -1).length - 1) * 1000;


        return (IV + IX + XL + XC + CD + CM + I + V + X + L + C + D + M);
    }


    public static void main(String[] args) {
        System.out.println(romanNumber());
    }

}
