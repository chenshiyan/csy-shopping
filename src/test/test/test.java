/**
 * Created by Administrator on 2017/12/28 0028.
 */
public class test {
    public static void main(String[] args){
        int[] a = {2,1,7,9,7,3};

       /* for (int i = 0; i < a.length-1; ++i) {

            for (int j = i+1; j < a.length; ++j) {
               if(a[i]>a[j]){
                   int temp = a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {

                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
