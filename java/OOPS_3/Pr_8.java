//Write a Java p**rogram to create class called "TrafficLight" with attributes for color and duration, and methods to 
//change the color and check for red or green.

import java.util.Scanner;

class TrafficLight {
    public String RESET = "\u001B[0m";
    public String RED = "\u001B[31m";
    public String GREEN = "\u001B[32m";

    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }
    // public void setcolour(String color){
    // this.color=color;
    // }

    public String getColor() {
        return color;
    }

    public void changeColor(String newColor, String newDuration) {
        color = newColor;
        duration = newDuration;
    }

    public boolean Red() {
        return color.equals("red");
    }

    public boolean Green() {
        return color.equals("green");
    }

    public int durationOf() {
        return duration;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the color");
        String color = sc.nextLine();
        System.out.println("Enter the duration");
        int duration = sc.nextInt();

        TrafficLight trafficLight = new TrafficLight(color, duration);

        System.out.println("Initial color: " + trafficLight.getColor());
        System.out.println("Is it red?:- " + trafficLight.Red());
        System.out.println("Is it green? :-" + trafficLight.Green());
        System.out.println("Duration :- " + duration);
        System.out.println("------------------------------------------------");

        System.out.println("Enter the update color");
        String newcolor = sc.nextLine();
        System.out.println("enter the update duration");
        int newDuration = sc.nextInt();
        trafficLight.changeColor(newcolor, newDuration);

        System.out.println("New color: " + trafficLight.getColor());
        System.out.println("Is it red?:- " + trafficLight.Red());
        System.out.println("Is it green?:- " + trafficLight.Green());
        System.out.println("Duration " + duration);
        System.out.println("-----------------------------------------------------");
    }
}