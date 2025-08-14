package part_1_behavioral.p2.State.abusing_the_state_pattern;

public class StoppedState implements State {

    private Stopwatch stopwatch;

    public StoppedState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new RunningState(stopwatch));
        System.out.println("Running");
    }

}
