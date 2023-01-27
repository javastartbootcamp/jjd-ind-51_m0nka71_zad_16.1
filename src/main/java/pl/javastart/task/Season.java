package pl.javastart.task;

public enum Season {
    SPRING("Wiosna", new String[] {"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", new String[] {"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("Jesień", new String[] {"wrzesień", "październik", "listopad"}),
    WINTER("Zima", new String[] {"grudzień", "styczeń", "luty"});

    private final String seasonNameInPl;
    final String[] months;

    Season(String seasonNameInPl, String[] months) {
        this.seasonNameInPl = seasonNameInPl;
        this.months = months;
    }

    public String getSeasonNameInPl() {
        return seasonNameInPl;
    }
}