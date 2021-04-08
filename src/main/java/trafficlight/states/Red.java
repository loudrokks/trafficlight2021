package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class Red implements State{

    @Override
    public void nextState(TrafficLightCtrl tlc) {
        tlc.setCurrentState(tlc.getYellowState());
    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.RED;
    }
}
