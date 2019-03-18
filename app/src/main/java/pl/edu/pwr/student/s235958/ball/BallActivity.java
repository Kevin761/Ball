package pl.edu.pwr.student.s235958.ball;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class BallActivity extends View {
    private Paint paint;
    private int x;
    private int y;
    private final int RADIUS = 50;
    private int Vx;
    private int Vy;

    public BallActivity (Context etx, AttributeSet attrs){
        super(etx,attrs);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLUE);

        x = 50;
        y = 50;
        Vx = 9;
        Vy = 9;

    }



    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        canvas.drawCircle(x,y,RADIUS, paint);
    }

    public void move()
    {
        if(x + RADIUS > getWidth() || x - RADIUS < 0)
        {
            Vx = -Vx;
        }
        else if(y + RADIUS > getHeight() || y - RADIUS < 0)
        {
            Vy = -Vy;
        }

        x = x + Vx;
        y = y + Vy;
    }

}
