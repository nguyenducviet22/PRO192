/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class SpecSpeaker extends Speaker {

    private String sound;

    public SpecSpeaker() {
    }

    public SpecSpeaker(String name, int power, String sound) {
        super(name, power);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + sound;
    }

    public void setData() {
        String rs = getName().substring(1);
        setName(rs);
    }

    public String getValue() {
        String rs = "";
        if (getPower() > 10) {
            rs = getSound()+getPower();
        } else {
            rs = getSound();
        }
        return rs;
    }
}
