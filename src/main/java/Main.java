import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Owner vlad = new Owner("Влад", "Худяков", 19);
        Owner ilon = new Owner("Илон", "Маск", 55);
        Owner maxim = new Owner("Максим", "Попкин", 13);

        Cars vesta1 = new LadaVesta(DriveType.FRONT_WHEEL, FuelType.PETROL_92,
                11.2, 162, vlad, 100_000);
        Cars modelS1 = new TeslaModelS(DriveType.ALL_WHEEL, FuelType.ELECTRIC,
                3.2, 250, ilon, 80);

        List<Cars> garage = new ArrayList<>();
        garage.add(vesta1);
        garage.add(modelS1);

        Collections.sort(garage);

        List<Owner> owners = new ArrayList<>();
        owners.add(vlad);
        owners.add(ilon);
        owners.add(maxim);

        Collections.sort(owners);

        for (Owner owner : owners) {
            System.out.println(owner.firstName() + " " + owner.lastName() + " " +
                    owner.age());
        }

        vesta1.refuel();
        modelS1.refuel();

        vesta1.drift();
        modelS1.drift();

        modelS1.changeOwner(maxim);
        modelS1.changeOwner(vlad);
    }
}
