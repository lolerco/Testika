import java.util.*;

public class MainTestika {

    // Declaring Locations
    public static String forestSur = "Hier ist ein Wald.";
    public static Location forest = null;
    public static String villageSur = "Hier ist ein Dorf.";
    public static Location village = null;
    public static String citySur = "Hier ist eine Stadt.";
    public static Location city = null;
    public static String shrineSur = "Hier ist ein vergessener Schrein.";
    public static Location shrine = null;
    public static String reveinSur = "Hier ist eine Kluft.";
    public static Location revein = null;
    public static String mineSur = "Hier ist ein altes Bergwerk.";
    public static Location mine = null;
    public static String coastSur = "Hier ist eine Kueste.";
    public static Location coast = null;
    public static String disSur = "Hier ist ein Außenbezirk der Stadt.";
    public static Location district = null;
    public static String grvySur = "Hier ist ein Friedhof.";
    public static Location graveyard = null;
    public static String ruinsSur = "Hier sind zerstörte Ruinen.";
    public static Location ruins = null;
    public static String castleSur = "Hier ist ein Schloss.";
    public static Location castle = null;

    // Declaring other Objects
    public static Player player;
    //public static Entity finalBoss;

    public static void setup() {
        
        System.out.println("Bevor du Spielen kannst musst du zwei Fragen beantworten. Zuerst, wie ist dein Name?");
        String playerName = System.console().readLine();
        
        System.out.println("Verstehe, " + playerName + " also. Und welcher Klasse gehoerst du an? Ritter [1], Magier [2] oder Assasine [3]?");
        String professionInput = System.console().readLine();
        int playerProfession = Integer.parseInt(professionInput);

        System.out.println("Wie du willst... Dein Charakter wird nun erstellt...");
        
        // Locations
        forest = new Location("Wald", forestSur, true);
        village = new Location("Dorf", villageSur, true);
        city = new Location("Stadt", citySur, false);
        shrine = new Location("Vergessener Schrein", shrineSur, false);
        revein = new Location("Kluft", reveinSur, false);
        mine = new Location("Altes Bergwerk", mineSur, false);
        coast = new Location("Kueste", coastSur, false);
        district = new Location("Außenbezirk", disSur, false);
        graveyard = new Location("Friedhof", grvySur, false);
        ruins = new Location("Ruinen", ruinsSur, false);
        castle = new Location("Schloss", castleSur, false);

        // Connecting Locations
        Location.connect(forest, village, "routeDorf");
        Location.connect(village, shrine, "routeSchrein");
        Location.connect(forest, city, "routeStadt");
        Location.connect(city, revein, "routeKluft");
        Location.connect(revein, mine, "routeBergwerk");
        Location.connect(revein, coast, "routeKueste");
        Location.connect(city, district, "routeAussenbezirk");
        Location.connect(district, graveyard, "routeFriedhof");
        Location.connect(city, ruins, "routeRuinen");
        Location.connect(ruins, castle, "routeSchloss");

        player = new Player(playerProfession, playerName, forest);
        Item potion = new Item("Heiltrank", "Verwendbar", "Ein einfacher Heiltrank", 20, 20.0);
        player.addItem(potion);

    }

    public static void gameLoop() {

        while (player.getHp() > 0) { // Finalboss missing

            clearScreen();
            Location playerLoc = player.getPlayerLoc();
            //Stats
            System.out.println(playerLoc.getSurroundings());
            System.out.println("Stats:\t[HP]\t" + player.getHp() + "\t-\t[MP]\t" + player.getMp());
            System.out.println("\t[HREG]\t" + player.getHreg() + "\t-\t[MREG]\t" + player.getMreg());
            System.out.println("\t[PDMG]\t" + player.getPdmg() + "\t-\t[MDMG]\t" + player.getMdmg());
            System.out.println("\t[PDEF]\t" + player.getPdef() + "\t-\t[MDEF]\t" + player.getMdef());
            System.out.println("\t[EXP]\t" + player.getExp() + "\t-\t[LVL]\t" + player.getLvl());

            System.out.println("Was moechtest du tun?");
            System.out.println("[1] Bewegen, [2] Kaempfen oder [3] Inventar anschauen?");
            String action = System.console().readLine();
            int actionInt = Integer.parseInt(action);

            switch (actionInt) {

                case 1: // Move

                    clearScreen();
                    player.movePlayer();
                    
                    break;

                case 2: // Fight

                    clearScreen();
                    // Fightloop 
                    break;
                
                case 3: // Inventory

                    clearScreen();
                    player.showInventory();
                    break;
                
            }
        }

    }

    public static void clearScreen() {

    System.out.print("\033[H\033[2J");  
    System.out.flush(); 

    }

    public static void main(String[] args) {

        // Create Frame

        setup(); 
        gameLoop();

    }

}