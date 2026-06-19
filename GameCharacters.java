class GameCharacter {
    private String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String attack() {
        return name + " attacks.";
    }
}

class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return getName() + " attacks with sword and causes melee damage.";
    }
}

class Archer extends GameCharacter {
    private int arrowCount;

    public Archer(String name, int arrowCount) {
        super(name);
        this.arrowCount = arrowCount;
    }

    @Override
    public String attack() {
        return getName() + " shoots arrow. Arrows left: " + arrowCount;
    }
}

class Mage extends GameCharacter {
    private int mana;

    public Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    @Override
    public String attack() {
        return getName() + " casts magic spell. Mana left: " + mana;
    }
}

public class GameCharacters {
    public static void main(String[] args) {
        GameCharacter[] characters = {
            new Warrior("Thor"),
            new Archer("Robin", 20),
            new Mage("Merlin", 100)
        };

        for (GameCharacter character : characters) {
            System.out.println(character.attack());
        }
    }
}
