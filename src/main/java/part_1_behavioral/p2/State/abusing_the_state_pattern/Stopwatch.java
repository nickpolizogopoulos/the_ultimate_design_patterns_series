package part_1_behavioral.p2.State.abusing_the_state_pattern;

public class Stopwatch {

    private State currentState = new StoppedState(this);

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void click() {
        currentState.click();
    }

}
