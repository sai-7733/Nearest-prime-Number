import java.util.*;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int after=0;
        int before=0;
        for(int i=n+1; ;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==2){
                after=i;
                break;
            }
        }
        for(int i=n-1;i>0;i--){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==2){
                before=i;
                break;
            }
        }
        if((after-n)<(n-before)){
            System.out.println(after);
        }
        else if((n-before)<(after-n)){
            System.out.println(before);
        }
        else{
            System.out.println(before+" "+after);
        }
    }
}