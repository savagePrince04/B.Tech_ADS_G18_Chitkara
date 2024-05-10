package Lec30;
import java.util.*;

public class Dijkstra_Algorithm {
	HashMap<Integer, HashMap<Integer, Integer>> map=new HashMap<>();

	public Dijkstra_Algorithm(int v) {
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	class DijkstraPair {
		int vtx;
		String path;
		int cost;

		public DijkstraPair(int vtx, String path, int cost) {
			this.vtx = vtx;
			this.path = path;
			this.cost = cost;
		}

		public String toString() {
			return this.vtx + " - " + this.path + " @ " + this.cost;
		}
	}

	public void Dijkstra(int src) {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(src, "" + src, 0));
		while (!pq.isEmpty()) {
			DijkstraPair rp = pq.poll();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);

			// 5.Add unvisited nbrs
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DijkstraPair(nbrs, rp.path + nbrs, rp.cost + cost));
				}

			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Dijkstra_Algorithm dj = new Dijkstra_Algorithm(n);
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			dj.AddEdge(v1, v2, cost);
		}
		dj.Dijkstra(1);
	}

}