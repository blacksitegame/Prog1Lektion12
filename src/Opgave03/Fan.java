package Opgave03;

public class Fan {
    public static int slow = 1;
    public static int medium = 2;
    public static int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;


    public Fan(int speed, boolean on, double radius, String color) {
        setSpeed(speed);
        setOn(on);
        setRadius(radius);
        setColor(color);
        toString(speed, on, radius, color);
    }


    public void defaultFan() {
        defaultSpeed();
        defaultOn();
        defaultRadius();
        defaultColor();
    }


    static public void toString(int speed, boolean on, double radius, String color) {
        if (on) {
            System.out.println("The speed of the fan is: " + speed + ". The fan is on");
            System.out.println("The radius of the fan is: " + radius + ". The color is: " + color);
        } else {
            System.out.println("The radius of the fan is: " + radius + ". The color is: " + color);
        }
    }

    public void defaultSpeed() {
        speed = slow;
    }

    public void defaultOn() {
        on = false;
    }

    public void defaultRadius() {
        radius = 5;
    }

    public void defaultColor() {
        color = "blue";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


}
