package com.example.student.p410429145;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

/**
 * Created by toreal on 2017/10/12.
 */

public class card extends FrameLayout {



    public card(@NonNull Context context , int w) {
        super(context);

        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(w-10 ,w-10);
        lp.setMargins(5,5,5,5);

        View view = new View(context);
        view.setBackgroundColor(0x33ff00ff);
        addView(view,lp);

        tv= new TextView(context);
        // tv.setText(Integer.toString(0));
        tv.setTextSize(48);
        tv.setGravity(Gravity.CENTER);
        addView(tv,lp);



    }
    TextView tv;
    int value;

    public int getNum()
    {
        return value;
    }

    public void setNum( int num )
    {
        value = num;
        if(num ==2)
            tv.setText("A");
         else if (num ==4)
            tv.setText("B");
         else if (num ==8)
            tv.setText("C");
         else if (num ==16)
            tv.setText("D");
         else if (num ==32)
            tv.setText("E");
         else if (num ==64)
            tv.setText("F");
         else if (num ==128)
            tv.setText("G");
         else if (num ==256)
            tv.setText("H");
        else if (num ==512)
            tv.setText("I");
        else if (num ==1024)
            tv.setText("J");
        else if (num ==2048)
            tv.setText("K");
        else if (num ==4096)
            tv.setText("L");
        else if (num ==8192)
            tv.setText("M");
        else if (num ==16384)
            tv.setText("N");
        else if (num ==32768)
            tv.setText("O");
        else if (num ==65536)
            tv.setText("P");
        else
            tv.setText("");


        switch(num)
        {
            case 0:
                tv.setBackgroundColor(0xffcdc1b4);
                break;

            case 2:
                tv.setBackgroundColor(0xffeee4da);
                tv.setTextColor(0xff000000);

                break;
            case 4:
                tv.setBackgroundColor(0xffede0c8);
                tv.setTextColor(0xff000000);


                break;
            case 8:
                tv.setBackgroundColor(0xfff2b179);
                tv.setTextColor(0xffffffff);

                break;


        }

        //   tv.setTextColor(0xffffffff);

    }
}
