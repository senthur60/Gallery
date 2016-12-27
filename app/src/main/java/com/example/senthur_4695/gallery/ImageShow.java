package com.example.senthur_4695.gallery;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by senthur-4695 on 14/12/16.
 */
public class ImageShow extends Activity {

    ImageView imageShow;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview);
        imageShow= (ImageView) findViewById(R.id.imageView);
        tv=(TextView) findViewById(R.id.sampletext);
        imageShow.setImageResource(getIntent().getIntExtra("image",0));


        /**
         * Fade in Face out Animation(Object Animation)
         */

        // ObjectAnimator fadeOut = ObjectAnimator.ofFloat(imageShow, "alpha",
         //       0f);
        //fadeOut.setDuration(2000);
//        ObjectAnimator s=ObjectAnimator.ofArgb(tv,"color", Color.RED,Color.YELLOW,Color.BLUE);
//
//        s.setDuration(2000);
//        ObjectAnimator mover = ObjectAnimator.ofInt(imageShow,
//                "translationX", -500, 0);
//        mover.setDuration(2000);
//        ObjectAnimator fadeIn = ObjectAnimator.ofInt(imageShow, "alpha",
//                0, 255);
//        fadeIn.setDuration(2000);
//        AnimatorSet animatorSet = new AnimatorSet();
//
//        animatorSet.play(mover).with(fadeIn).with(s);
//        animatorSet.start();
//
//
//        animatorSet.addListener(new AnimatorListenerAdapter() {
//
//            @Override
//            public void onAnimationStart(Animator animation) {
//                super.onAnimationStart(animation);
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                Toast.makeText(getApplicationContext(),"Animation started",Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                super.onAnimationEnd(animation);
//                //imageShow.setAlpha(0f);
//                Toast.makeText(getApplicationContext(),"Animation Ended",Toast.LENGTH_LONG).show();
//            }
//        });
        /**
         * View Animation
        */
        //view Animation
        /*ValueAnimator va = ValueAnimator.ofFloat(0f, getWindowManager().getDefaultDisplay().getWidth()-250);
        int mDuration = 3000; //in millis
        va.setDuration(mDuration);
        tv.setTextSize(20f);
        va.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator animation) {
                tv.setTranslationX((float)animation.getAnimatedValue());
            }
        });
        va.setRepeatMode(ValueAnimator.REVERSE);
        va.setRepeatCount(ValueAnimator.INFINITE);
        va.start();*/



        /**
         * Rotate Animation
         */
        /*Animation animation = new RotateAnimation(0f, 360f,getWindowManager().getDefaultDisplay().getWidth()/2, getWindowManager().getDefaultDisplay().getHeight()/2);
        //"Save" the results of the animation
        animation.setFillAfter(true);
        //Set the animation duration to zero, just in case
        animation.setDuration(3000);
        imageShow.setAnimation(animation);
        tv.setAnimation(animation);*/


        /**
         *
         */
        Animation fadeOut = new AlphaAnimation(0, 1);
        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setDuration(5000);

        fadeOut.setAnimationListener(new Animation.AnimationListener()
        {
            public void onAnimationEnd(Animation animation)
            {
                //imageShow.setVisibility(View.GONE);
            }
            public void onAnimationRepeat(Animation animation) {}
            public void onAnimationStart(Animation animation) {}
        });

        imageShow.startAnimation(fadeOut);
    }

}
