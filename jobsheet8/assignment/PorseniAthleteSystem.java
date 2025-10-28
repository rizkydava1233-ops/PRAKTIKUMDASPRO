package jobsheet8.assignment;
import java.util.*;

class Athlete implements Comparable<Athlete> {
    private String name;
    private String sport;
    private String polytechnic;
    
    public Athlete(String name, String sport, String polytechnic) {
        this.name = name;
        this.sport = sport;
        this.polytechnic = polytechnic;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSport() {
        return sport;
    }
    
    public String getPolytechnic() {
        return polytechnic;
    }
    
    @Override
    public int compareTo(Athlete other) {
        return this.name.compareToIgnoreCase(other.name);
    }
    
    @Override
    public String toString() {
        return String.format("%-25s %-20s %-30s", name, sport, polytechnic);
    }
}

public class PorseniAthleteSystem {
    private Map<String, ArrayList<Athlete>> athletesBySport;
    
    public PorseniAthleteSystem() {
        athletesBySport = new HashMap<>();
        athletesBySport.put("Badminton", new ArrayList<>());
        athletesBySport.put("Table Tennis", new ArrayList<>());
        athletesBySport.put("Basketball", new ArrayList<>());
        athletesBySport.put("Volleyball", new ArrayList<>());
    }
    
    public void addAthlete(String name, String sport, String polytechnic) {
        if (athletesBySport.containsKey(sport)) {
            if (athletesBySport.get(sport).size() < 5) {
                athletesBySport.get(sport).add(new Athlete(name, sport, polytechnic));
                System.out.println("Athlete added successfully!");
            } else {
                System.out.println("Error: " + sport + " already has 5 athletes.");
            }
        } else {
            System.out.println("Error: Sport not found.");
        }
    }
    
    public void displayAllAthletes() {
        System.out.println("\n=== PORSENI 2024 - MALANG STATE POLYTECHNIC ===");
        System.out.println("All Athletes in Ascending Order by Name\n");
        System.out.println(String.format("%-25s %-20s %-30s", "NAME", "SPORT", "POLYTECHNIC"));
        System.out.println("=".repeat(75));
        
        ArrayList<Athlete> allAthletes = new ArrayList<>();
        for (ArrayList<Athlete> athletes : athletesBySport.values()) {
            allAthletes.addAll(athletes);
        }
        
        Collections.sort(allAthletes);
        
        for (Athlete athlete : allAthletes) {
            System.out.println(athlete);
        }
        System.out.println("\nTotal Athletes: " + allAthletes.size());
    }
    
    public void displayBySport(String sport) {
        if (athletesBySport.containsKey(sport)) {
            ArrayList<Athlete> athletes = athletesBySport.get(sport);
            Collections.sort(athletes);
            
            System.out.println("\n=== " + sport.toUpperCase() + " ATHLETES ===");
            System.out.println(String.format("%-25s %-30s", "NAME", "POLYTECHNIC"));
            System.out.println("=".repeat(55));
            
            for (Athlete athlete : athletes) {
                System.out.println(String.format("%-25s %-30s", 
                    athlete.getName(), athlete.getPolytechnic()));
            }
            System.out.println("Total: " + athletes.size() + "/5 athletes");
        } else {
            System.out.println("Sport not found.");
        }
    }
    
    public void displayAllSports() {
        System.out.println("\n=== PORSENI 2024 - ALL SPORTS ===\n");
        
        for (String sport : athletesBySport.keySet()) {
            ArrayList<Athlete> athletes = athletesBySport.get(sport);
            Collections.sort(athletes);
            
            System.out.println("--- " + sport + " (" + athletes.size() + "/5) ---");
            for (Athlete athlete : athletes) {
                System.out.println("  " + athlete.getName() + " - " + athlete.getPolytechnic());
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PorseniAthleteSystem system = new PorseniAthleteSystem();
        
        // Sample data
        system.addAthlete("Ahmad Rizki", "Badminton", "Malang State Polytechnic");
        system.addAthlete("Siti Nurhaliza", "Badminton", "Bandung State Polytechnic");
        system.addAthlete("Budi Santoso", "Table Tennis", "Jakarta State Polytechnic");
        system.addAthlete("Dewi Lestari", "Basketball", "Surabaya State Polytechnic");
        system.addAthlete("Eko Prasetyo", "Volleyball", "Semarang State Polytechnic");
        
        while (true) {
            System.out.println("\n=== PORSENI 2024 ATHLETE MANAGEMENT ===");
            System.out.println("1. Add Athlete");
            System.out.println("2. Display All Athletes (Sorted)");
            System.out.println("3. Display Athletes by Sport");
            System.out.println("4. Display All Sports");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter athlete name: ");
                        String name = scanner.nextLine();
                        
                        System.out.println("Available sports:");
                        System.out.println("1. Badminton");
                        System.out.println("2. Table Tennis");
                        System.out.println("3. Basketball");
                        System.out.println("4. Volleyball");
                        System.out.print("Choose sport (1-4): ");
                        int sportChoice = scanner.nextInt();
                        scanner.nextLine();
                        
                        String sport = "";
                        switch (sportChoice) {
                            case 1: sport = "Badminton"; break;
                            case 2: sport = "Table Tennis"; break;
                            case 3: sport = "Basketball"; break;
                            case 4: sport = "Volleyball"; break;
                            default: 
                                System.out.println("Invalid sport choice.");
                                continue;
                        }
                        
                        System.out.print("Enter polytechnic name: ");
                        String polytechnic = scanner.nextLine();
                        
                        system.addAthlete(name, sport, polytechnic);
                        break;
                        
                    case 2:
                        system.displayAllAthletes();
                        break;
                        
                    case 3:
                        System.out.println("Available sports:");
                        System.out.println("1. Badminton");
                        System.out.println("2. Table Tennis");
                        System.out.println("3. Basketball");
                        System.out.println("4. Volleyball");
                        System.out.print("Choose sport (1-4): ");
                        int displayChoice = scanner.nextInt();
                        scanner.nextLine();
                        
                        String displaySport = "";
                        switch (displayChoice) {
                            case 1: displaySport = "Badminton"; break;
                            case 2: displaySport = "Table Tennis"; break;
                            case 3: displaySport = "Basketball"; break;
                            case 4: displaySport = "Volleyball"; break;
                            default: 
                                System.out.println("Invalid sport choice.");
                                continue;
                        }
                        
                        system.displayBySport(displaySport);
                        break;
                        
                    case 4:
                        system.displayAllSports();
                        break;
                        
                    case 5:
                        System.out.println("Thank you for using Porseni 2024 Athlete Management System!");
                        scanner.close();
                        return;
                        
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine(); // clear buffer
            }
        }
    }
}
