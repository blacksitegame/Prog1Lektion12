package Opgave04;

import javax.sound.midi.VoiceStatus;

public class WeatherStation {
    private double temperatureFahrenheit;
    private double temperature;
    private double pressurePsi;
    private double pressure;

    //Constructor
    public WeatherStation(double temperature, double pressure) {
        setPressure(pressure);
        setPressurePsi(pressure);
        setTemperature(temperature);
        setTemperatureFahrenheit(temperature);
    }

    //    Print methode
    public void print() {
        System.out.println("Imperial:");
        System.out.println("Pressure: " + getPressure() + " Temperature: " + getTemperature());
        System.out.println("Metric:");
        System.out.println("Pressure: " + getPressurePsi() + " Temperature: " + getTemperatureFahrenheit());

    }

    //    Getters

    public double getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressurePsi() {
        return pressurePsi;
    }

    public double getPressure() {
        return pressure;
    }

    //    Setters

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setTemperatureFahrenheit(double temperature) {
        this.temperatureFahrenheit = ((temperature - 32) / 1.8);
    }

    public void setPressurePsi(double pressure) {
        this.pressurePsi = pressure / 14.503773773;

    }


}
