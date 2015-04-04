public class Arrays {
    public static void main(String[] args) {
        int[] array;
        array = new int[10];

        int[] arrayx = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println("");

        foo(arrayx);
        bar();
        for(int i = 0; i < arrayx.length; i++){
            System.out.printf("%d ", arrayx[i]);
        }
        System.out.println("");

    }

    public static void foo(int[] array){
        for(int i = 0; i < 10; i++){
            array[i] = array[i] * 2;
            System.out.printf("%d ", array[i]);
        }
        System.out.println("");

        return;
    }

    public static void bar(){
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int[] row: matrix) {
            for(int e: row) {
                System.out.printf("%d ", e);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
