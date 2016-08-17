package edu.dasalgo.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Building {
	ArrayList<Elevator> elevatorlist = new ArrayList<Elevator>();
	Queue<Person> personlist = new LinkedList<Person>();
	ArrayList<ArrayList<Person>> peopleline = new ArrayList <ArrayList<Person>>();
	
	
	
	public Building(ArrayList<Elevator> elevatorlist) {
		super();
		Elevator elevator1 = this.addElevator();
		Elevator elevator2 = this.addElevator();
		Elevator elevator3 = this.addElevator();

	}
	
	

	public Queue<Person> getPersonlist() {
		return personlist;
	}

	public void setPersonlist(Queue<Person> personlist) {
		this.personlist = personlist;
	}

	public ArrayList<ArrayList<Person>> getPeopleline() {
		return peopleline;
	}

	public void setPeopleline(ArrayList<ArrayList<Person>> peopleline) {
		this.peopleline = peopleline;
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
