package bd.teamfly.application3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntentOnePageToAnother extends AppCompatActivity {

    Button button;
    TextView name , Age ;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_one_page_to_another);

        button = findViewById(R.id.send);
        name = findViewById(R.id.text);
        Age = findViewById(R.id.textAge);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nameText = name.getText().toString();
                String ageText = Age.getText().toString();


                Intent intent = new Intent(IntentOnePageToAnother.this,IntentNewPage.class);

                intent.putExtra("Name",nameText);
                intent.putExtra("Age","21");
                intent.putExtra("Email","sumaiya@gmail.com");

                startActivity(intent);

            }
        });
    }
}
