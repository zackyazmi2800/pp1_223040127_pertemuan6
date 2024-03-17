/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author zack
 */
public class StrukturListTest {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList myList = new StrukturList();
        
        // 2. Tambah elemen 5 di akhir list
        myList.addTail(5);
        
        // 3. Tambah elemen 4 di akhir list
        myList.addTail(4);
        
        // 4. Tambah elemen 6 di akhir list
        myList.addTail(6);
        
        // 5. Tampilkan elemen list
        System.out.print("List elements: ");
        myList.displayElement();
        System.out.println(); // New line for clarity
        
        // 6. Cari elemen bernilai 6
        int searchElement = 6;
        System.out.println(myList.find(searchElement));
    }

}
