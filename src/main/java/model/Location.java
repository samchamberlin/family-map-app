package model;

/** The Location class creates a POJO storing location information */
public class Location {

    private String country;
    private String city;
    private double latitude;
    private double longitude;

    /** Location constructor when all the location data is given */
    public Location(String country, String city, double latitude, double longitude){
        this.country = country;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o instanceof Location) {
            Location l = (Location) o;
            return l.getCountry().equals(getCountry()) &&
                    l.getCity().equals(getCity()) &&
                    l.getLatitude() == getLatitude() &&
                    l.getLongitude() == getLongitude();
        } else {
            return false;
        }
    }
}