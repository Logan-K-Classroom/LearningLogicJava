public class Logic2 {
    public static void main(String[] args){
        boolean presidentAlive = true;
        String presidentName = "Biden";
        int presNum = 46;
        double age = 81.92;
        char partyIdentifier = 'D';
        

        if (presidentName.equals("Biden")){
            System.out.println("President is Biden");;
        } else if (presidentName.equals("Trump")){ 
            System.out.println("President is Trump");
        } else {
            System.out.println("That president is not Biden or Trump");
        }
       
        if(age > 70){
            System.out.println("PRESIDENT IS SO OLD");
        } else if (age < 69 && age > 55){
            System.out.println("president is not that old but is still old");
        } else if (age >= 35){
            System.out.println("Reasonable age");
        } else {
            System.out.println("not old enough to be president");
        }
        
        if (presidentAlive){
            System.out.println("Yay!!!!!!!!!!!!!!!");
        } else {
            System.out.println("No!!!!!!!!!!!!!!!!");        
        }
                        
        if (presNum == 45){
            System.out.println("president is the 45th");   
        } else{
            System.out.println("this is the " + presNum + "th president");
        }

        
        
        if(partyIdentifier == 'D'){
            System.out.println("The current president is a member of the Democratic Party");
        } else if(partyIdentifier == 'R'){
            System.out.println("Probably a member of the Republican Party");
        } else{
            System.out.println("Edge case, either in code or in election");
        }
    
    }
}

