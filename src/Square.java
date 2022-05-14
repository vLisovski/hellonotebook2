public class Square {
    int side;
    Square(int side){
        this.side=side;
    }
    void area(){
        System.out.println("Area of square = " + (side*side));
    }
    void perimeter(){
        System.out.println("Perimeter of square = " + (4*side));
    }
    void diagonal(){
        System.out.println("Diagonal of square = " + (side*Math.sqrt(2)));
    }
}
