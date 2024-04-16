public class task3a {
    public static void main(String[] args) {
        int[][] x = {
            {0, 1, 0},
            {1, 0, 0},
            {0, 1, 0}
        };
        int n = x.length;
        boolean found = false; // initializes the flag condition if found the first allzeros row

        for (int i = 0; i < n; i++) {
            boolean allZeros = true; // flag for checking the rows
            for (int j = 0; j < n; j++) {
                if (x[i][j] != 0) {
                    allZeros = false; // flag for checking the columns
                    break;
                }
            }
            if (allZeros) { 
                System.out.println("First all-zero row is: " + (i + 1)); // need to increment because the indexes start at zero
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No all-zero row found.");// output when none of the row are all-zeros
        }
    }
}
