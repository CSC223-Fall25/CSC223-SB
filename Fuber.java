package csc223.sb;

public class Fuber {

    public static float euclidean(float x1, float y1, float x2, float y2) {

        float x_dif = (x2 - x1) * (x2 - x1);
        float y_dif = (y2 - y1) * (y2 - y1);
        float d = (float) Math.sqrt(x_dif + y_dif);

        return d;


    }

    public static float manhattan(float x1, float y1, float x2, float y2) {

        float d = Math.abs(x2 - x1) + Math.abs(y2 - y1);
        return d;
    }

    public interface Queue{
        void enqueue(int item);
        int dequeue();
        int peek();
        boolean isEmpty();
        int size();
    }
}
