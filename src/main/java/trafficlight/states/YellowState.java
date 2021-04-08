package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class YellowState implements State{

    //previous
    @Override
    public void nextState(TrafficLightCtrl tlc) {
        tlc.setCurrentState(tlc.getGreenState());
    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.YELLOW;
    }
}
