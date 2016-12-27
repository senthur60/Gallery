package com.example.senthur_4695.gallery;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageView img[]=new ImageView[10];
    ImageView hidimg;
    private Animator mCurrentAnimator;
    private int mShortAnimationDuration=2000;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hidimg=(ImageView) findViewById(R.id.hidimg);
        img[0]= (ImageView) findViewById(R.id.img1);
        img[1]= (ImageView) findViewById(R.id.img2);
        img[2]= (ImageView) findViewById(R.id.img3);
        img[3]= (ImageView) findViewById(R.id.img4);
        img[4]= (ImageView) findViewById(R.id.img5);
        img[5]= (ImageView) findViewById(R.id.img6);
        img[6]= (ImageView) findViewById(R.id.img7);
        img[7]= (ImageView) findViewById(R.id.img8);
        img[8]= (ImageView) findViewById(R.id.img9);
        img[9]= (ImageView) findViewById(R.id.img10);

            img[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {



                    /*img[0].buildDrawingCache();
                    Intent in=new Intent(view.getContext() ,ImageShow.class);
                    ActivityOptions options = ActivityOptions.makeScaleUpAnimation(view, 0,
                            0, view.getWidth(), view.getHeight());
                    in.putExtra("image",R.drawable.img1);
                    startActivity(in,options.toBundle());*/
//                    ImageView nv= (ImageView) findViewById(R.id.imageView);
//                    try{
//                        nv.setImageResource(R.drawable.img1);
//                    }catch (Exception e){
//                        Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_LONG);
//                    }
//
//                    Intent intent = new Intent(MainActivity.this, ImageShow.class);
//                    //intent.putExtra(ImageShow.EXTRA_CONTACT, contact);
//                    ActivityOptions options =
//                            ActivityOptions.
//                                    makeSceneTransitionAnimation(MainActivity.this, img[0], "sharedImage");
//
//                    startActivity(intent, options.toBundle());
                    zoomImageFromThumb(img[0], R.drawable.img1);


                }
            });
        img[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img[1].buildDrawingCache();
                Intent in=new Intent(view.getContext() ,ImageShow.class);
                in.putExtra("image",R.drawable.img2);
                ActivityOptions ap=ActivityOptions.makeClipRevealAnimation(view, 0,
                        0, view.getWidth(), view.getHeight());
                startActivity(in,ap.toBundle());
                //zoomImageFromThumb(img[1], R.drawable.img2);
            }
        });
        img[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img[2].buildDrawingCache();
                Intent in=new Intent(view.getContext() ,ImageShow.class);
                in.putExtra("image",R.drawable.img3);
                ActivityOptions ap=ActivityOptions.makeClipRevealAnimation(view, 0,
                        0, view.getWidth(), view.getHeight());
                startActivity(in,ap.toBundle());
                //zoomImageFromThumb(img[2], R.drawable.img3);

            }
        });
        img[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img[3].buildDrawingCache();
                Intent in=new Intent(view.getContext() ,ImageShow.class);
                in.putExtra("image",R.drawable.img4);
                ActivityOptions ap=ActivityOptions.makeClipRevealAnimation(view, 0,
                        0, view.getWidth(), view.getHeight());
                startActivity(in,ap.toBundle());
                //zoomImageFromThumb(img[3], R.drawable.img4);
            }
        });
        img[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(view.getContext() ,ImageShow.class);
                in.putExtra("image",R.drawable.img5);
                ActivityOptions ap=ActivityOptions.makeClipRevealAnimation(view, 0,
                        0, view.getWidth(), view.getHeight());
                startActivity(in,ap.toBundle());
                //zoomImageFromThumb(img[4], R.drawable.img5);
            }
        });
        img[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img[5].buildDrawingCache();
                Intent in=new Intent(view.getContext() ,ImageShow.class);
                in.putExtra("image",R.drawable.img6);
                ActivityOptions ap=ActivityOptions.makeClipRevealAnimation(view, 0,
                        0, view.getWidth(), view.getHeight());
                startActivity(in,ap.toBundle());
                //zoomImageFromThumb(img[5], R.drawable.img6);
            }
        });
        img[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img[6].buildDrawingCache();
                Intent in=new Intent(view.getContext() ,ImageShow.class);
                in.putExtra("image",R.drawable.img7);
                ActivityOptions ap=ActivityOptions.makeClipRevealAnimation(view, 0,
                        0, view.getWidth(), view.getHeight());
                startActivity(in,ap.toBundle());
                //zoomImageFromThumb(img[6], R.drawable.img7);
            }
        });
        img[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img[7].buildDrawingCache();
                Intent in=new Intent(view.getContext() ,ImageShow.class);
                in.putExtra("image",R.drawable.img8);
                ActivityOptions ap=ActivityOptions.makeClipRevealAnimation(view, 0,
                        0, view.getWidth(), view.getHeight());
                startActivity(in,ap.toBundle());
                //zoomImageFromThumb(img[7], R.drawable.img8);
            }
        });
        img[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img[8].buildDrawingCache();
                Intent in=new Intent(view.getContext() ,ImageShow.class);
                in.putExtra("image",R.drawable.img9);

                ActivityOptions ap=ActivityOptions.makeClipRevealAnimation(view, 0,
                        0, view.getWidth(), view.getHeight());
                startActivity(in,ap.toBundle());
                //zoomImageFromThumb(img[8], R.drawable.img9);
            }
        });
        img[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img[9].buildDrawingCache();
                Intent in=new Intent(view.getContext() ,ImageShow.class);
                ActivityOptions ap=ActivityOptions.makeClipRevealAnimation(view, 0,
                        0, view.getWidth(), view.getHeight());
                ActivityOptions options = ActivityOptions.makeScaleUpAnimation(view, 0,
                        0, view.getWidth(), view.getHeight());
                in.putExtra("image",R.drawable.img10);

                startActivity(in,ap.toBundle());
                //zoomImageFromThumb(img[9], */R.drawable.img10);
            }
        });










    }
    private void zoomImageFromThumb(final View thumbView, int imageResId) {
        // If there's an animation in progress, cancel it
        // immediately and proceed with this one.
        if (mCurrentAnimator != null) {
            mCurrentAnimator.cancel();
        }

        // Load the high-resolution "zoomed-in" image.
        final ImageView expandedImageView = (ImageView) findViewById(
                R.id.expanded_image);
        expandedImageView.setImageResource(imageResId);

        // Calculate the starting and ending bounds for the zoomed-in image.
        // This step involves lots of math. Yay, math.
        final Rect startBounds = new Rect();
        final Rect finalBounds = new Rect();
        final Point globalOffset = new Point();

        // The start bounds are the global visible rectangle of the thumbnail,
        // and the final bounds are the global visible rectangle of the container
        // view. Also set the container view's offset as the origin for the
        // bounds, since that's the origin for the positioning animation
        // properties (X, Y).
        thumbView.getGlobalVisibleRect(startBounds);
        findViewById(R.id.container)
                .getGlobalVisibleRect(finalBounds, globalOffset);
        startBounds.offset(-globalOffset.x, -globalOffset.y);
        finalBounds.offset(-globalOffset.x, -globalOffset.y);

        // Adjust the start bounds to be the same aspect ratio as the final
        // bounds using the "center crop" technique. This prevents undesirable
        // stretching during the animation. Also calculate the start scaling
        // factor (the end scaling factor is always 1.0).
        float startScale;
        if ((float) finalBounds.width() / finalBounds.height()
                > (float) startBounds.width() / startBounds.height()) {
            // Extend start bounds horizontally
            startScale = (float) startBounds.height() / finalBounds.height();
            float startWidth = startScale * finalBounds.width();
            float deltaWidth = (startWidth - startBounds.width()) / 2;
            startBounds.left -= deltaWidth;
            startBounds.right += deltaWidth;
        } else {
            // Extend start bounds vertically
            startScale = (float) startBounds.width() / finalBounds.width();
            float startHeight = startScale * finalBounds.height();
            float deltaHeight = (startHeight - startBounds.height()) / 2;
            startBounds.top -= deltaHeight;
            startBounds.bottom += deltaHeight;
        }

        // Hide the thumbnail and show the zoomed-in view. When the animation
        // begins, it will position the zoomed-in view in the place of the
        // thumbnail.
        thumbView.setAlpha(0f);
        expandedImageView.setVisibility(View.VISIBLE);

        // Set the pivot point for SCALE_X and SCALE_Y transformations
        // to the top-left corner of the zoomed-in view (the default
        // is the center of the view).
        expandedImageView.setPivotX(0f);
        expandedImageView.setPivotY(0f);

        // Construct and run the parallel animation of the four translation and
        // scale properties (X, Y, SCALE_X, and SCALE_Y).
        AnimatorSet set = new AnimatorSet();
        set
                .play(ObjectAnimator.ofFloat(expandedImageView, View.X,
                        startBounds.left, finalBounds.left))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.Y,
                        startBounds.top, finalBounds.top))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.SCALE_X,
                        startScale, 1f)).with(ObjectAnimator.ofFloat(expandedImageView,
                View.SCALE_Y, startScale, 1f));
        set.setDuration(mShortAnimationDuration);
        set.setInterpolator(new DecelerateInterpolator());
        set.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                mCurrentAnimator = null;
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                mCurrentAnimator = null;
            }
        });
        set.start();
        mCurrentAnimator = set;

        // Upon clicking the zoomed-in image, it should zoom back down
        // to the original bounds and show the thumbnail instead of
        // the expanded image.
        final float startScaleFinal = startScale;
        expandedImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCurrentAnimator != null) {
                    mCurrentAnimator.cancel();
                }

                // Animate the four positioning/sizing properties in parallel,
                // back to their original values.
                AnimatorSet set = new AnimatorSet();
                set.play(ObjectAnimator
                        .ofFloat(expandedImageView, View.X, startBounds.left))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView,
                                        View.Y,startBounds.top))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView,
                                        View.SCALE_X, startScaleFinal))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView,
                                        View.SCALE_Y, startScaleFinal));
                set.setDuration(mShortAnimationDuration);
                set.setInterpolator(new DecelerateInterpolator());
                set.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        thumbView.setAlpha(1f);
                        expandedImageView.setVisibility(View.GONE);
                        mCurrentAnimator = null;
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        thumbView.setAlpha(1f);
                        expandedImageView.setVisibility(View.GONE);
                        mCurrentAnimator = null;
                    }
                });
                set.start();
                mCurrentAnimator = set;
            }
        });
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
}
