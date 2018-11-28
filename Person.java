 
package driver;

import javax.swing.JOptionPane;

 
 class Person {
    
    
    int id;
    String name;
    String address;
    String gender;
    String phone_number;

     Person(int id, String name, String address, String gender, String phone_number) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.phone_number = phone_number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone_number() {
        return phone_number;
    }
    
    public void display()
    {
         JOptionPane.showMessageDialog(null,
                 "=========================="+
                 "\nPerson ID"+ getId()+
                 "\nPerson Name"+ getName()+
                 "\nPerson Address"+  getAddress()+
                 "\nPerson Gender"+ getGender()+
                 "\nPerson Phone number"+ getPhone_number()
                     
                      );
    
    
    
    }
}
