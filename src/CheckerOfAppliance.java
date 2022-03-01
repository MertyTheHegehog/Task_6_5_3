public class CheckerOfAppliance {
    ElectricalAppliance[] machines;
    static int MAX_OF_MACHINES = 5;
    int posOfLastMachine = 0;

    CheckerOfAppliance() {
        machines = new ElectricalAppliance[MAX_OF_MACHINES];
    }

    public void add(ElectricalAppliance machine) {
        if (posOfLastMachine < MAX_OF_MACHINES) {
            machines[posOfLastMachine++] = machine;
        } 
    }

    public void checkAll() {
        for (ElectricalAppliance machine : machines) {
            machine.check();
            System.out.println();
        }
    }

    public void chargeAll() {
        for (ElectricalAppliance machine : machines) {
            machine.chargeToMax();
        }
    }
}
