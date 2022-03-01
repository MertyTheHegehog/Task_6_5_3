public class Tractor extends ElectricalAppliance {
    int posOfLadle;
    static int MAX_POS_OF_LADLE = 5;

    public Tractor(String id) {
        super(id);
        SOUND_COST = 5;
        posOfLadle = 5;
        MAX_ENERGY = 20000;
    }

    @Override
    public void check() {
        super.check();
        upLadle();
        downLadle();
    }

    public void upLadle() {
        if (posOfLadle == MAX_POS_OF_LADLE) {
            System.out.println("Ladle is already upped to max");
        } else {
            posOfLadle++;
            printPos();
        }
    }

    public void downLadle() {
        if (posOfLadle == 0) {
            System.out.println("Ladle is already downed to min");
        } else {
            posOfLadle--;
            printPos();
        }
    }

    private void printPos(){
        System.out.println("Now position of ladle is " + posOfLadle);
    }

    @Override
    public void makeASound() {
        super.makeASound();
        if (makingSoundIsPossible()){
            energy -= SOUND_COST;
            beep();
        }
    }

    protected void beep() {
        System.out.println("Boooop");
    }
}
