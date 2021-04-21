import java.util.*;

public class Player {

    // Attributes of Player
    private String name;
    private int profession; // 1 Knight 2 Mage 3 Scavenger
    private int lvl = 1; // player starts at lvl 1
    private double exp = 0;
    private double gold = 0;
    private double hp;
    private double hreg;
    private double mp;
    private double mreg;
    private double pdmg;
    private double mdmg;
    private double pdef;
    private double mdef;
    private Location playerLoc;
    private List<Item> inventory = new ArrayList<>();

    public Player(int profession, String heroName, Location playerLoc) {

        // Name and profession
        this.profession = profession;
        this.name = heroName;
        this.playerLoc = playerLoc;
        this.inventory = new ArrayList<>();

 
        // Profession Stats
        switch (profession) {
            
            case 1: // Knight
                this.hp = 20.0;
                this.hreg = 1.5;
                this.mp = 15.0;
                this.mreg = 0.5;
                this.pdmg = 8.0;
                this.mdmg = 5.0;
                this.pdef = 12.0;
                this.mdef = 8.0;
                break;
        
            case 2: // Mage
                this.hp = 15.0;
                this.hreg = 0.5;
                this.mp = 20.0;
                this.mreg = 1.5;
                this.pdmg = 5.0;
                this.mdmg = 8.0;
                this.pdef = 8.0;
                this.mdef = 12.0;
                break;
            
            case 3: // Assasin
                this.hp = 15.0;
                this.hreg = 2.0;
                this.mp = 15.0;
                this.mreg = 2.0;
                this.pdmg = 10.0;
                this.mdmg = 10.0;
                this.pdef = 5.0;
                this.mdef = 5.0;
                break;
    
        }

    }

    // Gold
    private double addGold(double enemyGold) {

        this.gold = gold + enemyGold;

        return gold;

    }

    // Exp (Zusammenfassen?)
    public double gainExp(int enemyLvl) { 

        double expGained = (enemyLvl*100)/this.lvl;

        return expGained;

    }

    private double addExp(double expGained) { // Ewiger Loop mit gleichen Exp?

        this.exp = this.exp + expGained;

        return this.exp;

    }

    // Allows updating playersLoc to nearestLoc using printNearest method in Location class
    public void movePlayer() { 

        System.out.println("Wohin moechtest du gehen?");
 
        int i = 0;
        playerLoc.printNearest(i);

        String moveToString = System.console().readLine();
        int moveToInt = Integer.parseInt(moveToString);
        
        moveToInt--; // warum funktioniert das nicht aber in getNearestAt(i-1) schon?
        this.playerLoc = playerLoc.getNearestAt(moveToInt);

    }

    // Generates enemies in certain areas of the map
    public void playerEnters() {
        // Verschiedene Locations variieren (Castle, ruins, graveyard)?
        if (playerLoc == MainTestika.forest || playerLoc == MainTestika.shrine || playerLoc == MainTestika.revein || playerLoc == MainTestika.mine || playerLoc == MainTestika.coast || playerLoc == MainTestika.district || playerLoc == MainTestika.graveyard || playerLoc == MainTestika.ruins || playerLoc == MainTestika.castle) { 



        }

    }

    // Inventory Interaction
    public void showInventory() {   //Displays all Items in Inventory

        for (int i = 0; i < inventory.size(); i++) {

            Item item = this.inventory.get(i);
            System.out.println("[" + (i+1) + "]" + " " + item.getName());
            
        }

        System.out.println("Moechtest du [1] ein Item auswaehlen oder [2] zurueck?"); //Frage skippen?
        String choiceStg = System.console().readLine();
        int choiceInt = Integer.parseInt(choiceStg);

        switch (choiceInt) {

            case 1:
                selectItem();
                break;
            
            case 2:
                break;

        }

    }

    public void selectItem() {

        System.out.println("Welches Item moechtest du auswaehlen?");
        String selectionStg = System.console().readLine();
        int selectionInt = Integer.parseInt(selectionStg);

        interactItem(selectionInt);

    }

    public void interactItem(int selection) {

        selection--;
        Item selectedItem = getInventoryAt(selection);
        System.out.println("Name: " + selectedItem.getName());
        System.out.println("Typ: " + selectedItem.getType());
        System.out.println("Beschreibung: " + selectedItem.getDescription());
        System.out.println("Effekt: " + selectedItem.getDoubleEffect()); //Umbenennen?
        
        System.out.println("Moechtest du " + selectedItem.getName() + " verwenden [1] oder nicht [2]?"); // color change?
        String decisionStg = System.console().readLine();
        int decisionInt = Integer.parseInt(decisionStg);
        
        switch (decisionInt) {

            case 1:
                useItem(selectedItem);
                break;
            case 2:
                break;

        }
        
    }

    public void useItem(Item selectedItem) {

        switch (selectedItem.getTypeInt()) {

            case 1:
                this.hp = this.hp + selectedItem.getDoubleEffect();
                break;

        }

    }

    public void addItem(Item item) {

        this.inventory.add(item);

    }

    public Item getInventoryAt(int i) {

        return inventory.get(i);

    }

    //Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfession() {
        return this.profession;
    }

    public void setProfession(int profession) {
        this.profession = profession;
    }

    public int getLvl() {
        return this.lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public double getExp() {
        return this.exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public double getGold() {
        return this.gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }

    public double getHp() {
        return this.hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getHreg() {
        return this.hreg;
    }

    public void setHreg(double hreg) {
        this.hreg = hreg;
    }

    public double getMp() {
        return this.mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public double getMreg() {
        return this.mreg;
    }

    public void setMreg(double mreg) {
        this.mreg = mreg;
    }

    public double getPdmg() {
        return this.pdmg;
    }

    public void setPdmg(double pdmg) {
        this.pdmg = pdmg;
    }

    public double getMdmg() {
        return this.mdmg;
    }

    public void setMdmg(double mdmg) {
        this.mdmg = mdmg;
    }

    public double getPdef() {
        return this.pdef;
    }

    public void setPdef(double pdef) {
        this.pdef = pdef;
    }

    public double getMdef() {
        return this.mdef;
    }

    public void setMdef(double mdef) {
        this.mdef = mdef;
    }

    public Location getPlayerLoc() {
        return playerLoc;

    }

    public void setPlayerLoc(Location newLoc) {
        this.playerLoc = newLoc;

    }
    
    public List<Item> getInventory() {
        return this.inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

}