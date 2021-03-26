public class Entity {
    
    private String name;
    private int lvl;
    private int gold; // Zufällig abhängig des Mob Types
    private int hp;
    private double hreg;
    private int mp;
    private double mreg;
    private int pdmg;
    private int mdmg;
    private int pdef;
    private int mdef;
    private int mobType; // Dadurch werden im Konstruktor automatisch Stats zugewiesen // Int String?

    public Entity(int mobType) {

        this.mobType = mobType;

        switch (this.mobType) {

            case 0:
                this.name = "TestMob";
                this.lvl = 1; // Random
                this.gold = 10; // Random
                this.hp = 35;
                this.hreg = 1.0;
                this.mp = 20;
                this.mreg = 1.0;
                this.pdmg = 40;
                this.mdmg = 35;
                this.pdef = 30;
                this.mdef = 20;
        }

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return this.lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
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

    public String getMobType() {
        return this.mobType;
    }

    public void setMobType(String mobType) {
        this.mobType = mobType;
    }

}
