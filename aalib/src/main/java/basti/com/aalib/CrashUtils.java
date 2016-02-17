package basti.com.aalib;

import java.util.List;

/**
 * 碰撞检测工具类
 * <p/>
 * Created by Bowen on 2016-02-17.
 */
public class CrashUtils {

    public static final int targetAngle = 90;

    public static Point getTheClosestPoint(List<Point> points) {

        int size = points.size();
        int minIndex = 0;
        float limitAngle = 360;
        if (size == 0) {
            return null;
        }

        for (int i = 0; i < size; i++) {
            float angle = 0;

            Point point = points.get(i);

            angle = Math.abs((point.getAngle() % 360) - targetAngle);

            if (angle < limitAngle) {
                //找到更近的point，则继续寻找
                limitAngle = angle;
                minIndex = i;
            } else {
                //新找到的point已经比上一个远了，则停止需找
                //这里需要处理一个特殊情况，例如angle队列为 93 95 96 91
                //正确的min_index应该为3.计算值为1
                if (minIndex == 0) {
                    for (int j = size - 1; j > 0; j--) {
                        float lastAngle = 0;
                        Point lastPoint = points.get(j);
                        lastAngle = Math.abs((lastPoint.getAngle() % 360) - targetAngle);

                        if (lastAngle < limitAngle) {
                            minIndex = j;
                            limitAngle = lastAngle;
                        }else {
                            break;
                        }
                    }
                }
                break;
            }
        }

        Point point = points.get(minIndex);

        return point;
    }

    public static boolean checkCrash(Point p1, Point p2,float radius) {

        if (p2 == null){
            return false;
        }

        //两点距离的平方
        float distance = (p1.getCx()-p2.getCx())*(p1.getCx()-p2.getCx())
                +(p1.getCy()-p2.getCy())*(p1.getCy()-p2.getCy());
        //直径的平方
        float targetDistance = (2*radius)*(2*radius);

        return distance < targetDistance;

    }
}
