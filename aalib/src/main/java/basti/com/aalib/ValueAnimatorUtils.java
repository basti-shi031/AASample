package basti.com.aalib;

import android.animation.ValueAnimator;

/**
 * Created by Bowen on 2016-02-17.
 */
public class ValueAnimatorUtils {

    private int index;

    private ValueAnimator valueAnimator;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ValueAnimator getValueAnimator() {
        return valueAnimator;
    }

    public void setValueAnimator(ValueAnimator valueAnimator) {
        this.valueAnimator = valueAnimator;
    }

    public ValueAnimatorUtils(int index, ValueAnimator valueAnimator) {
        this.index = index;
        this.valueAnimator = valueAnimator;
    }
}
