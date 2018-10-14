package c.f.sayitahmin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class MainActivity extends AppCompatActivity {
    int sayı;
    public void generateRandomNumber(){
        Random random = new Random();
        sayı = random.nextInt(20) + 1;
    }
    
    public void tahmin(View view){


        EditText editText = (EditText) findViewById(R.id.editText);
        int sayi2 = Integer.parseInt(editText.getText().toString());

          String message;
        if(sayı>sayi2){
            message ="Yukarı!!";
        }else if(sayı<sayi2){
            message = "Aşağı!!";
        }else{
            message = "Doğru Tahmin!! TEKRAR DENE!!";
            generateRandomNumber();


        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Log.i("girilen sayı" , editText.getText().toString());
        Log.i("random sayı" , Integer.toString(sayı));


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       generateRandomNumber();
    }
}
