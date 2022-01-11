package Model.Cards;

/**
 * Is used within chancecard-array for multiple effects.
 */
public abstract class ChanceCard extends ChanceCardDeck{

    private String description;
    private String name;
    private String type;
    private int value;

    public ChanceCard(String description, String name, String type, int value) {
        this.description = description;
        this.name = name;
        this.type = type;
        this.value = value;
    }
}
