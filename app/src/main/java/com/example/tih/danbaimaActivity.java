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

public class danbaimaActivity extends Activity{
private TextView danbaimal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.danbaimamain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		danbaimal = (TextView)findViewById(R.id.danbaimal);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		danbaimal.setTypeface (face);
		danbaimal.setTextColor(Color.WHITE); 
		danbaimal.setBackgroundColor(Color.BLACK);
		danbaimal.setMovementMethod(ScrollingMovementMethod.getInstance());
		danbaimal.setText("༄༅། །སངས་རྒྱས་རྣམ་གཟིགས་གཙུག་ཏོར་ཐམས་ཅད་སྐྱོབ། །འཁོར་བ་འཇིག་དང་གསེར་ཐུབ་འོད་སྲུང་དང། །ཤཱཀྱ་ཐུབ་པ་གོའུ་ཏཾ་ལྷ་ཡི་ལྷ། །སངས་རྒྱས་དཔའ་བོ་བདུན་ལ་ཕྱག་འཚལ་ལོ། །སེམས་ཅན་དོན་དུ་བདག་གིས་སྔོན། །དཀའ་བ་གང་ཞིག་སྤྱད་གྱུར་དང་། །བདག་གི་བདེ་བ་བཏང་བ་ཡིས། །བསྟན་པ་ཡུན་རིང་འབར་གྱུར་ཅིག །ངས་སྔོན་ནད་པའི་ཆེད་དག་ཏུ། །རང་གི་འཚོ་བ་ཡོངས་བཏང་བས། །སེམས་ཅན་ཕོངས་པ་བསྐྱབ་པའི་ཕྱིར། །ཡུན་རིང་བསྟན་པ་འབར་གྱུར་ཅིག །བུ་དང་བུ་མོ་ཆུང་མ་དང་། །ནོར་དང་གླང་ཆེན་ཤིང་རྟ་དང་། །རིན་ཆེན་བྱང་ཆུབ་ཕྱིར་བཏང་བས། །བསྟན་པ་ཡུན་རིང་འབར་གྱུར་ཅིག །བདག་གིས་སངས་རྒྱས་རང་སངས་རྒྱས། །ཉན་ཐོས་ཕ་དང་མ་དང་ནི། །དྲང་སྲོང་དག་ལ་མཆོད་བྱས་པས། །བསྟན་པ་ཡུན་རིང་འབར་གྱུར་ཅིག། །བསྐལ་པ་བྱེ་བ་དུ་མར་བདག །སྡུག་བསྔལ་སྣ་ཚོགས་མྱོང་གྱུར་ཅིང་། །བྱང་ཆུབ་དོན་དུ་ཐོས་བཙལ་པས། །བསྟན་པ་ཡུན་རིང་འབར་གྱུར་ཅིག །བདག་གིས་ཚུལ་ཁྲིམས་བརྟུལ་ཞུགས་དང་། །དཀའ་ཐུབ་ཡུན་རིང་བསྟེན་བྱས་ཤིང་། །ཕྱོགས་བཅུའི་སངས་རྒྱས་ངས་མཆོད་པས། །བསྟན་པ་ཡུན་རིང་འབར་གྱུར་ཅིག །བདག་སྔོན་བརྩོན་འགྲུས་དང་ལྡན་པས། །རྟག་ཏུ་བརྟན་ཅིང་ཕ་རོལ་གནོན། །སེམས་ཅན་ཐམས་ཅད་བསྒྲལ་དོན་དུ། །བདག་བསྟན་ཡུན་རིང་འབར་གྱུར་ཅིག །བཟོད་བརྟུལ་རྟག་ཏུ་བསྟེན་བྱས་ཤིང་། །སེམས་ཅན་ཉོན་མོངས་སྙིགས་མ་ཡི། །སེམས་ཅན་ངན་བཟོད་བྱས་གྱུར་པས། །བསྟན་པ་ཡུན་རིང་འབར་གྱུར་ཅིག །བསམ་གཏན་རྣམ་ཐར་གཟུགས་མེད་དང་། །ཏིང་འཛིན་གང་གཱའི་བྱེ་སྙེད་པ། །བསྒོམས་པས་དེ་མཐུས་བདག་གི་ནི། །བསྟན་པ་ཡུན་རིང་འབར་གྱུར་ཅིག །ཡེ་ཤེས་དོན་དུ་བདག་གིས་སྔོན། །དཀའ་ཐུབ་ནགས་དག་བསྟེན་བྱས་ཤིང་། །བསྟན་བཅོས་དུ་མ་ཉེར་བསྟེན་པས། །བདག་གི་བསྟན་པ་འབར་གྱུར་ཅིག །བརྩེ་བའི་རྒྱུ་ཡིས་ཤ་ཁྲག་དང་། །འཚོ་བ་ཡོངས་སུ་བཏང་གྱུར་ཅིང་། །ཡན་ལག་ཉིང་ལག་བཏང་བ་ཡིས། །ཆོས་ཚུལ་རྣམ་པར་འཕེལ་གྱུར་ཅིག །བདག་སྔོན་སྡིག་པའི་སེམས་ཅན་རྣམས། །བྱམས་པས་གསལ་བར་སྨིན་བྱས་ཤིང་། །ཐེག་པ་གསུམ་ལ་རབ་བཀོད་པས། །ཆོས་ཀྱི་མཆོད་སྦྱིན་རྒྱས་ཅིག །བདག་སྔོན་ཐབས་ཤེས་གྱུར་པ་ན། །སེམས་ཅན་ལྟ་ངན་ལས་བསྒྲལ་ཅིང་། །ཡང་དག་ལྟ་ལ་བཀོད་བྱས་པས། །ཆོས་ནི་རྣམ་པར་འཕེལ་འགྱུར་ཅིག །བདག་གིས་སེམས་ཅན་བསྡུ་དངོས་བཞིས། །ཉོན་མོངས་མེ་ལས་ཐར་བྱས་ཤིང་། །བདག་གིས་འཕེལ་སྡིག་ཕམ་བྱས་པས། །བདག་འཁོར་ཡུན་རིང་གནས་གྱུར་ཅིག །བདག་གིས་མུ་སྟེགས་ཅན་གཞན་དག །ལྟ་བའི་ཆུ་ལས་བསྒྲལ་བྱས་ཏེ། །ཡང་དག་ལྟ་ལ་བཀོད་གྱུར་པས། །བདག་འཁོར་རྟག་ཏུ་གུས་གྱུར་ཅིག །ཡུན་རིང་བསྟན་པ་འབར་གྱུར་ཅིག  །ཆོས་ཀྱི་རྒྱལ་པོ་ཙོང་ཁ་བའི། །ཆོས་ཚུལ་རྣམ་པར་འཕེལ་བ་དང་། །འགལ་རྐྱེན་མཚན་མ་ཞི་བ་དང་། །མཐུན་རྐྱེན་མ་ལུས་ཚང་བར་ཤོག །བདག་དང་གཞན་གྱི་དུས་གསུམ་དང་། །འབྲེལ་བའི་ཚོགས་གཉིས་ལ་བརྟེན་ནས། །རྒྱལ་བ་བློ་བཟང་གྲགས་པ་ཡི། །བསྟན་པ་ཡུན་རིང་འབར་གྱུར་ཅིག།  །།སརྦ་མངྒ་ལཾ། །   ༼རོང་བོའི་ཤིང་པར་ལ་བསྟུན་ཡོད།༽");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			danbaimal.setTextSize(35);
			break;
		case R.id.zhun:
			danbaimal.setTextSize(25);
			break;
		case R.id.xiao:
			danbaimal.setTextSize(18);
			break;
		case R.id.muzhi:
			danbaimal.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			danbaimal.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			danbaimal.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			danbaimal.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			danbaimal.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			danbaimal.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			danbaimal.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			danbaimal.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			danbaimal.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			danbaimal.setTextColor(Color.BLUE);
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
