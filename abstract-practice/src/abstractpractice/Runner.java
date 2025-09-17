package abstractpractice;

public class Runner {
    public static void main(String[] args) {
        GraphicObject graphicObject = new RectangleImpl() ;
        graphicObject.moveTo(5,10);
        graphicObject.draw();
        graphicObject.resize();
    }
}
