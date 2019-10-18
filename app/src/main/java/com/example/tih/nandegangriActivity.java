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

public class nandegangriActivity extends Activity{
private TextView nandegangril;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nandegangrimain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		nandegangril = (TextView)findViewById(R.id.nandegangril);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		nandegangril.setTypeface (face);
		nandegangril.setBackgroundColor(Color.BLACK);
		nandegangril.setTextColor(Color.WHITE);
		nandegangril.setMovementMethod(ScrollingMovementMethod.getInstance());
		nandegangril.setText("༄༅། །ན་མོ་མཉྫུ་གྷོ་ཥཱ་ཡ། རྣམ་དག་གངས་རིའི་ཕྲེང་བས་ཡོངས་བསྐོར་པའི། །ཕྱོགས་འདིར་བདག་ཅག་མགོན་མེད་རྣམས་ཀྱི་མགོན། །བློ་དམན་བསམ་པའི་ངོ་དང་འཚམ་པའི་སྐུ། །སྟོན་མཛད་བླ་མ་མཆོག་ལ་བདག་ཕྱག་འཚལ། །ཁྱོད་ནི་སྐུ་ཚེ་དུ་མའི་སྔ་རོལ་ཏུ། །རྗེ་བཙུན་འཇམ་དབྱངས་སྲས་ཀྱི་ཐུ་བོར་གྱུར། །གཟུངས་སྤོབས་མངོན་ཤེས་ཏིང་འཛིན་དུ་མ་ལ། །དབང་འབྱོར་ཆོས་ཀུན་རྣམ་དཔྱོད་སྤྱན་གྱིས་གཟིགས། །ནམ་ཞིག་དེ་བཞིན་གཤེགས་པ་དབང་བོའི་ཏོག །རྣམ་མང་འཁོར་གྱི་དབུས་ན་ཐེག་པ་མཆོག ། སྟོན་མཛད་མདུན་ས་ཆེ་དེར་འཇམ་པའི་དབྱངས། །རྒྱལ་སྲས་རྒྱ་མཚོའི་འཁོར་དང་བཅས་ཏེ་གཤེགས། །དེ་ཚེ་རྒྱལ་བ་དེ་ཡི་ཚངས་དབྱངས་ཀྱིས། །རྒྱལ་སྲས་དཔའ་བོ་ལུས་དང་སྲོག་ལ་ཡང་། །ལྟོས་པ་མེད་པར་མ་དག་ཞིང་རྣམས་སུ། །རྡོ་རྗེ་ཐེག་པའི་ལམ་བཟང་འདབ་བརྒྱ་བ། །སྟོང་ཉིད་གཏམ་གྱི་དྲི་བཟང་རྫོགས་པ་ཡིས། །ཡོངས་སུ་འགེངས་ལ་ཞུགས་པ་གང་ཡིན་པ། །དེ་ནི་བྱང་ཆུབ་སེམས་དཔའི་སྤྱོད་ཀུན་གྱི། །རབ་དང་ཕུལ་ཞེས་རྒྱ་ཆེར་བསྔགས་པ་ལས། །བདག་ཉིད་ཆེ་ཁྱོད་སྙིང་སྟོབས་འོ་མའི་མཚོ། །ཆེས་ཆེར་བསྐྱོད་པའི་རླབས་ཕྲེང་གཡོས་པ་ཡི། །རྒྱལ་བའི་འཁོར་མང་དབུས་ནས་མྱུར་བར་ལངས། །མ་ཞུམ་ཤིན་ཏུ་མཐོ་བའི་སྒྲ་དབྱངས་ཀྱིས། །བདག་ནི་གྲངས་མེད་མ་དག་ཞིང་རྣམས་སུ། །སྟོང་ཉིད་ལྟ་དང་ཉེར་འབྲེལ་སྔགས་ཀྱི་ལམ། །ལུས་དང་སྲོག་ལ་མི་ལྟ་འདོམས་པ་ཡིས། །རྒྱལ་བ་དགྱེས་པའི་ལམ་བཟང་རྒྱས་བྱ་ཞེས། །དམ་བཅས་སྨོན་ལམ་བཏབ་པའི་མོད་ཉིད་ལ། །རྒྱལ་བ་དབང་བོའི་ཏོག་དང་ཕྱོགས་བཅུ་ཡི། །རྒྱལ་བ་མ་ལུས་དབྱངས་དང་མགྲིན་གཅིག་ཏུ། །ལེགས་སོ་ཁྱོད་ནི་སྙིང་སྟོབས་ཆེན་པོ་ཞེས། །ཆེས་ཆེར་བསྔགས་ཤིང་ངོ་མཚར་ལྟས་མང་བསྟན། །དེ་ནས་བརྩམས་ཏེ་སངས་རྒྱས་ཞིང་ཀུན་ཏུ། །འདི་ཡི་མཚན་ནི་སྙིང་སྟོབས་ཆེན་པོ་ཞེས། །རྒྱལ་བ་སྲས་བཅས་ཀུན་ལ་མཐུན་པར་གྲགས། །དེ་ནས་དེར་གནས་བདེ་གཤེགས་དབང་བོའི་ཏོག། སྐུ་ལུས་འོད་ཟེར་བྱེ་བ་འབུམ་འགྱེད་ཅིང། །འཛུམ་ལྡན་ཞལ་གྱིས་བདག་གི་དགེ་བའི་བཤེས། །སྙིང་སྟོབས་ཆེ་དེ་འདི་ལྟར་ལུང་བསྟན་མཛད། །ཁྱོད་ནི་དེང་ནས་བརྩམས་ཏེ་མ་དག་པའི། །གྲངས་མེད་ཞིང་དུ་རྡོ་རྗེ་ཐེག་པའི་ལམ། །ཟབ་མོ་དབུ་མའི་ལྟ་བས་ཡོངས་བཟུང་བ། །རྒྱས་བྱེད་རླབས་ཆེན་སྤྱོད་པ་རྫོགས་བྱས་ཏེ། །སངས་རྒྱས་ཞིང་མང་བརྒལ་བའི་བྱང་ཤར་མཚམས། །ངོ་མཚར་རྨད་བྱུང་བཀོད་པའི་འཇིག་རྟེན་དུ། །དེ་བཞིན་གཤེགས་པ་སེང་གེའི་ང་རོ་ཞེས། །མངོན་པར་རྫོགས་པར་མྱུར་དུ་འཚང་རྒྱ་འགྱུར། །ཞེས་གསུངས་དེ་ལྟར་འདི་ཉིད་སངས་རྒྱས་པའི། །རྒྱལ་བ་སེང་གེའི་ང་རོའི་སྐུ་ཚེ་ནི། །བསྐལ་པ་དཔག་མེད་ཐ་མལ་སྐུ་ཡི་ཚད། །དཔག་ཚད་གཅིག་པ་མར་གད་མདོག་ལྟ་བུ། །དཔག་ཚད་དུ་མའི་འོད་ལྡན་ཕྱག་གཡས་ནི། །ཆོས་འཆད་གཡོན་པ་མཉམ་གཞག་ལ་གནས་པ། །བདུད་རྩིས་གང་བའི་ལྷུང་བཟེད་དེ་དབུས་ན། །བདུད་རྩིའི་འོད་ལྡན་མཆོད་སྡོང་ཆེར་འཕགས་ཤིང་། །གྲངས་མེད་འོད་ཟེར་འགྱེད་པ་ལྷག་གེར་གསལ། །ཞིང་དེའི་གདུལ་བྱ་དབང་བོ་མཆོག་རྣམས་ཀྱིས། །མཆོད་སྡོང་དེ་ཉིད་མཐོང་བའི་མོད་ཙམ་ལ། །ཐེག་མཆོག་ལམ་བཟང་རྒྱུད་ལ་མངོན་དུ་བྱེད། །འབྲིང་དང་ཐ་མའི་གདུལ་བྱའང་རྒྱལ་བ་དེས། །སྔགས་ཚུལ་སྟོང་ཉིད་གཏམ་དང་ཉེར་འབྲེལ་བ། །འདོམས་པའི་གསུང་གི་བདུད་རྩི་འཐུངས་ཙམ་ལས། །དེ་ཡི་མོད་ལ་ལམ་བཟང་མངོན་དུ་བྱེད། །ཞིང་དེའི་གདུལ་བྱ་ཀུན་ཀྱང་སྔགས་ཀྱི་ཚུལ། ཟབ་མོ་དབུ་མའི་ལྟ་དང་ཉེར་འབྲེལ་བ། །ཁོང་དུ་ཆུད་པའི་མཐུ་ལས་སྲིད་པ་གཞན། །ཉིང་མཚམས་མི་སྦྱོར་རྒྱལ་སྲས་ཤ་སྟག་གོ ། དེ་ལྟར་འཚང་རྒྱ་བདག་ཅག་རྣམས་ཀྱི་སྐྱབས། །འདྲེན་པ་མཆོག་དེས་ཐུགས་ཀྱི་བཅུད་ཕྱུང་བ། །རྒྱུད་སྡེ་རྒྱ་མཚོའི་དེ་ཉིད་ལེགས་རྟོགས་ནས། །བཀའ་བཞིན་སྒྲུབ་པ་སྙིང་བོར་བྱེད་པ་དང་། །སྐྱེ་བ་ཀུན་ཏུ་ལུས་དང་སྲོག་ལ་ཡང་། །མི་ལྟ་སྔགས་ཀྱི་ཆོས་ཚུལ་ཀུན་བཟུང་ནས། །རྒྱལ་བ་སེང་གེའི་ང་རོར་སངས་རྒྱས་པ། །དེ་ཡི་འཁོར་གྱི་དང་པོར་བདག་གྱུར་ཅིག། ། །ཅེས་པ་འདི་ནི་མཁས་གྲུབ་དགེ་ལེགས་དཔལ་བཟང་གིས་མཛད་པའོ། ། ");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			nandegangril.setTextSize(35);
			break;
		case R.id.zhun:
			nandegangril.setTextSize(25);
			break;
		case R.id.xiao:
			nandegangril.setTextSize(18);
			break;
		case R.id.muzhi:
			nandegangril.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			nandegangril.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			nandegangril.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			nandegangril.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			nandegangril.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			nandegangril.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			nandegangril.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			nandegangril.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			nandegangril.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			nandegangril.setTextColor(Color.BLUE);
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
