package bd.teamfly.application3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimePickerTest extends AppCompatActivity {

    TimePicker time;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        time = findViewById(R.id.timepicker);
        text = findViewById(R.id.text11);

        time.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                text.setText(hourOfDay+":"+minute);
            }
        });
    }
}
