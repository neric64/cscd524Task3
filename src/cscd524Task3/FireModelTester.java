package cscd524Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FireModelTester {

	public static void main(String[] args) {
		List<Fire> list = new ArrayList<Fire>();
		double cleave = 0.4;
		double decay = 0.8;
		int listSize = 0;
		Random random = new Random();
		
		list.add(new Fire(cleave, decay));
		
		for(int i = 0; i < 100; i++) {
				listSize = list.size();
				for(int k = 0; k < listSize; k++) {
					if(random.nextDouble() < list.get(k).getCleave()) {
						list.add(new Fire((list.get(k).getCleave() * list.get(k).getDecay()), list.get(k).getDecay()));
						System.out.println("Cleave");
					}
					System.out.println("Updated");
				}
		}
		
		System.out.println(list.size());
		
		
	}

}
