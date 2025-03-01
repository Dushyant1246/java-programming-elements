// EarthVolume class to compute the volume of Earth in km^3 and miles^3
class EarthVolume {
    public static void main(String[] args) {
        
        // Radius of Earth in km
        double radius = 6378; // in km
        
        // Variable to calculate volume of Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        
        // Variable to calculate volume of Earth in cubic miles
        double volumeMiles3 = volumeKm3 * Math.pow(0.621371, 3); // 1 km = 0.621371 miles
        
        // Print the volumes in km^3 and miles^3
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}