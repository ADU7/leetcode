package others;

import java.util.ArrayList;
import java.util.List;

public class Question3 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> allList = new ArrayList<>();
		if(numRows == 0)
            return allList;
		List<Integer> first = new ArrayList<>();
		first.add(1);
		allList.add(first);
		while(allList.size() < numRows) {
			int size = allList.size();
			List<Integer> temp = new ArrayList<>();
			for(int i = 0; i <= size; i++) {
				if(i == 0 || i == size)
					temp.add(1);
				else
					temp.add(allList.get(size-1).get(i-1) + allList.get(size-1).get(i));
			}
			allList.add(temp);
		}
		return allList;
    }
}
