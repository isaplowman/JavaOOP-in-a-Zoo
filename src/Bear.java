public class Bear extends Animal {

    public Bear(String name){
        super("pooh", "fish");
    }
    public void sleep() {
        System.out.println( name + " hibernates for 4 months");

    }
}


//public class Bear {
//
//
//    String name;
//    String favoriteFood;
//
//
//    public Bear(String name){
//        this.name = name;
//        this.favoriteFood = "fish";
//
//    }
//
//    public void eat(String food) {
//        System.out.println( name + " eats " + favoriteFood);
//        if(food.equals(favoriteFood)){
//            System.out.println("YUM!! " + name + " wants more " + food);
//        }else{
//            sleep(name);
//        }
//
//    }
//
//    public void sleep(String name) {
//        System.out.println( name + " hibernates for 4 months");
//    }
//
//
//    public static void main(String[] args){
//        Tiger tigger = new Tiger("Tigger");
//        tigger.eat("meat");
//        tigger.eat("kibble");
//        Bear pooh = new Bear("Pooh");
//        pooh.eat("fish");
//        pooh.eat("meat");
//
//    }
//}

