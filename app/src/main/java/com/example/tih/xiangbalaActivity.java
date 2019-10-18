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

public class xiangbalaActivity extends Activity{
private TextView xiangbalal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xiangbalamain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		xiangbalal = (TextView)findViewById(R.id.xiangbalal);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		xiangbalal.setTypeface (face);
		xiangbalal.setBackgroundColor(Color.BLACK);
		xiangbalal.setTextColor(Color.WHITE);
		xiangbalal.setMovementMethod(ScrollingMovementMethod.getInstance());
		xiangbalal.setText("༄༅། །ན་མོ་གུ་རུ་ཝེ། དཔལ་ལྡན་དང་པོའི་སངས་རྒྱས་རིང་ལུགས་ཆེ། །ཤམྦྷ་ལ་ཡི་གྲོང་དུ་རྒྱས་མཛད་པ། །རྗེ་བཙུན་བླ་མ་ཁྱེད་ལ་གསོལ་འདེབས་ཀྱི། །བདག་གི་བདེན་པའི་ཚིག་འདི་འགྲུབ་པར་མཛོད། །བྱང་སེམས་དུས་འཁོར་སོགས་ཀྱིས་རྟག་བརྟེན་ཅིང་། །དམ་བའི་ཆོས་རྣམས་མཆོག་ཏུ་རྒྱས་བའི་ས། །བྱང་ཕྱོགས་ཀ་ལཱ་པ་ཞེས་བྱ་བའི་གྲོང་། །བརྒྱ་བྱིན་ཁང་བཟང་ལས་ཀྱང་ཆེས་ལྷག་པ། །ཕོ་བྲང་མཆོག་ནི་དཔག་ཚད་བཅུ་གཉིས་ཚད། །གྲུ་བཞིར་ལྷམ་ཞིང་རིན་ཆེན་དུ་མས་བརྒྱན། །བྱེ་བ་ཕྲག་ནི་དགུ་བརྒྱའི་གྲོང་གིས་བསྐོར། །སྐྱེད་མོས་ཚལ་མཆོག་ལྷ་ཡུལ་ལས་ལྷག་པར། །དང་པོའི་སངས་རྒྱས་དཀྱིལ་འཁོར་ཆེ་ཆུང་གཉིས། །མཐོང་བའི་མོད་ལ་དངོས་གྲུབ་མཆོག་སྩོལ་གྱིས། །རྒྱུ་ནི་རིན་ཆེན་རིན་ཐང་བྲལ་ལས་གྲུབ། །དེ་ཡི་གཡས་གཡོན་ཡིད་འོང་མཚོ་ཆེན་ནི། །ནོར་བུས་གང་ཞིང་དཔག་ཚད་བཅུ་གཉིས་པ། །མི་རྣམས་ནོར་ཕྱུག་ཆོས་ཀྱིས་དུས་འདའི་དབུས། །བླ་མ་མཆོག་ཁྱེད་དེང་དུས་ནས་བཟུང་བའི། །ལོ་ནི་བདུན་བརྒྱ་ཙམ་ཞིག་རྫོགས་པ་ན། །རིགས་ལྡན་དྲག་པོར་གྱུར་ནས་ཀླ་ཀློའི་དཔུང་། །བཅོམ་ནས་རྫོགས་ལྡན་བཞིན་དུ་མཛད་པའི་དུས། །སྔོན་གྱི་ཞལ་བཞེས་དམ་བཅའ་མ་གཡེལ་བར། །བདག་ཀྱང་འཁོར་གྱི་ཐོག་མར་རྗེས་འཛིན་མཛོད། །རྗེ་བཙུན་བླ་མ་དམ་པ་མཆོག་ཁྱེད་ཉིད། །རླུང་གི་ཤུགས་ཅན་རྡོ་ཡི་རྟར་ཆིབས་ནས། །ཕྱག་གི་མདུང་ཐུང་བྱིས་པའི་བློར་བསྣུན་ནས། །ངེས་པར་འཇོམས་ཚེ་བདག་ཀྱང་རྗེས་སུ་ཟུངས། །དམག་དཔུང་བྱེ་བ་ཁ་དོག་སྣ་ཚོགས་པ། །གླང་ཆེན་རིག་བྱེད་ཆང་དྲེགས་བཞི་འབུམ་དང་། །གསེར་གྱི་ཤིང་རྟ་མཚོན་ལྡན་དཔུང་བུ་ཆུང་། །འཇིགས་རུང་དམག་ཚོགས་དབུས་སུ་རབ་ཞུགས་ནས། །རང་གིས་བྱིས་པའི་བློ་ལ་བསྣུན་མཛད་ཅིང་། །རྟ་གནས་ཟླ་བ་ཆེན་པོའི་བུ་ལ་ནི། །ཧ་ནུ་མཱནྡ་རྣོན་པོའི་མཚོན་གྱིས་བསྣུན། །དྲག་པོ་ལ་སོགས་ལྷ་ཆེན་བཅུ་གཉིས་ཀྱིས། །ལྷ་མིན་ལ་སོགས་ཐམས་ཅད་རྩད་གཅོད་ཅིང་། །གླང་བོ་ཆེ་ཡིས་གླང་བོ་རྣམ་པར་འཇོམས། །རྡོ་ཡི་རྟ་ཡིས་རྟ་རྣམས་གསོད་བྱེད་ཅིང་། །གསེར་གྱི་ཤིང་རྟས་ཤིང་རྟ་ཕྱེ་མར་བྱེད། །ས་སྐྱོང་རྣམས་ཀྱིས་ས་སྐྱོང་འདུལ་བར་མཛད། །ཀླ་ཀློའི་རྒྱུན་ནི་རབ་ཏུ་བཅད་བྱས་ནས། །དང་པོའི་སངས་རྒྱས་གྱིས་མཚོན་ཆོས་ཚུལ་ཀུན། །རྒྱས་པར་མཛད་ཚེ་བདག་ཀྱང་རྗེས་སུ་ཟུངས། །དེ་ལྟར་ལོ་ནི་མང་པོར་ཆོས་བསྟན་ནས། །རྟ་ཡི་ལོ་ཡི་ཧོར་ཟླ་གཉིས་པ་ཡི། །ཉི་ཤུ་གཉིས་ཉིན་དཔའ་བོ་དཔའ་མོ་ཡིས། །རོལ་མོའི་སྒྲ་བཅས་འཁོར་ནི་འབུམ་ཕྲག་བཅས། །བདེ་དུས་ལམ་ལས་འོག་མིན་གནས་སུ་ནི། །ལོངས་སྤྱོད་རྫོགས་སྐུ་མངོན་དུ་མཛད་པའི་ཚེ། །བདག་ཀྱང་སངས་རྒྱས་གོ་འཕང་ཐོབ་པར་མཛོད། །ཅེས་པ་འདི་ནི་པཎ་ཆེན་བློ་བཟང་དཔལ་ལྡན་ཡེ་ཤེས་ཀྱིས་མཛད་པའོ། །");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			xiangbalal.setTextSize(35);
			break;
		case R.id.zhun:
			xiangbalal.setTextSize(25);
			break;
		case R.id.xiao:
			xiangbalal.setTextSize(18);
			break;
		case R.id.muzhi:
			xiangbalal.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			xiangbalal.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			xiangbalal.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			xiangbalal.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			xiangbalal.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			xiangbalal.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			xiangbalal.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			xiangbalal.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			xiangbalal.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			xiangbalal.setTextColor(Color.BLUE);
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
