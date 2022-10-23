public class Main {
    public static void main(String[] args) {

        Fruit apple = new Apple();
        Fruit pineapple = new Pinneapple();
        Fruit strawberry = new Strawberry();


        Fruit[] fruits = {apple, pineapple, strawberry};
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
