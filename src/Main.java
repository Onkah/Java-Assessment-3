public class Main {

    public static int[] combine(int [] arr1,int [] arr2){
        int [] arr_result = new int[7];
        arr_result[0] = arr1[0];
        arr_result[1] = arr2[0];

        for(int i = 1;i < arr1.length; i++){
            arr_result[i+1] = arr1[i];

            for(int j = i+1;j < arr2.length; j++){
                arr_result[j] = arr2[i];
                break;
            }
        }

        for(int i = 0; i < arr_result.length;i++){
            System.out.print(arr_result[i] + " ");
        }
        System.out.println();

        return arr_result;
    }
    public static void main(String[] args) {
        int [] arr1 = {11,22,33,45};
        int [] arr2 = {1,2,3};
        System.out.println(combine(arr1,arr2));
        //System.out.println(arr1);
    }
}