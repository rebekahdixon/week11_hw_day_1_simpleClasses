public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int remove10WhenUsed() {
        return this.volume -= 10;
    }

    public void emptyWaterBottle() {
        this.volume = 0;
    }

    public void fillWaterBottle() {
        this.volume = 100;
    }
}

//* Create a water bottle class with a volume property.
//        * Create an empty function that brings the volume down to 0.
//        * Create a fill function that fills the volume back to 100.