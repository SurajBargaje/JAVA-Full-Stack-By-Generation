
public class Test {
    public static void main(String[] args) {
        // Car rollsRoyce = new Car();
        // System.out.println(rollsRoyce.name);
        Square s = new Square(5);
        System.out.println(s.square());
        
    }
}

class Square {
int value;
    Square(int a){
        value=a;
    }

    int square() {
        return value * value;
    }


}

// class Car {
//     String name = "Rolls Royce";
// }
