import models.Feeder;
import models.Fountain;
import models.Petter;

public class SimpleCatCareTaker {

    private Feeder feeder;
    private Fountain waterFountain;
    private Petter petMachine;

    public SimpleCatCareTaker() {
        this.feeder = new Feeder();
        this.waterFountain = new Fountain();
        this.petMachine = new Petter();
    }

}
