import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class HasPath {
    public static <T> boolean hasPath(AdjacencyListGraph<T> graph,T src,T dst){
        Set<T>visited=new HashSet<>();
        return dfsHasPath(graph, src, dst, visited);
    }
    private static <T> boolean dfsHasPath(AdjacencyListGraph<T> graph,T src,T dst,Set<T> visited){
        if(src.equals(dst)){
            return true;
        }
        visited.add(src);
        for(T neighbour : graph.getNeighbors(src)){
            if(!visited.contains(neighbour)){
                if(dfsHasPath(graph, neighbour, dst, visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdjacencyListGraph<Integer> graph = new AdjacencyListGraph<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            graph.addEdge(sc.nextInt(), sc.nextInt());
        }
        graph.DFS(1);
        System.out.println();
        System.out.println(graph.toString());
        System.out.println();
        System.out.println("How any questions?");
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            System.out.println(hasPath(graph, sc.nextInt(), sc.nextInt()));
        }
    }   
}
