public class Cabriolet extends ElectricalAppliance {
    boolean roofIsRemoved;

    public Cabriolet(String id) {
        super(id);
        SOUND_COST = 4;
        roofIsRemoved = true;
        MAX_ENERGY = 15000;
    }

    @Override
    public void check() {
        super.check();
        removeRoof();
        upRoof();
    }

    public void removeRoof() {
        if (roofIsRemoved)
            System.out.println("Roof is already removed");
        else {
            roofIsRemoved = true;
            System.out.println("Roof is upped");
        }
    }

    public void upRoof() {
        if (roofIsRemoved) {
            roofIsRemoved = false;
            System.out.println("Roof is removed");
        } else
            System.out.println("Roof is already upped");
    }

    @Override
    public void makeASound() {
        super.makeASound();
        if (makingSoundIsPossible()){
            beep();
            energy -= SOUND_COST;
        }
    }

    protected void beep() {
        System.out.println("Beeeep");
    }
}
