package com.example.tih;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class lanrenmolanActivity extends Activity{
private TextView lanrenmolanl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lanrenmolanmain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		lanrenmolanl = (TextView)findViewById(R.id.lanrenmolanl);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		lanrenmolanl.setTypeface (face);
		lanrenmolanl.setBackgroundColor(Color.BLACK);
		lanrenmolanl.setTextColor(Color.WHITE);
		lanrenmolanl.setMovementMethod(ScrollingMovementMethod.getInstance());
		lanrenmolanl.setText("༄༅། །དེར་ནི་རིང་དུ་འབད་ལས་ཚོགས་གཉིས་ནི། །མཁའ་ལྟར་ཡངས་པ་གང་ཞིག་བསགས་པ་དེས། །བློ་མིག་མ་རིག་གིས་ལྡོངས་འགྲོ་བ་ཀུན། །རྣམ་འདྲེན་རྒྱལ་བའི་དབང་བོར་བདག་གྱུར་ཅིག །དེར་མ་སོན་པའི་ཚེ་རབས་ཀུན་ཏུ་ཡང་། །འཇམ་པའི་དབྱངས་ཀྱིས་བརྩེ་བས་རྗེས་བཟུང་སྟེ། །བསྟན་པའི་རིམ་པ་ཀུན་ཚང་ལམ་གྱི་མཆོག །རྙེད་ནས་སྒྲུབ་པས་རྒྱལ་རྣམས་མཉེས་བྱེད་ཤོག །རང་གིས་ཇི་བཞིན་རྟོགས་པའི་ལམ་གྱི་གནད། །ཤུགས་དྲག་བརྩེ་བས་དྲངས་པའི་ཐབས་མཁས་ཀྱིས། །འགྲོ་བའི་ཡིད་ཀྱི་མུན་པ་བསལ་བྱས་ནས། །རྒྱལ་བའི་བསྟན་པ་ཡུན་རིང་འཛིན་གྱུར་ཅིག ། བསྟན་པ་རིན་ཆེན་མཆོག་གིས་མ་ཁྱབ་པའམ། །ཁྱབ་ཀྱང་ཉམས་པར་གྱུར་པའི་ཕྱོགས་དེར་ནི། །སྙིང་རྗེ་ཆེན་པོས་ཡིད་རབ་བསྐྱོད་པ་ཡིས། །ཕན་བདེའི་གཏེར་དེ་གསལ་བར་བྱེད་པར་ཤོག །སྲས་བཅས་རྒྱལ་བའི་རྨད་བྱུང་འཕྲིན་ལས་ལས། །ལེགས་གྲུབ་བྱང་ཆུབ་ལམ་གྱི་རིམ་པས་ཀྱང་། །ཐར་འདོད་རྣམས་ཀྱི་ཡིད་ལ་དཔལ་སྟེར་ཞིང་། །རྒྱལ་བའི་མཛད་པ་རིང་དུ་སྐྱོང་གྱུར་ཅིག །ལམ་བཟང་བསྒྲིག་པའི་མཐུན་རྐྱེན་སྒྲུབ་བྱེད་ཅིང་། །འགལ་རྐྱེན་སེལ་བྱེད་མི་དང་མི་མིན་ཀུན། །ཚེ་རབས་ཀུན་ཏུ་རྒྱལ་བས་བསྔགས་པ་ཡི། །རྣམ་དག་ལམ་དང་འབྲལ་བར་མ་གྱུར་ཅིག །གང་ཚེ་ཐེག་པ་མཆོག་ལ་ཆོས་སྤྱོད་བཅུས། །ཚུལ་བཞིན་སྒྲུབ་ལ་བརྩོན་པ་དེ་ཡི་ཚེ། །མཐུ་ལྡན་རྣམས་ཀྱིས་རྟག་ཏུ་གྲོགས་བྱེད་ཅིང་། །བཀྲ་ཤིས་རྒྱ་མཚོས་ཕྱོགས་ཀུན་ཁྱབ་གྱུར་ཅིག ། སརྦ་མངྒ་ལཾ། །");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			lanrenmolanl.setTextSize(35);
			break;
		case R.id.zhun:
			lanrenmolanl.setTextSize(25);
			break;
		case R.id.xiao:
			lanrenmolanl.setTextSize(20);
			break;
		case R.id.muzhi:
			lanrenmolanl.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			lanrenmolanl.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			lanrenmolanl.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			lanrenmolanl.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			lanrenmolanl.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			lanrenmolanl.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			lanrenmolanl.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			lanrenmolanl.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			lanrenmolanl.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			lanrenmolanl.setTextColor(Color.BLUE);
			break;
	    }
	        // TODO Auto-generated method stub
	        if(item.getItemId() == android.R.id.home)
	        {
	            finish();
	            return true;
	        }
	        return super.onOptionsItemSelected(item);
	    }	

}
