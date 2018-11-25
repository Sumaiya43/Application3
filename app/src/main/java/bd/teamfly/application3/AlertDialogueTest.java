package bd.teamfly.application3;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AlertDialogueTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialogue);
    }

    @Override
    public void onBackPressed() {
        alertShow();
    }

    private void alertShow()
    {
       final AlertDialog.Builder b = new AlertDialog.Builder( this) ;
       b.setTitle("Exit");
       b.setMessage("Are you sure?");

       b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               finish();
           }
       });

       b.setNegativeButton("No", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               dialog.dismiss();
           }
       });

       b.create().show();
    }
}
