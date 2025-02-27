package dz10;

public class Conditioner {
    private int currentTemperature;
    private int maxTemperature = 30;
    private int minTemperature = 10;

    public Conditioner(int maxTemperature, int minTemperature){
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public int getMaxTemperature(){
        return maxTemperature;
    }

    public int getMinTemperature(){
        return minTemperature;
    }

    public void setCurrentTemperature(int newCurrentTemperature) {
        if(newCurrentTemperature < minTemperature) {
            newCurrentTemperature = minTemperature;
        }
        if (newCurrentTemperature >= maxTemperature){
           newCurrentTemperature = maxTemperature;
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
        currentTemperature = maxTemperature;
    }

    public void up1g(){
        int gradus = currentTemperature + 1;
        setCurrentTemperature(gradus);
    }
}
