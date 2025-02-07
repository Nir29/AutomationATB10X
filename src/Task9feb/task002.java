package Task9feb;

public class task002 {
    public static void main(String[] args) {
        int a[]={10,20,50,30,40,70,90};
        int smallnum=givesmall(a);
        System.out.println(smallnum);

    }
    static int givesmall(int a[]){
        int small=a[0];
        for (int i = 0; i < a.length; i++) {
            if (  small>a[i]) {
                small=a[i];
            }
        }

        return small;

    }
}
