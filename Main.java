import java.util.*;

class Main{
    public static void main(String[] args){
        /*  Leet Code Question #13
         *  Easy Question #3
        */
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s){
        int romanToInteger = 0;

        for(int i = 0; i < s.length(); i++){
            if( (i + 1 < s.length()) && (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') ){
                romanToInteger += 4;
                i++;
            } else if ( (i + 1 < s.length()) && (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') ){
                romanToInteger += 9;
                i++;
            } else if ( (i + 1 < s.length()) && (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') ){
                romanToInteger += 40;
                i++;
            } else if ( (i + 1 < s.length()) && (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') ){
                romanToInteger += 90;
                i++;
            } else if ( (i + 1 < s.length()) && (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') ){
                romanToInteger += 400;
                i++;
            } else if ( (i + 1 < s.length()) && (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') ){
                romanToInteger += 900;
                i++;
            } else {
                romanToInteger += translate(s.charAt(i));
            }
        }

        return romanToInteger;
    }

    public static int translate(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}