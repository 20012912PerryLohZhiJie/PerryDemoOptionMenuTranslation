package sg.edu.rp.c346.id20012912.demooptionmenutranslation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView tvTranslatedText, getTvTranslatedText2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText = findViewById(R.id.tvtranslatedtext);
        tvTranslatedText2 = findViewById(R.id.tvtranslatedtext2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //menu.add(0,0,0,"English");
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if(item.getItemId() ==R.id.englishSelection)
        {
            tvTranslatedText.setText("Hello");
            tvTranslatedText.setText("Bye");
        }

        else if(item.getItemId()== R.id.ItalainSelection)
        {
            tvTranslatedText.setText("Ciao");
            tvTranslatedText.setText("Addio");
        }



        return super.onOptionsItemSelected(item);
    }
}