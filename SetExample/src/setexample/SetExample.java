/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setexample;

import java.util.*;
// Map <K, V> nameVariable = new LinkedHashMap<K,V>() || new HashMap<K,v> || new TreeSet<k ,v>();

/* Bóc thăm trúng thưởng 
1. Thêm phiếu
2. Xoá phiếu
3. Kiểm tra phiếu
4. Xem toàn bộ các phiếu
5. Xem số lượng phiếu*/
// Tất cả các method của Set đều trả về boolean;
public class SetExample {

    static Scanner sc = new Scanner(System.in);
    Set<String> khoThamTrungThuong = new HashSet<String>(); // [];

    public void add(String phieu) {
        this.khoThamTrungThuong.add(phieu);
    }

    public void delete(String phieu) {
        this.khoThamTrungThuong.remove(phieu);
    }

    public boolean checkEle(String phieu) {
        return this.khoThamTrungThuong.contains(phieu); // true || false;
    }

    public void display() {
        System.out.println(Arrays.toString(khoThamTrungThuong.toArray())); // Obeject kieu Array
    }

    public int checkSize() {
        return this.khoThamTrungThuong.size();
    }

    public String bocTham() {
        String result = "";
        Random rd = new Random();
        int randomIndex = rd.nextInt(khoThamTrungThuong.size());
        result = (String) this.khoThamTrungThuong.toArray()[randomIndex];
        return result;
    }

    public static void main(String[] args) {
        SetExample sx = new SetExample();
        int choice;
        do {
            System.out.println("-----------------------------");
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Check");
            System.out.println("4. Display");
            System.out.println("5. Check size");
            System.out.println("6. Boc");
            System.out.println("0. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Phieu: ");
                    String phieu = sc.nextLine();
                    sx.add(phieu);
                    break;
                case 2:
                    System.out.print("Enter Phieu: ");
                    String phieuDeXoas = sc.nextLine();
                    sx.delete(phieuDeXoas);
                    break;
                case 3:
                    System.out.print("Enter Phieu: ");
                    String phieuDeTim = sc.nextLine();
                    sx.checkEle(phieuDeTim);
                    break;
                case 4:
                    sx.display();
                    break;
                case 5:
                    sx.checkSize();
                    break;
                case 6:
                    System.out.println("Giai thuong cua ban la: "+ sx.bocTham());
                    break;
                case 0:
                    System.exit(0);

            }
        } while (choice != 0);
    }
// Ôn lại bài cũ
//    public static void main(String[] args) {
//        Map<String, Integer> data = new HashMap<String, Integer>();
//        Map<String, Integer> data2 = new LinkedHashMap<String, Integer>();
//        Map<String, Integer> data3 = new TreeMap<String, Integer>();
//        
//        
//        // hashMap, treeMap: hashMap sẽ nhanh hơn treeMap
//        data.put("Bee", 1);
//        data.put("Control", 2);
//        data.put("Ant", 3);
//        data.put("Ruby", 4);
//        
//        data2.put("Java", 1);
//        data2.put("Python", 3);
//        data2.put("C++", 2);
//        data2.put("Ruby", 4);
//        
//        data3.put("Bee", 4);
//        data3.put("Controller", 3);
//        data3.put("Hi", 2);
//        data3.put("Ant", 1);
//        
//        System.out.println("Size of Map: " + data.size());
//        System.out.println("ALl element of Map: " + data);
//        
//        System.out.println("Size of Map: " + data2.size());
//        System.out.println("ALl element of Map: " + data2);
//        
//         System.out.println("Size of Map: " + data3.size());
//        System.out.println("ALl element of Map: " + data3);
//        
//    }
//}
    // Set : HashSet<>(); TreeSet<>(); LinkedHashSet<>();  , EnumSet<>();, Itertanol
//    public static void main(String [] args){
//        Set<String> data = new HashSet<String>(); 
//        Set<String> data2 = new TreeSet<String>();
//        
//        data.add("Bee");
//        data.add("Ant");
//        data.add("Control");
//        data.add("Hihi");
//        
//        
//        data2.add("Bee");
//        data2.add("Ant");
//        data2.add("Control");
//        
//        Iterator iterator = data.iterator();
//        while(iterator.hasNext()){ // false
//            System.out.println(iterator.next());
//        }
//        System.out.println("-------------------------");
//        Iterator iterator2 = data2.iterator();
//        while(iterator2.hasNext()){ // false
//            System.out.println(iterator2.next());
//        }
//        
//    }
}
