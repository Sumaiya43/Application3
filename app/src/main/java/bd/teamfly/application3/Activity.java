package bd.teamfly.application3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

public class Activity extends AppCompatActivity {


    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);

        text = findViewById(R.id.textView1);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(Activity.this,text);

                popupMenu.getMenuInflater().inflate(R.menu.popupmenu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        int id = item.getItemId();

                        if (id == R.id.yellow)
                        {
                            text.setTextColor(Color.YELLOW);
                        }

                        if (id == R.id.red)
                        {
                            text.setTextColor(Color.RED);
                        }


                        if (id == R.id.black)
                        {
                            text.setTextColor(Color.BLACK);
                        }


                        return true;
                    }
                });
                popupMenu.show();
            }
        });
    }
}
