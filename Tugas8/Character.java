package Tugas8;

public abstract class Character {
    private int defense;
    private int attack;
    private int hp;
    public Character(int defense, int attack, int hp){
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }
    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract boolean attack();

    public void receiveDamage(int damage){
        if(damage > this.defense){
            int totaldmg = damage - this.defense;
            this.hp -= totaldmg;
            if(this.hp < 0) setHp(0);
        }
    }
    public void info(){
        System.out.println("----------- STATUS -----------");
    }
}