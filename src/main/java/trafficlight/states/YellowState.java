package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class YellowState implements State{

    //previous
    @Override
    public void nextState(TrafficLightCtrl tlc) {
        if(tlc.getPreviousState().equals(tlc.getRedState())) {
            tlc.setCurrentState(tlc.getGreenState());
            tlc.setPreviousState(tlc.getGreenState());
        }else{ //if(tlc.getPreviousState().equals(tlc.getGreenState())){
            tlc.setCurrentState(tlc.getRedState());
            tlc.setPreviousState(tlc.getRedState());
        }
    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.YELLOW;
    }
}
