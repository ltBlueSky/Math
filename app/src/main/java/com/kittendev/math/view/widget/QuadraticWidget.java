package com.kittendev.math.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class QuadraticWidget extends View {

    private String string = "";

    public QuadraticWidget(Context context) {
        super(context);
    }

    public QuadraticWidget(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public QuadraticWidget(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setTextSize(30);
        canvas.drawText(string, 500, 500 , paint);
        super.onDraw(canvas);
    }

    public void setString(String string) {
        this.string = string;
        invalidate();
    }
}
