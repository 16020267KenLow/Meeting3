package sg.edu.rp.c346.meeting3;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etinput;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etinput = findViewById(R.id.editTextInput);
        btnsubmit = findViewById(R.id.buttonSubmit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                myBuilder.setTitle("Account's Submission");
                myBuilder.setMessage("Submit: " + etinput.getText().toString());
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                 @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                    Toast.makeText(MainActivity.this, etinput.getText().toString() + "submitted", Toast.LENGTH_LONG).show();
             }
          });
         myBuilder.setNegativeButton("Cancel", null);

        AlertDialog myDialog = myBuilder.create();
        myDialog.show();
    }
    });
    }
}
