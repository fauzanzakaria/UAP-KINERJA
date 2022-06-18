package Tugas8;

class Healer extends Character {
    public Healer(){
        super(10,10,70);
    }
    public void heal(){
        setHp(getHp()+25);
    }
    @Override
    public boolean attack(){
        int random = (int) (Math.random() * 100) + 1;
        return random <= 85;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Role    : Healer");
        System.out.println("Hp      : "+getHp());
        System.out.println("Attack  : "+getAttack());
        System.out.println("Defense : "+getDefense());
    }
}