import java.time.LocalDate;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//        StringBuilder a = new StringBuilder();
//        char b = 'a';
//        a.append(b);
//        Scanner db = new Scanner(System.in);
//        String c = db.nextLine();
//        System.out.println(c + a);
//        int[] x;
//        int[] zuA =new int[5];
//        for(int i=0;i<=4;i++){
//            zuA[i]=i;
//            System.out.println(zuA[i]);
//        }
        //重复数
        int nums[] ={-2,1,-3,4,-1,2,1,-5,4};
        boolean a = false;
        for(int i=1;i<nums.length;i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i - 1] == nums[j]) {
                    a = true;
                    break;
                }
            }
        }
        System.out.println(a);

        //最大子数组和

//        LocalDate newyear = LocalDate.of(2023,02,03);
//        int year = newyear.getYear();
//
//        System.out.println(year);
    }
}