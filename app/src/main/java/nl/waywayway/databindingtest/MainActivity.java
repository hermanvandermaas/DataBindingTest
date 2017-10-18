package nl.waywayway.databindingtest;

import android.*;
import android.databinding.*;
import android.os.*;
import android.support.v7.app.*;

public class MainActivity extends AppCompatActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		
		MainBinding binding = DataBindingUtil.setContentView(this, R.layout.main);
		TagLine tagline = new TagLine("Goodmorning world!");
		binding.setTagLine(tagline);
    }
}
