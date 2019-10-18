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

public class lezhimaActivity extends Activity{
private TextView lezhimal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lezhimamain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		lezhimal = (TextView)findViewById(R.id.lezhimal);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		lezhimal.setTypeface (face);
		lezhimal.setBackgroundColor(Color.BLACK);
		lezhimal.setTextColor(Color.WHITE);
		lezhimal.setMovementMethod(ScrollingMovementMethod.getInstance());
		lezhimal.setText("༄༅། །འཕགས་པ་སྤྱན་རས་གཟིགས་ལ་ཕྱག་འཚལ་ལོ། །ལེགས་བྲིས་དཔལ་གྱི་བདག་པོ་གསེར་གྱི་མངལ། །ལྷ་ཡི་བླ་མ་གླང་གདོང་དཔལ་གྱི་མགྲིན། །པདྨོའི་གཉེན་སོགས་ལྷ་བརྒྱའི་གཙུག་རྒྱན་གྱིས། །ཞབས་པད་གུས་མཆོད་སྒྲོལ་མའི་ཞབས་ལ་འདུད། །ཐུགས་རྗེ་ཆེན་པོའི་ཐུགས་རྗེའི་རྣམ་འཕྲུལ་གྱིས། །དུས་གསུམ་རྒྱལ་བའི་མཁྱེན་བརྩེ་ནུས་པ་རྣམས། །རབ་མཛེས་འཕྲིན་ལས་ལྷ་མོའི་སྐུར་བསྟན་ནས། །ཕོངས་པ་ཀུན་སྐྱོབ་སྒྲོལ་མའི་ཞབས་ལ་འདུད། །དབྱིངས་རིག་རྣམ་དག་པདྨའི་གདན་སྟེང་ན། །མར་གད་མདོག་ཅན་ཞལ་གཅིག་ཕྱག་གཉིས་མ། །ལང་ཚོ་རབ་རྒྱས་གཡས་བརྐྱངས་གཡོན་བསྐུམས་ཞབས། །ཐབས་ཤེས་ཟུང་འབྲེལ་མ་ལ་ཕྱག་འཚལ་ལོ། །ནུ་འབུར་རབ་རྒྱས་ཟག་མེད་བདེ་བའི་གཏེར། །ཞལ་རས་ཟླ་བ་རྒྱས་པའི་འཛུམ་དཀར་ཅན། །ཞི་བའི་ཉམས་ལྡན་ཐུགས་རྗེའི་སྤྱན་ཡངས་མ། །སེང་ལྡེང་ནགས་གྱི་མཛེས་མ་ཁྱོད་ལ་འདུད། །གཡུ་ཡི་ལྗོན་ཤིང་ཡལ་ག་བརྐྱངས་འདྲ་བའི། །འཇམ་མཉེན་ཕྱག་གཡས་མཆོག་སྦྱིན་ཕྱག་རྒྱ་ནི། །མཁས་རྣམས་དངོས་གྲུབ་མཆོག་གི་དགའ་སྟོན་ལ། །མགྲོན་དུ་འབོད་འདྲ་ཁྱོད་ལ་ཕྱག་འཚལ་ལོ། །ཕྱག་གཡོན་དཀོན་མཆོག་གསུམ་མཚོན་སྐྱབས་སྦྱིན་གྱིས། །འཇིགས་པ་བརྒྱ་ཕྲག་མཐོང་བའི་སྐྱེ་བོ་རྣམས། །མ་འཇིགས་ང་ཡིས་མྱུར་དུ་སྐྱོབ་བོ་ཞེས། །གསལ་བར་མཚོན་པ་ཁྱོད་ལ་ཕྱག་འཚལ་ལོ། །ཕྱག་གཉིས་ཨུཏྤལ་སྔོན་པོས་མཚན་པ་ནི། །འགྲོ་ཀུན་སྲིད་པའི་བདེ་ལ་མ་ཆགས་པར། །ཐར་པ་ཆེན་པོའི་གྲོང་དུ་ཞུགས་ཤིག་ཅེས། །བརྩོན་པའི་ལྕག་གིས་བསྐུལ་འདྲ་ཁྱོད་ལ་འདུད། །པདྨ་རཱ་གའི་མདངས་ལྡན་འོད་དཔག་མེད། །མཉམ་བཞག་བདུད་རྩིས་གང་བའི་ལྷུང་བཟེད་བསྣམས། །འཆི་མེད་དངོས་གྲུབ་སྩོལ་བས་སྤྱི་བོར་བརྒྱན། །བདག་གི་འཆི་བདག་འཇོམས་པ་ཁྱོད་ལ་འདུད། །ཚོགས་གཉིས་མཐོ་རིས་བཟོ་བོའི་འདུ་བྱེད་ཀྱིས། །གཞལ་མེད་ལྷ་ཡི་ཡིད་བཞིན་ནོར་བུ་རྣམས། །མཛེས་མཛེས་གཅིག་ཏུ་བསྡུས་པའི་ཡིད་འཕྲོག་རྒྱན། །ཀུན་གྱིས་བརྒྱན་པ་ཁྱོད་ལ་ཕྱག་འཚལ་ལོ། །མར་གད་རི་བོས་འཇའ་ཚོན་གྱོན་པ་བཞིན། །སྐུ་སྟོད་ལྷ་རྫས་གོས་ཀྱི་ག་ཤ་ཅན། །ཕྲ་ཞིང་ལྡེམ་ལ་མཛེས་པའི་རྐེད་སྐབས་ནི། །པཉྩ་ལི་ཀའི་ཤམ་ཐབས་འཛིན་ལ་འདུད། །གཡས་ན་མྱ་ངན་མེད་པའི་འོད་ཟེར་ཅན། །ཞི་བའི་ཉམས་ལྡན་གསེར་མདོག་ཉི་འོད་འཕྲོ། །གཡོན་ན་རལ་གཅིག་ནམ་མཁའི་མཛེས་པ་འཕྲོག ། ཁྲོ་ཆགས་བརྗིད་པས་མཛེས་པ་དེ་ལ་འདུད། །དྲུག་ལྡན་གླུ་དང་མཛེས་པའི་གར་ལ་མཁས། །གདུགས་དཀར་རྔ་ཡབ་པི་ཝང་གླིང་བུ་སོགས། །རབ་འབྱམས་མཆོད་རྫས་འཛིན་པའི་ལྷ་མོའི་ཚོགས། །ནམ་མཁའ་གང་བས་མཆོད་ལ་ཕྱག་འཚལ་ལོ། །དཔལ་མོ་ལེགས་བརྗོད་མ་དང་རི་སྐྱེས་སོགས། །ཡིད་འོང་འཆི་མེད་བུ་མོ་སྟོང་དག་གིས། །ཁྱོད་དྲུང་བྲན་མོ་ཙམ་ཡང་ཐོབ་དཀའ་བ། །མཛེས་སྡུག་ལྷ་མོའི་སྐུ་ལ་ཕྱག་འཚལ་ལོ། །ཐུགས་རྗེའི་ཆུ་འཛིན་རྒྱས་པའི་ཀླུང་ཡངས་ནས། །གསུང་སྙན་ཚངས་དབྱངས་སྤྲིན་ཀྱི་རྔ་སྒྲ་ཅན། །གདུལ་བྱའི་འཛིན་མར་ཡན་ལག་བརྒྱད་ཆོས་ཆར། །ཀུན་ཏུ་འབེབས་མཁས་མ་ལ་ཕྱག་འཚལ་ལོ། །ཤེས་བྱ་ཀུན་གཟུགས་ཡོན་ཏན་རྒྱ་མཚོའི་གཏེར། །ཇི་བཞིན་མ་ལུས་བརྗོད་པར་སུ་ཡིས་ནུས། །བློ་གྲོས་ཐོགས་མེད་སྟོབས་བཅུ་མངའ་བའི་ཐུགས། །མཁྱེན་རབ་མཐར་ཕྱིན་མ་ལ་ཕྱག་འཚལ་ལོ། །ཞི་བ་བརྙེས་ཀྱང་ཐུགས་རྗེའི་གཞན་དབང་གིས། །སྡུག་བསྔལ་རྒྱ་མཚོར་བྱིང་བའི་འགྲོ་བ་རྣམས། །ཐུགས་རྗེའི་ཕྱག་གིས་མྱུར་དུ་འདྲེན་མཛད་མ། །བརྩེ་བ་མཐར་ཕྱིན་མ་ལ་ཕྱག་འཚལ་ལོ། །ཞི་རྒྱས་དབང་དང་དྲག་པོའི་འཕྲིན་ལས་རྣམས། །རྒྱ་མཚོའི་རླབས་བཞིན་དུས་ལས་མི་འདའ་བར། །ལྷུན་གྲུབ་རྒྱུན་མི་ཆད་པར་འཇུག་མཛད་མ། །མཛད་པ་མཐར་ཕྱིན་མ་ལ་ཕྱག་འཚལ་ལོ། ། འཇིགས་ཆེན་སྡུག་བསྔལ་བརྒྱད་དང་འབྱུང་བའི་གདོན། །ཉོན་མོངས་ཤེས་བྱའི་སྒྲིབ་པའི་འཇིགས་པ་རྣམས། །ཁྱོད་ཞབས་དྲན་པའི་མོད་ལ་སྐྱོབ་མཛད་མ། །ནུས་པ་མཐར་ཕྱིན་མ་ལ་ཕྱག་འཚལ་ལོ། །དེ་ལྟར་སྐྱབས་འོས་ཁྱོད་ཀྱིས་ལུས་ཅན་རྣམས། །ནད་རིགས་གདོན་བགེགས་དུས་མིན་འཆི་བ་དང་། །རྨི་ལམ་ངན་དང་མཚན་མ་ངན་པ་སོགས། །འཇིགས་པ་ཀུན་ལས་མྱུར་དུ་བསྐྱབ་ཏུ་གསོལ། །འཇིག་ཚོགས་ལྟ་བའི་རི་སུལ་གནས་བཅས་ཏེ། །གཞན་ལས་མཆོག་ཏུ་འཛིན་པས་སེམས་ཁེངས་ཤིང་། །ཕ་རོལ་ཁྱད་དུ་གསོད་པའི་སྦར་ཁྱིམ་ཅན། །ང་རྒྱལ་སེང་གེའི་འཇིགས་པ་བསྐྱབ་ཏུ་གསོལ། །དྲན་ཤེས་ལྕགས་ཀྱུ་རྣོན་པོས་མ་བཏུལ་ཞིང་། །འདོད་ཡོན་མྱོས་ཆུ་འཐུངས་བས་འཐོམས་པའི་མཐུས། །ལོག་པའི་ལམ་ཞུགས་གནོད་འཚེའི་མཆེ་བ་གཙིགས། །གཏི་མུག་གླང་བོའི་འཇིགས་པ་བསྐྱབ་ཏུ་གསོལ། །ཚུལ་མིན་ཡིད་བྱེད་རླུང་གིས་བསྐུལ་བ་ལས། །ཉེས་སྤྱོད་དུད་སྤྲིན་འཁྲིགས་པའི་ཀློང་དཀྱིལ་ན། །དགེ་བའི་ནགས་ཚལ་སྲེག་པའི་ནུས་པ་ཅན། །ཞེ་སྡང་མེ་ཡི་འཇིགས་པ་བསྐྱབ་ཏུ་གསོལ། །མ་རིག་འཐིབས་པ་ཁུང་དུ་མངོན་ཞེན་ཅིང་། །གཞན་འབྱོར་ཕུན་ཚོགས་མཐོང་ཚེ་མི་བཟོད་པར། །གདུག་པའི་དུག་གིས་མྱུར་དུ་ཁྱབ་བྱེད་པའི། །ཕྲག་དོག་སྦྲུལ་གྱི་འཇིགས་པ་བསྐྱབ་ཏུ་གསོལ། །བརྟུལ་ཞུགས་དམན་པའི་འབྲོག་དགོན་འཇིགས་རུང་དང་། །རྟག་ཆད་མྱ་ངམ་ཐང་ལ་རབ་རྒྱུ་ཞིང་། །ཕན་བདེའི་གྲོང་དང་དགོན་པ་ཀུན་འཇོམས་པའི། །ལྟ་ངན་རྐུན་པོའི་འཇིགས་པ་བསྐྱབ་ཏུ་གསོལ། །མི་བཟད་སྲིད་པའི་བཙོན་ཁང་ར་བ་རུ། །ལུས་ཅན་རང་དབང་མེད་པར་འཆང་བྱེད་ཅིང་། །སྲེད་པའི་སྒོ་ལྕགས་དབྱེ་དཀས་འཁྱུད་པ་ཡི། །སེར་སྣའི་ལྕགས་སྒྲོག་འཇིགས་པ་བསྐྱབ་ཏུ་གསོལ། །ཤིན་ཏུ་བརྒལ་དཀའ་སྲིད་པའི་རྒྱུན་ཕྱོགས་ཁྱེར། །ལས་རླུང་དྲག་པོའི་རྐྱེན་དང་ཉེ་བ་ལས། །སྐྱེ་རྒ་ན་འཆིའི་རྦ་ཀློང་རབ་འཁྲུག་པའི། །འདོད་ཆགས་ཆུ་བོའི་འཇིགས་པ་བསྐྱབ་ཏུ་གསོལ། །ཀུན་ཏུ་རྨོངས་པའི་མཁའ་ལ་རབ་རྒྱུ་ཞིང་། །ངེས་པ་དོན་དུ་གཉེར་ལ་ལྷག་པར་འཚེ། །ཐར་བའི་སྲོག་ལ་རྒོལ་བའི་གདུག་པ་ཅན། །ཐེ་ཚོམ་ཤ་ཟའི་འཇིགས་པ་བསྐྱབ་ཏུ་གསོལ། །ཁྱོད་ལ་བསྟོད་ཅིང་གསོལ་བ་བཏབ་པའི་མཐུས། །དམ་ཆོས་སྒྲུབ་པའི་འགལ་རྐྱེན་ཞི་བ་དང་། །ཚེ་དང་བསོད་རྣམས་དཔལ་དང་འབྱོར་བ་སོགས། །མཐུན་པའི་རྐྱེན་རྣམས་ཡིད་བཞིན་འགྲུབ་པར་མཛོད། །ཞིང་མཆོག་བདེ་བ་ཅན་དེར་འགྲོ་བ་ཀུན། །འདྲེན་པ་འོད་དཔག་མེད་པས་རྗེས་བཟུང་ནས། །དཀའ་བ་བརྒྱ་ཕྲག་སྤྱད་པ་མེད་པར་ཡང་། །མྱུར་དུ་སངས་རྒྱས་ས་ལ་རེག་གྱུར་ཅིག ། བདག་ཀྱང་རྟག་ཏུ་ཚེ་རབས་དྲན་པ་དང་། །བྱང་ཆུབ་སེམས་དང་ནམ་ཡང་མི་འབྲལ་ཞིང་། །རྒྱལ་སྲས་སྤྱོད་པ་རླབས་ཆེན་ཚོལ་བ་ལ། །བརྩོན་འགྲུས་ཆུ་བོའི་རྒྱུན་བཞིན་བསྟེན་པར་ཤོག། རང་དོན་སྒྲུབ་ལ་ནམ་ཡང་མི་རེ་ཞིང་། །གཞན་དོན་འབའ་ཞིག་སྒྲུབ་ལ་གཞོལ་བ་དང་། །སྤྱན་དང་མངོན་ཤེས་སྨྲ་མཁས་བཟོད་པ་སོགས། །གཞན་དོན་བྱེད་པའི་རྐྱེན་རྣམས་ཚང་བར་ཤོག །རབ་འབྱམས་ཞིང་དུ་རྒྱལ་བའི་དམ་ཆོས་ཀུན། །རྒྱས་པར་བྱེད་ལ་ནམ་ཡང་མི་ཞུམ་ཞིང་། །རྟག་ཏུ་སེམས་ཅན་ཀུན་དོན་བསྒྲུབ་པའི་ཕྱིར། །རྒྱལ་བའི་གོ་འཕང་བདེ་བླག་ཐོབ་གྱུར་ཅིག། ། །ཅེས་པ་འདི་ནི་རྗེ་དགེ་འདུན་གྲུབ་པས་མཛད་པའོ། ། ");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			lezhimal.setTextSize(35);
			break;
		case R.id.zhun:
			lezhimal.setTextSize(25);
			break;
		case R.id.xiao:
			lezhimal.setTextSize(18);
			break;
		case R.id.muzhi:
			lezhimal.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			lezhimal.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			lezhimal.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			lezhimal.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			lezhimal.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			lezhimal.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			lezhimal.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			lezhimal.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			lezhimal.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			lezhimal.setTextColor(Color.BLUE);
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