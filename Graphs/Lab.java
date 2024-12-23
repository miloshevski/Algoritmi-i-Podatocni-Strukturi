import java.util.*;

public class Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdjacencyListGraph<Integer> graph = new AdjacencyListGraph<>();

        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.addEdge(u, v);
        }

        int startVertex = scanner.nextInt();
        int targetSum = scanner.nextInt();
        scanner.close();

        int result = findPaths(graph, startVertex, startVertex, targetSum);
        System.out.println(result);
        System.out.println();
    }

    private static int findPaths(AdjacencyListGraph<Integer> graph, int current, int currentSum, int targetSum) {
        if(currentSum>targetSum){
            return 0;
        }
        if(currentSum==targetSum){
            return 1;
        }
        int sum=0;
        for(int neighbor:graph.getNeighbors(current)){
            sum+=findPaths(graph, neighbor, currentSum+neighbor, targetSum);
        }
        return sum;
    }
}
