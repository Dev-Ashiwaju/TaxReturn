package taxreturn;
/**
 * @author ASHIWAJU
 */
import javax.swing.JOptionPane;
public class ShowTax {
   
    public static void main (String[]args){
        String security_number, l_name, f_name, z_code, m_status, own_v, inc;
        int number_of_vehicle;
        double income,tax = 0;

        TaxReturn myTax = new TaxReturn();
        do{
          security_number = JOptionPane.showInputDialog( null, "Enter Security Number" , 
                    "Security Number", JOptionPane.INFORMATION_MESSAGE);
        }while(security_number.length() != 10);
        l_name = JOptionPane.showInputDialog( null, "Enter Last Name" , 
                "Last Name", JOptionPane.INFORMATION_MESSAGE);
        f_name = JOptionPane.showInputDialog( null, "Enter Fist Name" , 
                "Fist Name", JOptionPane.INFORMATION_MESSAGE);
        z_code = JOptionPane.showInputDialog( null, "Enter Zip Code" , 
                "Zip Code", JOptionPane.INFORMATION_MESSAGE);       
        own_v = JOptionPane.showInputDialog( null, "Enter Vehicle Number" , 
                "Vehicle Number", JOptionPane.INFORMATION_MESSAGE);
        do{
          m_status = JOptionPane.showInputDialog( null, "Enter Marital Status" , 
                "Marital Status", JOptionPane.INFORMATION_MESSAGE);
        }while(m_status.length() == 0  );
        do{
          inc = JOptionPane.showInputDialog( null, "Enter Income Value" , 
                "Income Value", JOptionPane.INFORMATION_MESSAGE);
        }while(Integer.parseInt(inc) == 0 || inc.length() == 0 );
        number_of_vehicle = Integer.parseInt(own_v);
        income = Double.parseDouble(inc);
        
        myTax.setSecurityNumber(security_number);
        myTax.setLastName(l_name);
        myTax.setFirstName(f_name);
        myTax.setZipCode(z_code);
        myTax.setVehicleNumber(number_of_vehicle);
        myTax.setMaritalStatus(m_status);
        myTax.setAnnualIncome(income);
        tax = myTax.calculateTax(m_status, income);
       
        StringBuilder stringbuilder = new StringBuilder("Security Number: ");
        stringbuilder.append(myTax.getSecurityNumber());
        stringbuilder.append("\nFull Name: ");
        stringbuilder.append(myTax.getLastName() + " " + myTax.getFirstName());
        stringbuilder.append("\nZip Code: ");
        stringbuilder.append(myTax.getZipCode());
        stringbuilder.append("\nNumber of Owned Vehicle(s): ");
        stringbuilder.append(myTax.getVehicleNumber());
        stringbuilder.append("\nMarital Status: ");
        stringbuilder.append(myTax.getMaritalStatus());
        stringbuilder.append("\nAnnual Income: ");
        stringbuilder.append(myTax.getAnnualIncome());
        stringbuilder.append("\nTax: ");
        stringbuilder.append(tax);
              
        //Display the result with message dialog of JOptionpane
        JOptionPane.showMessageDialog( null, stringbuilder.toString(), "Output", JOptionPane.INFORMATION_MESSAGE);
   } 
}
