package de.uni.koeln.se.state;

public class Elevator {

	public static int current_Floor = 5;
	int dest_Floor;

	private Elv_States State = new Elv_States();

	public Elevator(int dest_floor) {
		this.dest_Floor = dest_floor;
		System.out.println("*** Destination floor is: " + dest_Floor);
		arrive_atFloor();

	}

	private void arrive_atFloor() {

		while (dest_Floor != current_Floor) {
			if (dest_Floor < current_Floor) {
				System.out.println(State.Moving_down);
				current_Floor--;
			} else if (dest_Floor > current_Floor) {
				System.out.println(State.Moving_up);
				current_Floor++;
			}
		}

		if (dest_Floor == current_Floor) {
			System.out.println(State.Idle);
		}

	}

}
