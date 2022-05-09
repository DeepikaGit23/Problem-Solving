package easy;

import java.util.List;

public class DiagonalDiff {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        Integer leftD=0;
        Integer rightD=0, mid=0;
        int j=arr.size() -1;
        for (int i = 0; i < arr.size() ; i++) {
//            for (int j = 0; j < arr.size(); j++) {
//                if (i==j) {
//                    mid = arr.get(i).get(j);
//                    break;
//                }
//            }
            leftD=leftD + arr.get(i).get(i);
            rightD=rightD + arr.get(i).get(j);
            j--;
        }
//        leftD= mid + (arr.get(0).get(0)) + (arr.get(arr.size()-1).get(arr.size()-1));
//        rightD= mid + (arr.get(0).get(arr.size()-1)) + (arr.get(arr.size()-1).get(0));
        return  Math.abs(leftD-rightD);
    }

    public static void main(String[] args) {

        List<List<Integer>> list=List.of(List.of(1,2,3),List.of(4,5,6),List.of(7,8,9));
        System.out.println(diagonalDifference(list));
    }
}
