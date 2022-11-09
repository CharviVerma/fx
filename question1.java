import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

    public class question1{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            allfactors(n);
        }


        static void allfactors(int n){
            Vector<Integer> fact = new Vector<Integer>();
            for (int i = 1; i * i <= n; i++){
                if (n % i == 0){
                    fact.add(i);
                    fact.add(n/i);
                }
            }
            Collections.sort(fact);

            System.out.println("Factors:");
            for (int i = 0; i < fact.size(); i++){
                System.out.print(fact.get(i) + " ");
            }
            System.out.println();
            int maxProduct = 1;
            boolean count = true;


            for (int i = 0; i < fact.size(); i++){
                for (int j = i; j < fact.size(); j++){
                    for (int k = j; k < fact.size(); k++){
                        int y = n - fact.get(i) - fact.get(j) -
                                fact.get(k);

                        if (y <= 0){
                            break;
                        }
                        if (n % y == 0){
                            count = false;
                            int[] wxyz = new int[]{0,0,0,0};
						wxyz[0] = vec.get(i);
                        wxyz[1] = vec.get(j);
                        wxyz[2] = vec.get(k);
                        wxyz[3] =y;
                        }
                    }
                }
            }
            if (count == false){
                System.out.println("W:" + wxyz[0] + " X:" + wxyz[1] + " Y:" + wxyz[2] + " Z:" + wxyz[3] + " multiple:" + maxProduct);
            }
            else{
                System.out.println("nope");
            }
        }
    }
