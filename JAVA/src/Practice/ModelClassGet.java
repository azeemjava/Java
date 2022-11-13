package Practice;

import java.util.Arrays;
import java.util.List;

public class ModelClassGet {

	public static void main(String[] args) {

		List<ModelClass> modelSet = Arrays.asList(new ModelClass("azeem", "tenkasi", 56),
				new ModelClass("jameel", "chennai", 54));
//		
//		Stream<ModelClass> stream = modelSet.stream();
//		Stream<ModelClass> streamFilter = stream.filter(m -> m.getName() == "azeem");
//		Stream<String> streamMap = streamFilter.map(m -> m.getCity());
//		streamMap.forEach(System.out::println);
//		

		modelSet.stream().filter(m -> m.getName() == "azeem").map(m -> m.getCity()).forEach(System.out::println);

	}

}
