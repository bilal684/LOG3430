package main;

import java.io.IOException;
import java.util.ArrayList;

public interface ListeChainee {
	public MyList build(String op,ArrayList<Object> val1, ArrayList<Object> val2, boolean sort, int val1Factor, int val2Factor)throws IOException;
}
