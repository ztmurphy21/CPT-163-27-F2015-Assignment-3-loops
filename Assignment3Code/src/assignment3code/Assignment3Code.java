

package assignment3code;
import java.util.Scanner;
import javax.swing.JOptionPane; //for dialog box to appear throughout program 
 

public class Assignment3Code {

  
    public static void main(String[] args) {
       //dec of all variables
        Scanner keyboard = new Scanner (System.in);
        String wordToReverse;
        String reverse = "";

        //obtaining the input
      
       
        wordToReverse = JOptionPane.showInputDialog("Enter a word with atleast five"
                + " characters.");
        //incase user enters string less than 5 letters
        while (wordToReverse.length() <5){
            JOptionPane.showMessageDialog(null, "The word must be five characters, please enter a different word.");
                    wordToReverse = JOptionPane.showInputDialog("Enter a word with atleast five"
                + " characters.");
        }
   
        //loop for processing
            for (int i=wordToReverse.length() -1; i > -1; i--){  //initialized i as length of string since legth of string is greater than 1
                reverse = reverse + wordToReverse.charAt(i);
            }
            
            //output final
        JOptionPane.showMessageDialog(null, "The word " + wordToReverse + " reversed is " + reverse + ". ");
       
       }
    }


    
    
    
        
    
    

