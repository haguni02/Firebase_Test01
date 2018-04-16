package edu.android.firebase_test01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    static int userNumber = 0;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Users");


    EditText name;
    EditText age;
    EditText job;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        job = findViewById(R.id.job);

    }

    public void toFirebase(View view) {
        Users user = new Users(name.getText().toString(), age.getText().toString(), job.getText().toString());
        myRef.child("user"+userNumber).setValue(user);
        userNumber++;
    }
}
