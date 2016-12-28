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
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
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

        /* ObjectAnimator fadeOut = ObjectAnimator.ofFloat(imageShow, "alpha",
                0f);
        fadeOut.setDuration(2000);
        ObjectAnimator s=ObjectAnimator.ofArgb(tv,"color", Color.RED,Color.YELLOW,Color.BLUE);

        s.setDuration(2000);
        ObjectAnimator mover = ObjectAnimator.ofInt(imageShow,
                "translationX", -500, 0);
        mover.setDuration(2000);
        ObjectAnimator fadeIn = ObjectAnimator.ofInt(imageShow, "alpha",
                0, 255);
        fadeIn.setDuration(2000);
        AnimatorSet animatorSet = new AnimatorSet();

        animatorSet.play(mover).with(fadeIn).with(s);
        animatorSet.start();


        animatorSet.addListener(new AnimatorListenerAdapter() {

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);

                Toast.makeText(getApplicationContext(),"Animation started",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                //imageShow.setAlpha(0f);
                Toast.makeText(getApplicationContext(),"Animation Ended",Toast.LENGTH_LONG).show();
            }
        });*/
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
         *Fade out
         */
/*        Animation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setDuration(5000);

        fadeOut.setAnimationListener(new Animation.AnimationListener()
        {
            public void onAnimationEnd(Animation animation)
            {
                imageShow.setVisibility(View.GONE);
            }
            public void onAnimationRepeat(Animation animation) {}
            public void onAnimationStart(Animation animation) {}
        });

        imageShow.startAnimation(fadeOut);*/

        /**
         *Fade in
         */
       /* Animation fadeOut = new AlphaAnimation(0, 1);
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

        imageShow.startAnimation(fadeOut);*/
        /**
        * Flip in object
        */
       /* Animation fadein = new AlphaAnimation(0, 1);
        fadein.setInterpolator(new AccelerateInterpolator());
        fadein.setDuration(3000);
        imageShow.startAnimation(fadein);
        float scale = getResources().getDisplayMetrics().density;
        imageShow.setCameraDistance(4000 * scale);
        ObjectAnimator ob= ObjectAnimator.ofFloat(imageShow,"rotationY",0f,360f);
        ob.setDuration(3000);
        AnimatorSet animatorSet = new AnimatorSet();

         animatorSet.play(ob);
        animatorSet.start();*/
            /**
            *Teeter animation
            */

        /*Animation animation = new RotateAnimation(-10f, 10f,getWindowManager().getDefaultDisplay().getWidth()/2, getWindowManager().getDefaultDisplay().getHeight()/2);
         final Animation animation2 = new RotateAnimation(10f, -10f,getWindowManager().getDefaultDisplay().getWidth()/2, getWindowManager().getDefaultDisplay().getHeight()/2);
        animation.setFillAfter(true);
        animation.setDuration(100);
        animation2.setDuration(100);
        imageShow.setAnimation(animation);
        animation2.setRepeatMode(5);
        animation.setRepeatCount(5);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
imageShow.setAnimation(animation2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        animation2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
imageShow.setAnimation(animation);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
*/

        /**
         * Fly in animation using xml
         */
    /*    Animation anim = AnimationUtils.loadAnimation(this, R.anim.animation);
        imageShow.setAnimation(anim);
        */

        /**
         * Fly in animation
         */
        /*ValueAnimator va = ValueAnimator.ofFloat( getWindowManager().getDefaultDisplay().getHeight(),0f);
        int mDuration = 3000;
        va.setDuration(mDuration);

        va.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator animation) {
                imageShow.setTranslationY((float)animation.getAnimatedValue());
            }
        });
        va.start();*/

        /**
         * Shake Animation
         */
        /*ValueAnimator va = ValueAnimator.ofFloat( -20f,20f);
        int mDuration = 100;
        va.setDuration(mDuration);

        va.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator animation) {
                imageShow.setTranslationX((float)animation.getAnimatedValue());
            }
        });
        va.setRepeatMode(ValueAnimator.REVERSE);
        va.setRepeatCount(10);
        va.start();*/

        /**
         * Zoom in animation using xml
         */
       /* Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation2);
        imageShow.startAnimation(animation);*/


        /**
         * Zoom in animation
         */
        /*Animation as= new ScaleAnimation(0f,1f,0f,1f,getWindowManager().getDefaultDisplay().getWidth()/2,getWindowManager().getDefaultDisplay().getHeight()/2);
        as.setDuration(2000);
        imageShow.setAnimation(as);*/


        /**
        * Spinner in Animation
        */
        /*Animation as= new ScaleAnimation(0f,1f,0f,1f,imageShow.getWidth()/2,imageShow.getHeight()/2);
        as.setDuration(2000);
        AnimationSet set=new AnimationSet(true);
        Animation animation = new RotateAnimation(0f, 360f,getWindowManager().getDefaultDisplay().getWidth()/2, getWindowManager().getDefaultDisplay().getHeight()/2);
        animation.setFillAfter(true);
        set.addAnimation(as);
        set.addAnimation(animation);
        animation.setDuration(2000);
        imageShow.setAnimation(set);*/
        /**
         * Spinner out animation
         */
        /*Animation as= new ScaleAnimation(1f,0f,1f,0f,getWindowManager().getDefaultDisplay().getWidth()/2,getWindowManager().getDefaultDisplay().getHeight()/2);
        as.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageShow.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        as.setDuration(2000);
        AnimationSet set=new AnimationSet(true);
        Animation animation = new RotateAnimation(0f, 360f,getWindowManager().getDefaultDisplay().getWidth()/2, getWindowManager().getDefaultDisplay().getHeight()/2);
        animation.setFillAfter(true);
        set.addAnimation(as);
        set.addAnimation(animation);
        animation.setDuration(2000);
        imageShow.setAnimation(set);*/

        /**
         * Float in animation
         */
        /*imageShow.setAlpha(0.0f);
        imageShow.animate().translationX(500).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                imageShow.animate().translationX(0).alpha(1.0f).setDuration(1000);
            }
        });*/




       /**
         * Float out animation
         *//*
        imageShow.animate()
                .translationY(500)
                .alpha(0.0f)
                .setDuration(1000)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        imageShow.setVisibility(View.GONE);
                    }
                });*/
    }

}
