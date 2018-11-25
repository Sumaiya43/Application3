package bd.teamfly.application3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListView extends AppCompatActivity {

    ArrayList<String> peoples;
    ArrayList<String> countries;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        setContentView(R.layout.activity_custom_list_view);

        listView = findViewById(R.id.listView);
        peoples = new ArrayList<String>();
        countries = new ArrayList<String>();

        peoples.add("Sumaiya");
        peoples.add("Shipa");
        peoples.add("Sneha");
        peoples.add("Popy");
        peoples.add("Tanu");

        countries.add("Canada");
        countries.add("Uganda");
        countries.add("France");
        countries.add("Pakistan");
        countries.add("Sweden");

        ListViewAdapter adapter = new ListViewAdapter(this, peoples, countries);

        listView.setAdapter(adapter);
    }
}
