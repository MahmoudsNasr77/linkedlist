

public class LinkdedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LinkedList l1=new LinkedList();
      l1.insertAtFirst(4);
    
      l1.insertAtLast(3);
      l1.insetAtPos(2, 2);
      
      l1.Display();
        System.out.println("");
      l1.removeAtpos(2);
      l1.Display();
    }    
}
class LinkedList{
     class node {
         int item;
         node next;
    }
    private int length;
    private  node head,tail;

    public LinkedList() {
     length=0;
     head=null;
     tail=null;
    }


    
    public void insertAtFirst(int item){
        node newNode=new node();
        newNode.item=item;
        if (length==0){
            tail=head=newNode;
            newNode.next=null;     
        }
        else {
            
            newNode.next=head;
            head=newNode;
        }
        length++;
    }
    public void insertAtLast(int item){
        node newNode=new node();
        newNode.item=item;
        if (length==0){
            tail=head=newNode;
            newNode.next=null;
        }
        else{
            tail.next=newNode;
            newNode.next=null;
            tail=newNode;    
        }
        length++;
    }
    public void insetAtPos(int item,int pos){
        node newNode =new node();
        newNode.item=item;
            
        if (pos <0 || pos >length){
            System.out.println("Out Of Range");
        }
        else {
                if (pos==0){
                    insertAtFirst(item);
                }else if (pos==length){
                    insertAtLast(item);
                }
                else {
                    node current=head;
                    for (int i=1;i<pos;i++){
                        current=current.next;
                    }
                    newNode.next=current.next;
                    current.next=newNode;
                    length++;
    }
    }
    }
    public void removeAtFirst(){
        if (length==0){
            System.out.println("Linked list is Underflow");
            return;
        }
        else if (length==1){
            head=tail=null;
            length--;
        }else {
            head =head.next;
            length--;
        }
    }
       public void removeAtLast(){
            if (length==0){
                System.out.println("Linked list is underflow");
                return;
            }else if (length==1){
                tail=head=null;
                length--;
            }else {
                node prev=head;
                node current=head.next;
                while (current !=tail){
                    prev=current;
                    current=current.next;
                }
                prev.next=null;
                tail=prev;
                length--;
            }
    }
       public void removeAtpos(int element){
           if (length==0){
               System.out.println("Linked list is Underflow");
               return;
           }
           else if (head.item==element){
               removeAtFirst();
           }else {
               node prv=head;
               node curr=head.next;
               while (curr!=null){
                   if (curr.item==element){
                       break;
                   }
                   prv=curr;
                   curr=curr.next;
                   
               }if (curr==null){
                   System.out.println("Not FOund");
               }else{ 
                   prv.next=curr.next;
                   if (curr==tail){
                   tail=prv;
                   length--;
               }
           }
       }
       }
    public void Display(){
        node current=head;
        while(current !=null){ 
            System.out.print(current.item+" ");
            current=current.next;
        }
    }
    
                
}


