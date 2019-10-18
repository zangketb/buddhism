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

public class genremolanActivity extends Activity{
private TextView genremolanl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.genremolanmain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		genremolanl = (TextView)findViewById(R.id.genremolanl);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		genremolanl.setTypeface (face);
		genremolanl.setBackgroundColor(Color.BLACK);
		genremolanl.setTextColor(Color.WHITE);
		genremolanl.setMovementMethod(ScrollingMovementMethod.getInstance());
		genremolanl.setText("༄༅། །དེ་ལྟར་སྣང་སྟོང་ཚོགས་པའི་རོལ་པ་ལས། །ངན་སོང་སྦྱོང་བའི་མཆོག་གྱུར་དཀྱིལ་འཁོར་པ། །བསྒོམ་བཟླས་མཆོད་བསྟོད་བསྒྲུབས་པའི་རྣམ་དཀར་ཚོགས། །མི་ཁོམ་གནས་ཀུན་སྟོངས་པའི་རྒྱུ་རུ་བསྔོ། །དེ་ཡི་མཐུ་ལས་བདག་གཞན་འགྲོ་བ་རྣམས། །དལ་འབྱོར་རྟེན་ཐོབ་དམ་པའི་མགོན་གྱིས་བཟུང་། །ཐུན་མོང་ལམ་སྦྱངས་དབང་གིས་རྒྱུད་སྨིན་ཅིང་། །དམ་ཚིག་སྡོམ་པ་ཚུལ་བཞིན་བསྲུང་བར་ཤོག  །དེ་ནས་རྡོ་རྗེ་འཛིན་པའི་དེད་དཔོན་ལ། །བརྟེན་ནས་དཔལ་ལྡན་དེ་ཉིད་བསྡུས་པ་སོགས། །རྣལ་འབྱོར་རྒྱུད་རྒྱལ་རྒྱ་མཚོའི་མཐར་སོན་ནས། །རྣམ་གྲོལ་ནོར་བུའི་གླིང་དུ་བགྲོད་པར་ཤོག །ཚོགས་གཉིས་མྱུར་དུ་རྫོགས་པའི་ཐབས་མཁས་མཆོག །སྨྲ་བྱེད་ལྕེ་དང་ལག་སོགས་བྱིན་བརླབས་པས། །བཟླས་བརྗོད་ཕྱག་རྒྱ་འཆིང་ལ་སོགས་པ་ཡི། །ལུས་ངག་རིག་བྱེད་མཐུ་དང་ལྡན་པར་ཤོག  །འཇིག་རྟེན་གསུམ་རྒྱལ་ཁྲོ་བོའི་དབང་པོ་ཡིས། །བགེགས་རྣམས་བསྣུན་བསྲེགས་བཅིངས་ནས་ཚར་བཅད་དེ། །བདག་དང་གནས་སོགས་སྲུང་བའི་རྣལ་འབྱོར་གྱིས། །ལམ་བཟང་བསྒྲུབ་ལ་བར་ཆད་མེད་པར་ཤོག །ཕུལ་བྱུང་ཞིང་གི་མཆོག་ལ་ཚོགས་བསགས་པས། །རང་གི་རྒྱུད་ནི་ཡོངས་སུ་སྨིན་པ་དང་། །རིགས་ལྔའི་ལྷ་དང་ལྷ་མོའི་ཕྱག་རྒྱ་རྣམས། །ལེགས་པར་འཆིང་དང་འགྲོལ་ལ་དབང་བར་ཤོག  །ཉི་ཟླའི་འོད་འབར་ཕྱི་ནང་ཕོ་བྲང་ཆེ། །བསྒོམས་པས་གང་དུ་འཚང་རྒྱའི་ཞིང་སྦྱངས་ནས། །ཡེ་ཤེས་རང་བཞིན་གཞལ་ཡས་ཁང་འགྲུབ་པའི། །དགེ་བའི་རྩ་བ་ཡོངས་སུ་སྨིན་པར་ཤོག  །དེར་ནི་སྒོ་གསུམ་དྲི་མ་དག་བྱེད་པ། །ཆོ་ག་གསུམ་གྱི་རིམ་པའི་ཉམས་ལེན་གྱིས། །རྣམ་པར་སྣང་མཛད་མངོན་དུ་བྱེད་པའི་ཐབས། །དང་པོ་སྦྱོར་ཏིང་འཛིན་རྫོགས་པར་ཤོག །བཅོམ་ལྡན་ཚངས་བ་ཆེན་པོ་པདྨ་ལ། །བཞུགས་བཞིན་ངན་སོང་སྦྱོང་བའི་རྣམ་འཕྲུལ་བརྒྱས། །མགོན་མེད་ཉམ་ཐག་མ་ལུས་དབུགས་དབྱུང་སྟེ། །མཆོད་ཅིང་ཆེད་དུ་བརྗོད་པས་བསྔགས་པར་ཤོག  །སླར་ཡང་འཁོར་ལོའི་མགོན་པོས་མངོན་སྤྲུལ་པའི། །དཀྱིལ་འཁོར་རྒྱལ་མཆོག་ཡོངས་སུ་རྫོགས་པ་དང་། །ཕྱག་རྒྱ་བཞི་ཡིས་ལེགས་པར་རྒྱས་བཏབ་པས། །སྒོ་གསུམ་བྱ་བའི་དྲི་མ་འཁྲུད་པར་ཤོག །མ་དག་སྤྱི་དང་ངན་སོང་གསུམ་སྦྱོང་བའི། །འཕྲིན་ལས་རྒྱལ་མཆོག་ཕུན་སུམ་ཚོགས་པ་དང་། །རགས་དང་ཕྲ་མོའི་ཏིང་འཛིན་མཐར་ཕྱིན་ནས། །མཚན་མེད་རྣལ་འབྱོར་བསྒོམ་ལ་བརྩོན་པར་ཤོག  །ལྷ་དང་སྔགས་ཀྱི་དེ་ཉིད་ལ་དམིགས་པ། །ཤེས་རབ་སྤྲོས་དང་བྲལ་བའི་ཉམས་ལེན་གྱིས། །འཁྲུལ་བའི་བག་ཆགས་མ་ལུས་དྲུངས་ཕྱུང་ནས། །གཞན་དོན་ཕུན་ཚོགས་འཕྲིན་ལས་འགྲུབ་པར་ཤོག  །ཁྱད་པར་སྤྱན་སྟོང་མངའ་བའི་ལེགས་བྲིས་སྲས། །ནོར་བུ་དྲི་མ་མེད་པ་དབུགས་དབྱུང་ལྟར། །འདིར་སྣང་འགགས་པ་བར་དོའི་འགྲོ་བ་རྣམས། །ལམ་འདིས་རྗེས་སུ་འཛིན་ལ་མཐུ་ལྡན་ཤོག  །བདུད་དང་གཤིན་རྗེས་ཟིན་པའི་རྣམ་ཤེས་དེ། །སྔགས་དང་ཏིང་འཛིན་ཕྱག་རྒྱས་བཀུག་ནས་ཀྱང་། །བགེགས་སྡིག་དྲི་མ་མ་ལུས་སྦྱངས་བྱས་ཏེ། །ཕུན་ཚོགས་བདེ་འགྲོའི་རྟེན་ལ་འགོད་པར་ཤོག །རླུང་སེམས་ལུས་ཅན་འཛིན་པའི་སྐྱབས་མེད་རྣམས། །དཔལ་ལྡན་ཐམས་ཅད་རིག་པའི་དཀྱིལ་འཁོར་དུ། །བཅུག་ནས་དབང་བསྐུར་ལམ་བསྟན་སྦྱངས་བྱས་ཏེ། །དག་པའི་ཞིང་ཁམས་མཆོག་ཏུ་འདྲེན་པར་ཤོག །མདོར་ན་རང་གཞན་དོན་གཉིས་བསྒྲུབ་པ་ཡི། །ཐབས་མཁས་སྤྱོད་པ་ཡོངས་སུ་རྫོགས་བྱས་ནས། །ངན་སོང་གསུམ་སོགས་ཉམ་ཐག་འགྲོ་བ་ཀུན། །སྒྲོལ་ལ་རྣམ་སྣང་ཆེན་པོར་བདག་གྱུར་ཅིག །ཀུན་རིག་སྨོན་ལམ་རྫོགས་སོ།།");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			genremolanl.setTextSize(35);
			break;
		case R.id.zhun:
			genremolanl.setTextSize(25);
			break;
		case R.id.xiao:
			genremolanl.setTextSize(18);
			break;
		case R.id.muzhi:
			genremolanl.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			genremolanl.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			genremolanl.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			genremolanl.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			genremolanl.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			genremolanl.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			genremolanl.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			genremolanl.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			genremolanl.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			genremolanl.setTextColor(Color.BLUE);
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
