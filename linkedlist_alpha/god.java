public class god {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;

    public void addfirst(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return ;zxz
        }
    }
    public static void main(String[] args) {
    }
    
}
