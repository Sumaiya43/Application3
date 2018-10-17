package bd.teamfly.application3;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class CartoonImage extends AppCompatActivity {

    RelativeLayout cartoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartoon_image);

        cartoon = findViewById(R.id.cartoon);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.frozen)
        {
            cartoon.setBackgroundResource(R.drawable.frozen);
        }

        if (id == R.id.moana)
        {
            cartoon.setBackgroundResource(R.drawable.moana);
        }

        if (id == R.id.jasmine)
        {
            cartoon.setBackgroundResource(R.drawable.jasmine1);
        }


        return super.onOptionsItemSelected(item);
    }
}
