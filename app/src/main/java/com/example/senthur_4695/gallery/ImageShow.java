package com.example.senthur_4695.gallery;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PixelFormat;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
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
    ImageView mTopImage;
    ImageView mBottomImage;
    Bitmap mBmp1,mBmp2;

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
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.test);
//      imageShow.startAnimation(animation);
/**
 * Wisp out animation
 */
      /*  ObjectAnimator mover = ObjectAnimator.ofFloat(imageShow,
                "translationX", 0, 500);
        mover.setDuration(1000);
        ObjectAnimator mover2 = ObjectAnimator.ofFloat(imageShow,
                "translationX",500, 0);
        mover2.setDuration(1000);
        ObjectAnimator aph = ObjectAnimator.ofFloat(imageShow,
                "alpha", 1, 0);
        aph.setDuration(800);
        ObjectAnimator scalex = ObjectAnimator.ofFloat(imageShow,
                "scaleX", 1, 0);
        scalex.setDuration(1000);
        ObjectAnimator scaley = ObjectAnimator.ofFloat(imageShow,
                "scaleY", 1, 0);
        scaley.setDuration(1000);
        AnimatorSet s=new AnimatorSet();

        s.play(aph).with(scalex).with(scaley).with(mover2).after(mover);


        s.start();*/
        /**
         * Wisp in Animation
         */
/*
        ObjectAnimator mover = ObjectAnimator.ofFloat(imageShow,
                "translationX", 0, 500);
        mover.setDuration(1000);
        ObjectAnimator mover2 = ObjectAnimator.ofFloat(imageShow,
                "translationX",500, 0);
        mover2.setDuration(1000);
        ObjectAnimator aph = ObjectAnimator.ofFloat(imageShow,
                "alpha", 0, 1);
        aph.setDuration(1000);
        ObjectAnimator scalex = ObjectAnimator.ofFloat(imageShow,
                "scaleX", 0, 1);
        scalex.setDuration(1000);
        ObjectAnimator scaley = ObjectAnimator.ofFloat(imageShow,
                "scaleY", 0, 1);
        scaley.setDuration(1000);
        AnimatorSet s=new AnimatorSet();

        s.play(aph).with(scalex).with(scaley).with(mover).before(mover2);


        s.start();*/
        final Activity qa=this;
        imageShow.setDrawingCacheEnabled(true);


        Bitmap bmp = ((BitmapDrawable) imageShow.getDrawable()).getBitmap();;
        int splitYCoord =  bmp.getHeight() / 2;
        if (splitYCoord > bmp.getHeight())
            throw new IllegalArgumentException("Split Y coordinate [" + splitYCoord + "] exceeds the activity's height [" + bmp.getHeight() + "]");
        mBmp1 = Bitmap.createBitmap(bmp, 0, 0, bmp.getWidth(), splitYCoord);
        mBmp2 = Bitmap.createBitmap(bmp, 0, splitYCoord, bmp.getWidth(), bmp.getHeight() - splitYCoord);
          int[] mLoc1;
         int[] mLoc2;
        mLoc1 = new int[]{0, imageShow.getTop()};
        mLoc2 = new int[]{0, imageShow.getTop() + splitYCoord};

        mTopImage = createImageView(this, mBmp1, mLoc1);
        mBottomImage = createImageView(this, mBmp2, mLoc2);


    AnimatorSet mSetAnim = new AnimatorSet();
    mTopImage.setLayerType(View.LAYER_TYPE_HARDWARE, null);
    mBottomImage.setLayerType(View.LAYER_TYPE_HARDWARE, null);
    mSetAnim.addListener(new Animator.AnimatorListener() {
        @Override
        public void onAnimationStart(Animator animation) {

        }

        @Override
        public void onAnimationEnd(Animator animation) {
            clean(qa);
        }

        @Override
        public void onAnimationCancel(Animator animation) {
            clean(qa);
        }

        @Override
        public void onAnimationRepeat(Animator animation) {

        }
    });

    Animator anim1 = ObjectAnimator.ofFloat(mTopImage, "translationY", mTopImage.getHeight() * -1);
    Animator anim2 = ObjectAnimator.ofFloat(mBottomImage, "translationY", mBottomImage.getHeight());
    anim1.setDuration(4000);
        anim2.setDuration(4000);
    mSetAnim.setDuration(4000);
    mSetAnim.playTogether(anim1, anim2);
    mSetAnim.start();




    }
    private void clean(Activity activity) {
        if (mTopImage != null) {
            mTopImage.setLayerType(View.LAYER_TYPE_NONE, null);
            try {
                activity.getWindowManager().removeViewImmediate(mBottomImage);
            } catch (Exception ignored) {}
        }
        if (mBottomImage != null) {
            mBottomImage.setLayerType(View.LAYER_TYPE_NONE, null);
            try {
                activity.getWindowManager().removeViewImmediate(mTopImage);
            } catch (Exception ignored) {}
        }

        mBmp1 = null;
        mBmp2 = null;
    }
      ImageView createImageView(Activity destActivity, Bitmap bmp, int loc[]) {
        ImageView imageView = new ImageView(destActivity);
        imageView.setImageBitmap(bmp);

        WindowManager.LayoutParams windowParams = new WindowManager.LayoutParams();
        windowParams.gravity = Gravity.CENTER;
        windowParams.x = loc[0];
        windowParams.y = loc[1];
        windowParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        windowParams.width = ViewGroup.LayoutParams.WRAP_CONTENT;
        windowParams.flags =
                WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN;
        windowParams.format = PixelFormat.TRANSLUCENT;
        windowParams.windowAnimations = 0;
        destActivity.getWindowManager().addView(imageView, windowParams);

        return imageView;
    }

}
