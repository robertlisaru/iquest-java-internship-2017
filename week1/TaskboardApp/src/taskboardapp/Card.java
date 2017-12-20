package taskboardapp;

public class Card {
    protected String title;
    protected String description;

    public Card(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Card() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
