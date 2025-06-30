class PoliceStation {

    static String stationName = "Rajajinagar  Police Station";
    static String location = "Bangalore, Karnataka";
    static String chiefOfficer = "Mohan";
    static int chiefBadgeNumber = 137;
    static String chiefRank = "Inspector";
    static boolean isOnDuty = true;
    static int activeCases = 43;
    static int closedCases = 12;
	static int totalOfficers = 12;
    static String latestCaseType = "Robbery";
	static int totalVehicles = 5;
    static int totalCells =3;
    static String latestCaseStatus = "Under Investigation";
    static String firFiledBy = "Gajani";
    static String firCrimeType = "Theft";
    static int firId = 45231;
    static String firDate = "2025-06-19";
    static int numberOfWeapons = 15;
    static int numberOfComputers = 10;
    static int evidenceRoomCapacity = 300;
    static boolean hasCCTVMonitoring = true;

    public static void main(String[] args) {

        
        System.out.println("Station Name: " + stationName);
        System.out.println("Location: " + location);
        System.out.println("Total Officers: " + totalOfficers);
        System.out.println("Total Vehicles: " + totalVehicles);
        System.out.println("Total Cells: " + totalCells);
        System.out.println("Name: " + chiefOfficer);
        System.out.println("Badge Number: " + chiefBadgeNumber);
        System.out.println("Rank: " + chiefRank);
        System.out.println("On Duty: " + isOnDuty);
        System.out.println("Active Cases: " + activeCases);
        System.out.println("Closed Cases: " + closedCases);
        System.out.println("Latest Case Type: " + latestCaseType);
        System.out.println("Latest Case Status: " + latestCaseStatus);
        System.out.println("Filed By: " + firFiledBy);
        System.out.println("Crime Type: " + firCrimeType);
        System.out.println("FIR ID: " + firId);
        System.out.println("FIR Date: " + firDate);
        System.out.println("Number of Weapons: " + numberOfWeapons);
        System.out.println("Number of Computers: " + numberOfComputers);
        System.out.println("Evidence Room Capacity: " + evidenceRoomCapacity);
        System.out.println("Has CCTV Monitoring: " + hasCCTVMonitoring);
    }
}