package PTvsRT;

import java.awt.*;

public class PTvsRT {
    public static void main(String[] args) {
        
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point2.x = 2;

        System.out.println(point1);

    }
}
