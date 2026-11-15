public class LadaVesta extends Cars{
    private int mileage;

    public LadaVesta(DriveType drive, FuelType fuel, double acceleration, int max_speed,
                     Owner owner, int mileage){
        super(drive, fuel, acceleration, max_speed, owner);
        this.mileage = mileage;
    }

    public int getMileage(){
        return this.mileage;
    }


    @Override
    public void startEngine() {
        System.out.println("Движок запущен. Врум-врум");
    }
}
