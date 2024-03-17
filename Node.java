/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

import Tugas4HapusNode.*;

/**
 *
 * @author zack
 */
public class Node {
    private int data;
    private Node next;
    
    // inisialisasi Node
    public Node(int data) {
        this.data = data;
    }
    
    // setter dan getter
    
    public int getData() {
        return data;
    }
    
     public Node getNext() {
        return next;
    }
     
    public void setdata(int data) {
        this.data = data;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    
}
