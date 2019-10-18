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

public class sanbajiActivity extends Activity{
private TextView sanbajil;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sanbajimain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		sanbajil = (TextView)findViewById(R.id.sanbajil);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		sanbajil.setTypeface (face);
		sanbajil.setBackgroundColor(Color.BLACK);
		sanbajil.setTextColor(Color.WHITE);
		sanbajil.setMovementMethod(ScrollingMovementMethod.getInstance());
		sanbajil.setText("༄༅། །ཨེ་མ་ཧོ། མཚོ་དབུས་གེ་སར་པད་མའི་སྡོང་པོ་ལ། །སྐུ་ལྔ་ཡེ་ཤེས་ལྷུན་གྱིས་གྲུབ་པའི་ལྷ། །རང་བྱུང་ཆེན་པོ་པད་མ་ཡབ་ཡུམ་ནི། །མཁའ་འགྲོའི་སྤྲིན་ཕུང་འཁྲིགས་ལ་གསོལ་བ་འདེབས། །བསམ་པ་མྱུར་དུ་འགྲུབ་པར་བྱིན་གྱིས་རློབས། །ལས་ངན་སྤྱད་པའི་རྣམ་སྨིན་མཐུས་བསྐྱེད་པའི། །ནད་གདོན་བར་གཅོད་དམག་འཁྲུག་མུ་གེ་སོགས། །ཁྱོད་ཞལ་དྲན་པའི་མོད་ལ་ཟད་བྱེད་པའི། །ཞལ་བཞེས་སྙིང་ནས་བསྐུལ་ལོ་ཨོ་རྒྱན་རྗེ། །བསམ་པ་མྱུར་དུ་འགྲུབ་པར་བྱིན་གྱིས་རློབས། །དད་དང་ཚུལ་ཁྲིམས་གཏོང་ལ་གོམས་པ་དང་། །ཐོས་པས་རྒྱུད་གྲོལ་ཁྲེལ་ཡོད་ངོ་ཚ་ཤེས། །ཤེས་རབ་ཕུན་སུམ་ཚོགས་པའི་ནོར་བདུན་པོ། །སེམས་ཅན་ཀུན་གྱི་རྒྱུད་ལ་རབ་ཞུགས་ནས། །འཇིག་རྟེན་བདེ་སྐྱིད་ལྡན་པར་དབུགས་འབྱིན་མཛོད། །བསམ་པ་མྱུར་དུ་འགྲུབ་པར་བྱིན་གྱིས་རློབས། །གང་ལ་ནད་དང་སྡུག་བསྔལ་མི་འདོད་རྐྱེན། །འབྱུང་བོའི་གདོན་དང་རྒྱལ་པོའི་ཆད་པ་དང་། །མེ་ཆུ་གཅན་གཟན་ལམ་འཕྲང་འཇིགས་པ་ཆེས། །ཚེ་ཡི་ཕ་མཐར་གཏུགས་པའི་གནས་སྐབས་ཀུན། །སྐྱབས་དང་རེ་ས་གཞན་དུ་མ་མཆིས་པས། །ཐུགས་རྗེས་ཟུངས་ཤིག་གུ་རུ་ཨོ་རྒྱན་རྗེ། །བསམ་པ་མྱུར་དུ་འགྲུབ་པར་བྱིན་གྱིས་རློབས།།  །།ཞེས་བོད་ཁམས་ནད་མུག་མཐའ་དག་ཞི་ཞིང་བསྟན་འགྲོའི་བདེ་སྐྱིད་གསོ་བར་ཕན་ན་སྙམ་པ་དད་ལྡན་རྣམས་ཀྱིས་ཐུགས་ལ་གཞུག་ཅེས་པ་འདིའི་ཤློ་ཀ་དང་པོ་ཀུན་མཁྱེན་ཀློང་ཆེན་པའི་མཁའ་འགྲོ་ཡང་ཏིག་གི་རྒྱབ་ཆོས་ཟབ་དོན་རྒྱ་མཚོའི་སྤྲིན་ཕུང་གི་མཆོད་བརྗོད་ལས་འབྱུང་ཞིང་། དེ་ཕྱིན་ཀུན་མཁྱེན་གཉིས་པ་རིག་འཛིན་འཇིགས་མེད་གླིང་པའི་རྡོ་རྗེའི་གསུང་བྱིན་རླབས་ཅན་ནོ། །\nཨོ་རྒྱན་རིན་པོ་ཆེ་ལ་གསོལ་བ་འདེབས། །འགལ་རྐྱེན་བར་ཆད་མི་འབྱུང་ཞིང་། །མཐུན་རྐྱེན་བསམ་པ་འགྲུབ་པ་དང་། །མཆོག་དང་ཐུན་མོང་དངོས་གྲུབ་བསྩལ་ཏུ་གསོལ། །ཅེས་པ་འདི་ནི་གྲུབ་ཆེན་རིན་པོ་ཆེ་འཇིགས་མེད་འཕྲིན་ལས་འོད་ཟེར་མཁའ་སྤྱོད་དཔལ་གྱི་ཙ་རི་དྲར་ཕེབས་སྐབས་སློབ་དཔོན་རིན་པོ་ཆེ་ཞལ་གཟིགས་པའི་དུས་ཐོལ་བྱུང་དུ་གསུང་པའི་གསོལ་འདེབས་བྱིན་རླབས་ཅན་ནོ། ། མངྒལཾ། །\nཨེ་མ་ཧོ། དཀོན་མཆོག་རྩ་གསུམ་བདེ་གཤེགས་ཀུན་འདུས་དཔལ། །སྙིགས་དུས་འགྲོ་བ་མགོན་མེད་སྐྱབས་གཅིག་པུ། །ཐུགས་རྗེའི་གློག་ལྟར་མྱུར་བའི་ཐོད་ཕྲེང་རྩལ། །མ་ཧཱ་གུ་རུ་པདྨ་ཧེ་རུ་ཀར། །མོས་གུས་གདུང་ཤུགས་དྲག་པོས་གསོལ་བ་འདེབས། །དགྲ་འདོན་བགེགས་དང་བར་ཆད་བྱད་ཕུར་བཟློག །མ་རུང་རྒྱལ་བསེན་འབྱུང་པོ་དམ་ལ་ཐོགས། །བསམ་པ་ལྷུན་གྱིས་འགྲུབ་པར་བྱིན་གྱིས་རློབས། །ཞེས་པ་འདི་འཇའ་ལུས་རྡོ་རྗེས་སྨྲས་སོ།།");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			sanbajil.setTextSize(35);
			break;
		case R.id.zhun:
			sanbajil.setTextSize(25);
			break;
		case R.id.xiao:
			sanbajil.setTextSize(18);
			break;
		case R.id.muzhi:
			sanbajil.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			sanbajil.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			sanbajil.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			sanbajil.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			sanbajil.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			sanbajil.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			sanbajil.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			sanbajil.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			sanbajil.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			sanbajil.setTextColor(Color.BLUE);
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
