public class SmartThermostat implements SmartDevice {

    private boolean isOn;
    private double temperature;

    public SmartThermostat() {
        isOn = false;
        temperature = 22.0;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String getStatus() {
        if (isOn) {
            return "Smart Thermostat is ON at " + temperature + "°C.";
        } else {
            return "Smart Thermostat is OFF.";
        }
    }

    public void setTemperature(double temp) {
        if (temp >= 10 && temp <= 35) {
            temperature = temp;
        }
    }
}