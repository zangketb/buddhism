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

public class gasanbaActivity extends Activity{
   private TextView gasanbal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gasanbamain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		gasanbal = (TextView)findViewById(R.id.gasanbal);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		gasanbal.setTypeface (face);
		gasanbal.setBackgroundColor(Color.BLACK);
		gasanbal.setTextColor(Color.WHITE);
		gasanbal.setMovementMethod(ScrollingMovementMethod.getInstance());
		gasanbal.setText(" ༄༅། །ན་མཿཤྲཱི་གུ་རུ་མཉྫུ་གྷོ་ཥཱ་ཡ། སྐབས་གསུམ་པ་དང་དབང་བོའི་དགྲ། །དྲི་ཟ་གདེངས་ཅན་གྲུབ་པའི་གཙོ། །ཀུན་གྱི་གཙུག་རྒྱན་ནོར་བུ་ཡིས། །གང་གི་ཞབས་པད་མཛེས་བྱས་པ། །གསེར་འོད་འཁྱུག་པའི་དཔལ་གྱིས་བརྗིད་པའི་སྐུ། །དྲི་ཟའི་དབྱངས་ཀྱིས་བསྒྲུན་དུ་མེད་པའི་གསུང་། །ཉི་མ་བྱེ་བའི་མདངས་ལས་གསལ་བའི་ཐུགས། །མཐའ་ཡས་འགྲོ་བའི་འདྲེན་མཆོག་ཤཱཀྱའི་ཏོག །དག་པའི་མཁའ་ལ་ཤར་བའི་གཟའ་སྐར་རྣམས། །ཆུ་གཏེར་དབུས་ན་ཡོངས་སུ་གསལ་བ་བཞིན། །དང་བའི་ཡིད་མཚོར་ཁྱོད་ཀྱི་ཡོན་ཏན་གྱི། །གཟུགས་བརྙན་མ་འདྲེས་གསལ་བར་རབ་བཀོད་ནས། །ཟླ་ཟེར་ཕོག་པའི་ཆུ་སྐྱེས་གཞོན་ནུ་བཞིན། །ལག་པའི་སོར་མོ་སྙིང་གའི་ངོས་སུ་ཟུམ། །རྩེ་གཅིག་ཡིད་ཀྱིས་ཁྱོད་སྐུར་མངོན་ཕྱོགས་ཏེ། །ཅུང་ཟད་བསྟོད་ལ་ཐུགས་རྗེ་ཅན་ཁྱོད་དགོངས། །སྐར་མའི་ཚོགས་ཀྱིས་མཁའ་ལ་ཟླ་བ་བཞིན། །རྒྱལ་སྲས་དཔའ་བོ་རྣམས་ཀྱིས་ཀུན་ནས་བསྐོར། །བ་ལང་ཁྱུ་ཡི་ཐོག་མར་ཁྱུ་མཆོག་བཞིན། །དགྲ་བཅོམ་འཁོར་གྱི་ཚོགས་ཀྱིས་མདུན་དུ་བདར། །ནམ་མཁའི་ཁྱོན་ཀུན་འགེངས་པའི་འོད་ཟེར་གྱི། །དྲ་བ་སྟོང་གིས་ཡོངས་སུ་དཀྲིགས་པའི་སྐུ། །ནམ་མཁའི་ལམ་ནས་ཆོ་འཕྲུལ་དུ་མ་ཡིས། །ངང་བའི་རྒྱལ་པོ་བཞིན་དུ་ལྡིང་ཞིང་གཤེགས། །དེ་ཚེ་རིང་ནས་བསྐྲུན་པའི་བཟང་བོའི་ལས། །ཡོངས་སུ་སད་པའི་ལྷ་མི་སྟོང་ཕྲག་བརྒྱ། །ཁྱོད་ཞལ་མཐོང་བའི་མོད་ལ་མི་བསྲུན་ཡིད། །ཉེས་བརྒྱའི་འཆིང་བ་ཀུན་ནས་ལྷོད་པར་གྱུར། །དཔའ་བོ་ཁྱོད་ཀྱིས་བྱང་ཆུབ་ཤིང་དྲུང་དུ ། །མཁྱེན་བརྩེའི་དཔུང་གིས་ཡིད་སྲུབས་བདག་པོའི་སྡེ། །མ་ལུས་ཟིལ་གྱིས་གནོན་པར་མཛད་པ་ནི། །དྲག་པོའི་རླུང་དང་ཉེ་བའི་སྤྲིན་ནག་བཞིན། །མདའ་མཚོན་གོ་ཆ་མ་བཟུང་བར། །རང་ཉིད་གཅིག་པུས་བྱེ་བའི་བདུད། །མ་ལུས་ཕམ་མཛད་གཡུལ་གྱི་ལས། །ཁྱོད་ལས་གཞན་པ་སུ་ཡིས་ཤེས། །དེ་ལྟར་ཁྱོད་ཀྱི་བྱམས་པའི་མེས། །འདོད་ལྷའི་སྙིང་ནི་རབ་གདུངས་ཀྱང་། །བརྩེ་བའི་གཏེར་ཁྱོད་ལུས་ཅན་ལ། །རིས་སུ་ཆད་པར་གྱུར་པ་མེད། །ཁྱོད་ནི་འགྲོ་བའི་དོན་གྱི་སླད། །ཅུང་ཟད་ཙམ་ཡང་མི་ངལ་ཞིང་། །འགྲོ་བ་རྣམས་ཀྱང་ཁྱོད་ཀྱི་ནི། །ཡོན་ཏན་བརྗོད་ལ་ངལ་མ་གྱུར། །རྒྱ་མཚོའི་ཀློང་ལྟར་རབ་ཏུ་ཟབ་པའི་ཐུགས། །ལྷ་ཡི་རྔ་བཞིན་ལེགས་པར་འདོམས་པའི་གསུང་། །ལྷུན་པོའི་སྤོ་ལྟར་མངོན་པར་འཕགས་པའི་སྐུ། །མཐོང་ཐོས་དྲན་པ་དོན་ལྡན་མཛད་པ་ཁྱོད། །འཇིག་རྟེན་ཀུན་གྱི་སེམས་ཅན་ཐམས་ཅད་ཀྱིས། །དུས་གཅིག་ཉིད་དུ་ཐེ་ཚོམ་དོན་ཞུས་ཀྱང་། །དེ་དག་རེ་རེའི་མདུན་དུའང་དེ་སྙེད་ཀྱི། །སྐུ་དང་གསུང་གི་བཀོད་པ་དུས་གཅིག་ཏུ། །མཛད་པ་མཛད་ཀྱང་རྟོག་པ་ཉེར་ཞི་བ། །ཁྱོད་ཀྱི་སྐུ་གསུང་ཐུགས་ཀྱི་གསང་བ་ཡི། །ཚུལ་འདི་རྒྱལ་སྲས་རང་རྒྱལ་ཉན་ཐོས་ཀྱིས། །ཇི་ཙམ་བརྟགས་ཀྱང་བློ་ཡི་ཡུལ་མིན་ན། །ཚངས་དང་དབང་བོ་སོགས་ཀྱིས་སྨོས་ཅི་འཚལ། །མཁའ་ལྡིང་དབང་བོ་མཁའ་ལ་བགྲོད་བགྲོད་ནས། །ནམ་ཞིག་རང་སྟོབས་བྲི་བས་ལྡོག་འགྱུར་གྱི། །ནམ་མཁའ་ཟད་པས་ལྡོག་པར་མི་འགྱུར་བཞིན། །ཁྱོད་ཀྱི་ཡོན་ཏན་བརྗོད་པའང་དེ་ལྟར་ལགས། །གཤོག་རྩལ་རབ་ཏུ་རྫོགས་པའི་མཁའ་ལྡིང་གིས། །བགྲོད་པའི་ལམ་དུ་བྱེའུའི་རྩོལ་བ་ལྟར། །སྟོབས་བཅུ་མངའ་བ་གང་དུ་གཤེགས་པ་ཡི། །ལམ་མཆོག་དེར་ནི་འཇུག་པར་འདོད་པ་བདག ། གནས་ལུགས་དོན་ལ་བལྟ་བའི་བློ་མིག་ཉམས། །ངེས་འབྱུང་བྱང་ཆུབ་སེམས་ཀྱི་འབྱོར་བས་དབུལ། །སྟོབས་ལྡན་ཉོན་མོངས་དགྲ་བོས་རྒྱུན་དུ་གཙེས། །བདག་འཛིན་གཅོང་རོང་ཟབ་མོའི་སྦུབས་སུ་ལྷུང་། །འདི་འདྲའི་ཉམ་ཐག་གནས་སུ་གྱུར་ལགས་པ། །བརྩེ་ཆེན་ཁྱེད་ཀྱིས་ཡལ་བར་འདོར་ལགས་ན། །དམན་པ་རྣམས་ལ་ཆེས་ཆེར་བརྩེ་བའི་མགོན། །ཁྱོད་ལས་གཞན་པ་གང་ལ་སྐྱབས་སུ་གཟུང་། །སྙིགས་མ་ལྔ་ཡིས་ཧ་ཅང་སྦགས་པ་ཡི། །ཞིང་འདི་གཞན་གྱིས་སྤངས་དུས་མགོན་ཁྱོད་ཀྱིས། །ཡོངས་སུ་བཟུང་སྟེ་རྒྱལ་བ་སྲས་བཅས་ཀྱིས། །པད་དཀར་ལྟ་བུར་བསྔགས་པའི་དགོས་པའང་ཅི། །འོན་ཀྱང་ཁྱོད་ཀྱི་འཕྲིན་ལས་གདུལ་བྱ་ལ། །མ་བརྟགས་བཏང་སྙོམས་ཅུང་ཟད་མི་མངའ་བས། །སྐལ་ངན་བདག་གི་ཉེས་པ་ཁོ་ནར་ཟད། །དེ་ཕྱིར་ཁྱོད་ལ་སྐྱོན་གྱི་སྐབས་མེད་པས། །དེང་ནས་བྱང་ཆུབ་སྙིང་བོར་བདུད་སྡེ་ལས། །ཇི་སྲིད་རྒྱལ་བར་མ་གྱུར་དེ་སྲིད་དུ། །སྐྱེ་ཞིང་སྐྱེ་བར་ཁྱོད་ཀྱིས་རྗེས་བཟུང་ནས། །གསུང་གི་བདུད་རྩིས་ངོམས་པ་མེད་པར་ཤོག ། དེ་བཞིན་གཤེགས་པ་ཁྱེད་སྐུ་ཇི་འདྲ་དང་། །འཁོར་དང་སྐུ་ཚེའི་ཚད་དང་ཞིང་ཁམས་དང་། །ཁྱེད་ཀྱི་མཚན་མཆོག་བཟང་བོ་ཅི་འདྲ་བ། །དེ་འདྲ་ཁོ་ནར་བདག་སོགས་འགྱུར་བར་ཤོག ། ཁྱེད་ལ་བསྟོད་ཅིང་གསོལ་བ་བཏབ་པའི་མཐུས། །བདག་སོགས་གང་དུ་གནས་པའི་ས་ཕྱོགས་དེར། །ནད་དང་དབུལ་ཕོངས་འཐབ་རྩོད་ཞི་བ་དང་། །ཆོས་དང་བཀྲ་ཤིས་འཕེལ་བར་མཛད་དུ་གསོལ། ། ། །ཞེས་པ་འདི་ནི་རྗེ་ཙོང་ཁ་པ་བློ་བཟང་གྲགས་པས་མཛད་པའོ། །");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			gasanbal.setTextSize(35);
			break;
		case R.id.zhun:
			gasanbal.setTextSize(25);
			break;
		case R.id.xiao:
			gasanbal.setTextSize(18);
			break;
		case R.id.muzhi:
			gasanbal.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			gasanbal.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			gasanbal.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			gasanbal.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			gasanbal.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			gasanbal.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			gasanbal.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			gasanbal.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			gasanbal.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			gasanbal.setTextColor(Color.BLUE);
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
