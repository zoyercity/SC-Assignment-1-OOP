public class SmartBulb implements SmartDevice {

    private boolean isOn;
    private int brightness;

    public SmartBulb() {
        isOn = false;
        brightness = 50;
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
            return "Smart Bulb is ON at " + brightness + "% brightness.";
        } else {
            return "Smart Bulb is OFF.";
        }
    }

    public void setBrightness(int level) {
        if (level >= 0 && level <= 100) {
            brightness = level;
        }
    }
}