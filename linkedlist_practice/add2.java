public class add2 {
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
    public void add(int idx,int data){
        node newnode=new node(data);
        size++;
        if(idx==0){
            addFirst(data);
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

    public void removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
        }
        else if(size==1){
            head=tail=null;
            System.out.println("no element");
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
        node curr=head;
        node prev=null;
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
    public node findMid(node head){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkpallindrome(){
        if(head==null||head.next==null){
            return true;
        }
        node midnode=findMid(head);

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

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public void removeCycle(){
        // detect a cylce
        node slow=head;
        node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        // finding meeting point of slow and fast
        slow=head;
        node prev=fast;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }
    public static void main(String[] args) {
        add2 ll=new add2();
        ll.addFirst(1);
        ll.add(1,2);
        ll.add(2,1);
        ll.print();
        System.out.println(ll.checkpallindrome());

        /* 
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.print();
        ll.add(2,6969);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.reverse();
        ll.print();
        ll.deleteNthfromEnd(1);
        ll.print();
        ll.deleteNthfromEnd(1);
        ll.print();
        System.out.println(ll.findMid(head));
        */
    }
}
