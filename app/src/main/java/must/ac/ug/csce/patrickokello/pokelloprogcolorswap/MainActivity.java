package must.ac.ug.csce.patrickokello.pokelloprogcolorswap;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import  android.widget.Button;
import android.graphics.Color;
import java.util.Random;


public class MainActivity extends AppCompatActivity {


    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button= new Button(this);
        button.setText("TAP ME!");


        TextView textView = new TextView(this);
        textView.setText("Tap to Change Color");
        textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
        textView.setPadding(20,20,20,20);
        textView.setTextAlignment(4);


        final Random random= new Random();

        button.setOnClickListener((m )-> {
            int red= random.nextInt();

            int green= random.nextInt();
            int blue= random.nextInt();
            textView.setText("COLOR: "+"R "+String.valueOf(red)+"   G "+String.valueOf(green+" B "+String.valueOf(blue)  ));
            textView.setTextColor(Color.rgb(red,green,blue));

        });
        LinearLayout linearlayoutobj = new LinearLayout(this);
        linearlayoutobj.setOrientation(LinearLayout.VERTICAL);

        linearlayoutobj.addView(textView);
        linearlayoutobj.addView(button);
        linearlayoutobj.setGravity(Gravity.CENTER);
        linearlayoutobj.setPadding(40,40,40,40);
        setContentView(linearlayoutobj);

    }

}







