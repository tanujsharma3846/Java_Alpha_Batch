public class Linkedlist{
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
        // step 1-> create new node
        node newNode=new node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }

        // step 2->  newNode next=head
        newNode.next=head;

        // step 3-> head=newNode
        head=newNode;
    }
    public void addLast(int data){
        // step1->create new node
        node newnode=new node(data);
        size++;

        if(head==null){
            head=tail=newnode;
            return;
        }
        // step2->tail next=newnode
        tail.next=newnode;

        // step 3->tail=newnode
        tail=newnode;
    }
    public void print(){
        if(head==null){
            System.out.println(" ll is empty ");
            return;
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
        // i=idx-1;  temp->prev
        newnode.next=temp.next;
        temp.next=newnode;

    }
    public int removeFirst(){
        if(size==0){
            System.out.println(" ll is empty ");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("ll in empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        // prev: i=size-2
        node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data; // tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){ // key found case
                return i;
            }
            temp=temp.next;
            i++;
        }
        // key not found case
        return -1;

    }
    public void reverse(){
        node prev=null;
        node curr=tail=head;
        node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteNthfromEnd(int n){
        // calculte size
        int siz=0;
        node temp=head;
        while(temp!=null){
            temp=temp.next;
            siz++;
        }
        if(n==siz){
            head=head.next;
            return;
        }
        // siz - n
        int i=1;
        int iToFind=siz-n;
        node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }
    // slow fast app

    public node findmid(node head){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; // slow is my mid node
    }
    public boolean checkPallindrom(){
        if(head==null||head.next==null){
            return true;
        }
        // step 1-> find mid
        node midnode=findmid(head);
        // step 2->reverse 2nd half
        node prev=null;
        node curr=midnode;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node right=prev;
        node left=head;

        // step 3->check left half and right half
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static boolean isCycle(){
        node slow=head;
        node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;  // +1
            fast=fast.next.next; //+2
            if(slow==fast){
                return true;// cycle exists
            }
        }
        return false;// cycle does not exists

    }
    public static void removeCycle(){
        // detect cycle
        node slow =head;
        node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }

        // find meeting cycle
        slow=head;
        node prev=null;
        while(slow!=fast){// last node
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        // remove cycle-->last.next=null

        prev.next=null;
    }

    public static void main(String[] args) {
        //Linkedlist ll=new Linkedlist();
        head=new node(1);
        node temp=new node(2);
        head.next=temp;
        head.next.next=new node(3);
        head.next.next.next=temp;
        //1->2->3->1
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        /* 
        ll.print();  
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print(); 
        ll.add(2,9);
        ll.print();
        ll.add(0,69);
        ll.print();
        System.out.println("size of linked list="+size);
        ll.removeFirst();
        ll.print();
        System.out.println("size of ll ="+size);
        ll.removeLast();
        ll.print();
        System.out.println("size of ll ="+size);
        System.out.println("index of key is "+ll.itrSearch(2));
        System.out.println("index of key is "+ll.itrSearch(9));
        System.out.println("index of key is "+ll.itrSearch(69));
        ll.print();
        ll.reverse();
        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();

         */  
        /* 
        ll.addLast(1);  
        ll.addLast(2);  
        ll.addLast(2);  
        //ll.addLast(1);  
        ll.print();
        System.out.println(ll.checkPallindrom());  
        */
        
    }
}