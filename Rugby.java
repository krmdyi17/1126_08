import java.util.Scanner;

class Rugby{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int [] card = new int[N+1];

        StringBuilder sb = new StringBuilder();

        for(int j=0; j<Q; j++){
            int event = sc.nextInt();
            int i = sc.nextInt();
            
            switch(event){
                case 1:
                    card[i] += 1;
                    break;
                case 2:
                    card[i] += 2;
                    break;
                case 3:
                    if(card[i]>=2){
                        sb.append("Yes\n");
                    }else{
                        sb.append("No\n");
                    }
                    break;

            }

        }
        System.out.println(sb.toString());
    }
}
