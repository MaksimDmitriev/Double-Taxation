package ru.maksim.sample_app;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;

/**
 * Created by maksim on 11.09.17.
 */

public class MyTextView extends android.support.v7.widget.AppCompatTextView {

    private static final String TAG = "MyTextView";

    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context,
                      @Nullable AttributeSet attrs
    ) {
        super(context, attrs);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d(TAG,
              "onMeasure, "
                      + " widthMeasureSpec=" + widthMeasureSpec
                      + " heightMeasureSpec=" + heightMeasureSpec
        );
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.d(TAG, "onLayout");
    }
}
