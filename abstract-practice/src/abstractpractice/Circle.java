package abstractpractice;

public abstract class Circle extends GraphicObject{
    @Override
    void draw() {
        System.out.println("Drawing");
    }

//    @Override
//    void resize() {
//        System.out.println("Resizing");
//    }
    @Override
    void moveTo(int a ,int b ){
        System.out.println(a*b);
    }
}
