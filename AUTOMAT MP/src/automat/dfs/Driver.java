package automat.dfs;

public class Driver {
	public static void main(String[] args)
	{
		DFA graphans = new DFA();
		
		graphans.allShortpaths(Tree.q0, Tree.q7);
	}
}
