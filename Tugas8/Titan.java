package Tugas8;

class Titan extends Character {
    public Titan(){
        super(0,45,200);
    }

    @Override
    public boolean attack(){
        int random = (int) (Math.random() * 100) + 1;
        return random <= 40;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Role    : Titan");
        System.out.println("Hp      : "+getHp());
        System.out.println("Attack  : "+getAttack());
        System.out.println("Defense : "+getDefense());
    }
}
