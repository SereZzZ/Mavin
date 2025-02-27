package dz10;

public class Conditioner {
    private int currentTemperature;

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int newCurrentTemperature) {
        if(newCurrentTemperature < 0) {
            return;
        }
        if (newCurrentTemperature >= 30){
           newCurrentTemperature = 30;
        }
        currentTemperature = newCurrentTemperature;
    }

    public void increaseTemp50p(){
        int target = currentTemperature * 3 / 2;
        setCurrentTemperature(target);
    }

    public void minusTemp50p() {
        int target = currentTemperature / 2;
        setCurrentTemperature(target);
    }

    public void setTuMaxTemp() {
        currentTemperature = 30;
    }

    public void up1g(){
        int gradus = currentTemperature + 1;
        setCurrentTemperature(gradus);
    }
}
