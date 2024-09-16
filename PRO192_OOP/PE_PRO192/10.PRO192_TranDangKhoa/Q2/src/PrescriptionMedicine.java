/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class PrescriptionMedicine extends Medicine {
    private String doctorName;

    public PrescriptionMedicine() {
    }

    public PrescriptionMedicine(String name, String indication, int expirationYear, String doctorName) {
        super(name, indication, expirationYear);
        this.doctorName = doctorName;
    }

    public String getDoctorName() {
        return doctorName.substring(0, 1).toUpperCase() + doctorName.substring(1).toLowerCase();
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", %s", getDoctorName()); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String isExpired(int currentYear){
        if (currentYear > super.getExpirationYear()){
            return "Expired";
        } else{
            return "Valid";
        }
    }
}
