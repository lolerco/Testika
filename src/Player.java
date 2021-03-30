public class Player {

    // Attributes of Player
    private String name;
    private int profession; // 1 Knight 2 Mage 3 Scavenger
    private int lvl = 1; // player starts at lvl 1
    private int exp = 0;
    private int gold = 0;
    private int hp;
    private double hreg;
    private int mp;
    private double mreg;
    private int pdmg;
    private int mdmg;
    private int pdef;
    private int mdef;
    private Location playerLoc;
    // Inventory List

    public Player(int profession, String heroName, Location playerLoc) {

        // Name and profession
        this.profession = profession;
        this.name = heroName;
        this.playerLoc = playerLoc;

        // Profession Stats
        switch (profession) {
            
            case 1: // Knight
                this.hp = 20;
                this.hreg = 1.5;
                this.mp = 15;
                this.mreg = 0.5;
                this.pdmg = 8;
                this.mdmg = 5;
                this.pdef = 12;
                this.mdef = 8;
                break;
        
            case 2: // Mage
                this.hp = 15;
                this.hreg = 0.5;
                this.mp = 20;
                this.mreg = 1.5;
                this.pdmg = 5;
                this.mdmg = 8;
                this.pdef = 8;
                this.mdef = 12;
                break;
            
            case 3: // Assasin
                this.hp = 15;
                this.hreg = 2;
                this.mp = 15;
                this.mreg = 2;
                this.pdmg = 10;
                this.mdmg = 10;
                this.pdef = 5;
                this.mdef = 5;
                break;
    
        }

    }

    // Gold
    private int addGold(int enemyGold) {

        this.gold = gold + enemyGold;

        return gold;

    }

    // Exp (Zusammenfassen?)
    public int gainExp(int enemyLvl) { 

        int expGained = (enemyLvl*100)/this.lvl;

        return expGained;

    }

    private int addExp(int expGained) { // Ewiger Loop mit gleichen Exp?

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
        
        moveToInt = moveToInt--; // warum funktioniert das nicht aber in getNearestAt(i-1) schon?
        this.playerLoc = playerLoc.getNearestAt(moveToInt);

    }

    // Generates enemies in certain areas of the map
    public void playerEnters() {
        // Verschiedene Locations variieren (Castle, ruins, graveyard)?
        if (playerLoc == MainTestika.forest || playerLoc == MainTestika.shrine || playerLoc == MainTestika.revein || playerLoc == MainTestika.mine || playerLoc == MainTestika.coast || playerLoc == MainTestika.district || playerLoc == MainTestika.graveyard || playerLoc == MainTestika.ruins || playerLoc == MainTestika.castle) { 

            

        }

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

    public int getExp() {
        return this.exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getGold() {
        return this.gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getHreg() {
        return this.hreg;
    }

    public void setHreg(double hreg) {
        this.hreg = hreg;
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public double getMreg() {
        return this.mreg;
    }

    public void setMreg(double mreg) {
        this.mreg = mreg;
    }

    public int getPdmg() {
        return this.pdmg;
    }

    public void setPdmg(int pdmg) {
        this.pdmg = pdmg;
    }

    public int getMdmg() {
        return this.mdmg;
    }

    public void setMdmg(int mdmg) {
        this.mdmg = mdmg;
    }

    public int getPdef() {
        return this.pdef;
    }

    public void setPdef(int pdef) {
        this.pdef = pdef;
    }

    public int getMdef() {
        return this.mdef;
    }

    public void setMdef(int mdef) {
        this.mdef = mdef;
    }

    public Location getPlayerLoc() {
        return playerLoc;

    }

    public void setPlayerLoc(Location newLoc) {
        this.playerLoc = newLoc;

    }

}