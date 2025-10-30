// Ryan Buck
package sorting;

public class NonRecursive extends SortFactory {
    public SortingAlgorithm getAlgorithm() {
        return switch (algorithm) {
            case "Selection" -> new SelectionSort();
            case "Insertion" -> new InsertionSort();
            default -> null;
        };
    }
}
