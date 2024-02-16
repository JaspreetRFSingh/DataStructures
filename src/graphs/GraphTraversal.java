package graphs;

import java.util.*;

public class GraphTraversal {
    static List<Integer> ansBfs = new ArrayList<>();
    static List<Integer> ansDfs = new ArrayList<>();
    public static void main(String[] args){
        List<List<Integer>> adjList = List.of(new ArrayList<>(Arrays.asList(3,5)),
                new ArrayList<>(List.of(3)),
                new ArrayList<>(List.of(3)),
                new ArrayList<>(Arrays.asList(2,4,0,1)),
                new ArrayList<>(List.of(3)),
                new ArrayList<>(Arrays.asList(0,6)),
                new ArrayList<>(List.of(5)),
                new ArrayList<>(List.of(9)),
                new ArrayList<>(),
                new ArrayList<>(Arrays.asList(7,8))
        );
        int V = 10;
        boolean[] visited = new boolean[V];
        int components = 0;
        Arrays.fill(visited, false);
        for(int i=0; i<V; i++){
            if(!visited[i]){
                bfs(adjList, i, visited);
                components++;
            }
        }
        ansBfs.forEach(s-> System.out.print(s+" "));
        System.out.println("\nNumber of components: " + components);

        Arrays.fill(visited, false);
        for(int i=0; i<V; i++){
            if(!visited[i]){
                dfs(adjList,i,visited);
            }
        }
        ansDfs.forEach(s-> System.out.print(s+" "));
    }

    public static void dfs(List<List<Integer>> adj, int src, boolean[] visited){
        visited[src] = true;
        ansDfs.add(src);
        List<Integer> neighbours = adj.get(src);
        for (Integer neighbour : neighbours) {
            if (!visited[neighbour]) {
                dfs(adj, neighbour, visited);
            }
        }
    }
    public static void bfs(List<List<Integer>> adj, int src, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        visited[src] = true;
        ansBfs.add(src);
        q.add(src);
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int i=0; i<adj.get(curr).size(); i++){
                if(!visited[adj.get(curr).get(i)]){
                    visited[adj.get(curr).get(i)] = true;
                    ansBfs.add(adj.get(curr).get(i));
                    q.add(adj.get(curr).get(i));
                }
            }
        }
    }
}
