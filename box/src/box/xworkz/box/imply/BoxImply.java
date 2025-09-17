package box.xworkz.box.imply;

import box.xworkz.box.Box;
import box.xworkz.box.BoxType;

public class BoxImply implements Box {
    public void boxDesign(){
        System.out.println("Design is completed");
    }
    public int noOfOrders(){
        return 70;
    }
    public void boxType(BoxType types){
        System.out.println("Box types"+types);
    }
}
