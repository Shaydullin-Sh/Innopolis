package binar_Cod;

import java.util.ArrayList;
import java.util.List;

public class ConvertBinCod {
    public static int convertBinaryToDecimal(String binary){
        List<Integer> list = new ArrayList<>();
        int decimal = 0;
        for(int i = binary.length()-1; i >= 0; i--){
            list.add(Integer.parseInt(binary.substring(i,i+1)));
        }
        for(int i = list.size()-1; i >= 0; i--){
            decimal = decimal * 2 + list.get(i);
        }
        return decimal;
    }
    public static String convertDecimalToBinary(int decimal){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < decimal; ){
            int x = decimal%2;
            decimal = decimal / 2;
            sb.append(x);
            if(decimal == 1){
                sb.append(decimal);
                sb.reverse();
                break;
            }
        }
        return sb.toString();
    }
}
