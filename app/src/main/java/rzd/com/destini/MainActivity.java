package rzd.com.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    TextView txtViewStory;
    int mIndex;
    String mStory;

//    private Story[] storyArray = new Story[]{
//            new Story(R.string.T1_Story, R.string.T1_Ans1, R.string.T3_Story),
//            new Story(R.string.T1_Story, R.string.T1_Ans2, R.string.T2_Story),
//            new Story(R.string.T2_Story, R.string.T2_Ans1, R.string.T3_Story),
//            new Story(R.string.T2_Story, R.string.T2_Ans2, R.string.T4_End),
//            new Story(R.string.T3_Story, R.string.T3_Ans1, R.string.T6_End),
//            new Story(R.string.T3_Story, R.string.T3_Ans2, R.string.T6_End),
//    };
    private Story[] storyArray = new Story[]{
            new Story(R.string.T1_Story),
            new Story(R.string.T2_Story),
            new Story(R.string.T3_Story),
            new Story(R.string.T4_End),
            new Story(R.string.T5_End),
            new Story(R.string.T6_End),
            new Story(R.string.T1_Ans1),
            new Story(R.string.T1_Ans2),
            new Story(R.string.T2_Ans1),
            new Story(R.string.T2_Ans2),
            new Story(R.string.T3_Ans1),
            new Story(R.string.T3_Ans2)
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btnRed);
        button2 = findViewById(R.id.btnBlue);
        txtViewStory = findViewById(R.id.txtViewStory);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            updateStoryBtn1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            updateBtn2();
            }
        });



    }

    private void updateStoryBtn1(){
            if(txtViewStory.getText().equals(getResources().getString(storyArray[0].getStoryID()))){
                    txtViewStory.setText(storyArray[2].getStoryID());
                    button1.setText(storyArray[10].getStoryID());
                    button2.setText(storyArray[11].getStoryID());
            }
            else if(txtViewStory.getText().equals(getResources().getString(storyArray[1].getStoryID()))){
                    txtViewStory.setText(storyArray[2].getStoryID());
                    button1.setText(storyArray[10].getStoryID());
                    button2.setText(storyArray[11].getStoryID());
            }
            else if(txtViewStory.getText().equals(getResources().getString(storyArray[2].getStoryID()))){
                txtViewStory.setText(storyArray[5].getStoryID());
                btnInvis();
            }


    }
    private void updateBtn2(){
        if(txtViewStory.getText().equals(getResources().getString(storyArray[0].getStoryID()))){
            txtViewStory.setText(storyArray[1].getStoryID());
            button1.setText(storyArray[8].getStoryID());
            button2.setText(storyArray[9].getStoryID());
        }
        else if(txtViewStory.getText().equals(getResources().getString(storyArray[2].getStoryID()))){
            txtViewStory.setText(storyArray[4].getStoryID());
            btnInvis();
        }
        else if(txtViewStory.getText().equals(getResources().getString(storyArray[1].getStoryID()))){
            txtViewStory.setText(storyArray[3].getStoryID());
            btnInvis();
        }

    }
    private void btnInvis(){
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
    }
}
