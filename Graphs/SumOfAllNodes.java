import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfAllNodes {
    public static int sumOfNodes(AdjacencyListGraph<Integer>graph,int start){
        Set<Integer>visited= new HashSet<>();
        int totalSum=0;
        for(int node : graph.getNeighbors(start)){
            if(!visited.contains(node)){
                totalSum+=dfsSum(graph,node,visited);
            }
        }
        return totalSum;
    }
    private static int dfsSum(AdjacencyListGraph<Integer>graph,int node,Set<Integer>visited){
        if(visited.contains(node)){
            return 0;
        }
        visited.add(node);
        int sum=node;
        for(int neighbor:graph.getNeighbors(node)){
            sum+=dfsSum(graph, neighbor, visited);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        AdjacencyListGraph<Integer>graph=new AdjacencyListGraph<>();
        for(int i=0;i<n;i++){
            graph.addEdge(sc.nextInt(), sc.nextInt());
        }
        int v=sc.nextInt();
        System.out.println(sumOfNodes(graph,v));
    }
}
