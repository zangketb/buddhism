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

public class sangemolanActivity extends Activity{
private TextView sangemolanl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sangemolanmain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		sangemolanl = (TextView)findViewById(R.id.sangemolanl);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		sangemolanl.setTypeface (face);
		sangemolanl.setBackgroundColor(Color.BLACK);
		sangemolanl.setTextColor(Color.WHITE);
		sangemolanl.setMovementMethod(ScrollingMovementMethod.getInstance());
		sangemolanl.setText("༄༅། །གསང་ཆེན་ལམ་གྱི་རིམ་པ་འདིར་འབད་པས། །རླབས་ཆེན་ཚོགས་གཉིས་མང་དུ་བསགས་པ་རྣམས། །མར་གྱུར་འགྲོ་བ་ཀུན་གྱི་རེ་སྐོང་བའི། །ཟུང་འཇུག་རྡོ་རྗེ་འཆང་དབང་ཐོབ་ཕྱིར་བསྔོ། །དེས་ནི་ཚེ་རབས་ཀུན་ཏུ་དངོས་གྲུབ་གཞི། །ཐེག་མཆོག་བཤེས་གཉེན་འབད་པས་མཉེས་བྱས་ནས། །ཚུལ་བཞིན་བསྐུར་བའི་རྣམ་དག་དབང་བཞི་ཡིས། །ཟབ་མོའི་ལམ་གྱི་སྣོད་དུ་འགྱུར་བར་ཤོག །དེ་ཚེ་བླ་མ་དཔའ་བོ་དཔའ་མོའི་ཚོགས། །དཔང་དུ་བཞག་ནས་ལེགས་པར་ཁས་བླངས་པའི། །བསྲུང་དང་བཟུང་དང་བསྟེན་པའི་དམ་ཚིག་གི །བཅས་པའི་མཚམས་ལས་འདའ་བར་མ་གྱུར་ཅིག །རིམ་གཉིས་སྤྱོད་དང་བཅས་པའི་རྒྱུད་དོན་ལ། །གཏུགས་པ་མེད་པའི་དྲི་མེད་རིགས་པ་ཡིས། །མ་རྟོགས་ལོག་རྟོག་ཐེ་ཚོམ་ཀུན་བཅད་ནས། །བརྩོན་པས་སྒྲུབ་པ་སྙིང་བོར་བྱེད་པར་ཤོག །དེ་ལྟར་སློབ་པའི་རླབས་ཆེན་སྤྱོད་པ་ལ། །མཐུ་ལྡན་རྣམས་ཀྱིས་རྟག་ཏུ་གྲོགས་མཛད་པས། །བར་དུ་གཅོད་པའི་མིང་ཡང་མེད་པ་དང་། །འདོད་པའི་རྐྱེན་རྣམས་ཡིད་བཞིན་འབྱོར་བར་ཤོག ། བསྟན་པ་ཁོ་ན་ལྷར་བཅས་འགྲོ་བ་ཡི། །བདེ་ལེགས་ཀུན་གྱི་རྩ་བར་ཡིད་ཆེས་ནས། །ལུས་སྲོག་ཡལ་བར་གྱུར་ཀྱང་མི་གཏོང་བའི། །སྙིང་སྟོབས་ཆེན་པོས་དམ་ཆོས་འཛིན་གྱུར་ཅིག །གསང་དོན་ལེགས་པར་ཕྱེ་བ་འདི་ཡིས་ཀྱང་། །ཐེག་པ་མཆོག་གི་བགྲོད་པ་མཐའ་ཡས་ལ། །གཞུང་ལུགས་གདམས་པར་འཆར་བའི་རྐྱེན་བྱས་ནས། །བསྟན་པའི་སྙིང་བོ་རིང་དུ་གསལ་བྱེད་ཤོག །མཚམས་སྤྲིན་གཞོན་ནུས་འཁྱུད་པའི་གསེར་གྱི་རིས། །ཨིནྡྲ་ནཱི་ལའི་ཐོར་ཅོག་བཅིངས་པ་བཞིན། །དམར་སེར་སྐུ་ཡིས་ཡིད་འཕྲོག་གང་གི་གཙུག །མཐོན་མཐིང་རལ་བའི་ཟུར་ཕུད་ལྔས་མཛེས་པའི། །འཇམ་དབྱངས་དེ་ཡིས་ཚེ་རབས་ཀུན་དུ་བདག །དགྱེས་བཞིན་རྗེས་སུ་བཟུང་བའི་དྲིན་ལས་ནི། །གཏིང་དཔག་དཀའ་བའི་ཆོས་ཚུལ་རྒྱ་མཚོ་ལ། །བློ་གྲོས་ཐོགས་པ་མེད་པར་འཇུག་པར་ཤོག །བཀྲ་ཤིས། །");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			sangemolanl.setTextSize(35);
			break;
		case R.id.zhun:
			sangemolanl.setTextSize(25);
			break;
		case R.id.xiao:
			sangemolanl.setTextSize(18);
			break;
		case R.id.muzhi:
			sangemolanl.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			sangemolanl.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			sangemolanl.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			sangemolanl.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			sangemolanl.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			sangemolanl.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			sangemolanl.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			sangemolanl.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			sangemolanl.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			sangemolanl.setTextColor(Color.BLUE);
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
