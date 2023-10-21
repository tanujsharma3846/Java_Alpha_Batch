public class add {
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
        // create a new node
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        // newnode next=head
        newnode.next=head;
        //head=newnode;
        head=newnode;
         
    }

    public void addMid(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        node newnode=new node(data);
        size++;
        int i=0;
        size++;
        node temp=head;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
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
        System.out.println("null");
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return 0;
        }
        else if(size==1){
            head=tail=null;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public void removeLast(){
        if(size==0){
            System.out.println("ll in empty");
        }
        else if(size==1){
            head=tail=null;
            size=0;
        }
        node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
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
        // calculate size of LL
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
        int i=1;
        int iToFind=siz-n;
        node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;

    }
    public node findmid(node head){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkpallindrome(){
        // base case
        // empty ll or ll with 1 element only
        if(head==null|| head.next==null){
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
        node right=prev;// right half head
        node left=head;// left half head

        // step3->check left and right half data
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static boolean checkCycle(){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==head){
                return true;
            }
        }
        return false;
    }
    public void removeCycle(){
        // check loop exits or not
        node slow=head;
        node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;// break so that we get position where slow and fast meet
            }
        }
        if(cycle==false){
            return;
        }

        // find meeting point of slow and fast
        slow=head;
        node prev=null; // last node store
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        // remove cycle -->last.next=null
        prev.next=null;


    }
    public void PairWiseSwap(){
        node prev=null;
        node curr=head;
        node next;
        while(curr!=null){
            next=curr.next;
            
        }
    }
    public static void main(String[] args) {
        //add ll=new add();
        head=new node(1);
        node temp=new node(2);
        head.next=temp;
        head.next.next=new node(3);
        head.next.next.next=head;
        System.out.println(checkCycle());
        //removeCycle();
        //ll.print();
        // 1->2->3->2
        //System.out.println(checkCycle());
        //ll.removeCycle();
        //System.out.println(checkCycle());
        /* 
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        //ll.addFirst(1);
        ll.print();
        System.out.println(ll.checkpallindrome());
        ll.checkCycle();
        //ll.addMid(3,69);
        //ll.print();
        //ll.removeFirst();
        //ll.print();
        //ll.removeLast();
        //ll.print();
        //System.out.println(ll.itrSearch(69));
       */

        
    }
}
