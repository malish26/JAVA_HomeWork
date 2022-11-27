public class triangula_number {
   
        public static void main(String [] args) {
        int c = 5;
        for (int i = 0, num = 1; i < c; i++) {
            for (int l = c - i; l > 0; l--) {
                System.out.print("  ");
            }
            for (int l = 0; l <= i; l++) {
                if (num < 11) {
                    System.out.print(num + "   ");
                    num += 2;
                } else {
                    System.out.print(num + "  ");
                    num += 2;
                }
            }
            System.out.println();
        }
        }
    
}

