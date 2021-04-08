package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public interface State {

    public void nextState(TrafficLightCtrl tlc);

    public TrafficLightColor getState();
}