public class Main {
    public static void main(String[] args) {
        ElectricalAppliance tractor1 = new Tractor("356703001");
        ElectricalAppliance cabriolet1 = new Cabriolet("356704001");
        ElectricalAppliance cabriolet2 = new Cabriolet("356704002");
        ElectricalAppliance cabriolet3 = new Cabriolet("356704003");
        ElectricalAppliance c3po = new Robot("356702001");

        CheckerOfAppliance checker = new CheckerOfAppliance();

        checker.add(tractor1);
        checker.add(cabriolet1);
        checker.add(cabriolet2);
        checker.add(cabriolet3);
        checker.add(c3po);

        checker.checkAll();

        checker.chargeAll();
    }
}
