package org.example.dz1;

public class calcServise {
    public int bonusServis(int amount, boolean isRegister){
        int procent = isRegister ? 3 : 1;
        int bonus = amount * procent / 100;
        if (bonus > 500){
            bonus = 500;
        }
        return bonus;
    }

}
