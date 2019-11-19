package models;

public class Squad {
    private int squadSize;
    private String squadName;
    private String squadObligation;

    public Squad(int squadSize, String squadName, String squadObligation) {
        this.squadSize = squadSize;
        this.squadName = squadName;
        this.squadObligation = squadObligation;
    }

    public int getSquadSize() {
        return squadSize;
    }

    public String getSquadName() {
        return squadName;
    }

    public String getSquadObligation() {
        return squadObligation;
    }
}


