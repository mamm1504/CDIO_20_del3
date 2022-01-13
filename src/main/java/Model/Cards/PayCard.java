package Model.Cards;

public class PayCard extends ChanceCard {
    private final String DESCRIPTION;
    private final String TYPE;
    private final int VALUE;

    public PayCard(String description, String type, int value) {
        super(description, type, value);
        this.VALUE = value;
        this.DESCRIPTION = description;
        this.TYPE = type;
    }
    public String getDescription() {
        return DESCRIPTION;
    }
    public String getType() {
        return TYPE;
    }
    public int getValue() {
        return VALUE;
    }
}
