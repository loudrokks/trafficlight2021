package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class Off implements State{

    @Override
    public void nextState(TrafficLightCtrl tlc) {
        tlc.setCurrentState(tlc.getRedState());
    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.OFF;
    }
}
