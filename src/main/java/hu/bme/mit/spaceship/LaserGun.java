package hu.bme.mit.spaceship;

public class LaserGun {
    private boolean underMaintenance = false;

    public void setMaintenanceMode(boolean isUnderMaintenance) {
        underMaintenance = isUnderMaintenance;
    }

    public boolean fire() {
        return underMaintenance == false;
    }

    public boolean isEmpty() {
        return false;
    }
}
