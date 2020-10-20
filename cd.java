public class cd {

    static final int M = 1000000;

    static Kattio io = new Kattio(System.in, System.out);

    static int[] nlist = new int[M];
    static int[] mlist = new int[M];

    public static void main(String[] args) {

        while (true) {

            //Get inputs
            int n = io.getInt();
            int m = io.getInt();

            //if neither of them have any cds
            if (n == 0 && m == 0) {
                break;
            }

            //Jack's cds
            for (int i = 0; i < n; i++) {
                nlist[i] = io.getInt();
            }

            //Jill's cds
            for (int i = 0; i < m; i++) {
                mlist[i] = io.getInt();
            }

            int sell = 0;
            int jacksList = 0, jillsList = 0;

            while (jacksList < n && jillsList < m) {
                if (nlist[jacksList] > mlist[jillsList]) {
                    jillsList++;
                } else if (nlist[jacksList] < mlist[jillsList]) {
                    jacksList++;
                } else {
                    sell++;
                    jacksList++;
                    jillsList++;
                }
            }

            System.out.println(sell);
        }
        io.close();
    }
}