package practice;

public class BinaryManipulation {

    public int man(Long n){
        int bit= (int)(Math.log(n)/Math.log(2));
        System.out.println(bit);
        return 0;
    }

    public static void main(String[] args) {
        BinaryManipulation b= new BinaryManipulation();
        b.man(3L);
    }
}
