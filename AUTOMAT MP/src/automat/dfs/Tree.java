package automat.dfs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Tree {
    public static State q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17;
    private static final Tree instance = new Tree();
    public static HashMap<State, List<State>> treemap;
    
    private Tree(){
        treemap = new HashMap<>();
        this.initialize();
    }
    
    public final void initialize() {
    	q0 = new State("HHGLC", 0);
        q1 = new State("HHG", 1);
        q2 = new State("HHGL", 2);
        q3 = new State("LG", 3);
        
        q4 = new State("LCG", 4);
        q5 = new State("C", 5);
        q6 = new State("LC", 6);
        q7 = new State("", 7);
        
        q8 = new State("HHGC", 8);
        q9 = new State("HH", 9);
        q10 = new State("HHG", 10);
        q11 = new State("L", 11);
        
        q12 = new State("G", 12);
        q13 = new State("HG", 13);
        q14 = new State("HHLC", 14);
        q15 = new State("GLC", 15);
        
        q16 = new State("CLHH", 16);
        q17 = new State("CLG", 17);

        treemap.put(q0, Arrays.asList(new State[]{q1}));
        treemap.put(q1, Arrays.asList(new State[]{q0, q2, q8}));
        treemap.put(q2, Arrays.asList(new State[]{q1, q3, q9, q13}));
        treemap.put(q3, Arrays.asList(new State[]{q2, q4, q15}));
       
        treemap.put(q4, Arrays.asList(new State[]{q3, q5, q12, q11}));
        treemap.put(q5, Arrays.asList(new State[]{q4, q6, q10, q16}));
        treemap.put(q6, Arrays.asList(new State[]{q5, q7 , q11}));
        treemap.put(q7, Arrays.asList(new State[]{q6}));
        
        treemap.put(q8, Arrays.asList(new State[]{q1, q13, q9}));
        treemap.put(q9, Arrays.asList(new State[]{q2, q8, q14, q10}));
        treemap.put(q10, Arrays.asList(new State[]{q9, q5, q17}));
        treemap.put(q11, Arrays.asList(new State[]{q6, q4, q16}));

        treemap.put(q12, Arrays.asList(new State[]{q4}));
        treemap.put(q13, Arrays.asList(new State[]{q8, q2, q15}));
        treemap.put(q14, Arrays.asList(new State[]{q9}));
        treemap.put(q15, Arrays.asList(new State[]{q13, q3}));
        
        treemap.put(q16, Arrays.asList(new State[]{q17, q11, q5}));
        treemap.put(q17, Arrays.asList(new State[]{q10, q16}));
    }
}
