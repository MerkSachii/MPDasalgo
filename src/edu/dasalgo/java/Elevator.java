package edu.dasalgo.java;

import java.util.ArrayList;

public class Elevator {
	private int maxWeight; // Maximum weight
	private ArrayList<Integer> elevFloors = new ArrayList<>(); // List of floors the elevator can pass
	private double timeToMove; // Time required for the elevator to move in between floors
	private double boostedMove; // Time required to move if the elevator goes straight to a certain floor
	private boolean isHighSpeed; // Boolean for the statement above
	
	
//	CONSTRUCTOR
//	
	public Elevator() {
		
	}
	
//	
//	
	
	
	
	
	
//	Setters goes here.
//	
//	
//	
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	public void setElevFloors(ArrayList<Integer> elevFloors) {
		this.elevFloors = elevFloors;
	}
	public void setTimeToMove(double timeToMove) {
		this.timeToMove = timeToMove;
	}
	public void setBoostedMove(double boostedMove) {
		this.boostedMove = boostedMove;
	}
	public void setHighSpeed(boolean isHighSpeed) {
		this.isHighSpeed = isHighSpeed;
	}


//	
//	
//	
//	Setters ends here
	

// 	Getters go here
//
//	
//	
	public int getMaxWeight() {
		return maxWeight;
	}
	public ArrayList<Integer> getElevFloors() {
		return elevFloors;
	}
	public double getTimeToMove() {
		return timeToMove;
	}
	public double getBoostedMove() {
		return boostedMove;
	}
	public boolean isHighSpeed() {
		return isHighSpeed;
	}
	
	
//	
//	
//	
//	Getters end here
}
