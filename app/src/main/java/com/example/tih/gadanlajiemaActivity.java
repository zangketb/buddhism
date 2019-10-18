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

public class gadanlajiemaActivity extends Activity{
    private TextView gadanlajiemal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gadanlajiemamain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		gadanlajiemal=(TextView)findViewById(R.id.gadanlajiemal);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		gadanlajiemal.setTypeface (face);
		gadanlajiemal.setBackgroundColor(Color.BLACK);
		gadanlajiemal.setTextColor(Color.WHITE);
		gadanlajiemal.setMovementMethod(ScrollingMovementMethod.getInstance());
		gadanlajiemal.setText("༄༅། ། ན་མོ་གུ་རུ་མཉྫུ་གྷོ་ཥཱ་ཡ། དགའ་ལྡན་ལྷ་བརྒྱའི་མགོན་གྱི་ཐུགས་ཀ་ནས། །རབ་དཀར་ཞོ་གསར་སྤུངས་འདྲའི་ཆུ་འཛིན་རྩེར། །ཆོས་ཀྱི་རྒྱལ་པོ་ཀུན་མཁྱེན་བློ་བཟང་གྲགས། །སྲས་དང་བཅས་པ་གནས་འདིར་གཤེགས་སུ་གསོལ། །མདུན་གྱི་ནམ་མཁར་སེང་ཁྲི་པད་ཟླའི་སྟེང་། །རྗེ་བཙུན་བླ་མ་དགྱེས་པའི་འཛུམ་དཀར་ཅན། །བདག་བློ་དད་པའི་བསོད་ནམས་ཞིང་མཆོག་ཏུ། །བསྟན་པ་རྒྱས་ཕྱིར་བསྐལ་བརྒྱར་བཞུགས་སུ་གསོལ། །ཤེས་བྱའི་ཁྱོན་ཀུན་འཇལ་བའི་བློ་གྲོས་ཐུགས། །སྐལ་བཟང་རྣ་བའི་རྒྱན་གྱུར་ལེགས་བཤད་གསུང་། །གྲགས་པའི་དཔལ་གྱིས་ལྷམ་མེར་མཛེས་པའི་སྐུ། །མཐོང་ཐོས་དྲན་པ་དོན་ལྡན་ལ་ཕྱག་འཚལ། །ཡིད་འོང་མཆོད་ཡོན་སྣ་ཚོགས་མེ་ཏོག་དང་། །དྲི་ཞིམ་བདུག་སྤོས་སྣང་གསལ་དྲི་ཆབ་སོགས། །དངོས་བཤམས་ཡིད་སྤྲུལ་མཆོད་སྤྲིན་རྒྱ་མཚོ་འདི། །བསོད་ནམས་ཞིང་མཆོག་ཁྱེད་ལ་མཆོད་པར་འབུལ། །གང་ཞིག་ཐོག་མེད་དུས་ནས་བསགས་པ་ཡི། །ལུས་ངག་ཡིད་ཀྱིས་མི་དགེ་ཅི་བགྱིས་དང་། །ཁྱད་པར་སྡོམ་པ་གསུམ་གྱི་མི་མཐུན་ཕྱོགས། །སྙིང་ནས་འགྱོད་པ་དྲག་པོས་སོ་སོར་བཤགས། །སྙིགས་མའི་དུས་འདིར་མང་ཐོས་སྒྲུབ་ལ་བརྩོན། །ཆོས་བརྒྱད་སྤངས་པས་དལ་འབྱོར་དོན་ཡོད་བྱས། །མགོན་པོ་ཁྱོད་ཀྱི་རླབས་ཆེན་མཛད་པ་ལ། །བདག་ཅག་བསམ་པ་ཐག་པས་ཡི་རང་ངོ་། །རྗེ་བཙུན་བླ་མ་དམ་པ་ཁྱེད་རྣམས་ཀྱི། །ཆོས་སྐུའི་མཁའ་ལ་མཁྱེན་བརྩེའི་ཆུ་འཛིན་འཁྲིགས། །ཇི་ལྟར་འཚམ་པའི་གདུལ་བྱའི་འཛིན་མ་ལ། །ལྷུན་གྲུབ་ཆོས་ཀྱི་ཆར་བ་དབབ་དུ་གསོལ། །བདག་གིས་ཇི་སྙེད་བསགས་པའི་དགེ་བ་འདིས། །བསྟན་དང་འགྲོ་བ་ཀུན་ལ་གང་ཕན་དང་། །ཁྱད་པར་རྗེ་བཙུན་བློ་བཟང་གྲགས་པ་ཡི། །བསྟན་པའི་སྙིང་བོ་རིང་དུ་གསལ་བྱེད་ཤོག  །དངོས་གྲུབ་ཀུན་འབྱུང་ཐུབ་དབང་རྡོ་རྗེ་འཆང་། །དམིགས་མེད་བརྩེ་བའི་གཏེར་ཆེན་སྤྱན་རས་གཟིགས། །དྲི་མེད་མཁྱེན་པའི་དབང་བོ་འཇམ་པའི་དབྱངས། །བདུད་དཔུང་མ་ལུས་འཇོམས་མཛད་གསང་བའི་བདག  །གངས་ཅན་མཁས་པའི་གཙུག་རྒྱན་བློ་བཟང་གྲགས། །སྐྱབས་གསུམ་ཀུན་འདུས་བླ་མ་སངས་རྒྱས་ལ། །སྒོ་གསུམ་གུས་པའི་སྒོ་ནས་གསོལ་བ་འདེབས། །རང་གཞན་སྨིན་ཅིང་གྲོལ་བར་བྱིན་གྱིས་རློབས། །མཆོག་དང་ཐུན་མོང་དངོས་གྲུབ་བསྩལ་དུ་གསོལ། ། ཅེས་པ་དང་། དམིགས་མེད་བརྩེ་བའི་གཏེར་ཆེན་སྤྱན་རས་གཟིགས། །དྲི་མེད་མཁྱེན་པའི་དབང་བོ་འཇམ་པའི་དབྱངས། །བདུད་དཔུང་མ་ལུས་འཇོམས་མཛད་གསང་བའི་བདག  །གངས་ཅན་མཁས་པའི་གཙུག་རྒྱན་ཙོང་ཁ་པ། །བློ་བཟང་གྲགས་པའི་ཞབས་ལ་གསོལ་བ་འདེབས། །ཞེས་བརྒྱ་སྟོང་ལ་སོགས་པ་བརྗོད། །དེ་ནས་སྐྱབས་གནས་ཀུན་འདུས་ཆོས་ཀྱི་རྒྱལ་པོ་ཙོང་ཁ་པ་ཆེན་པོ་ལ་གསོལ་བ་འདེབས་སོ། །བདག་གི་ལུས་ངག་ཡིད་གསུམ་བྱིན་གྱིས་རློབས་ཤིག བཅོས་མ་མ་ཡིན་པའི་ངེས་འབྱུང་གི་བསམ་པས་རྒྱུད་བསྐུལ་ནས་བྱམས་སྙིང་རྗེ་བྱང་ཆུབ་ཀྱི་སེམས་དང་། ཟབ་མོ་དབུ་མའི་ལྟ་བ་དང་ལམ་རིམ་པ་གཉིས་ཀྱི་རྣལ་འབྱོར་ཟབ་མོ་ཉམས་སུ་ལེན་ནུས་པར་བྱིན་གྱིས་རློབས་ཤིག དེ་ལྟར་ཉམས་སུ་བླངས་པའི་ཆོས་ལམ་དུ་སོང་སྟེ་མཁའ་མཉམ་སེམས་ཅན་ཀུན་གྱི་དོན་དུ་སངས་རྒྱས་ཀྱི་གོ་འཕང་ཐོབ་པར་བྱིན་གྱིས་རློབས་ཤིག མདོར་ན་ཚེ་རབས་ཐམས་ཅད་དུ་རྗེ་བཙུན་ཙོང་ཁ་པ་ཆེན་པོས་རྗེས་སུ་བཟུང་ནས། རང་གཞན་གྱི་དོན་རྒྱ་ཆེན་པོ་བསྒྲུབ་ནུས་པར་བྱིན་གྱིས་བརླབ་ཏུ་གསོལ། དཔལ་ལྡན་རྩ་བའི་བླ་མ་རིན་པོ་ཆེ། །བདག་གི་སྙིང་ཁར་པདྨའི་སྟེང་བཞུགས་ལ། །བཀའ་དྲིན་ཆེན་པོའི་སྒོ་ནས་རྗེས་བཟུང་སྟེ། །སྐུ་གསུང་ཐུགས་ཀྱི་དངོས་གྲུབ་བསྩལ་དུ་གསོལ། །ཚེ་རབས་ཀུན་ཏུ་རྒྱལ་བ་ཙོང་ཁ་པས། །ཐེག་མཆོག་བཤེས་གཉེན་དངོས་སུ་མཛད་པའི་མཐུས། །རྒྱལ་བས་བསྔགས་པའི་ལམ་བཟང་དེ་ཉིད་ལས། །སྐད་ཅིག་ཙམ་ཡང་ལྡོག་པར་མ་གྱུར་ཅིག །ཐེག་མཆོག་ལམ་གྱི་གཞུང་ཤིང་བྱང་ཆུབ་སེམས། །ཡང་དག་ལྟ་བའི་གནད་དང་རིམ་གཉིས་ལ། །འཁྲུལ་མེད་ངེས་པ་རྙེད་ནས་བརྩོན་པ་ཡིས། །ཁྱེད་གསུང་སྒྲུབ་པ་སྙིང་བོར་བྱེད་པར་ཤོག །སྡེ་སྣོད་གསུམ་དང་རྒྱུད་སྡེ་རྣམ་པ་བཞི། །གདམས་པའི་མཆོག་ཏུ་གཟིགས་པའི་བཤད་སྒྲུབ་ཀྱིས། །ཐུབ་བསྟན་ཕྱོགས་དུས་ཀུན་ཏུ་རྒྱས་མཛད་པ། །བློ་བཟང་གྲགས་པའི་དཔལ་གྱིས་བཀྲ་ཤིས་ཤོག། །།  ");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			gadanlajiemal.setTextSize(35);
			break;
		case R.id.zhun:
			gadanlajiemal.setTextSize(25);
			break;
		case R.id.xiao:
			gadanlajiemal.setTextSize(18);
			break;
		case R.id.muzhi:
			gadanlajiemal.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			gadanlajiemal.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			gadanlajiemal.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			gadanlajiemal.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			gadanlajiemal.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			gadanlajiemal.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			gadanlajiemal.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			gadanlajiemal.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			gadanlajiemal.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			gadanlajiemal.setTextColor(Color.BLUE);
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
