public class Arrays {

    int[] num = new int[6];

    // Using a constructor:
    public Arrays() {
        for (int i = 0; i < 6; i++) {
            num[i] = i;
        }
    }

    public void print_array(){
        for (int j : num) {
            System.out.println(j);
        }

        String h = "Ankit";

        System.out.println(h.charAt(0));
        System.out.println(h.concat("Hey"));

    }

    public void initialising_multidimensional_array(){
        int [][] nums = new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++) nums[i][j] = 0;
        }
    }
}
