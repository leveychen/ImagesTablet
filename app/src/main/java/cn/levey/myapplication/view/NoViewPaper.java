package cn.levey.myapplication.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Levey on 2018/2/7 13:53.
 * e-mail: m@levey.cn
 */

public class NoViewPaper extends ViewPager {
    public NoViewPaper(Context context) {
        super(context);
    }

    public NoViewPaper(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setCurrentItem(int item, boolean smoothScroll) {
        super.setCurrentItem(item, smoothScroll);
    }

    @Override
    public void setCurrentItem(int item) {
        super.setCurrentItem(item,false);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }


    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }
}
