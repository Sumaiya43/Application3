//package bd.teamfly.application3;
//
//import android.graphics.Color;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.RelativeLayout;
//import android.widget.Toast;
//
//public class OptionMenuIntegrate extends AppCompatActivity {
//
//    RelativeLayout relative;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//
//
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_option_menu_integrate);
//
//        relative = findViewById(R.id.relative);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu,menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        if ( id==R.id.yellow)
//        {
//            relative.setBackgroundColor(Color.YELLOW);
//        }
//
//        if ( id==R.id.red)
//        {
//            relative.setBackgroundColor(Color.RED);
//        }
//
//        if ( id==R.id.blue)
//        {
//            relative.setBackgroundColor(Color.BLUE);
//        }
//
//        if (id== R.id.logout)
//        {
//            Toast.makeText(this, "Logout Pressed!", Toast.LENGTH_SHORT).show();
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//}
