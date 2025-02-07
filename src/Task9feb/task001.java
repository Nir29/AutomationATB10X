package Task9feb;

public class task001 {
    public static void main(String[] args) {
        int a[]={10,30,20,40,60,50,70,15};

        int maximun=givemax(a);
        System.out.println(maximun);


    }


    static int givemax(int a[]){
        int max=a[0];
        for (int i = 0; i <a.length ; i++) {
            if( a[i]>max){
                max=a[i];

            }

        }

        return max;
    }
}
