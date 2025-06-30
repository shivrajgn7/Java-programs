class Satellite {

    static String satelliteName ;
    static String country ;
    static String agency ;
    static String launchVehicle ;
    static String launchSite;
    static String missionType ;
    static String orbitType ;
    static String communicationBand ;
    static String builtBy ;
    static String fuelType;
    static String controlCenter ;
	static int altitudeKm ;
    static int powerWatts ;
    static int trackingAntennas;

    static double satelliteMassKg;
    static int missionDurationYears ;
    static int solarPanels ;
    static int transponders;
    static int sensors ;
    static int launchYear;
    

    public static void main(String[] args) {
		
		
		
		
		
		
        System.out.println("Satellite: " + satelliteName);
        System.out.println("Country: " + country);
        System.out.println("Agency: " + agency);
		System.out.println("Sensors: " + sensors);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Altitude: " + altitudeKm);
        System.out.println("Power: " + powerWatts);
        System.out.println("Antennas: " + trackingAntennas);
        System.out.println("Mass: " + satelliteMassKg + " kg");
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Mission: " + missionType);
        System.out.println("Orbit: " + orbitType);
        System.out.println("Band: " + communicationBand);
        System.out.println("Built By: " + builtBy);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Control: " + controlCenter);
        System.out.println("Duration: " + missionDurationYears);
        System.out.println("Solar Panels: " + solarPanels);
        System.out.println("Transponders: " + transponders);
		
		satelliteName = "INSAT-3DR";
		country = "India";
		agency = "ISRO";
		launchVehicle = "GSLV-F05";
		launchSite = "Sriharikota";
		missionType = "Weather Observation";
		orbitType = "Geostationary";
		 communicationBand = "C-band, S-band";
		 builtBy = "ISRO Satellite Centre";
		fuelType = "Mono-propellant";
		controlCenter = "Master Control Facility, Hassan";
		altitudeKm = 36000;
		 powerWatts = 1200;
		trackingAntennas = 3;
		satelliteMassKg = 2211.0;
		missionDurationYears = 10;
		solarPanels = 2;
		transponders = 8;
		sensors = 5;
		launchYear = 2016;
	
		
		System.out.println("Satellite: " + satelliteName);
        System.out.println("Country: " + country);
        System.out.println("Agency: " + agency);
		System.out.println("Sensors: " + sensors);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Altitude: " + altitudeKm);
        System.out.println("Power: " + powerWatts);
        System.out.println("Antennas: " + trackingAntennas);
        System.out.println("Mass: " + satelliteMassKg + " kg");
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Mission: " + missionType);
        System.out.println("Orbit: " + orbitType);
        System.out.println("Band: " + communicationBand);
        System.out.println("Built By: " + builtBy);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Control: " + controlCenter);
        System.out.println("Duration: " + missionDurationYears);
        System.out.println("Solar Panels: " + solarPanels);
        System.out.println("Transponders: " + transponders);
       
    }
}