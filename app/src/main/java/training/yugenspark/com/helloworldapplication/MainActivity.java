package training.yugenspark.com.helloworldapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Student student;
    TextView studentName, studentCollage, studentDOB, studentEmail, studentContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Helllo World", Snackbar.LENGTH_LONG)
                        .setAction("Action", showToastText()).show();
            }
        });

        studentName = (TextView) findViewById(R.id.studentName);
        studentCollage = (TextView) findViewById(R.id.studentCollage);
        studentDOB = (TextView) findViewById(R.id.studentDOB);
        studentEmail = (TextView) findViewById(R.id.studentEmail);
        studentContact = (TextView) findViewById(R.id.studentContact);




        student =  new Student();
        student.setName("Rahul Kapoor");
        student.setCollage("VIIT");
        student.setContactNo("7588589686");
        student.setEmailId("omkomawar222@gmail.com");
        student.setDateOfBirth("16/07/1995");


        studentName.setText(student.getName());
        studentCollage.setText(student.getCollage());
        studentDOB.setText(student.getDateOfBirth());
        studentEmail.setText(student.getEmailId());
        studentContact.setText(student.getContactNo());

    }

    private View.OnClickListener showToastText() {
        Toast.makeText(this, "Hello World", Toast.LENGTH_LONG).show();

        return null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
