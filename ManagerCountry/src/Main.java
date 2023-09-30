
import controller.ManageEastAsiaCountry;


public class Main{
    
    // ----------------------- 2023/09/30
    public static void main(String[] args) {
        String mChon [] = {"Input the information of 11 countries in East Asia","Display and sort the information of country you've just input","Search the information of country by user-enterd name","Exit"};
        ManageEastAsiaCountry meac = new ManageEastAsiaCountry("Menu",mChon);
        meac.run();
    }
}