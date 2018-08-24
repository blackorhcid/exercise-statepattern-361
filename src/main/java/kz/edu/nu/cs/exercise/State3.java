package kz.edu.nu.cs.exercise;

public class State3 extends State{

	public State3(StateContext sc){
		this.sc = sc;
		accept = true;
	}

	public void actionA() {
		this.sc.setCurrentState(sc.state3);
    }

    public void actionB() {
		this.sc.setCurrentState(sc.state2);
    }

	public boolean isAccept() {
		return this.accept;
	}

}    