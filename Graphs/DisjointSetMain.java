import java.util.*;
class DisjointSetMain{
    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(7);
        // through rank
        // ds.unionByRank(1, 2);
        // ds.unionByRank(2, 3);
        // ds.unionByRank(4, 5);
        // ds.unionByRank(6, 7);
        // ds.unionByRank(5, 6);

        // through size
        ds.unionBySize(1,2);
        ds.unionBySize(2,3);
        ds.unionBySize(4,5);
        ds.unionBySize(6,7);
        ds.unionBySize(5,6);

        if(ds.findParent(3) == ds.findParent(7)){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }

        ds.unionBySize(3, 7);//size
        //ds.unionByRank(3, 7);// rank
        
        if(ds.findParent(3) == ds.findParent(7)){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }
}
class DisjointSet{
    List<Integer>rank = new ArrayList<>();
    List<Integer>size = new ArrayList<>();
    List<Integer>parent = new ArrayList<>();

    public DisjointSet(int n) {
        for(int i=0;i<=n;i++){
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }
    public int findParent(int node){
        if(node == parent.get(node))return node;
        int ulp = findParent(parent.get(node));
        parent.set(node,ulp);
        return ulp;
    }
    public void unionByRank(int u,int v){
        int ulp_u = findParent(u);
        int ulp_v = findParent(v);
        if(ulp_u == ulp_v)return ;
        if(rank.get(ulp_u) < rank.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
        }
        else if(rank.get(ulp_u) > rank.get(ulp_v)){
            parent.set(ulp_v,ulp_u);
        }
        else{
            parent.set(ulp_v,ulp_u);
            rank.set(ulp_u,rank.get(ulp_u)+1);
        }
    } 

    public void unionBySize(int u,int v){
        int ulp_u = findParent(u);
        int ulp_v = findParent(v);
        if(ulp_u == ulp_v)return ;
        if(size.get(ulp_u) < size.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
        }
        else{
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_u)+size.get(ulp_v));
        }
       
    } 
}

