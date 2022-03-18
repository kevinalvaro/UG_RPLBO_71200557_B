package com.ug6.soal1;
import java.util.ArrayList;
import java.util.Arrays;
public class Codes {
    public static ArrayList<String> COMPANYCODES = new ArrayList(Arrays.asList("XM", "SG", "AP", "RM", "OP", "VV"));
    public static ArrayList<String> ANDROIDCODES = new ArrayList(Arrays.asList("Lollipop", "Marshmallow", "Nougat", "Oreo", "Pie", "10 Q", "Red Velvet Cake", "Snow Cone", "Tiramisu"));

    public static ArrayList<String> getCOMPANYCODES() {
        return COMPANYCODES;
    }
    public static void setCOMPANYCODES(ArrayList<String> COMPANYCODES) {
        Codes.COMPANYCODES = COMPANYCODES;
    }
    public static ArrayList<String> getANDROIDCODES() {
        return ANDROIDCODES;
    }
    public static void setANDROIDCODES(ArrayList<String> ANDROIDCODES) {
        Codes.ANDROIDCODES = ANDROIDCODES;
    }

    public static String generatePhoneCode(String companyCode) {
        int min = 1,max=20;
        double random = Math.random() * (double)(max - min + 1) + (double)min;
        int randomCode = (int)random;
        return companyCode + "X" + randomCode;
    }

    public static String generatePhoneCode(String companyCode, String androidCode) {
        int min = 1, max =20;
        double random = Math.random() * (double)(max - min + 1) + (double)min;
        int randomCode = (int)random;
        return companyCode + androidCode.charAt(0) + androidCode.charAt(androidCode.length() - 1) + randomCode;
    }
}