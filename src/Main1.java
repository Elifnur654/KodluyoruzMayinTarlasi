import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int row,column;
       System.out.println("MAayın Tarlasına Hoşgeldiniz");
       System.out.println("Lütfen oynamak istediğiniz boyutları girin:");
       System.out.println("Satır sayısı :");
       row=scan.nextInt();
       System.out.println("Sütün sayısı:");
       column=scan.nextInt();
        MinseSweeper mine=new MinseSweeper(row,column);
        mine.run();
            }
}
