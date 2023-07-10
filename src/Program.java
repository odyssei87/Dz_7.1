public class Program {
    public static void main(String[] args){
        int [] values = {1,2,3};
        int [] weights={1,2,10};
    RandomFromArray randomFromArray = new RandomFromArray(values,weights);
    randomFromArray.Print();
    System.out.println("\n********************");
    System.out.println(randomFromArray.Random());

    }
}
