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

public class badanyuncuomaActivity extends Activity{
private TextView badanyuncuomal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.badanyuncuomamain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		badanyuncuomal = (TextView)findViewById(R.id.badanyuncuomal);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		badanyuncuomal.setTypeface (face);
		badanyuncuomal.setTextColor(Color.WHITE); 
		badanyuncuomal.setBackgroundColor(Color.BLACK);
		badanyuncuomal.setMovementMethod(ScrollingMovementMethod.getInstance());
		badanyuncuomal.setText("༄༅། །རྗེ་བཙུན་བླ་མ་འཇམ་པའི་དབྱངས་ཀྱི་ཞབས་ལ་ཕྱག་འཚལ་ལོ། །དཔལ་ལྡན་ཡོན་ཏན་ཚོགས་ཀྱི་བྱེད་པོ་ཡིས། །མི་འཇིགས་སེང་གེའི་ཁྲི་ལ་དབང་བསྐུར་པ། །རྒྱལ་བ་གཉིས་པའི་རྒྱལ་ཚབ་ཆོས་ཀྱི་རྗེ། །མི་ཕམ་བླ་མ་གཉིས་པ་རྒྱལ་གྱུར་ཅིག །ཁྱོད་ནི་རྣམ་དཔྱོད་ལུས་མཛེས་ཤིང་། །དར་དིར་ལེགས་བཤད་མགྲིན་པའི་དབྱངས། །མ་ལུས་མཁས་པའི་ཡིད་འཕྲོག་པ། །རིན་ཆེན་རིགས་པའི་དོ་ཤལ་འཕྱང་། །མཁས་པ་ཀུན་གྱི་ཟུར་ཕུད་ལ། །བཀའ་ཡི་རྩེ་དགའ་བགྱིས་པ་ཁྱོད། །དཔལ་ལྡན་ཕྱོགས་རྣམས་ཐམས་ཅད་ལས། །རྣམ་པར་རྒྱལ་བའི་རྒྱལ་མཚན་འཛིན། །རིགས་པའི་ཉིན་བྱེད་ཁྱོད་དྲིན་ལས། །གངས་ཅན་བློ་གསལ་བུང་བའི་ཚོགས། །མཐའ་དག་བསྟན་པའི་པད་ཚལ་དུ། །གསུང་རབ་སྦྲང་རྩིའི་དགའ་སྟོན་མྱོང་། །ཁྱོད་གསུང་རིགས་པའི་རི་བོ་ནི། །ཤིན་ཏུ་ལྕི་བས་ཅི་ཡང་ནོན། །བརྩོན་པ་དམ་པའི་དཔུང་གི་ཚོགས། །ཡན་ལག་བཞི་དང་ལྡན་པ་ཁྱོད། །ལེ་ལོའི་དགྲ་སྡེ་དྲུངས་ཕྱུངས་ནས། །ཉམས་པ་མེད་པའི་གོ་འཕང་འཛེགས། །དེ་ཕྱིར་ཆོས་ཚུལ་ཆུ་བོའི་རྒྱུན། །བྱེ་བ་ཕྲག་བརྒྱ་ཉིན་བཞིན་དུ། །རྒྱུན་མི་འཆད་པར་འབབ་པ་ལས། །ཁྱོད་ཐུགས་ཆུ་གཏེར་རྣམ་པར་འཕེལ། །ཁྱོད་ནི་དམ་པའི་མགོན་གྱིས་བཟུང་། །རྒྱལ་བའི་ཐུགས་བཅུད་བདུད་རྩིའི་རྒྱུན། །ཞལ་གྱི་བུམ་བཟང་ལས་འོངས་པ། །དད་པའི་སྙིམ་པས་རྫོགས་པར་གསོལ། །དེ་སླད་ཆོས་ཀུན་ཐུགས་སུ་ཆུད། །རང་གཞན་གྲུབ་མཐའི་ཕ་རོལ་སོན། །སྨྲ་མཁས་རི་དྭགས་ཚོགས་རྣམས་ཀྱི། །དབུས་སུ་སེང་གེའི་སྒྲ་ཡང་བསྒྲགས། །སྟོང་ཉིད་སྡེར་ཕྲེང་ཆེར་གཡོ་བ། །རྟེན་འབྲེལ་ཟབ་མོའི་ང་རོ་ཡིས། །དངོས་འཛིན་གླང་ཆེན་མྱོས་པ་དག ། སྙིང་ལ་འཆི་བའི་འཇིགས་པ་བྱིན། །བདེན་གསུང་བདེན་པར་གསུངས་པ་གང་། །དེ་ཡང་བཅད་བརྡར་བསྲེགས་པ་ཡི། །གསེར་བཞིན་ཚད་མས་ལེགས་སྦྱངས་པའི། །གསུང་ལ་སུ་ཞིག་གླགས་ཐོབ་འགྱུར། །དེ་ཕྱིར་རྟོག་གེ་རྣོ་ལྡན་པ། །ལེགས་སྦྱངས་རྒོལ་བ་སྟོང་དག་ནི། །ཁྱོད་དྲུང་ལྕེ་རྩེ་འགྲིམ་པ་ན། །སྙིང་དང་ལྷན་ཅིག་འདར་བ་བསྟེན། །ལེགས་བཤད་འོད་དཀར་རབ་རྒྱས་ཤིང་། །ལྷག་བསམ་ཆ་ཤས་ཡོངས་རྫོགས་པ། །གྱ་གྱུའི་རི་བོང་མཚན་མ་དང་། །བྲལ་བའི་ཟླ་བ་ཁྱོད་ཤར་ཚེ། །ལོག་སྨྲ་འབྱུང་བོའི་བྱ་ཡི་ཚོགས། །མཚན་མོ་རྒྱུ་བའང་མཚན་མོར་ནི། །ལོང་བས་སྡུག་བསྔལ་ཐོབ་པ་དག ། །མུན་པའི་ཁུང་བུ་སྐྱབས་སུ་འཛིན། །ཁྱོད་ནི་དབྱངས་ཅན་མགྲིན་པར་བྱས། །ལེགས་བཤད་བདུད་རྩི་ཞལ་ལ་ཆགས། །ཕ་རོལ་རྒོལ་བ་མ་ལུས་ཀྱི། །ཁ་ལ་སྨྲ་བཅད་རྒྱ་ཡང་བྱིན། །མཁས་པ་གསེར་རིའི་ཕྲེང་བ་ནི། །གཟི་བརྗིད་རབ་རྒྱས་ཉི་མ་ཡི། །དྲུང་ན་མར་མེའི་རྩེ་མོ་དང་། །མཚུངས་པའི་གནས་ལ་ཁྱོད་ཀྱིས་བཀོད། །རྟག་ཏུ་ལེགས་བཤད་ཚོགས་ཀྱིས་གང་། །དུལ་བའི་དཔལ་གྱིས་རྣམ་པར་བརྗིད། །རིགས་པའི་སྣང་བ་བྱེ་བས་བརྒྱན། །བསྟན་པ་འབའ་ཞིག་གཅེས་པར་དགོངས། །དེ་ཕྱིར་ཕན་བདེའི་རྩ་ལག་མཆོག ། བློ་ལྡན་ཐར་ལམ་སྟོན་པའི་མིག ། འགྲོ་བའི་མཛའ་བཤེས་དམ་པའི་ཕུལ། །ཁྱོད་ལྟའི་མགོན་བཅས་སྐལ་བ་བཟང་། །བག་ཡོད་ཆུ་ལོན་བརྟན་པོ་ཡིས། །ཉེས་པའི་ཆུ་ཀླུང་རྒྱུན་བཅད་ནས། །བརྟུལ་ཞུགས་རྫོགས་པའི་དྲང་སྲོང་མཆོག ། ཀུན་གྱི་རལ་བའི་ཅོད་པན་མཛེས། །རང་གི་དོན་དུ་འཆི་མེད་ཀྱི། །བདེ་བའང་རྩྭ་ལྟར་དགོངས་པ་ཁྱོད། །ཐུགས་རྗེ་ཁོ་ནས་གཞན་དོན་ཕྱིར། །དཀའ་བ་བརྒྱ་ཕྲག་དག་གིས་དགྱེས། །རི་རབ་ལྟ་བུར་བརྟན་པའི་ཐུགས། །བྱམས་པའི་རླུང་ཤུགས་ཀྱིས་བསྐྱོད་པས། །ཤིང་བལ་བཞིན་དུ་སྲིད་པ་འདིར། །འགྲོ་བའི་དོན་དུ་གཡོ་བ་ལགས། །རིམ་གཉིས་ནོར་བུའི་ཅོད་པན་གྱིས། །བསླབ་གསུམ་གདེངས་ཀ་རབ་དུ་མཛེས། །ཟབ་ཡངས་རྒྱུད་སྡེའི་རྒྱ་མཚོ་ལ། །དབང་སྒྱུར་གདེངས་ཅན་དབང་བོ་ཁྱོད། །ཏིང་འཛིན་མཆོག་གི་བདེ་བ་ལ། །འདོད་དགུར་སྤྱོད་པའི་མཐུ་ལྡན་ཡང་། །འགྲོ་བའི་མུན་སེལ་ངལ་བ་ལ། །ལྷག་པར་གཞོལ་འདི་རྨད་དུ་བྱུང་། །མདོར་ན་ཡབ་རྗེ་དམ་པའི་བཀའ། །རྒྱལ་བའི་རང་ལུགས་ཡོངས་རྫོགས་པ། །ཉམས་པ་མེད་པའི་བཀའ་དྲིན་མཛད། །ཕན་མཛད་ཁྱོད་ལ་ཕྱག་འཚལ་ལོ། །སྐྱེ་བོ་ཡོན་ཏན་མེད་ལ་ཡང་། །ཡོན་ཏན་ལྷག་པར་སྒྲོ་བཏགས་ནས། །གཅམ་བུ་ཁོ་ནའི་ངག་གིས་ནི། །མགུ་བ་ལྷུར་ལེན་ཚིག་ཏུ་སྨྲ། །ཁྱོད་ཀྱི་ཡོན་ཏན་ཆུ་གཏེར་ལས། །སྐྲ་རྩེས་བཟུང་བའི་ཐིགས་པ་ལྟར། །བསྔགས་པའི་འདབ་བརྒྱ་དགོད་པ་འདི། །ཚད་མའི་ཉིན་བྱེད་འོད་ཀྱིས་ཕྱེ། །དེ་ལྟར་དགེ་བའི་བཤེས་ཀྱི་ཡོན་ཏན་གྱི། །མེ་ཏོག་ཕྲེང་མཛེས་ཅུང་ཟད་སྤེལ་བ་ལས། །ཐོབ་པའི་དགེ་བས་འགྲོ་བ་མ་ལུས་པ། །ཐེག་པ་མཆོག་གི་མགོན་དང་ལྡན་གྱུར་ཅིག ། རབ་བྱེད་འདི་ཡང་གངས་རིའི་ཁྲོད་འདི་ན། །སྙན་ངག་དབང་བོ་ཀུན་གྱི་མགོ་བོ་ལ། །ཚིག་གི་གོམ་པ་འགོད་མཁས་དགེ་ལེགས་དཔལ། །བཟང་བོས་ཚིག་གི་སྦྱོར་བ་སྤངས་ཏེ་སྨྲས། །ཞེས་པ་འདི་ནི་མཁས་གྲུབ་དགེ་ལེགས་དཔལ་བཟང་གིས་མཛད་པའོ། ། ");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			badanyuncuomal.setTextSize(35);
			break;
		case R.id.zhun:
			badanyuncuomal.setTextSize(25);
			break;
		case R.id.xiao:
			badanyuncuomal.setTextSize(18);
			break;
		case R.id.muzhi:
			badanyuncuomal.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			badanyuncuomal.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			badanyuncuomal.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			badanyuncuomal.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			badanyuncuomal.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			badanyuncuomal.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			badanyuncuomal.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			badanyuncuomal.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			badanyuncuomal.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			badanyuncuomal.setTextColor(Color.BLUE);
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
