public class Robot extends ElectricalAppliance {
    Robot(String id) {
        super(id);
        SOUND_COST = 3;
        MAX_ENERGY = 1000;
    }


    @Override
    public void makeASound() {
        super.makeASound();
        if (makingSoundIsPossible()){
            energy -= SOUND_COST;
            speak();
        }
    }

    @Override
    public void check() {
        super.check();
        energy+=SOUND_COST;
        makeASound("Humanity = GG");
    }

    public void makeASound(String input) {
        super.makeASound();
        if (makingSoundIsPossible()){
            speak(input);
            energy -= SOUND_COST;
        }
    }

    private void speak() {
        System.out.println("Hi, humans!");
    }

    private void speak(String input) {
        System.out.println(input);
    }
}
