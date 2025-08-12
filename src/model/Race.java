package model;

public enum Race {
    HUMAIN (1), ORQUE (2), GNOME (3);

    private final int selection;
    private Race(int selection) {
        this.selection = selection;
    }
    public int getSelection() {
        return this.selection;
    }
}
