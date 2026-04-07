public class Visual_sort {
    public static void main(String[] args) {
        int vec[] = {7, 11, 22, -5, -9, 99, -1};
        print(vec);
    }
    private static void print(int v[]) {
        int s = v.length;
        for (int i = 0; i < s; i++) {
            if (i == 0) System.out.print("+");
            System.out.print("--+");
            if (i == s-1) System.out.print("\n");
        }

        for (int i = 0; i < s; i++) {
            if (i == 0) System.out.print("|");
            System.out.printf("%2d|", v[i]);
            if (i == s-1) System.out.print("\n");
        }

        for (int i = 0; i < s; i++) {
            if (i == 0) System.out.print("+");
            System.out.print("--+");
            if (i == s-1) System.out.print("\n");
        }
    }
}