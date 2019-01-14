import java.util.*; 
public class DFS{
    
    static class Node{
        public int v;
        public ArrayList<Node> children;
        public boolean visited;
        
        public Node(int v){
            this.v = v;
            this.visited = false;
            this.children = new ArrayList<Node>();
        }
        
        public void addEdge(Node n){
            this.children.add(n);
        }
    }
    
    static void DFS(Node root){
        if(!root.visited){
            root.visited = true;
            System.out.println(root.v);
        }
            
        for(Node n: root.children){
            if(!n.visited)
                DFS(n);
        }
    }
    
    public static void main(String []args){
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        
        n0.addEdge(n3);
        n0.addEdge(n2);
        n1.addEdge(n0);
        n1.addEdge(n4);
        n2.addEdge(n1);
           
        System.out.println("Following is Depth First Traversal"); 
        DFS(n0); 
     }
}
