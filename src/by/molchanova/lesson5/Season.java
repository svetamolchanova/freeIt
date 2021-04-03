package by.molchanova.lesson5;

public enum Season {
    WINTER (1, "winter"),
    QQQQ(5, "QQQQ"),
    SPRING (2, "spring"),
    SUMMER (3, "summer"),
    AUTUMN (4, "autumn");

    private int number;
    private String value;

    private Season(int number, String value) {
        this.number = number;
        this.value = value;
    }

    public int getNumber() {
        return this.number;
    }
}
