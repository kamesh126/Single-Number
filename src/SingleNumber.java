import java.util.Scanner;

public class SingleNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int array[] = new int[size];
            for(int i=0;i<size;i++)
            {
                array[i] = sc.nextInt();
            }
            System.out.println(checkUnique(array,size));
        }
        public static int checkUnique(int[] array,int size)
        {
            int result = 0;
            for(int i=0;i<size;i++)
            {
                result=result^array[i];
            }
            return result;
        }
    }
