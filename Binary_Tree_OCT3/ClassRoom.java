import java.util.*;

public class ClassRoom {
    static class Node
    {
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=count(root.left);
        int rightCount=count(root.right);
        return leftCount+rightCount+1;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDiam=diameter(root.left);
        int leftHt=height(root.left);
        int rightDiam=diameter(root.right);
        int rightHt=height(root.right);

        int selfDiam=leftHt+rightHt+1;
        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
    }
    public static boolean isIdentical(Node node,Node subRoot){
        if(node==null && subRoot==null){
            return true;
        }else if(node==null || subRoot==null || subRoot.data != node.data){
            return false;
        }
        if(isIdentical(node.left, subRoot.left)){
            return false;
        }if(isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void TopView(Node root){
        // level order traversal
        Queue<Info>q=new LinkedList<>();
        HashMap<Integer,Node>map=new HashMap<>();
        int min=0;
        int max=0;
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{

            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node);
            }
            if(curr.node.left!=null){
                q.add(new Info(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new Info(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
                }
            }
        }
        
        for(int i=min;i<=max;i++){
            System.out.println(map.get(i).data+" ");
        }
        System.out.println();
    }

    public static void klevel(Node root,int level, int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.println(root.data+" ");
            return;
        }
        klevel(root.left, level+1, k);
        klevel(root.right, level+1, k);
    }

    public static boolean getPath(Node root,int n,ArrayList<Node>path){
        if(root==null){
            return false;
        }
        path.add(root);

        if(root.data==n){
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }

    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node>path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);

        // last comman ancesstor
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        // last node -> (i-1)th
        Node lca=path1.get(i-1);
        return lca;

    }
    public static Node lca2(Node root,int n1,int n2){
        if(root==null||root.data==n1 || root.data==n2){
            return root;
        }
        Node leftLca=lca2(root.left,n1,n2);
        Node rightLca=lca2(root.right,n1,n2);
        // leftLCA =val 
        // rightLCA= null
        if(rightLca==null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }
        return root;
    }
    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=lcaDist(root.left, n);
        int rightDist=lcaDist(root.right, n);
        if(leftDist==-1 && rightDist==-1){
            return -1;
        }else if(leftDist==-1){
            return rightDist+1;
        }else{
            return leftDist+1;
        }
    }
    public static int minDist(Node root, int n1, int n2){
        Node lca=lca2(root,n1,n2);
        int dist1=lcaDist(lca,n1);
        int dist2=lcaDist(lca,n2);
        return dist1+dist2;
    }
    public static int  KAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=KAncestor(root.left,n,k);
        int rightDist=KAncestor(root.right,n,k);

        if(leftDist== -1 && rightDist== -1){
            return -1;
        }

        int max=Math.max(leftDist,rightDist);

        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        //Node subRoot=new Node(2);
        //root.left=new Node(4);
        //root.right=new Node(5);

        //System.out.println(height(root));
        //System.out.println(count(root));
        //System.out.println(diameter(root));
        //System.out.println(isSubtree(ro ot,subRoot));

        //TopView(root);
        //int k=2;
        //klevel(root,1,k);
        //int n1=4;
        //int n2=6;
        //System.out.println(lca2(root,n1,n2).data);
        //System.out.println(minDist(root,n1,n2));
        int n=5,k=2;
        System.out.println(KAncestor(root, n, k));

    }
}
