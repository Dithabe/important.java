// Online Java Compiler

import java.io.*;

class HexConversion {
    public static String baseConvertor(String num, int sBase, int dBase){
        return Integer.toString(Integer.parseInt(num, sBase), dBase);
    }
    
    static void decimalConversion(int n)
    {
    
        char[] hexaDeciNum = new char[100];
 
        int i = 0;
        while (n != 0) {
            
            int temp = 0;
 
            temp = n % 16;
 
            if (temp < 10) {
                hexaDeciNum[i] = (char)(temp + 48);
                i++;
            }
            else {
                hexaDeciNum[i] = (char)(temp + 55);
                i++;
            }
 
            n = n / 16;
        }
 
        for (int j = i - 1; j >= 0; j--)
            System.out.print(decimalConversion[j]);
    }
 
    public static void main(String[] args)
    {
        int n = 2545;
        decToHexa(n);
    }
}
public static void main(String[] args) {
    public static void decToHexa(int n)
    {
        System.out.println(Integer.toHexString(n));
        System.out.println("Converting 155 from Base 10 to base 16 is: "+baseConvertor("155",10,16));
        System.out.println("Converting 155 from Base 10 to base 2 is: "+baseConvertor("155",10,2));
        
    }
    }
