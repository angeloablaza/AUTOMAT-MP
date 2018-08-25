package automat.dfs;

import java.util.ArrayList;
import java.util.List;

public class DFA {
    
    public void allShortpaths(State start, State finish) {
        List<List<State>> shortpaths = allPaths(start, finish, new ArrayList<>());
        int statesize = -1;
        String moves = null;
        
        for (List<State> nodes:shortpaths){
            if (statesize == -1 || nodes.size() < statesize)
                statesize = nodes.size();
        }
        
        for (int i = shortpaths.size()-1; i > -1; i--)
            if (shortpaths.get(i).size() != statesize)
                shortpaths.remove(i);
        
        for(int i=0; i < shortpaths.size(); i++) {
        	moves = shortpaths.get(i).toString();
        	System.out.println(moves);
        }
    }

    public final List<List<State>> allPaths(State start, State finish, List<State> path) {
        List<State> temppath = new ArrayList<>();
        List<List<State>> paths = new ArrayList<>();
        
        for (State node:path)
            temppath.add(node);
        temppath.add(start);

        if (start.getEarthcur().equalsIgnoreCase(finish.getEarthcur())) {
            List<List<State>> temp = new ArrayList<>();
            temp.add(temppath);
            return temp;
        }
        
        for (State n : Tree.treemap.get(start)) {
            if (!temppath.contains(n)) {
                for (List<State> newPath : allPaths(n, finish, temppath)) {
                    paths.add(newPath);
                }
            }
        }
        return paths;
    }
}
