package kz.edu.nu.cs.exercise;

public class State1 extends State {

	public State1(StateContext sc){
		this.sc = sc;
	}

	public void actionA() {
		this.sc.setCurrentState(sc.state2);
    }

    public void actionB() {
		this.sc.setCurrentState(sc.state1);
    }

	public boolean isAccept() {
		return this.accept;
	}
}