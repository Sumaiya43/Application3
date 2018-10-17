package bd.teamfly.application3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageChange extends AppCompatActivity {

    Button button1;
    ImageView Image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_change);

        button1 = findViewById (R.id.changeButton1);
        Image1 = findViewById( R.id.imageView1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Image1.setImageDrawable(getDrawable(R.drawable.jasmine1));
            }
        });
    }
}
