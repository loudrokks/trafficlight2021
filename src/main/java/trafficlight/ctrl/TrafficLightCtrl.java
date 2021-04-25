package trafficlight.ctrl;

import trafficlight.gui.TrafficLightGui;
import trafficlight.states.*;

public class TrafficLightCtrl {

    private State greenState;
    private State redState;
    private State yellowState;
    private State currentState;
    private State previousState;
    private TrafficLightGui gui;


    public TrafficLightCtrl() {
        super();  //whatfor?
        initStates();
        gui = new TrafficLightGui(this);
        gui.setVisible(true);
    }

    private void initStates() {
        //TODO create the states and set current and previous state
        currentState = new YellowState();
        greenState = new GreenState();
        redState = new Red();
        yellowState = new YellowState();
        previousState = new GreenState();
    }

    public State getGreenState() {
        return greenState;
    }

    public State getRedState() {
        return redState;
    }

    public State getYellowState() {
        return yellowState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getPreviousState() {
        return previousState;
    }

    public void setPreviousState(State previousState) {
        this.previousState = previousState;
    }

    public void run() {
        gui.run();
    }

    public void nextState() {
        //TODO handle GUi request and update GUI
        if(currentState != yellowState)
        setPreviousState(currentState);

        currentState.nextState(this);
        //System.out.println(currentState);  //datesta
        //gui.setLight(currentState.getState());
        gui.setLight(getCurrentState().getState());
    }
}