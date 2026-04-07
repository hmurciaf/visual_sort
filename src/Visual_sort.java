public class Visual_sort {
    public static void main(String[] args) {
        int vec[] = {7, 11, 22, -5, -9, 99, -1};
        print(vec);
        int sorted[] = sorting(vec);
        print(sorted);
    }
    private static int[] sorting(int arr[]) {
        int [] x = new int[arr.length];
        
        return x;
    }
    private static void print(int v[]) {
        int s = v.length;
        borde(v);
        middle(v);
        borde(v);
        
    }
    private static void middle(int w[]) {
        int s = w.length;
        for (int i = 0; i < s; i++) {
            if (i == 0) System.out.print("|");
            System.out.printf("%2d|", w[i]);
            if (i == s-1) System.out.print("\n");
        }
    }
    private static void borde(int vec[]) {
        int s = vec.length;
        for (int i = 0; i < s; i++) {
            if (i == 0) System.out.print("+");
            System.out.print("--+");
            if (i == s-1) System.out.print("\n");
        }
    }
}