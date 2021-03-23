package javalibs5026201109;

import java.awt.*;
import javax.swing.JOptionPane;

public class JavaLibs5026201109 {

    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null,"Welcome!");
        int answer = JOptionPane.showOptionDialog(null,
                "Do you mind telling me about yourself?",
                "Do you?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(answer == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"okay :( sorry for bothering you");
            System.exit(0);
        }
        {
        JOptionPane.showMessageDialog(null, "Let's start!");
        
        String quest1 = JOptionPane.showInputDialog("What is your name?");
        String quest2 = JOptionPane.showInputDialog("How old are you?");
        String quest3 = JOptionPane.showInputDialog("What is your gender?");
        String quest4 = JOptionPane.showInputDialog("Where do you come from?");
        String quest5 = JOptionPane.showInputDialog("Do you have any hobbies?");
        String quest6 = JOptionPane.showInputDialog("Anything you dislike?");
        String quest7 = JOptionPane.showInputDialog("How many siblings do you have?");
        String quest8 = JOptionPane.showInputDialog("How many pets do you have?");
        String quest9 = JOptionPane.showInputDialog("How much money do you have right now?");
        String quest10 = JOptionPane.showInputDialog("Do you have anything you crave right now?");
        
        int sibling = Integer.parseInt(quest7);
        int totalfam = sibling+3;
        
        double money = Double.parseDouble(quest9);
        double share = money/2;
        
        JOptionPane.showMessageDialog(null,"hello,"+quest1+"!"
                +"\n You're a " +quest2+ " years old " +quest3+ " Who comes from " +quest4+ "."
                +"\n You love " +quest5+ " and hate " +quest6+ ". You came from a family of " +totalfam+ " with " +quest8+ " pets." 
                +"\n You told me that you want " +quest10+ " for us, so you decided to share your pocket money, and pay " +share+ " for that."
                +"\n how nice of you to do so!");
        }
    }
    
}
