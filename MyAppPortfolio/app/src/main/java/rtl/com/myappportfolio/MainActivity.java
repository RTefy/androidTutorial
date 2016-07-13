package rtl.com.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickApp1(View view) {
        displayToast(this, "popular movies");
    }

    public void clickApp2(View view) {
        displayToast(this, "stock hawk");
    }

    public void clickApp3(View view) {
        displayToast(this, "build it bigger");
    }

    public void clickApp4(View view) {
        displayToast(this, "make your app material");
    }

    public void clickApp5(View view) {
        displayToast(this, "go ubiquitous");
    }

    public void clickApp6(View view) {
        displayToast(this, "capstone");
    }

    public static void displayToast(Context context, String project_name) {
        StringBuilder message = new StringBuilder();
        message.append("This button will launch ").append(project_name).append(" app!");
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
