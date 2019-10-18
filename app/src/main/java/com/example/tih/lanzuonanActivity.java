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

public class lanzuonanActivity extends Activity{
    private TextView lanzuonanl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lanzuonanmain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		lanzuonanl = (TextView)findViewById(R.id.lanzuonanl);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		lanzuonanl.setTypeface (face);
		lanzuonanl.setBackgroundColor(Color.BLACK);
		lanzuonanl.setTextColor(Color.WHITE);
		lanzuonanl.setMovementMethod(ScrollingMovementMethod.getInstance());
		lanzuonanl.setText("༄༅། །རྗེ་བཙུན་བླ་མ་རྣམས་ལ་ཕྱག་འཚལ་ལོ། །རྒྱལ་བའི་གསུང་རབ་ཀུན་གྱི་སྙིང་པོའི་དོན། །རྒྱལ་སྲས་དམ་པ་རྣམས་ཀྱིས་བསྔགས་པའི་ལམ། །སྐལ་ལྡན་ཐར་འདོད་རྣམས་ཀྱི་འཇུག་ངོགས་དེ། །ཇི་ལྟར་ནུས་བཞིན་བདག་གིས་བཤད་པར་བྱ། །གང་དག་སྲིད་པའི་བདེ་ལ་མ་ཆགས་ཤིང་། །དལ་འབྱོར་དོན་ཡོད་བྱ་ཕྱིར་བརྩོན་པ་ཡིས། །རྒྱལ་བ་དགྱེས་པའི་ལམ་ལ་ཡིད་རྟོན་པའི། །སྐལ་ལྡན་དེ་དག་དང་བའི་ཡིད་ཀྱིས་ཉོན། །རྣམ་དག་ངེས་འབྱུང་མེད་པར་སྲིད་མཚོ་ཡི། །བདེ་འབྲས་དོན་གཉེར་ཞི་བའི་ཐབས་མེད་ལ། །སྲིད་ལ་བརྐམ་པ་ཡིས་ཀྱང་ལུས་ཅན་རྣམས། །ཀུན་ནས་འཆིང་ཕྱིར་ཐོག་མར་ངེས་འབྱུང་བཙལ། །དལ་འབྱོར་རྙེད་དཀའ་ཚེ་ལ་ལོང་མེད་པ། །ཡིད་ལ་གོམས་པས་ཚེ་འདིའི་སྣང་ཤས་ལྡོག །ལས་འབྲས་མི་བསླུ་འཁོར་བའི་སྡུག་བསྔལ་རྣམས། །ཡང་ཡང་བསམ་པས་ཕྱི་མའི་སྣང་ཤས་ལྡོག །དེ་ལྟར་གོམས་པས་འཁོར་བའི་ཕུན་ཚོགས་ལ། །ཡིད་སྨོན་སྐད་ཅིག་ཙམ་ཡང་མི་སྐྱེ་ཞིང་། །ཉིན་མཚན་ཀུན་ཏུ་ཐར་པ་དོན་གཉེར་བློ། །བྱུང་ན་དེ་ཚེ་ངེས་འབྱུང་སྐྱེས་པ་ལགས། །ངེས་འབྱུང་དེ་ཡང་རྣམ་དག་སེམས་བསྐྱེད་ཀྱིས། །ཟིན་པ་མེད་ན་བླ་མེད་བྱང་ཆུབ་ཀྱི། །ཕུན་ཚོགས་བདེ་བའི་རྒྱུ་རུ་མི་འགྱུར་བས། །བློ་ལྡན་རྣམས་ཀྱིས་བྱང་ཆུབ་སེམས་མཆོག་བསྐྱེད། །ཤུགས་དྲག་ཆུ་བོ་བཞི་ཡི་རྒྱུན་གྱིས་ཁྱེར། །བཟློག་དཀའ་ལས་ཀྱི་འཆིང་བ་དམ་པོས་བསྡམས། །བདག་འཛིན་ལྕགས་ཀྱི་དྲ་བའི་སྦུབས་སུ་ཚུད། །མ་རིག་མུན་པའི་སྨག་ཆེན་ཀུན་ནས་འཐིབས། །མུ་མེད་སྲིད་པར་སྐྱེ་ཞིང་སྐྱེ་བ་རུ། །སྡུག་བསྔལ་གསུམ་གྱིས་རྒྱུན་ཆད་མེད་པར་མནར། །གནས་སྐབས་འདི་འདྲར་གྱུར་བའི་མ་རྣམས་ཀྱི། །ངང་ཚུལ་བསམས་ནས་སེམས་མཆོག་བསྐྱེད་པར་མཛོད། །གནས་ལུགས་རྟོགས་པའི་ཤེས་རབ་མི་ལྡན་ན། །ངེས་འབྱུང་བྱང་ཆུབ་སེམས་ལ་གོམས་བྱས་ཀྱང་། །སྲིད་པའི་རྩ་བ་གཅོད་པར་མི་ནུས་པས། །དེ་ཕྱིར་རྟེན་འབྲེལ་རྟོགས་པའི་ཐབས་ལ་འབད། །གང་ཞིག་འཁོར་འདས་ཆོས་རྣམས་ཐམས་ཅད་ཀྱི། །རྒྱུ་འབྲས་ནམ་ཡང་བསླུ་བ་མེད་མཐོང་ཞིང་། །དམིགས་པའི་གཏད་སོ་གང་ཡིན་ཀུན་ཞིག་པ། །དེ་ནི་སངས་རྒྱས་དགྱེས་པའི་ལམ་ལ་ཞུགས། །སྣང་བ་རྟེན་འབྲེལ་བསླུ་བ་མེད་པ་དང་། །སྟོང་པ་ཁས་ལེན་བྲལ་བའི་གོ་བ་གཉིས། །ཇི་སྲིད་སོ་སོར་སྣང་བ་དེ་སྲིད་དུ། །ད་དུང་ཐུབ་པའི་དགོངས་པ་རྟོགས་པ་མེད། །ནམ་ཞིག་རེས་འཇོག་མེད་པར་ཅིག་ཅར་དུ། །རྟེན་འབྲེལ་མི་བསླུར་མཐོང་བ་ཙམ་ཉིད་ནས། །ངེས་ཤེས་ཡུལ་གྱི་འཛིན་སྟངས་ཀུན་ཞི་ན། །དེ་ཚེ་ལྟ་བའི་དཔྱད་པ་རྫོགས་པ་ལགས། །གཞན་ཡང་སྣང་བས་ཡོད་མཐའ་སེལ་བ་དང་། །སྟོང་པས་མེད་མཐའ་སེལ་ཞིང་སྟོང་པ་ཉིད། །རྒྱུ་དང་འབྲས་བུར་འཆར་བའི་ཚུལ་ཤེས་ན། །མཐར་འཛིན་ལྟ་བས་འཕྲོག་པར་མི་འགྱུར་རོ། །དེ་ལྟར་ལམ་གྱི་གཙོ་བོ་རྣམ་གསུམ་གྱི། །གནད་རྣམས་རང་གིས་ཇི་བཞིན་རྟོགས་པའི་ཚེ། །དབེན་པ་བསྟེན་ཏེ་བརྩོན་འགྲུས་སྟོབས་བསྐྱེད་ནས། །གཏན་གྱི་འདུན་མ་མྱུར་དུ་སྒྲུབས་ཤིག་བུ། །ཞེས་པ་འདི་ནི་མང་ཏུ་ཐོས་པའི་དགེ་སློང་བློ་བཟང་གྲགས་པའི་དཔལ་གྱིས་ཚ་ཁོ་དཔོན་པོ་ངག་དབང་གྲགས་པ་ལ་གདམས་པའོ། །");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			lanzuonanl.setTextSize(35);
			break;
		case R.id.zhun:
			lanzuonanl.setTextSize(25);
			break;
		case R.id.xiao:
			lanzuonanl.setTextSize(18);
			break;
		case R.id.muzhi:
			lanzuonanl.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			lanzuonanl.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			lanzuonanl.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			lanzuonanl.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			lanzuonanl.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			lanzuonanl.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			lanzuonanl.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			lanzuonanl.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			lanzuonanl.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			lanzuonanl.setTextColor(Color.BLUE);
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
