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

public class xiexiakuayangActivity extends Activity{
private TextView xiexiakuayangl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xiexiakuayangmain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		xiexiakuayangl = (TextView)findViewById(R.id.xiexiakuayangl);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		xiexiakuayangl.setTypeface (face);
		xiexiakuayangl.setBackgroundColor(Color.BLACK);
		xiexiakuayangl.setTextColor(Color.WHITE);
		xiexiakuayangl.setMovementMethod(ScrollingMovementMethod.getInstance());
		xiexiakuayangl.setText(" ༄༅། །ན་མོ་མཉྫུ་ཤྲཱི་ཡེ།   ཤེས་བྱའི་མཁའ་དབྱིངས་ཟབ་ཅིང་ཡངས་པ་ལ། །བློ་གྲོས་དཀྱིལ་འཁོར་རྒྱས་པའི་འོད་ཟེར་གྱིས། །སྐྱེ་དགུའི་མི་ཤེས་མུན་པའི་ཚོགས་རྣམས་ཀུན། །གསལ་བྱེད་དབང་བོ་འཇམ་པའི་དབྱངས་ལ་འདུད། །དེང་ནས་བཟུང་སྟེ་བྱང་ཆུབ་སྙིང་བོའི་བར། །ཁྱོད་མིན་བདག་ལ་སྐྱབས་གཞན་མ་མཆིས་པས། །ལས་ཀྱི་དབང་གིས་རིགས་དྲུག་གར་སྐྱེས་ཀྱང་། །འཁོར་བའི་འཇིགས་ལས་སྐྱོབས་ཤིག་འཇམ་པའི་དབྱངས། །བདག་ནི་ཚེ་འདིའི་འདུ་བྱེད་གཏོང་བ་ན། །བརྩེ་ཞིང་བྱམས་པའི་གཉེན་བཤེས་ཀུན་དང་བྲལ། །རྔམས་ཤིང་འཇིགས་པའི་གཤིན་རྗེས་ཟིན་པའི་ཚེ། །གཤིན་རྗེའི་འཇིགས་ལས་སྐྱོབས་ཤིག་འཇམ་པའི་དབྱངས། །ཐོག་མེད་དུས་ནས་ལས་ངན་བསགས་པའི་མཐུས། །སྲིད་པ་བར་དོའི་ཉོན་མོངས་རླུང་ཤུགས་ཀྱིས། །བཟོད་དཀའ་ངན་འགྲོའི་གཡང་སར་འཁྱེར་སྲིད་པས། །ཉོན་མོངས་རླུང་སྒོ་ཆོད་ཅིག་འཇམ་པའི་དབྱངས། །བར་དོའི་རྣམ་ཤེས་ཉིང་མཚམས་སྦྱོར་བའི་ཚེ། །མི་ཁོམ་བརྒྱད་པོ་དག་ལས་རབ་འདས་ཤིང་། །ཐུབ་བསྟན་རྒྱལ་མཚན་འཛིན་པའི་རིགས་དག་ཏུ། །སྐྱེ་བའི་རྟེན་འབྲེལ་སྒྲིགས་ཤིག་འཇམ་པའི་དབྱངས། །སྐྱེ་བ་ཕྱི་མ་མཐོ་རིས་ཡོན་ཏན་མཆོག །བདུན་གྱིས་མཛེས་པའི་དལ་འབྱོར་ལུས་ཐོབ་ནས། །བསྟན་པ་ཚུལ་བཞིན་འཛིན་པའི་བཤེས་གཉེན་དང། །མཇལ་བའི་རྟེན་འབྲེལ་སྒྲིགས་ཤིག་འཇམ་པའི་དབྱངས། །ཐབས་མཁས་ཐུགས་རྗེ་ལྡན་པའི་བཤེས་གཉེན་དེས། །ལེགས་པར་གསུངས་པའི་གསུང་རབ་རྒྱ་མཚོའི་ཚོགས། །ཚུལ་བཞིན་རྟོགས་ནས་གཞན་ལ་སྟོན་ནུས་པའི། །རྣམ་དཔྱོད་བློ་གྲོས་སྩོལ་ཅིག་འཇམ་པའི་དབྱངས། །ཚེ་རབས་ཀུན་ཏུ་གཞན་དོན་ཁོ་ནའི་ཕྱིར། །སེར་སྣ་མེད་པར་དངོས་པོ་ཀུན་གཏོང་ཞིང་། །རྣམ་གཡེང་མེད་པའི་བསམ་གཏན་སྒོམ་པ་སོགས། །ཕར་ཕྱིན་དྲུག་ལྡན་སྩོལ་ཅིག་འཇམ་པའི་དབྱངས། །འཁོར་བའི་ཚ་གདུང་སེལ་བའི་བསིལ་བྱེད་མཆོག །གསུང་རབ་གངས་རིའི་ངོས་ལ་བལྟ་འདོད་ཀྱང་། །རྣམ་གཡེང་ལེ་ལོའི་འདམ་དུ་བྱིང་ལགས་པས། །མྱུར་མགྱོགས་ཐུགས་རྗེས་ཟུངས་ཤིག་འཇམ་པའི་དབྱངས། །ཟབ་ལམ་ལྟ་བའི་ལམ་ལ་རབ་ཞུགས་ནས། །རྣམ་གྲོལ་ཐར་བའི་གླིང་དུ་འགྲོ་འདོད་ཀྱང་། །སྐལ་དམན་བདག་ནི་འཁོར་བའི་ཞགས་པས་བཅིངས། །འཁོར་བའི་ཞེན་ཐག་ཆོད་ཅིག་འཇམ་པའི་དབྱངས། །རང་དོན་ཉེར་ཞི་ཀུནྡའི་ཚལ་སྤངས་ནས། །རླབས་ཆེན་རྒྱལ་བའི་པད་ཚལ་བལྟ་འདོད་ཀྱང་། །བདག་གི་བློ་འདི་མ་རིག་མུན་པས་བསྒྲིབས། །མ་རིག་འཐིབས་པོ་སོལ་ཅིག་འཇམ་པའི་དབྱངས། །མདོར་ན་བདག་ཀྱང་སྐྱེ་བ་ཐམས་ཅད་དུ། །གསུང་རབ་རྒྱ་མཚོའི་ཚོགས་ལ་བརྟེན་བྱེད་ཅིང་། །འགྲོ་བའི་དགོས་འདོད་མ་ལུས་འབྱུང་བ་ཡི། །ཡིད་བཞིན་ནོར་བུར་གྱུར་ཅིག་འཇམ་པའི་དབྱངས། །འཇམ་མགོན་ཁྱོད་ལ་གསོལ་བ་བཏབ་པའི་མཐུས། །ཚོགས་གཉིས་རྣམ་པར་དག་པའི་གྲུ་ཆེན་གྱིས། །འགྲོ་ཀུན་སྲིད་པའི་མཚོ་ལས་སྒྲོལ་བ་ལ། །བདག་ཀྱང་ཁྱོད་བཞིན་གྱུར་ཅིག་འཇམ་པའི་དབྱངས། ། མངྒ་ལཾ།");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			xiexiakuayangl.setTextSize(35);
			break;
		case R.id.zhun:
			xiexiakuayangl.setTextSize(25);
			break;
		case R.id.xiao:
			xiexiakuayangl.setTextSize(18);
			break;
		case R.id.muzhi:
			xiexiakuayangl.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			xiexiakuayangl.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			xiexiakuayangl.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			xiexiakuayangl.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			xiexiakuayangl.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			xiexiakuayangl.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			xiexiakuayangl.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			xiexiakuayangl.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			xiexiakuayangl.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			xiexiakuayangl.setTextColor(Color.BLUE);
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
