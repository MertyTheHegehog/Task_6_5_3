public class ElectricalAppliance {
    protected int energy,SOUND_COST, MAX_ENERGY;
    protected String idCode;

    ElectricalAppliance(String idCode) {
        this.idCode = idCode;
        energy = 0;
    }

    public void makeASound() {
        if (makingSoundIsPossible()) {
            System.out.printf("%s signals: ", idCode);
        }
    }

    protected boolean makingSoundIsPossible() {
        boolean soundWillBeMade = true;
        if (energy < SOUND_COST) {
            soundWillBeMade = false;
            System.out.printf("%s has no energy to make a sound\n", idCode);
        }
        return soundWillBeMade;
    }

    public void move(int inputDistance) {
        int distance;
        if (energy > 0) {
            if (inputDistance <= energy) {
                distance = inputDistance;
                energy -= inputDistance;
            } else {
                distance = energy;
                energy = 0;
            }
            System.out.printf("%s is moved by %d\n", idCode, distance);
        } else
            System.out.printf("%s can't move: no energy left\n",idCode);
    }

    public void charge(int added) {
        if (energy + added <= MAX_ENERGY)
            energy += added;
        else
            energy = MAX_ENERGY;
        System.out.printf("Now %s have %d of energy\n", idCode, energy);
    }

    public void chargeToMax() {
        energy = MAX_ENERGY;
    }

    public void check() {
        charge(10000);
        move(10000);
        charge(SOUND_COST);
        makeASound();
    }
}
