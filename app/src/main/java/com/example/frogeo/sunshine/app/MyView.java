package com.example.frogeo.sunshine.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by geordywilliams on 7/24/15.
 */
public class MyView extends View {

    private int myHeight;
    private int myWidth;

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defaultStyle) {
        super(context, attrs, defaultStyle);
    }

    @Override
    protected void onMeasure(int wMeasureSpec, int hMeasureSpec) {
        int hSpecMode = MeasureSpec.getMode(hMeasureSpec);
        int hSpecSize = MeasureSpec.getSize(hMeasureSpec);
        myHeight = hSpecSize;

        int wSpecMode = MeasureSpec.getMode(wMeasureSpec);
        int wSpecSize = MeasureSpec.getSize(wMeasureSpec);
        myWidth = wSpecSize;

        if (hSpecMode == MeasureSpec.EXACTLY) {
            myHeight = hSpecSize;
        }

        if (wSpecMode == MeasureSpec.EXACTLY) {
            myWidth = wSpecSize;
        }

        setMeasuredDimension(myWidth, myHeight);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int x = 0;
        int y = 0;
        int radius = myWidth;
        Paint paint = new Paint();
        Shader shader = new Shader();
        ColorFilter filter = new ColorFilter();

        paint.setColor(-16711936);
        paint.setShader(shader);
        paint.setColorFilter(filter);

        canvas.drawCircle(x, y, radius, paint);
    }
}
