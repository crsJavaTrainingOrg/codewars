package hu.adam.sevenKyu;

//https://www.codewars.com/kata/56541980fa08ab47a0000040

import java.util.ArrayList;
import java.util.List;


public class Printer {
    public static String printerError(String s) {
        String availableColours = "abcdefghijklm";
        List<Character> charactersOfString = new ArrayList<>();
        List<Character> charactersOfAvailableColours = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            charactersOfString.add(s.charAt(i));
        }
        for (int i = 0; i < availableColours.length(); i++) {
            charactersOfAvailableColours.add(availableColours.charAt(i));
        }
        charactersOfString.removeAll(charactersOfAvailableColours);

        System.out.print(charactersOfString.size()+"/"+ s.length());
        String result = charactersOfString.size()+"/"+ s.length();
        return result;

    }
}
