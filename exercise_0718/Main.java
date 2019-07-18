package exercise.exercise_0718;


/*
连续最大和
 */
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = in.nextInt();
        }
        int sum = num[0];
        int max = num[0];
        for(int i=1; i<n; i++){
            if(sum >= 0){
                sum += num[i];
            }else{
                sum = num[i];
            }
            if(max < sum){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
 */


/*
坐标移动
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int x = 0;
            int y = 0;
            String[] strs = in.nextLine().split(";");
            for(int i=0; i<strs.length; i++){
                if(strs[i].length()==3 || strs[i].length()==2){
                    char a = strs[i].charAt(0);
                    boolean flag = strs[i].length() == 3 ? '0'<=strs[i].charAt(1) && strs[i].charAt(1)<='9'&&
                            '0'<=strs[i].charAt(2) && strs[i].charAt(2)<='9':'0'<=strs[i].charAt(1) && strs[i].charAt(1)<='9';
                    if(!flag){
                        continue;
                    }
                    int num = Integer.parseInt(strs[i].substring(1));
                    if(a=='A'){
                        x-=num;
                    }else if(a=='D'){
                        x+=num;
                    }else if(a=='S'){
                        y-=num;
                    }else if(a=='W'){
                        y+=num;
                    }
                }
            }
            System.out.println(x+","+y);
        }
    }
}
