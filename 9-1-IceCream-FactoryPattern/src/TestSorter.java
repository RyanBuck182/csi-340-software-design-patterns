// Ryan Buck
import sorting.NonRecursive;
import sorting.SortFactory;
import sorting.SortingAlgorithm;

public class TestSorter {

	public static void main(String[] args) {
		String[] elements = { "beta", "chi", "alpha", "zeta", "nu", "mu" };
        String[] elements2 = { "beta", "chi", "alpha", "zeta", "nu", "mu" };
		SortFactory factory = new NonRecursive();

		factory.setFactory("Selection");
		SortingAlgorithm algorithm = factory.getAlgorithm();
		algorithm.sort(elements);

		for (int i = 0; i < elements.length; i++)
			System.out.println(elements[i]);
        System.out.println("~~~~~~~~~~~~~~");

        factory.setFactory("Insertion");
        SortingAlgorithm algorithm2 = factory.getAlgorithm();
        algorithm2.sort(elements2);

        for (int i = 0; i < elements2.length; i++)
            System.out.println(elements2[i]);
    }
}
