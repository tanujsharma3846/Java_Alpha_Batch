public class practice2{
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
    public static int size;

    public void addFirst(int data){
        node raju=new node(data);
        size++;
        if(head==null){
            head=tail=raju;
            return;
        }
        raju.next=head;
        head=raju;
    }

    public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void add(int idx,int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        int i=0;
        node prev=head;
        while(i<idx-1){
            prev=prev.next;
            i++;
        }
        newnode.next=prev.next;
        prev.next=newnode; 
    }
    public void removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
        }
        else if(size==1){
            System.out.println("element removed");
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
        node slow =head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        practice2 ll=new practice2();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.print();
        ll.add(3,45);
        ll.add(1,69);
        ll.print();
        ll.reverse();
        ll.print();
        /* 
        ll.removeFirst();
        ll.print();
        System.out.println(ll.itrSearch(69));
        System.out.println(ll.itrSearch(6969696));
        */
    }
}