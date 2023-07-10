public class RandomFromArray {
    private int[] values_end;

    public RandomFromArray(int[] values, int[] weights) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }

        values_end = new int[sum];
        int a = 0;

        for (int i = 0; i < weights.length; i++) {
            for (int j = 0; j < weights[i]; j++) {
                values_end[a++] = values[i];
            }
        }
    }
    public int Random() {
        int random = (int) (Math.random() * ( values_end.length - 1));
        return values_end[random];
    }
    public void Print(){
        for (int i = 0; i<values_end.length;i++){
            System.out.print(values_end[i]+" ");
        }
    }

}
