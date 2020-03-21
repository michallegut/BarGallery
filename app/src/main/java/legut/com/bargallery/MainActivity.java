package legut.com.bargallery;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.constraint.Guideline;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Guideline guideline1;
    private Guideline guideline2;
    private Guideline guideline3;
    private Guideline guideline4;
    private Guideline guideline5;
    private Guideline guideline6;
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
    private ImageButton photo1;
    private ImageButton photo2;
    private ImageButton photo3;
    private ImageButton photo4;
    private ImageButton photo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        guideline1 = findViewById(R.id.guideline1);
        guideline2 = findViewById(R.id.guideline2);
        guideline3 = findViewById(R.id.guideline3);
        guideline4 = findViewById(R.id.guideline4);
        guideline5 = findViewById(R.id.guideline5);
        guideline6 = findViewById(R.id.guideline6);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        photo1 = findViewById(R.id.photo1);
        photo2 = findViewById(R.id.photo2);
        photo3 = findViewById(R.id.photo3);
        photo4 = findViewById(R.id.photo4);
        photo5 = findViewById(R.id.photo5);
    }

    public void onClickButton1(final View view) {
        photo1.setVisibility(View.VISIBLE);
        button1.setVisibility(View.GONE);
        moveGuideline(guideline6, 1f, 1.8f, false, null, null);
        moveGuideline(guideline5, 0.8f, 1.6f, false, null, null);
        moveGuideline(guideline4, 0.6f, 1.4f, false, null, null);
        moveGuideline(guideline3, 0.4f, 1.2f, false, null, null);
        moveGuideline(guideline2, 0.2f, 1f, false, null, null);
    }

    public void onClickPhoto1(View view) {
        moveGuideline(guideline2, 1f, 0.2f, false, null, null);
        moveGuideline(guideline3, 1.2f, 0.4f, false, null, null);
        moveGuideline(guideline4, 1.4f, 0.6f, false, null, null);
        moveGuideline(guideline5, 1.6f, 0.8f, false, null, null);
        moveGuideline(guideline6, 1.8f, 1f, true, button1, photo1);
    }

    public void onClickButton2(final View view) {
        photo2.setVisibility(View.VISIBLE);
        button2.setVisibility(View.GONE);
        moveGuideline(guideline1, 0f, -0.2f, false, null, null);
        moveGuideline(guideline2, 0.2f, 0f, false, null, null);

        moveGuideline(guideline6, 1f, 1.6f, false, null, null);
        moveGuideline(guideline5, 0.8f, 1.4f, false, null, null);
        moveGuideline(guideline4, 0.6f, 1.2f, false, null, null);
        moveGuideline(guideline3, 0.4f, 1f, false, null, null);
    }

    public void onClickPhoto2(View view) {
        moveGuideline(guideline3, 1f, 0.4f, false, null, null);
        moveGuideline(guideline4, 1.2f, 0.6f, false, null, null);
        moveGuideline(guideline5, 1.4f, 0.8f, false, null, null);
        moveGuideline(guideline6, 1.6f, 1f, false, null, null);

        moveGuideline(guideline2, 0f, 0.2f, false, null, null);
        moveGuideline(guideline1, -0.2f, 0f, true, button2, photo2);
    }

    public void onClickButton3(final View view) {
        photo3.setVisibility(View.VISIBLE);
        button3.setVisibility(View.GONE);
        moveGuideline(guideline1, 0f, -0.4f, false, null, null);
        moveGuideline(guideline2, 0.2f, -0.2f, false, null, null);
        moveGuideline(guideline3, 0.4f, 0f, false, null, null);

        moveGuideline(guideline6, 1f, 1.4f, false, null, null);
        moveGuideline(guideline5, 0.8f, 1.2f, false, null, null);
        moveGuideline(guideline4, 0.6f, 1f, false, null, null);
    }

    public void onClickPhoto3(View view) {
        moveGuideline(guideline4, 1f, 0.6f, false, null, null);
        moveGuideline(guideline5, 1.2f, 0.8f, false, null, null);
        moveGuideline(guideline6, 1.4f, 1f, false, null, null);

        moveGuideline(guideline3, 0f, 0.4f, false, null, null);
        moveGuideline(guideline2, -0.2f, 0.2f, false, null, null);
        moveGuideline(guideline1, -0.4f, 0f, true, button3, photo3);
    }

    public void onClickButton4(final View view) {
        photo4.setVisibility(View.VISIBLE);
        button4.setVisibility(View.GONE);
        moveGuideline(guideline1, 0f, -0.6f, false, null, null);
        moveGuideline(guideline2, 0.2f, -0.4f, false, null, null);
        moveGuideline(guideline3, 0.4f, -0.2f, false, null, null);
        moveGuideline(guideline4, 0.6f, 0f, false, null, null);


        moveGuideline(guideline6, 1f, 1.2f, false, null, null);
        moveGuideline(guideline5, 0.8f, 1f, false, null, null);
    }

    public void onClickPhoto4(View view) {
        moveGuideline(guideline5, 1f, 0.8f, false, null, null);
        moveGuideline(guideline6, 1.2f, 1f, false, null, null);

        moveGuideline(guideline4, 0f, 0.6f, false, null, null);
        moveGuideline(guideline3, -0.2f, 0.4f, false, null, null);
        moveGuideline(guideline2, -0.4f, 0.2f, false, null, null);
        moveGuideline(guideline1, -0.6f, 0f, true, button4, photo4);
    }

    public void onClickButton5(final View view) {
        photo5.setVisibility(View.VISIBLE);
        button5.setVisibility(View.GONE);
        moveGuideline(guideline1, 0f, -1f, false, null, null);
        moveGuideline(guideline2, 0.2f, -0.8f, false, null, null);
        moveGuideline(guideline3, 0.4f, -0.6f, false, null, null);
        moveGuideline(guideline4, 0.6f, -0.4f, false, null, null);
        moveGuideline(guideline5, 0.8f, -0.2f, false, null, null);
        moveGuideline(guideline6, 1f, 0f, false, null, null);
    }

    public void onClickPhoto5(View view) {
        moveGuideline(guideline6, 0f, 1f, false, null, null);
        moveGuideline(guideline5, -0.2f, 0.8f, false, null, null);
        moveGuideline(guideline4, -0.4f, 0.6f, false, null, null);
        moveGuideline(guideline3, -0.6f, 0.4f, false, null, null);
        moveGuideline(guideline2, -0.8f, 0.2f, false, null, null);
        moveGuideline(guideline1, -1f, 0f, true, button5, photo5);
    }

    private void moveGuideline(final Guideline guideline, float fromPercent, float toPercent, final boolean hidePhotoAndShowButtonOnEnd, final ImageButton button, final ImageButton photo) {
        ValueAnimator valueAnimator = ValueAnimator.ofFloat(fromPercent, toPercent);
        valueAnimator.setDuration(1000);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animation) {
                button1.setEnabled(false);
                photo1.setEnabled(false);
                button2.setEnabled(false);
                photo2.setEnabled(false);
                button3.setEnabled(false);
                photo3.setEnabled(false);
                button4.setEnabled(false);
                photo4.setEnabled(false);
                button5.setEnabled(false);
                photo5.setEnabled(false);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                if (hidePhotoAndShowButtonOnEnd && button.getVisibility() == View.GONE && photo.getVisibility() == View.VISIBLE) {
                    button.setVisibility(View.VISIBLE);
                    photo.setVisibility(View.GONE);
                }
                button1.setEnabled(true);
                photo1.setEnabled(true);
                button2.setEnabled(true);
                photo2.setEnabled(true);
                button3.setEnabled(true);
                photo3.setEnabled(true);
                button4.setEnabled(true);
                photo4.setEnabled(true);
                button5.setEnabled(true);
                photo5.setEnabled(true);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                guideline.setGuidelinePercent((float) animation.getAnimatedValue());
            }
        });
        valueAnimator.start();
    }
}