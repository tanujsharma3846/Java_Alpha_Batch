import java.util.*;

public class practice{
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
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        node prev=head;
        int i=0;
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
            head=tail=null;
            System.out.println("empty");
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
    void deleteNthfromEnd(int n){
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
        int iToFind=bada-n;
        int i=1;
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
        return slow;// slow is my mid node
    }
    public boolean checkPallindrome(){
        if(head==null||head.next==null){
            return true;
        }
        // find mid
        node fast=head;
        node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        node mid=slow;

        // reverse second half
        node prev=null;
        node next;
        node curr=mid;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node right=prev;
        node left=head;

        // check left half and right half
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

    practice ll=new practice();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addLast(2);
    ll.print();
    System.out.println(ll.checkPallindrome());
    ///l//l.add(3,69696);
    //ll.print();
    //ll.removeFirst();
    //ll.print();
    //ll.reverse();
    ////ll.print();
    //ll.deleteNthfromEnd(2);
    //ll.print();

    }
}