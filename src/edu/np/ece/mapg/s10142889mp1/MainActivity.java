package edu.np.ece.mapg.s10142889mp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
	EditText etMessage;
	Button btGuess;
	int myNumber=9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMessage=(EditText)this.findViewById(R.id.etNumber);
        btGuess=(Button)this.findViewById(R.id.btGuess);
        btGuess.setOnClickListener(Listener);
        
    }
    private View.OnClickListener Listener=new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			
				try{
					String str=etMessage.getText().toString();
					int num=Integer.parseInt(str);
				if(num==myNumber){
					Toast.makeText(MainActivity.this, "Bingo! Correct number.", Toast.LENGTH_SHORT).show();
				}
				else{
					Toast.makeText(MainActivity.this, "Try again!", Toast.LENGTH_SHORT).show();
				}
			
			
				
				}catch(Exception e){
					Toast.makeText(MainActivity.this, "Wrong Input", Toast.LENGTH_SHORT).show();
				}
			// TODO Auto-generated method stub
			
		}
	};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
