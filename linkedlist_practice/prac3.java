public class prac3 {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data=data;
            this.next=null;
        }       
    } 
    // head and tail node class ke bahar define karte hai
    public static node head;
    public static node tail;
    public static int size;


    public void addFirst(int data){
        node harry=new node(data);
        size++;
        if(head==null){
        head=tail=harry;
        return;
       }
       harry.next=head;
       head=harry;
    }
    public void addLast(int data){
        node harry=new node(data);
        size++;
        if(head==null){
            head=tail=harry;
            return;
        }
        tail.next=harry;
        tail=harry;
    }
    public void add(int idx,int data){
        node newnode=new node(data);
        size++;
        if(idx==0){
            head=tail=newnode;
            return;
        }
        int i=0;
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
            System.out.println("this is empty linkedlinst");
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
        }
        if(size==1){
            head=tail=null;
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
    public void deleteNthfromEnd(int n){
        int bada=0;
        node temp=head;
        while(temp!=null){
            temp=temp.next;
            bada++;
        }
        if(n==bada){
            head=head.next;
            return;
        }
        int i=1;
        int iToFind=bada-n;
        node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }
    public node FindMid(node head){
        node slow =head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public boolean checkPallindrome(){
        if(head==null||head.next==null){
            return true;
        }
        // find mid node
        node Mid=FindMid(head);
        // reverse 2nd half
        node prev=null;
        node next;
        node curr=Mid;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node left=head;
        node right=prev;

        // compare left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }
    public static void main(String[] args) {
        prac3 ll=new prac3();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        //ll.addLast(3);
        ll.print();
        System.out.println(ll.checkPallindrome());
        //ll.add(3,6969);
        //ll.print();
        ////ll.removeFirst();
        //ll.print();
        //System.out.println(ll.itrSearch(696));
        //ll.reverse();
        //ll.print();
        //ll.deleteNthfromEnd(1);
        //ll.print();
    }
    
}
