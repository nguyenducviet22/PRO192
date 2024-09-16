/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class SpecUser extends User {

    private String address;

    public SpecUser() {
    }

    public SpecUser(String name, int status, String address) {
        super(name, status);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", getName(), getAddress(), getStatus());
    }

    public void setData() {
        setName(getName() + getAddress());
    }
    
    public String getValue() {
        String str = "";
        if (getStatus() == 1)
            return str = getName() + "admin";
        return str = getName() + "user";
    }
}
