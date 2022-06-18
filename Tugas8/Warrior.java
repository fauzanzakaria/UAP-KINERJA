package Tugas8;

class Warrior extends Character {
    public Warrior(){
        super(30,25,80);
    }
    @Override
    public boolean attack() {
        int random = (int) (Math.random() * 100) + 1;
        return random <= 60;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Role    : Warrior");
        System.out.println("Hp      : "+getHp());
        System.out.println("Attack  : "+getAttack());
        System.out.println("Defense : "+getDefense());
    }
}