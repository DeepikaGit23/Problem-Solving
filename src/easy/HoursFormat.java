package easy;

public class HoursFormat {
    public static String timeConversion(String s) {
        // Write your code here
       String arr[]= s.split(":");
       String ss=arr[0];
       String ls=arr[2].substring(0,2);

        if( (ss.equals("12")) && s.endsWith("AM"))
            return "00:" + arr[1] + ":" + ls;

        else if((ss.equals("12")) && s.endsWith("PM"))
            return "12:" + arr[1] + ":" + ls;

        if(s.endsWith("AM"))
            return arr[0] + ":" + arr[1] + ":" + ls;
        else {
            Integer n= (Integer.parseInt(arr[0])+12);
            String s2=n.toString();
            return s2 + ":" + arr[1] + ":" + ls;
            }
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("11:05:45AM"));
    }
}
