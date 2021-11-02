package com.example.gps_app;

import android.location.Address;
import android.location.Location;

public class SendLocationToActivity {
    private Location location;

    public SendLocationToActivity(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
