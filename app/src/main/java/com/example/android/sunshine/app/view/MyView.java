package com.example.android.sunshine.app.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by rafael.alves on 21/06/16.
 */

public class MyView extends View {

    private Paint mTextPaint;

    public MyView(Context context) {
        super(context);
        init();
    }

    private void init() {
        mTextPaint = new Paint();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawText("R",0,0,mTextPaint);
    }
}
