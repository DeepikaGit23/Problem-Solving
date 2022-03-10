package problemSolving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTrips {
   
    public int trip(ArrayList<Integer> list, int trips){
    	Collections.sort(list);
    	int left=0;
    	for(int i=list.size()-1;i>=0;i--) {
            if(list.get(i)>2){
                trips++;
            }
            if(list.get(i)<2) {
	            if((list.get(i)+list.get(left))<3) {  
	                left++;
	            }
	            trips++;
            }
            if(left>i)
            	break;
            System.out.println("trips: " + trips);
        }
        return trips;
    }
	
    public static void main(String[] args) {
    	List<Integer> list1= Arrays.asList(1,1,1,6,7,9);
    	ArrayList<Integer> list= new ArrayList<>(list1);
    	int trips=0;
        FindTrips f= new FindTrips();
        System.out.println(f.trip(list,trips));
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        

    }
}
