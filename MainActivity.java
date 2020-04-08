import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String SEND_MESSAGE = "com.transposesolutions.mymobileapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the "Submit" button */

    public void displayMessage(View view) {
        Intent intent = new Intent(this, DisplayActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(SEND_MESSAGE, message);
        startActivity(intent);
    }
}
