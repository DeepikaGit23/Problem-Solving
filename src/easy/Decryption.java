package practice;

import java.util.ArrayList;

public class Decryption {
    public static String decryptMessage(String encryptedMessage) {
//        ArrayList<Character> b= new ArrayList<>();
        String[] s2= encryptedMessage.split(" ");
        for(int i=0;i<s2.length;i++)
        {
            System.out.println(s2[i]);
        }
//        String rev="";
//        for(Character v: b) {
//            rev=v+ " ";
//        }
        return encryptedMessage;
    }

    public static void main(String[] args) {
        System.out.println(Decryption.decryptMessage("hey there"));
    }

}
