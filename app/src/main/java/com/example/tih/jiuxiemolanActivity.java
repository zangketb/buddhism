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

public class jiuxiemolanActivity extends Activity{
private TextView jiuxiemolanl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jiuxiemolanmain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		jiuxiemolanl = (TextView)findViewById(R.id.jiuxiemolanl);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		jiuxiemolanl.setTypeface (face);
		jiuxiemolanl.setBackgroundColor(Color.BLACK);
		jiuxiemolanl.setTextColor(Color.WHITE);
		jiuxiemolanl.setMovementMethod(ScrollingMovementMethod.getInstance());
		jiuxiemolanl.setText("༄༅། །རྣམ་དག་ཡིད་ཀྱི་ཟླ་ཤེལ་རྩིག་ངོས་ལ། །བཅོམ་ལྡན་རྡོ་རྗེ་འཇིགས་བྱེད་དཀྱིལ་འཁོར་ནི། །ཏིང་འཛིན་པིར་གྱིས་དབང་བོའི་གཞི་ལྟ་བུར། །རབ་བཀོད་སྒོམ་དང་མཆོད་བསྟོད་བཟླས་སོགས་ཀྱིས། །རྣམ་དཀར་ཟླ་འོད་དུང་དང་ཀུནྡ་ལྟར། །མཆོག་ཏུ་དཀར་བ་གང་ཞིག་བསགས་པ་དེས། །དངོས་གྲུབ་རྩ་བ་ཐེག་མཆོག་དགེ་བའི་བཤེས། །མཚན་ཉིད་ལྡན་པས་རྗེས་སུ་འཛིན་པར་ཤོག། ཚེ་འདིའི་ཆོས་བརྒྱད་བྱིས་པའི་རོལ་རྩེད་དང་། །འཁོར་བའི་ཕུན་ཚོགས་དུག་སྦྲུལ་ཚང་ལྟ་བུར། །རིག་ནས་བྱང་ཆུབ་མཆོག་ཏུ་སེམས་བསྐྱེད་དེ། །ཕྱིན་དྲུག་སྤྱོད་པས་རྟག་ཏུ་འཚོ་བར་ཤོག། རྣམ་དག་དབང་བཞིའི་ཆུ་བོས་སྒོ་གསུམ་གྱི། །དྲི་མ་ཀུན་བཀྲུས་སྐུ་བཞིའི་ས་བོན་བཞག །དམ་ཚིག་སྡོམ་པ་མིག་གི་འབྲས་བུ་ལྟར། །བསྲུངས་པས་རིམ་གཉིས་ལམ་གྱི་སྣོད་གྱུར་ཅིག །སྐྱེ་ཤི་བར་དོའི་མུན་པ་ཀུན་སེལ་ཞིང་། །སྐུ་གསུམ་འོད་བརྒྱའི་དྲ་བ་འགྱེད་བྱེད་པ། །བསྐྱེད་རིམ་ཟབ་མོ་ཐུན་བཞིར་བསྒོམས་པ་ལས། །རྫོགས་རིམ་ཡོངས་རྫོགས་སྐྱེ་བའི་རྒྱུད་སྨིན་ཤོག །བླ་མ་གཤིན་རྗེའི་གཤེད་ཀྱི་ལྷ་ཡི་ཚོགས། །ནམ་མཁའ་གང་བའི་བསོད་ནམས་ཞིང་མཆོག་ལ། །འཁོར་གསུམ་རྣམ་པར་དག་པའི་མཆོད་སྦྱིན་གྱིས། །རང་གི་རྒྱུད་ནི་ཡོངས་སུ་སྨིན་པར་ཤོག །སྔགས་གཉིས་དོན་ལྟར་གདོད་ནས་དག་པའི་དབྱིངས། །བདེ་ཆེན་རང་གིས་སེམས་དང་རོ་གཅིག་པ། །ཡེ་ཤེས་ཚོགས་རྫོགས་འཆི་བའི་སྐྱོན་སྤངས་ཤིང་། །འོད་གསལ་ལམ་གྱི་ཆོས་སྐུ་ཐོབ་པར་ཤོག །གཏུམ་ཆེན་གནོད་མཛེས་དཔལ་ལྡན་ཁྲོ་བོ་བཅུས། །ཡོངས་སུ་བསྐོར་བའི་ཏིང་འཛིན་ལ་གཞོལ་པས། །བདུད་དང་བགེགས་སོགས་ནག་པོའི་རྩ་ལག་ཀུན། །སྐད་ཅིག་ཉིད་ལ་དྲུངས་ནས་འབྱིན་པར་ཤོག །རྣམ་མང་རིན་ཆེན་ཚོགས་འབར་གཞལ་མེད་ཁང་། །རྣམ་སྣང་རྣམ་པར་དག་པའི་བདག་ཉིད་ཅན། །རྣམ་པར་བསྒོམས་པས་མ་དག་ཞིང་སྦྱངས་ཏེ། །རྣམ་དག་ཡེ་ཤེས་གཞལ་ཡས་ཁང་འགྲུབ་ཤོག །དེར་ནི་གུར་ཀུམ་ལྷུན་པོ་བརྩེགས་པ་བཞིན། །རྒྱུ་ཡི་རྡོ་རྗེ་འཛིན་པའི་རྣལ་འབྱོར་གྱིས། །བར་དོའི་སྲིད་སྦྱངས་སྒྱུ་ལུས་སྣོད་གྱུར་ནས། །རྒྱལ་བའི་ལོངས་སྐུ་མྱུར་དུ་འགྲུབ་པར་ཤོག །ཟླ་ཉི་ས་བོན་ཕྱག་མཚན་སྐུ་རྫོགས་པའི། །རིམ་པས་ཡེ་ཤེས་ལྔ་ཡི་མངོན་བྱང་ལས། །འབྲས་བུ་རྡོ་རྗེ་འཛིན་པའི་རྣལ་འབྱོར་གྱིས། །སྐྱེ་སྲིད་སྦྱོང་ཞིང་སྤྲུལ་སྐུ་འགྲུབ་པར་ཤོག །འབུམ་ཕྲག་ཉི་འོད་སྤུངས་པའི་གཟི་བརྗིད་ཅན། །རང་ཉིད་སེམས་དཔའ་གསུམ་གྱི་བདག་ཉིད་དང་། །རང་རིགས་ཕྱག་རྒྱར་སྦྱོར་བའི་རྣལ་འབྱོར་གྱིས། །སྤྲུལ་པའི་སྤྲིན་གྱིས་ས་གསུམ་ཁྱབ་བྱས་ནས། །མ་དག་སྣོད་བཅུད་དྲི་མ་ཀུན་སྦྱངས་ཏེ། །དག་པའི་རྟེན་དང་བརྟེན་པར་རྟག་འཆར་བ། །གཞན་དོན་ཕུན་སུམ་ཚོགས་པའི་བདག་ཉིད་ཅན། །དཀྱིལ་འཁོར་རྒྱལ་མཆོག་ཏིང་འཛིན་མཐར་ཕྱིན་ཤོག །ཕྱི་ནང་བཟླས་བརྗོད་མཐར་ཕྱིན་བསམ་གཏན་དང་། །རྫས་སོགས་རྟེན་འབྲེལ་འཁྲུལ་འཁོར་རིམ་པ་ལ། །བརྟེན་ནས་ཞི་སོགས་རབ་འབྱམས་ཀུན་འགྲུབ་པའི། །ལས་ཀྱི་རྒྱལ་པོ་མཆོག་ནི་འགྲུབ་པར་ཤོག །ཟབ་ལམ་རིམ་པ་ལྔ་ཡི་གནད་ཀྱི་དོན། །མ་ལུས་བསྡུས་པ་རྣལ་འབྱོར་རྣམ་པ་བཞི། །སྤྱོད་པ་གསུམ་དང་བཅས་པའི་ལམ་བཟང་གིས། །སྐུ་གསུམ་གོ་འཕང་ཚེ་འདིར་ཐོབ་པར་ཤོག །སྤྲུལ་པའི་འཁོར་ལོར་འདོད་ལྷ་ཡབ་ཡུམ་ལ། །སེམས་གཞོལ་རྗེས་གཞིག་སྡུད་རིམ་མཆོག་གིས་ནི། །ཟླ་ཉིའི་རྒྱུ་བ་སྒྲ་གཅན་ལམ་བཀག་པས། །ཡས་བབས་མས་བརྟན་དགའ་བཞི་སྐྱེ་བར་ཤོག །ཆོས་ཀྱི་འཁོར་ལོར་སྔགས་ཀྱི་རྣལ་འབྱོར་མཆོག །བུམ་པ་ཅན་དང་རྡོ་རྗེའི་བཟླས་པ་ཡིས། །སྙིང་གའི་རྩ་མདུད་མ་ལུས་གྲོལ་བྱས་ནས། །ལྷན་སྐྱེས་བདེ་བས་ཡིད་ལ་མྱོས་ཐོབ་ཤོག །སླར་ཡང་བྱིན་གྱིས་བརླབས་པའི་རྣལ་འབྱོར་གྱིས། །ནང་གི་རྗེས་གཞིག་བསམ་གཏན་རིམ་པ་དང་། །ཕྱག་རྒྱ་གཉིས་དང་སྦྱོར་བའི་ཐབས་མཁས་ལས། །སེམས་དབེན་མཐར་ཐུག་ཏིང་འཛིན་འདྲེན་པར་ཤོག །འཆི་རིམ་ཇི་བཞིན་རླུང་རྣམ་མ་ལུས་པ། །སྙིང་གར་ཐིམ་པའི་འོད་གསལ་དེ་ཉིད་ལས། །དབྱིབས་ཀྱི་རྣལ་འབྱོར་མཚན་དཔེའི་དྲ་བ་ཅན། །སྒྱུ་མ་ལྟ་བུའི་ཏིང་འཛིན་རྫོགས་པར་ཤོག །དབང་བོའི་གཞུ་ལྟར་དྭངས་པའི་སྐུ་དེ་ཉིད། །ནམ་མཁའི་དབྱིངས་སུ་ཆུ་འཛིན་ཞུ་བ་བཞིན། །སྦྱངས་པའི་རྣམ་དག་ཡེ་ཤེས་རྣལ་འབྱོར་གྱིས། །བདེན་པར་འཛིན་པའི་ས་བོན་དྲུངས་འབྱིན་ཤོག །དོན་གྱི་ལྷན་ཅིག་སྐྱེས་པ་དེ་ཉིད་ལས། །མཚན་དཔེས་བརྒྱན་པའི་ཡོངས་སུ་དག་པའི་སྐུ། །དོན་དམ་འོད་གསལ་ཐུགས་དང་མཉམ་སྦྱོར་བའི། །ཟུང་དུ་འཇུག་པའི་རྣལ་འབྱོར་མཆོག་གྲུབ་ཤོག །ནམ་མཁའ་ཇི་སྲིད་སྐུ་ལྔའི་བདག་ཉིད་ཅན། །ཁ་སྦྱོར་བདུན་ལྡན་གོ་འཕང་མངོན་གྱུར་ནས། །མཐའ་དག་འགྲོ་འདི་གོ་འཕང་དེ་ཉིད་ལ། །སྐད་ཅིག་ཉིད་ལ་བདེ་བླག་འགོད་པར་ཤོག  །ཅེས་པ་འདི་ནི་རྗེ་ཙོང་ཁ་པ་བློ་བཟང་གྲགས་པས་མཛད་པའོ༎");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			jiuxiemolanl.setTextSize(35);
			break;
		case R.id.zhun:
			jiuxiemolanl.setTextSize(25);
			break;
		case R.id.xiao:
			jiuxiemolanl.setTextSize(18);
			break;
		case R.id.muzhi:
			jiuxiemolanl.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			jiuxiemolanl.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			jiuxiemolanl.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			jiuxiemolanl.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			jiuxiemolanl.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			jiuxiemolanl.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			jiuxiemolanl.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			jiuxiemolanl.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			jiuxiemolanl.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			jiuxiemolanl.setTextColor(Color.BLUE);
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
