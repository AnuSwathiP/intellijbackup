package staragile.preparation;
interface Character {
    void attack();
}

interface Weapon {
    void use();
}
class Warrior implements Character, Weapon {

    @Override
    public void attack() {
        System.out.println("Warrior attacks with a sword.");
    }

    @Override
    public void use() {
        System.out.println("Warrior uses a sword.");
    }
}

class Mage implements Character, Weapon {

    @Override
    public void attack() {
        System.out.println("Mage attacks with a wand.");
    }

    @Override
    public void use() {
        System.out.println("Mage uses a wand.");
    }
}
    public class D5_Multipleinheritance {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Mage mage = new Mage();

        warrior.attack(); // Output: Warrior attacks with a sword.
        warrior.use(); // Output: Warrior uses a sword.

        mage.attack(); // Output: Mage attacks with a wand.
        mage.use(); // Output: Mage uses a wand.
    }
}
