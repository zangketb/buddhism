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

public class sangdumolanActivity extends Activity{
private TextView sangdumolanl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sangdumolanmain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		sangdumolanl = (TextView)findViewById(R.id.sangdumolanl);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		sangdumolanl.setTypeface (face);
		sangdumolanl.setBackgroundColor(Color.BLACK);
		sangdumolanl.setTextColor(Color.WHITE);
		sangdumolanl.setMovementMethod(ScrollingMovementMethod.getInstance());
		sangdumolanl.setText("༄༅། །དགེ་བ་འདི་ཡིས་མྱུར་དུ་བདག །སངས་རྒྱས་ཀུན་གྱི་ཀུན་བདག་ཉིད། །རྡོ་རྗེ་འཆང་དབང་ཐོབ་གྱུར་ཅིག །འགྲོ་བས་ཀྱང་ནི་དེ་ཐོབ་ཤོག །བྱང་ཆུབ་ཕྱིར་ནི་སྤྱོད་གང་དང་། །རྫོགས་སངས་རྒྱས་ཀྱི་གང་ཡིན་པ། །བྱང་ཆུབ་རྡོ་རྗེས་གང་གསུངས་པའི། །སྤྱོད་དེ་གཉིས་ཀའང་བདག་སྤྱོད་ཤོག །དེ་ལྟར་སྒྱུ་མ་ཇི་བཞིན་རྨི་ལམ་བཞིན། །སྣང་སྟོང་ལྷ་སྐུར་གསལ་བའི་ངང་ཉིད་ནས། །ཕྱོགས་བཅུའི་རྒྱལ་བ་རབ་འབྱམས་ཀུན་བསྡུས་པ། །མི་བསྐྱོད་རྡོ་རྗེའི་དཀྱིལ་འཁོར་ལྷ་ཚོགས་ལ། །རྨད་བྱུང་བདེ་བས་དགྱེས་པ་བསྐྱེད་པའི་ཕྱིར། །ཕྱི་དང་ནང་དང་གསང་བའི་མཆོད་བསྟོད་དང་། །སྒོམ་དང་བཟླས་པ་སོགས་ལ་འདིར་འབད་པས། །བདག་གིས་ཇི་སྙེད་བསགས་པའི་དགེ་བ་འདིས། །རང་ཉིད་སྲིད་མཚོར་ལྷུང་བ་ཇི་བཞིན་དུ། །མར་གྱུར་འགྲོ་བ་ཀུན་ཀྱང་དེ་འདྲ་བར། །མཐོང་ནས་འགྲོ་བ་སྒྲོལ་བའི་ཁུར་འཁྱེར་བའི། །བྱང་ཆུབ་སེམས་མཆོག་འབྱོངས་པ་ཉིད་གྱུར་ཅིག །སེམས་ཙམ་བསྐྱེད་ཀྱང་ཚུལ་ཁྲིམས་རྣམ་གསུམ་ལ། །གོམས་པ་མེད་ན་བྱང་ཆུབ་མི་འགྲུབ་པར། །ལེགས་པར་མཐོང་ནས་རྒྱལ་སྲས་སྡོམ་པ་ལ། །བརྩོན་པ་དྲག་པོས་སློབ་པ་ཉིད་གྱུར་ཅིག །ཐུན་མོང་ལམ་སྦྱངས་སྣོད་དུ་གྱུར་པ་ན། །ཐེག་པ་ཀུན་གྱི་མཆོག་གྱུར་རྡོ་རྗེའི་ཐེག །སྐལ་བཟང་སྐྱེ་བོའི་འཇུག་ངོགས་དམ་པ་དེར། །བདེ་བླག་ཉིད་དུ་འཇུག་པ་ཉིད་གྱུར་ཅིག །བུམ་དབང་གངྒཱའི་ཆུ་རྒྱུན་བསྐུར་པ་ཡིས། །ཐ་མལ་སྣང་ཞེན་དྲི་མ་འཁྲུད་པར་ཤོག །གསང་དབང་ཡེ་ཤེས་བདུད་རྩི་མྱངས་པ་ཡིས། །ངག་གནས་རླུང་ནི་སྔགས་སུ་འཆར་བར་ཤོག །གསུམ་པ་ལྷན་སྐྱེས་དགའ་བའི་ལྕགས་ཀྱུ་ཡིས། །ཡིད་ནི་འོད་གསལ་དབྱིངས་སུ་འདྲེན་པར་ཤོག །བཞི་བ་ཟུང་འཇུག་དོན་ལ་ངོ་སྤྲད་པས། །མཐར་ཐུག་དོན་ལ་སྒྲོ་འདོགས་ཆོད་པར་ཤོག །དེ་ཚེ་དངོས་གྲུབ་རྣམ་གཉིས་འགྲུབ་པའི་གཞི། །རྣམ་དག་དམ་ཚིག་སྡོམ་པར་གསུངས་པ་ལ། །བཅོས་མ་མིན་པའི་ངེས་པ་རྙེད་གྱུར་ནས། །སྲོག་དང་བསྡོས་ཏེ་རྟག་ཏུ་བསྲུང་བར་ཤོག །ཐ་མལ་སྣང་ཞེན་ཀུན་རྟོག་སྤངས་པ་ཡི། །ལུས་ཀྱི་གཡོ་བ་ངག་གི་བརྗོད་པ་དང་། །ཡིད་ཀྱི་བསམ་པ་ཀུན་གྱིས་འབད་མེད་པར། །རླབས་ཆེན་ཚོགས་རྣམས་ཡོངས་སུ་སྡུད་བྱེད་པའི། །ཐུན་བཞིའི་སྦྱོར་བ་བསྙེན་སྒྲུབ་ཡན་ལག་བཞི། །རིམ་པ་དང་པོའི་རགས་དང་ཕྲ་བའི་ལམ། །མ་ལུས་ཤིན་ཏུ་བརྟན་པ་རྙེད་ནས་ནི། །གང་སྣང་ལྷ་ཡི་འཁོར་ལོར་འཆར་བར་ཤོག །ཞིང་གི་ཕུལ་བྱུང་ཐུགས་ཀྱི་དཀྱིལ་འཁོར་ལ ། །བརྟེན་ནས་འཁོར་གསུམ་དག་པའི་མཆོད་སྦྱིན་སོགས། །སྦྱོར་བ་ཚོགས་བསགས་ཆོ་ག་བཞིན་བྱས་པས། །རང་གི་རྒྱུད་ནི་ཡོངས་སུ་དག་པར་ཤོག །དཔལ་ལྡན་ཞེ་སྡང་རྡོ་རྗེ་ཁྲོ་བོ་བཅུའི། །འཁོར་གྱིས་ཡོངས་སུ་བསྐོར་བའི་ཏིང་འཛིན་གྱིས། །ཕྱོགས་བཅུར་རྒྱུ་བའི་གདུག་པའི་བསམ་པ་ཅན། །མ་ལུས་ཚར་གཅོད་འཕྲིན་ལས་འགྲུབ་པར་ཤོག །གང་དུ་འཚང་རྒྱའི་ཞིང་ཀུན་དག་བྱས་ནས། །དེར་ནི་སྐུ་གསུམ་གོ་འཕང་མངོན་འགྱུར་བའི། །ཐབས་ཀྱི་དམ་པ་འཆི་བ་ཆོས་སྐུ་དང་། །བར་དོ་ལོངས་སྐུ་སྐྱེ་བ་སྤྲུལ་པའི་སྐུར། །ཚུལ་བཞིན་ཉམས་སུ་ལེན་པའི་རྡོ་རྗེ་མཆོག །རིམ་པ་ཇི་བཞིན་རྒྱུད་ལ་བསྐྱེད་པ་ཡིས། །ཐ་མལ་སྐྱེ་ཤི་བར་དོའི་སྣང་ཞེན་ཀུན། །སྦྱོང་བྱེད་དང་པོའི་སྦྱོར་བ་ཐོབ་པར་ཤོག །རང་དོན་ཕུན་ཚོགས་དེ་ཡི་མྱུར་བའི་ལམ། །འདོད་ཆགས་ཆེན་པོའི་ཚུལ་གྱི་ཏིང་འཛིན་གྱིས། །རང་རིགས་ཕྱག་རྒྱར་གཞོལ་བའི་ཐབས་ལ་མཁས། །ལྷན་སྐྱེས་བདེ་བས་རྒྱལ་རྣམས་མཆོད་པར་ཤོག །མཁའ་དབྱིངས་རྡོ་རྗེ་སྦྱར་བས་སྦར་བ་ཡི། །ཙཎྡ་ལི་ཡིས་བཞུས་པའི་བྱང་ཆུབ་སེམས། །ཨ་ཝ་དྷཱུ་ཏཱིའི་རྒྱུན་ལམ་ནས་འོངས་པ། །ཤེས་རབ་པདྨའི་ཟེའི་འབྲུར་སོན་པ་ལས། །འཁྲུངས་པའི་རྟེན་དང་བརྟེན་པའི་དཀྱིལ་འཁོར་གྱི། །སྤྲུལ་པའི་སྤྲིན་གྱིས་ནམ་མཁའི་ཁྱོན་བཀང་སྟེ། །སྣོད་བཅུད་ཞིང་ཀུན་ཡོངས་སུ་སྦྱོང་མཛད་པའི། །དཀྱིལ་འཁོར་རྒྱལ་མཆོག་མྱུར་དུ་འགྲུབ་པར་ཤོག །སྲོག་འཛིན་ཐུར་སེལ་ལམ་གྱི་སྣ་རྩེར་ནི། །གནས་ནས་འོད་ཟེར་དྲ་བ་འགྱེད་པ་ཅན། །བདེ་གཤེགས་ལྔ་བདག་རིན་ཆེན་ཁ་དོག་ལྔ། །ཕྱག་མཚན་བྱང་སེམས་ཕྲ་མོ་ཡུངས་འབྲུ་ཙམ། །དེ་ནང་དཀྱིལ་འཁོར་འཁོར་ལོ་ཡོངས་རྫོགས་ཤིང་། །མ་འདྲེས་གསལ་ལ་ཇི་སྲིད་འདོད་ཀྱི་བར། །མཉམ་པར་འཇོག་པའི་ཕྲ་མོའི་རྣལ་འབྱོར་དང་། །ཕྱི་ནང་བཟླས་པ་ཡོངས་སུ་རྫོགས་པར་ཤོག །དེས་ནི་རྫས་སྔགས་འཁྲུལ་འཁོར་བསམ་གཏན་ལ། །བརྟེན་ནས་འགྲུབ་པ་ཆེན་པོ་བརྒྱད་དང་ནི། །ཞི་སོགས་རབ་འབྱམས་ལས་ཀུན་འགྲུབ་པ་ཡི། །ལས་ཀྱི་རྒྱལ་པོ་མཆོག་ནི་འགྲུབ་པར་ཤོག །སོ་སོར་སྡུད་དང་བསམ་གཏན་སྲོག་རྩོལ་དང་། །འཛིན་པ་རྗེས་དྲན་ཏིང་འཛིན་ཡན་ལག་དྲུག །ཡོངས་སུ་སྡུད་པའི་ཟབ་ལམ་རིམ་པ་ལྔ། །སྤྱོད་པ་གསུམ་དང་བཅས་པ་འགྲུབ་པར་ཤོག  །ནོར་བུར་ཐིག་ལེ་ཕྲ་མོར་སེམས་བརྟན་པས། །ཉི་མས་ཟླ་བ་བཞུས་པའི་བདུད་རྩིའི་རྒྱུན། །ལུགས་འབྱུང་ལུགས་ལྡོག་རིམ་པས་དྲངས་པ་ཡི། །ཡས་བབས་མས་བརྟན་དགའ་བཞི་སྐྱེ་བར་ཤོག   །དེ་ལས་ལངས་ཚེ་གང་ཤར་སྣང་བ་ཀུན། །རིགས་བརྒྱ་རིགས་ལྔ་རིགས་གསུམ་རིགས་གཅིག་ཏུ། །འཆར་བའི་སྐུ་ཡི་རྡོ་རྗེའི་ཏིང་འཛིན་གྱིས། །ལུས་དབེན་སོར་སྡུད་བསམ་གཏན་རྫོགས་པར་ཤོག །ཐིག་ལེའི་རྒྱལ་པོ་སྔགས་ཀྱི་ཐིག་ལེ་མཆོག །སྙིང་གའི་ཆུ་སྐྱེས་སྣ་རྩེར་གོམས་བྱས་པས། །གཟུང་དང་འཛིན་པའི་རྣམ་རྟོག་བསྐྱེད་པའི་རླུང་། །བཅུ་གཉིས་མི་ཤིགས་ཐིག་ལེར་སྡུད་པར་ཤོག །གདོང་གི་སྣ་རྩེར་འོད་ཀྱི་ཐིག་ལེའི་གདངས། །མ་བཅོས་རྡོ་རྗེ་གསུམ་དུ་ཤར་བ་ཡི། །ངག་དབེན་གསུང་གི་རྡོ་རྗེའི་ཏིང་འཛིན་གྱིས། །སྙིང་གའི་མ་རིག་སྒོ་ངའི་སྦུབས་འབྱེད་ཤོག །ཐབས་ཤེས་གསང་བའི་རྩ་མཆོག་གཉིས་ཀྱི་རྩེར། །རྫས་ཀྱི་ཐིག་ལེའི་སྲོག་རྩོལ་བསྒོམས་པ་ཡིས། །ཀུན་རྟོག་རླུང་གི་མུན་པ་སངས་གྱུར་ནས། །འོད་གསལ་ཉི་མ་སྙིང་དབུས་འཆར་བར་ཤོག །སྣ་རྩེ་གསུམ་དུ་ཐིག་ལེ་རྣམ་གསུམ་གྱི། །སྲོག་རྩོལ་བསྒོམས་པས་སྤྲིན་མེད་ནམ་མཁའ་ལ། །ཟླ་ཉིའི་འོད་དང་སྨག་གིས་ཁྱབ་འདྲ་ཡི། །སྟོང་བ་གསུམ་གྱི་སེམས་དབེན་སྐྱེ་བར་ཤོག །སྒྱུ་མ་ལོངས་སྐུ་འོད་གསལ་ཆོས་སྐུ་དང། །སྣ་ཚོགས་སྤྲུལ་སྐུ་གསུམ་ལ་རེ་རེ་ཞིང་། རྣམ་པ་གསུམ་གསུམ་བསྲེ་བ་རྣམ་པ་དགུ། །ཡོངས་རྫོགས་མན་ངག་གནད་ལ་མཁས་གྱུར་ཏེ། །ཀུན་རྫོབ་སྒྱུ་ལུས་དོན་དམ་འོད་གསལ་འཛིན། །ལུགས་ལྡོག་རྗེས་དྲན་ཟུང་ཏིང་འཛིན་དང་། །སྤྲོས་བཅས་སྤྲོས་མེད་ཤིན་ཏུ་སྤྲོས་མེད་ཀྱི། །སྤྱོད་མཆོག་རྣམ་གསུམ་ཡོངས་སུ་རྫོགས་པར་ཤོག །གལ་ཏེ་འདི་དང་བར་དོར་མཆོག་འགྲུབ་པའི། །ཏིང་འཛིན་མ་རྙེད་འཆི་བའི་དུས་བྱེད་ན། །གཞི་ཡི་འཆི་རིམ་སྟོང་པ་རྣམ་པ་བཞི། །ལམ་གྱི་སྟོང་པ་བཞི་དང་བསྲེ་ནུས་ཤོག  །བར་དོ་གྲུབ་ཚེ་སྒྱུ་མའི་ཏིང་འཛིན་དང་། །བསྲེ་བར་བྱེད་ཅིང་སྐྱེ་བ་ལེན་པའི་ཚེ། །ལོངས་སྐུས་སྤྲུལ་སྐུའི་སྐྱེ་བ་འཛིན་པ་བཞིན། །སྐྱེ་གནས་མཆོག་ཏུ་བསམ་བཞིན་སྐྱེ་བར་ཤོག །མདོར་ན་སྐྱེ་ཤི་བར་དོ་གང་ཤར་ཡང་། །སྔོན་ཆད་བསྒོམས་པའི་ལམ་འཁྱེར་རྣམ་གསུམ་གྱི། །གསལ་འདེབས་དགེ་སྦྱོར་བསྐུལ་མར་རྟོགས་གྱུར་ནས། །འཆི་ཚེ་ཡིད་ལ་དགའ་བ་རྒྱས་པར་ཤོག །དེ་ལྟར་རྨད་བྱུང་ལམ་གྱི་མཐར་ཐུག་འདི། །ཚུལ་བཞིན་བསྒྲུབ་ལ་བར་ཆད་མེད་པ་དང་། །ཕྱོགས་དུས་ཀུན་ཏུ་དར་ཞིང་རྒྱས་གྱུར་ཏེ། །འགྲོ་ཀུན་ཐབས་མཁས་འདི་ཡིས་སྒྲོལ་བར་ཤོག། ཅེས་པ་འདི་ནི་རྗེ་ཙོང་ཁ་པ་བློ་བཟང་གྲགས་པས་མཛད་པའོ། །");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			sangdumolanl.setTextSize(35);
			break;
		case R.id.zhun:
			sangdumolanl.setTextSize(25);
			break;
		case R.id.xiao:
			sangdumolanl.setTextSize(18);
			break;
		case R.id.muzhi:
			sangdumolanl.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			sangdumolanl.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			sangdumolanl.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			sangdumolanl.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			sangdumolanl.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			sangdumolanl.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			sangdumolanl.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			sangdumolanl.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			sangdumolanl.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			sangdumolanl.setTextColor(Color.BLUE);
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