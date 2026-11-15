public class TeslaModelS extends Cars{
    private int charge;

    public TeslaModelS(DriveType drive, FuelType fuel, double acceleration, int max_speed,
                       Owner owner, int charge){
        super(drive, fuel, acceleration, max_speed, owner);
        this.charge = charge;
    }

    @Override
    public void startEngine() {
        System.out.println("Движок запущен. пи-пи-пи");
    }
}
