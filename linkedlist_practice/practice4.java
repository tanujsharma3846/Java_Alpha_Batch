public class practice4 {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;

    public void addFirst(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addLast(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void print(){
        if(head==null){
            System.out.println("ll is empty");
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        node newnode=new node(data);
        size++;
        node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
        }
        else if(size==1){
            head=tail=null;
            return;
        }
        head=head.next;
        size--;
    }
    public int itrSearch(int key){
        node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public void reverse(){
        node prev=null;
        node curr=head;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public node findMid(node head){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        practice4 ll=new practice4();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(69);
        ll.print();
        ll.add(1,4);
        ll.print();
        ll.add(4,22);
        ll.print();
        ll.reverse();
        ll.print();
        /* 
        ll.removeFirst();
        
        ll.print();
        ll.removeFirst();
        ll.print();
        System.out.println(ll.itrSearch(69));
        */
    }
}
