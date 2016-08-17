package edu.dasalgo.java;

import java.util.ArrayList;

public class Building {
	ArrayList<Elevator> elevatorlist = new ArrayList<Elevator>();
	ArrayList<Person> personlist = new ArrayList<Person>();
	ArrayList<ArrayList<Person>> peopleline = new ArrayList <ArrayList<Person>>();
	
	
	
	public Building(ArrayList<Elevator> elevatorlist) {
		super();
		this.elevatorlist = elevatorlist;
		this.personlist = personlist;
	}
	
	public ArrayList<Person> getPersonlist() {
		return personlist;
	}


	public void setPersonlist(ArrayList<Person> personlist) {
		this.personlist = personlist;
	}

	public ArrayList<Elevator> getElevatorlist() {
		return elevatorlist;
	}

	public void setElevatorlist(ArrayList<Elevator> elevatorlist) {
		this.elevatorlist = elevatorlist;
	}


	/* Methods */
	public Elevator addElevator(){
		ArrayList<Person> personlist = new ArrayList<Person>();
		Elevator elevator = new Elevator();
		elevatorlist.add(elevator);
		this.peopleline.add(personlist);
		
		return elevator;
	}	

}
