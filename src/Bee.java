public class Bee extends Animal {

    public Bee(String name){
        super("Stinger", "pollen");
    }

    public void sleep() {
        System.out.println( name + " never sleeps");

    }

    public void eat(String food) {
        System.out.println( name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!! " + name + " wants more " + food);
            sleep();
        }else{
            System.out.println("YUCK!! " + name + " will not eat " + food);
        }

    }
}
