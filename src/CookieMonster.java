

import java.util.Stack;

public class CookieMonster {

	int[] max;
	static int[][] cookies = 
		{{ 1,  3,  0 , 5, -1,  7, -1, -1,  0,  4,  2,  1}, 
		{-1,  3,  2,  1, -1,  4, -1,  5,  3, -1,  1,  0},
		 {5,  4,  8, -1,  3,  2,  2, -1, 4, -1,  0,  0},
		 {2,  1,  0,  4,  1, -1,  8,  0,  2, -1,  2,  5},
		 {1, 4,  0,  1, -1,  0,  3,  2,  2,  4,  1,  4},
		 {0,  1,  4,  1,  1,  6,  1,  4,  5,  2,  1,  0},
		 {3,  2,  5,  2,  0,  7, -1,  2,  1,  0, -1,  3},
		 {0, -1,  4, -1, -1,  3,  5,  1,  4,  2, 1,  2},
		 {5,  4,  8, -1,  3,  2,  2, -1,  4, -1,  0,  0},
		 {2,  1,  0,  4,  1, -1,  8,  0,  2, -1,  2,  5},
		 {1,  3,  0,  5, -1,  7, -1, -1,  0,  4,  2,  1},
		 {0,  0,  3,  1,  5,  2,  1,  5,  4,  1,  3,  3}};

	
	Stack stack = new Stack<int[]>();
	
	
	
	public int optimalPath(int r, int c) {
			
		
		int opt = 0;
		
		if (r == cookies.length && c == cookies[0].length || cookies[r+1][c] == -1 && cookies[r][c+1] == -1) 
			return 0;
		else if (r < cookies.length && !(c < cookies[0].length))
			return (opt + optimalPath(r+1 ,c)); 
		else if (c < cookies[0].length && !(r < cookies.length))
			return (opt + optimalPath(r, c+1));
		else {
			if (cookies[r+1][c] > cookies[r][c+1])
				return (opt + optimalPath(r+1, c));
			else
				return (opt + optimalPath(r, c+1));
		
		
		}
		
	//	return opt;
	

	}
	
	

}
