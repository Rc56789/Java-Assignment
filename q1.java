class q1 {
    public static void main(String args[]) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 27; j++) {
                if ((i == 1 && (j == 1 || j == 2 || j == 3 || j == 5 || j == 6 || j == 7 || j == 9 || j == 13 || j == 15 || j == 17 || j == 19 || j == 21 || j == 23 || j==26 ))
                  || i == 2 && (j == 2 || j == 5 || j == 6 || j == 9 || j == 13 || j == 15 || j == 18 || j == 21 || j == 22 || j == 25 || j == 27)
                  || i == 3 && (j == 2 || j == 5 || j == 6 || j == 7 || j == 9 || j == 10 || j == 11 || j == 14 || j == 17 || j == 19 || j == 21 || j == 23 || j == 26)) 
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}