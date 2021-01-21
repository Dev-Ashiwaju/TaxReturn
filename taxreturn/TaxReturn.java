package taxreturn;

public class TaxReturn {
    private String payer_security_number, last_name, first_name, zip_code, marital_status;
    private int number_of_vehicle;
    private double annual_income;
   
    public String getSecurityNumber(){
        return this.payer_security_number;
    }
    public String getFirstName(){
        return this.first_name;
    } 
    public String getLastName(){
        return this.last_name;
    }
    public String getZipCode(){
        return this.zip_code;
    }
    public int getVehicleNumber(){
        return this.number_of_vehicle;
    }
    public String getMaritalStatus(){
        return this.marital_status;
    }
    public double getAnnualIncome(){
        return this.annual_income;
    }
   
    public void setSecurityNumber(String number){
        this.payer_security_number = number;
    }
    public void setFirstName(String f_name){
        this.first_name = f_name;
    }
    public void setLastName(String l_name){
        this.last_name = l_name;
    }
    public void setZipCode(String z_code){
        this.zip_code = z_code;
    }
    public void setVehicleNumber(int vehicle_n){
        this.number_of_vehicle = vehicle_n;
    }
    public void setMaritalStatus(String m){
        this.marital_status = m;
    }
    public void setAnnualIncome(double income){
        this.annual_income = income;
    }
    
    public double calculateTax(String maritalStatus, double income){
        double Tax = 0; 
        if (maritalStatus.equals("M") || maritalStatus.equals("m")) {
            if (income > 0 && income <= 15000) { Tax = income * .10;}
            else if (income > 15000 && income <= 40000){Tax = income  * .18 ;}
            else if (income > 40000) { Tax = income  * .23;}
        }
        
        else if (maritalStatus.equals("S")|| maritalStatus.equals("s")) {
            if (income > 0 && income <= 15000) { Tax = income * .12;}
            else if (income > 15000 && income <= 40000){Tax = income  * .20 ; }
            else if (income > 40000) {Tax = income  * .25;}   
        }
        return Tax;
    }
}
