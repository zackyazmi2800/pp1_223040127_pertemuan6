/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;


/**
 *
 * @author zack
 */
public class StrukturList {
    
        // variable untuk menujukna node linked list
    private Node head;
    
    
    // method untuk menambahkab node di akhir linked
    public void addTail(int data){
        // membuat Node batu dengan data
        Node newNode = new Node(data);
        
        //jika linkedlist kosong node baru menjadi head
        if(isEmpty()) {
            head = newNode;
        } else{
            Node curNode = head;
            while (curNode.getNext() != null){
            curNode = curNode.getNext();
        }
            curNode.setNext(newNode);
        }
    }
     // method menambahkan data node di awal linked
    public void addHead(int data){
        // membuat node baru
        Node newNode = new Node (data);
       // jika kosong
       if(head == null) {
           head = newNode;
       } else{
           // jika tidak node baru menjadi head baru
           newNode.setNext(head);
           head = newNode;
       }
    }
    
    // memnambahkan middle node
    public void addMiddle(int data, int position){
        // membuat node 
        Node newNode = new Node(data);
        
        // jika linkedlist kosng atau posisi adalah 1 node jadi head 
        if (head == null || position == 1){
            newNode.setNext(head);
            head = newNode;
        } else{
            Node curNode = head;
            Node posNode = null;
            int i = 1;
            while (curNode != null && i < position){
                posNode = curNode;
                curNode = curNode.getNext();
                i++;
            }
            
            // jika posisi ditemukan, sisipkan node baru diantara psnode dan cur
            if(curNode != null){
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            } else{
                posNode.setNext(newNode);
            }
            
            
        }
    }   
    
      
public void removeTail() {
    if (head != null) {
        if (head.getNext() == null) { // Jika hanya ada satu elemen dalam list
            head = null;
        } else {
            Node lastNode = head;
            Node preNode = null;

            // Iterasi hingga mencapai elemen terakhir
            while (lastNode.getNext() != null) {
                preNode = lastNode;
                lastNode = lastNode.getNext();
            }

            // Menghapus elemen terakhir dengan mengatur next node sebelumnya menjadi null
            preNode.setNext(null);
            dispose(lastNode);
        }
    } else {
        System.out.println("List Kosong");
    }
}


    public void removeMid(int e) {
    Node preNode = new Node(0);
    Node tempNode;
    int i;
    boolean ketemu;

    if (isEmpty()) {
        System.out.println("Elemen list kosong");
    } else {
        ketemu = false;
        i = 1;
        tempNode = head;

        while (tempNode.getNext() != null && !ketemu) {
            if (tempNode.getData() == e) {
                ketemu = true;
            } else {
                preNode = tempNode;
                tempNode = tempNode.getNext();
                i++;
            }
        }

        if (ketemu) {
            if (i == 1) {
                head = null;
            } else {
                preNode.setNext(tempNode.getNext());
                dispose(tempNode);
            }
        }
    }
}
    
    public void removedHead(){
        if (isEmpty()){
            System.out.println("List Kosong");
        } else {
            Node temp = head;
            head = head.getNext();
            dispose(temp);
        }

        
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    // menambpiklkan semua elemen data node
    public void displayElement(){
    if (isEmpty()) {
        System.out.println("List Kosong");
    } else {
        Node curNode = head; 
        while(curNode != null){
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
         }
        System.out.println();
    }
}


    private void dispose(Node temp) {
        temp.setNext(temp);
        temp = null;
    }
    
    public boolean find(int x){
        Node curNode = head;
        boolean ketemu = false;
        
        while (curNode != null && !ketemu)
        {
            if(curNode.getData() == x)
                ketemu = true;
            else
                curNode = curNode.getNext();
        }
        return ketemu;
    }
        
    public int size(){
        Node curNode = head;
        int jumlah = 0;
        
        while (curNode != null)
        {
           jumlah = jumlah + 1;
           curNode = curNode.getNext();
        }
        return jumlah;
        
    } 
    
    public void clearList() {
    while (head != null) {
        Node temp = head;
        head = head.getNext();
        dispose(temp);
    }
}

    
    
}
