package Tugas8;

class Magician extends Character {
    public Magician() {
        super(10,60,100);
    }

    @Override
    public boolean attack() {
        int random = (int) (Math.random() * 100) + 1;
        return random <= 35;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Role    : Magician");
        System.out.println("Hp      : "+getHp());
        System.out.println("Attack  : "+getAttack());
        System.out.println("Defense : "+getDefense());
    }
}