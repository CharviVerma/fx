import java.util.Arrays;

public class question2 {
        public static void main(String[] args) {
            String commands = "LLRDDR";
            int[] startingPosition = new int[] {0,0};

            System.out.println(Arrays.toString(moveYoshita(commands, startingPosition)));
        }

        public static int[] moveYoshita(String commands ,int[] startingPosition) {
            for(int i =0;i< commands.length(); i++){
                char ch = commands.charAt(i);
                if (ch == 'L'){
                    startingPosition[0]--;
                }
                else if (ch == 'R'){
                    startingPosition[0]++;
                }
                else if (ch == 'U'){
                    startingPosition[1]++;
                }
                else if (ch == 'D'){
                    startingPosition[1]--;
                }
            }
            return startingPosition;
        }
    }