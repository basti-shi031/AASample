package basti.com.aalib;

/**
 * 圆Bean
 *
 * Created by Bowen on 2016-02-16.
 */
public class Point {

    private float cx;//圆心x
    private float cy;//圆心y
    private float angle;//所在的角度 0-360;
    private int id;//第id个圆

    public Point(float cx, float cy, float angle,int id) {
        this.cx = cx;
        this.cy = cy;
        this.angle = angle;
        this.id = id;
    }


    public void setLocationInfo(float cx, float cy, float angle){
        setAngle(angle);
        setCy(cy);
        setCx(cx);
    }

    public float getCx() {
        return cx;
    }

    public void setCx(float cx) {
        this.cx = cx;
    }

    public float getCy() {
        return cy;
    }

    public void setCy(float cy) {
        this.cy = cy;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }
}
