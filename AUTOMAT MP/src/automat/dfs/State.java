package automat.dfs;

public class State {

    private String earthcur;
    private int statenum;

    public State(String earthcur, int statenum) {
        this.earthcur = earthcur;
        this.statenum = statenum;
    }
    
    public String getEarthcur() {
        return earthcur;
    }
    
    public String toString() {
        return "q" + Integer.toString(statenum);
    }
}
