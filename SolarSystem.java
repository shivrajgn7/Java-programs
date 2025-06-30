class SolarSystem {

    static String sunType = "G-Type Main-Sequence Star";
    static String galaxy = "Milky Way";
    static String dominantPlanet = "Jupiter";
    static String smallestPlanet = "Mercury";
    static String earthType = "Terrestrial";
    static String marsNickname = "Red Planet";
	static int comets = 5000;
    static int satellitesLaunched = 7000;
    static int spaceProbes = 45;
    static int sunAgeInBillionYears = 5;
    static String outerPlanets = "Jupiter, Saturn, Uranus, Neptune";
    static String asteroidBeltLocation = "Between Mars and Jupiter";
    static String discoveredBy = "Ancient Civilizations";
    static String orbitShape = "Elliptical";
    static String centerObject = "Sun";

    static int totalPlanets = 8;
    static int dwarfPlanets = 5;
    static int moonsInSystem = 214;
    static int knownAsteroids = 1000000;
    

    static double solarSystemDiameterKm = 28746000000.0;

    public static void main(String[] args) {
        System.out.println("Sun Type: " + sunType);
        System.out.println("Galaxy: " + galaxy);
        System.out.println("Dominant Planet: " + dominantPlanet);
        System.out.println("Smallest Planet: " + smallestPlanet);
        System.out.println("Earth Type: " + earthType);
        System.out.println("Mars Nickname: " + marsNickname);
        System.out.println("Outer Planets: " + outerPlanets);
        System.out.println("Asteroid Belt: " + asteroidBeltLocation);
        System.out.println("Discovered By: " + discoveredBy);
        System.out.println("Orbit Shape: " + orbitShape);
        System.out.println("Center Object: " + centerObject);
        System.out.println("Planets: " + totalPlanets);
        System.out.println("Dwarf Planets: " + dwarfPlanets);
        System.out.println("Moons: " + moonsInSystem);
        System.out.println("Asteroids: " + knownAsteroids);
        System.out.println("Comets: " + comets);
        System.out.println("Satellites: " + satellitesLaunched);
        System.out.println("Probes: " + spaceProbes);
        System.out.println("Sun Age: " + sunAgeInBillionYears + " billion years");
        System.out.println("Diameter: " + solarSystemDiameterKm + " km");
    }
}