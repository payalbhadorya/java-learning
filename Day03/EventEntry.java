package Day03;


public class EventEntry {
    public static void main(String[] args) {
        
        boolean isStudent = true;
        boolean hasID = false;

        if(isStudent) {
            if(hasID){
                System.out.println("Enter allowed");
            }else{
                System.out.println("ID required");
            }
        
        }else {
            System.out.println("Students only");
            
        }
    }

}
