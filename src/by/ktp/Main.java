package by.ktp;

public class Main {

    public static void main(String[] args) {
        BrainStructure brainStructure = new BrainStructure();
        Brain brain = brainStructure.genenateNewBrain();
        boolean isLiveTimePrsent = true;
        brain.activate();
        while (isLiveTimePrsent) {
            brain.startCycling();
            isLiveTimePrsent = brain.checkTimeToCompleteCurrentLife();
        }
    }
}
