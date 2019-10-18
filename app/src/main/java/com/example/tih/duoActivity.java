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

public class duoActivity extends Activity{
 private TextView duom;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.duomain);
		duom = (TextView)findViewById(R.id.duom);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		duom.setTypeface (face);
		duom.setBackgroundColor(Color.BLACK);
		duom.setTextColor(Color.WHITE);
		duom.setMovementMethod(ScrollingMovementMethod.getInstance());
		duom.setText("༄༅། །རྒྱ་གར་སྐད་དུ། བྷ་ག་ཝ་ཏི་པྲ་ཛྙཱ་པཱ་ར་མི་ཏཱ་ཧྲི་ད་ཡ། བོད་སྐད་དུ། བཅོམ་ལྡན་འདས་མ་ཤེས་རབ་ཀྱི་ཕ་རོལ་ཏུ་ཕྱིན་པའི་སྙིང་བོ། བཅོམ་ལྡན་འདས་མ་ཤེས་རབ་ཀྱི་ཕ་རོལ་ཏུ་ཕྱིན་མ་ལ་ཕྱག་འཚལ་ལོ། །འདི་སྐད་བདག་གིས་ཐོས་པ་དུས་གཅིག་ན། བཅོམ་ལྡན་འདས་རྒྱལ་པོའི་ཁབ་བྱ་རྒོད་ཕུང་བོའི་རི་ལ་དགེ་སློང་གི་དགེ་འདུན་ཆེན་པོ་བྱང་ཆུབ་སེམས་དཔའི་དགེ་འདུན་ཆེན་པོ་དང་ཐབས་གཅིག་ཏུ་བཞུགས་ཏེ། དེའི་ཚེ་བཅོམ་ལྡན་འདས་ཟབ་མོ་སྣང་བ་ཞེས་བྱ་བའི་ཆོས་ཀྱི་རྣམ་གྲངས་ཀྱི་ཏིང་ངེ་འཛིན་ལ་སྙོམས་པར་ཞུགས་སོ། །ཡང་དེའི་ཚེ་བྱང་ཆུབ་སེམས་དཔའ་སེམས་དཔའ་ཆེན་པོ་འཕགས་པ་སྤྱན་རས་གཟིགས་དབང་ཕྱུག་ཀྱང་ཤེས་རབ་ཀྱི་ཕ་རོལ་ཏུ་ཕྱིན་པ་ཟབ་མོ་སྤྱོད་པ་ཉིད་ལ་རྣམ་པར་བལྟ་ཞིང་ཕུང་བོ་ལྔ་བོ་དེ་དག་ལ་ཡང་རང་བཞིན་གྱིས་སྟོང་བར་རྣམ་པར་བལྟའོ། །དེ་ནས་སངས་རྒྱས་ཀྱི་མཐུས། ཚེ་དང་ལྡན་པ་ཤཱ་རིའི་བུས་བྱང་ཆུབ་སེམས་དཔའ་སེམས་དཔའ་ཆེན་པོ་འཕགས་པ་སྤྱན་རས་གཟིགས་དབང་ཕྱུག་ལ་འདི་སྐད་ཅེས་སྨྲས་སོ། །རིགས་ཀྱི་བུའམ་རིགས་ཀྱི་བུ་མོ་གང་ལ་ལ་ཤེས་རབ་ཀྱི་ཕ་རོལ་ཏུ་ཕྱིན་པ་ཟབ་མོ་སྤྱོད་པ་སྤྱད་པར་འདོད་པ་དེས། ཇི་ལྟར་བསླབ་པར་བྱ། དེ་སྐད་ཅེས་སྨྲས་པ་དང་། བྱང་ཆུབ་སེམས་དཔའ་སེམས་དཔའ་ཆེན་པོ་འཕགས་པ་སྤྱན་རས་གཟིགས་དབང་ཕྱུག་གིས་ཚེ་དང་ལྡན་པ་ཤཱ་ར་དྭ་ཏིའི་བུ་ལ་འདི་སྐད་ཅེས་སྨྲས་སོ། །ཤཱ་རིའི་བུ། རིགས་ཀྱི་བུའམ་རིགས་ཀྱི་བུ་མོ་གང་ལ་ལ་ཤེས་རབ་ཀྱི་ཕ་རོལ་ཏུ་ཕྱིན་པ་ཟབ་མོ་སྤྱོད་པ་སྤྱད་པར་འདོད་པ་དེས་འདི་ལྟར་རྣམ་པར་བལྟ་བར་བྱ་སྟེ། ཕུང་བོ་ལྔ་བོ་དེ་དག་ཀྱང་རང་བཞིན་གྱིས་སྟོང་བར་ཡང་དག་པར་རྗེས་སུ་བལྟའོ། །གཟུགས་སྟོང་བའོ། །སྟོང་བ་ཉིད་གཟུགས་སོ། །གཟུགས་ལས་ཀྱང་སྟོང་བ་ཉིད་གཞན་མ་ཡིན། སྟོང་བ་ཉིད་ལས་ཀྱང་གཟུགས་གཞན་མ་ཡིན་ནོ། །དེ་བཞིན་དུ་ཚོར་བ་དང་། འདུ་ཤེས་དང་། འདུ་བྱེད་དང་། རྣམ་པར་ཤེས་པ་རྣམས་སྟོང་བའོ། །ཤཱ་རིའི་བུ། དེ་ལྟ་བས་ན་ཆོས་ཐམས་ཅད་སྟོང་བ་ཉིད་དེ། མཚན་ཉིད་མེད་པ། མ་སྐྱེས་པ། མ་འགགས་པ། དྲི་མ་མེད་པ། དྲི་མ་དང་བྲལ་བ་མེད་པ། བྲི་བ་མེད་པ། གང་བ་མེད་པའོ། །ཤཱ་རིའི་བུ། དེ་ལྟ་བས་ན་སྟོང་བ་ཉིད་ལ་གཟུགས་མེད། ཚོར་བ་མེད། འདུ་ཤེས་མེད། འདུ་བྱེད་རྣམས་མེད། རྣམ་པར་ཤེས་པ་མེད། མིག་མེད། རྣ་མེད། སྣ་མེད། ལྕེ་མེད། ལུས་མེད། ཡིད་མེད། གཟུགས་མེད། སྒྲ་མེད། དྲི་མེད། རོ་མེད། རེག་བྱ་མེད། ཆོས་མེད། མིག་གི་ཁམས་མེད་པ་ནས་ཡིད་ཀྱི་ཁམས་མེད། ཡིད་ཀྱི་རྣམ་པར་ཤེས་པའི་ཁམས་ཀྱི་བར་དུ་ཡང་མེད་དོ། །མ་རིག་པ་མེད། མ་རིག་པ་ཟད་པ་མེད་པ་ནས་རྒ་ཤི་མེད། རྒ་ཤི་ཟད་པའི་བར་དུ་ཡང་མེད་དོ། །དེ་བཞིན་དུ་སྡུག་བསྔལ་བ་དང་། ཀུན་འབྱུང་བ་དང་། འགོག་པ་དང་། ལམ་མེད། ཡེ་ཤེས་མེད། ཐོབ་པ་མེད། མ་ཐོབ་པ་ཡང་མེད་དོ། །ཤཱ་རིའི་བུ། དེ་ལྟ་བས་ན། བྱང་ཆུབ་སེམས་དཔའ་རྣམས་ཐོབ་པ་མེད་པའི་ཕྱིར། ཤེས་རབ་ཀྱི་ཕ་རོལ་ཏུ་ཕྱིན་པ་ཟབ་མོ་འདི་ལ་བརྟེན་ཅིང་གནས་ཏེ། སེམས་ལ་སྒྲིབ་པ་མེད་ཅིང་སྐྲག་པ་མེད་དེ། ཕྱིན་ཅི་ལོག་ལས་ཤིན་ཏུ་འདས་ནས། མྱ་ངན་ལས་འདས་པའི་མཐར་ཕྱིན་ཏོ། །དུས་གསུམ་དུ་མངོན་པར་བཞུགས་པའི་སངས་རྒྱས་ཐམས་ཅད་ཀྱང་ཤེས་རབ་ཀྱི་ཕ་རོལ་ཏུ་ཕྱིན་པ་ཟབ་མོ་འདི་ལ་བརྟེན་ནས། བླ་ན་མེད་པ་ཡང་དག་པར་རྫོགས་པའི་བྱང་ཆུབ་ཏུ་མངོན་པར་རྫོགས་པར་སངས་རྒྱས་སོ། །དེ་ལྟ་བས་ན་ཤེས་རབ་ཀྱི་ཕ་རོལ་ཏུ་ཕྱིན་པའི་སྔགས། རིག་པ་ཆེན་པོའི་སྔགས། བླ་ན་མེད་པའི་སྔགས། མི་མཉམ་པ་དང་མཉམ་པར་བྱེད་པའི་སྔགས། སྡུག་བསྔལ་ཐམས་ཅད་རབ་ཏུ་ཞི་བར་བྱེད་པའི་སྔགས། མི་རྫུན་པས་ན་བདེན་པར་ཤེས་པར་བྱ་སྟེ། ཤེས་རབ་ཀྱི་ཕ་རོལ་ཏུ་ཕྱིན་པའི་སྔགས་སྨྲས་པ། ཏདྱ་ཐཱ། ཨོཾ་ག་ཏེ་ག་ཏེ་པཱ་ར་ག་ཏེ་པཱ་ར་སཾ་ག་ཏེ་བོ་དྷི་སྭཱ་ཧཱ། ཤཱ་རིའི་བུ། བྱང་ཆུབ་སེམས་དཔའ་སེམས་དཔའ་ཆེན་པོ་རྣམས་ཀྱིས། དེ་ལྟར་ཤེས་རབ་ཀྱི་ཕ་རོལ་ཏུ་ཕྱིན་པ་ཟབ་མོ་ལ་བསླབ་པར་བྱའོ། །དེ་ནས་བཅོམ་ལྡན་འདས་ཏིང་ངེ་འཛིན་དེ་ལས་བཞེངས་ཏེ། བྱང་ཆུབ་སེམས་དཔའ་སེམས་དཔའ་ཆེན་པོ་འཕགས་པ་སྤྱན་རས་གཟིགས་དབང་ཕྱུག་ལ་ལེགས་སོ་ཞེས་བྱ་བ་བྱིན་ནས། ལེགས་སོ་ལེགས་སོ། །རིགས་ཀྱི་བུ་དེ་དེ་བཞིན་ནོ། །རིགས་ཀྱི་བུ་དེ་དེ་བཞིན་ཏེ། ཇི་ལྟར་ཁྱོད་ཀྱིས་བསྟན་པ་དེ་བཞིན་དུ་ཤེས་རབ་ཀྱི་ཕ་རོལ་ཏུ་ཕྱིན་པ་ཟབ་མོ་ལ་སྤྱད་པར་བྱ་སྟེ། དེ་བཞིན་གཤེགས་པ་རྣམས་ཀྱང་རྗེས་སུ་ཡི་རང་ངོ་། །བཅོམ་ལྡན་འདས་ཀྱིས་དེ་སྐད་ཅེས་བཀའ་བསྩལ་ནས། ཚེ་དང་ལྡན་པ་ཤཱ་རིའི་བུ་དང་། བྱང་ཆུབ་སེམས་དཔའ་སེམས་དཔའ་ཆེན་པོ་འཕགས་པ་སྤྱན་རས་གཟིགས་དབང་ཕྱུག་དང་། ཐམས་ཅད་དང་ལྡན་པའི་འཁོར་དེ་དག་དང་། ལྷ་དང་། མི་དང་། ལྷ་མ་ཡིན་ཡིན་དང་། དྲི་ཟར་བཅས་པའི་འཇིག་རྟེན་ཡི་རངས་ཏེ། བཅོམ་ལྡན་འདས་ཀྱིས་གསུངས་པ་ལ་མངོན་པར་བསྟོད་དོ། ། ཤེས་རབ་སྙིང་བོ་རྫོགས་སོ། ། ");
		}
	  public boolean onOptionsItemSelected(MenuItem item)
	    {switch (item.getItemId()) {
		case R.id.da:
			duom.setTextSize(35);
			break;
		case R.id.zhun:
			duom.setTextSize(25);
			break;
		case R.id.xiao:
			duom.setTextSize(18);
			break;
		case R.id.muzhi:
			duom.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			duom.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			duom.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			duom.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			duom.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			duom.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			duom.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			duom.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			duom.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			duom.setTextColor(Color.BLUE);
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
	  public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}
}
