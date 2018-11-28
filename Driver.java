 
package driver;

import java.util.ArrayList;
import javax.swing.JOptionPane;

 
public class Driver {
        
     static ArrayList<Person> list = new ArrayList<>();
    public static void main(String[] args) {
         
         String input;
          int option;
         
         
         while(true)
         
         {
         input = JOptionPane.showInputDialog("Enter 1 for adding Person Details"+
                                              "\n Enter 2 for show Person Details"     
                                                );
         option = Integer.parseInt(input);
         
         
         switch(option)
         {
             case 1:
                 addperson();
                 break;
                 
             case 2:
                 showperson();
                 break;
         
         }
         
         }
         
         
         
         
         
    }
    
    
    
   static void addperson()
     
    {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter person id"));
        String name = JOptionPane.showInputDialog("Enter name");
        String Address = JOptionPane.showInputDialog("Enter Addres");
        String Gender = JOptionPane.showInputDialog("Enter Gender");
        String Phone  = JOptionPane.showInputDialog("Enter Phone");
        
        Person p = new Person(id, name, Address, Gender, Phone);
        list.add(p);
    
    }
    
   static void showperson()
   {
       for (int i = 0; i < list.size(); i++) {
          Person per = list.get(i);
          per.display();
       }
      
   
   
   }
}
