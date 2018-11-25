package bd.teamfly.application3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class AnimationTest extends AppCompatActivity {

    TextView animation;
    Button zoomIn , zoomOut , blink , fadeIn , fadeOut;

    Animation aZoomIn,aZoomOut,aBlink,aFadeIn,aFadeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_test);

        animation = findViewById(R.id.animation);
        zoomIn = findViewById(R.id.zoomIn);
        zoomOut = findViewById(R.id.zoomOut);
        blink = findViewById(R.id.blink);
        fadeIn = findViewById(R.id.fadeIn);
        fadeOut = findViewById(R.id.fadeOut);

        aZoomIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        aZoomOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
        aBlink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        aFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        aFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);

        zoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animation.setVisibility(View.VISIBLE);
                animation.startAnimation(aZoomIn);

            }
        });

        zoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animation.setVisibility(View.VISIBLE);
                animation.startAnimation(aZoomOut);

            }
        });

        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animation.setVisibility(View.VISIBLE);
                animation.startAnimation(aBlink);

            }
        });

        fadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animation.setVisibility(View.VISIBLE);
                animation.startAnimation(aFadeIn);

            }
        });

        fadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animation.setVisibility(View.VISIBLE);
                animation.startAnimation(aFadeOut);

            }
        });


    }
}
