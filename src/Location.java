import java.util.*;

public class Location {
    
    private String name;
    private String surroundings;
    private boolean visited;
    private boolean containsPlayer;
    private List<String> routes; 
    private List<Location> nearest;

    public Location(String name, String surroundings, boolean visited) {

        this.name = name;
        this.surroundings = surroundings;
        this.visited = visited;
        this.nearest = new ArrayList<>();
        this.routes = new ArrayList<>();

    }

    private void addNearest(Location neighbour, String route) {
        
        this.nearest.add(neighbour);
        this.routes.add(route);

    }

    // Connects Location A to Location B and B to A
    public static void connect(Location a, Location b, String route) {

        a.addNearest(b, route);
        b.addNearest(a, route);

    }

    // Prints possible Locations to go to with numbers
    public void printNearest(int i) {

        for (; i < this.nearest.size(); i++) {

            Location l = this.nearest.get(i);
            String r = this.routes.get(i);
            i = i + 1;

            if (l.getVisited()) {
                
                System.out.println("[" + i + "]" + " " + l.getName());

            } else {
                
                System.out.println("[" + i + "]" + " " + r);

            }

            i = i - 1;
        }

    }

    public String nearestNameAt(int i) {

        return this.nearest.get(i).getName();

    }

    public Location getNearestAt(int i) {

        Location newPlayerLoc = this.nearest.get(i-1);
        newPlayerLoc.setVisited(true);

        return newPlayerLoc;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurroundings() {
        return this.surroundings;
    }

    public void setSurroundings(String surroundings) {
        this.surroundings = surroundings;
    }

    public boolean isVisited() {
        return this.visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
    public boolean isContainsPlayer() {
        return this.containsPlayer;
    }

    public void setContainsPlayer(boolean containsPlayer) {
        this.containsPlayer = containsPlayer;
    }

    public List<String> getRoutes() {
        return this.routes;
    }

    public void setRoutes(List<String> routes) {
        this.routes = routes;
    }

    public List<Location> getNearest() {
        return this.nearest;
    }

    public void setNearest(List<Location> nearest) {
        this.nearest = nearest;
    }

    public boolean getVisited() {

        return this.visited;

    }

    public String getName() {

        return this.name;

    }

}
