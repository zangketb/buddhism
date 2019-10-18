package com.example.tih;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.pm.LabeledIntent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.ScrollingMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

@SuppressLint("InflateParams")
public class jiazhuoActivity extends Activity{
    private TextView jiazhuo01;
    //private TextView textview01;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stu
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jiazhuomain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		
		/*SpannableString spannableString = new SpannableString("TimeToDo");
		spannableString.setSpan(new com.example.tih.font.TypefaceSpan(this, "himalaya.ttf"), 0, spannableString.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spannableString.setSpan(new AbsoluteSizeSpan(24, true), 0, spannableString.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		getActionBar().setTitle(spannableString);*/
		/*LayoutInflater inflator = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflator.inflate(R.layout.jiazhuomain ,null);
		getActionBar().setCustomView(v);
		TextView textViewActionbarTitle = (TextView)v.findViewById(R.id.textview01);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		textViewActionbarTitle.setTypeface(face);
		//textViewActionbarTitle.setText(R.string.songsihui);*/
		jiazhuo01 = (TextView)this.findViewById(R.id.jiazhuo01);
		//Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		jiazhuo01.setTypeface (face);
		jiazhuo01.setBackgroundColor(Color.BLACK);
		jiazhuo01.setTextColor(Color.WHITE);
		//TextPaint tp = jiazhuo01.getPaint(); 
		//tp.setFakeBoldText(true);
		//jiazhuo01.setBackgroundResource(R.drawable.back);
		jiazhuo01.setMovementMethod(ScrollingMovementMethod.getInstance());
		jiazhuo01.setText("༄༅། །ཕྱོགས་བཅུ་དུས་གསུམ་གྱི་དེ་བཞིན་གཤེགས་པ་ཐམས་ཅད་ཀྱི་སྐུ་གསུང་ཐུགས་ཡོན་ཏན་འཕྲིན་ལས་ཐམས་ཅད་ཀྱི་ངོ་བོར་གྱུར་པ། ཆོས་ཀྱི་ཕུང་བོ་སྟོང་ཕྲག་བརྒྱད་ཅུ་རྩ་བཞིའི་འབྱུང་གནས། འཕགས་པའི་དགེ་འདུན་ཐམས་ཅད་ཀྱི་མངའ་བདག་དྲིན་ཅན་རྩ་བ་དང་བརྒྱུད་པར་བཅས་པའི་དཔལ་ལྡན་བླ་མ་དམ་པ་རྣམས་ལ་སྐྱབས་སུ་མཆིའོ། །སངས་རྒྱས་ལ་སྐྱབས་སུ་མཆིའོ། །ཆོས་ལ་སྐྱབས་སུ་མཆིའོ། །དགེ་འདུན་ལ་སྐྱབས་སུ་མཆིའོ།། ལན་གསུམ། ཡི་དམ་དཀྱིལ་འཁོར་གྱི་ལྷ་ཚོགས་འཁོར་དང་བཅས་པ་རྣམས་ལ་སྐྱབས་སུ་མཆིའོ། །དཔལ་མགོན་དམ་པ་ཆོས་སྐྱོང་བའི་སྲུང་མ་ཡེ་ཤེས་ཀྱི་སྤྱན་དང་ལྡན་པ་རྣམས་ལ་སྐྱབས་སུ་མཆིའོ། །སངས་རྒྱས་ཆོས་དང་ཚོགས་ཀྱི་མཆོག་རྣམས་ལ། །བྱང་ཆུབ་བར་དུ་བདག་ནི་སྐྱབས་སུ་མཆི། །བདག་གིས་སྦྱིན་སོགས་བགྱིས་པ་འདི་དག་གིས། །འགྲོ་ལ་ཕན་ཕྱིར་སངས་རྒྱས་འགྲུབ་པར་ཤོག། ལན་གསུམ། དཀོན་མཆོག་གསུམ་ལ་བདག་སྐྱབས་མཆི། །སྡིག་པ་ཐམས་ཅད་སོ་སོར་བཤགས། །འགྲོ་བའི་དགེ་ལ་རྗེས་ཡི་རང་། །སངས་རྒྱས་བྱང་ཆུབ་ཡིད་ཀྱིས་གཟུང་། །སངས་རྒྱས་ཆོས་དང་ཚོགས་མཆོག་ལ། །བྱང་ཆུབ་བར་དུ་བདག་སྐྱབས་མཆི། །རང་གཞན་དོན་ནི་རབ་བསྒྲུབ་ཕྱིར། །བྱང་ཆུབ་སེམས་ནི་བསྐྱེད་པར་བགྱི། །བྱང་ཆུབ་མཆོག་གི་སེམས་ནི་བསྐྱེད་བགྱིས་ནས། །སེམས་ཅན་ཐམས་ཅད་བདག་གིས་མགྲོན་དུ་གཉེར། །བྱང་ཆུབ་སྤྱོད་མཆོག་ཡིད་འོང་སྤྱད་པར་བགྱི། །འགྲོ་ལ་ཕན་ཕྱིར་སངས་རྒྱས་འགྲུབ་པར་ཤོག །སེམས་ཅན་ཐམས་ཅད་བདེ་བ་དང་བདེ་བའི་རྒྱུ་དང་ལྡན་པར་གྱུར་ཅིག   །སེམས་ཅན་ཐམས་ཅད་སྡུག་བསྔལ་དང་སྡུག་བསྔལ་གྱི་རྒྱུ་དང་བྲལ་བར་གྱུར་ཅིག  །སེམས་ཅན་ཐམས་ཅད་སྡུག་བསྔལ་མེད་པའི་བདེ་བ་དང་མི་འབྲལ་བར་གྱུར་ཅིག   །སེམས་ཅན་ཐམས་ཅད་ཉེ་རིང་ཆགས་སྡང་གཉིས་དང་བྲལ་བའི་བཏང་སྙོམས་ལ་གནས་པར་གྱུར་ཅིག །ལན་གསུམ། གང་གིས་རྟེན་ཅིང་འབྲེལ་བར་འབྱུང་། །འགག་པ་མེད་པ་སྐྱེ་མེད་པ། །ཆད་པ་མེད་པ་རྟག་མེད་པ། །འོང་བ་མེད་པ་འགྲོ་མེད་པ། །ཐ་དད་དོན་མིན་དོན་གཅིག་མིན། །སྤྲོས་པ་ཉེར་ཞི་ཞི་བསྟན་པ། །རྫོགས་པའི་སངས་རྒྱས་སྨྲ་རྣམས་ཀྱི། །དམ་པ་དེ་ལ་ཕྱག་འཚལ་ལོ། །ཉན་ཐོས་ཞི་བ་འཚོལ་རྣམས་ཀུན་ཤེས་ཉིད་ཀྱིས་ཉེར་ཞིར་འཁྲིད་མཛད་གང་ཡིན་དང་། །འགྲོ་ལ་ཕན་པར་བྱེད་རྣམས་ལམ་ཤེས་ཉིད་ཀྱིས་འཇིག་རྟེན་དོན་སྒྲུབ་མཛད་པ་གང་། །གང་དང་ཡང་དག་ལྡན་པའི་ཐུབ་རྣམས་རྣམ་པ་ཀུན་ལྡན་སྣ་ཚོགས་འདི་གསུངས་པ། །ཉན་ཐོས་བྱང་ཆུབ་སེམས་དཔའི་ཚོགས་བཅས་སངས་རྒྱས་ཀྱི་ནི་ཡུམ་དེ་ལ་ཕྱག་འཚལ་ལོ། །རྟོག་པའི་དྲ་བ་རྣམ་བསལ་ཅིང་། །ཟབ་ཅིང་རྒྱ་ཆེའི་སྐུ་མངའ་བ། །ཀུན་ཏུ་བཟང་བོའི་འོད་ཟེར་དག  །ཀུན་ནས་འཕྲོ་ལ་ཕྱག་འཚལ་ལོ། །མ་ལུས་སེམས་ཅན་ཀུན་གྱི་མགོན་གྱུར་ཅིང་། །བདུད་སྡེ་དཔུང་བཅས་མི་བཟད་འཇོམས་མཛད་ལྷ། །དངོས་རྣམས་མ་ལུས་ཡང་དག་མཁྱེན་གྱུར་པའི། །བཅོམ་ལྡན་འཁོར་བཅས་གནས་འདིར་གཤེགས་སུ་གསོལ། །ཇི་ལྟར་བལྟམས་པ་ཙམ་གྱིས་ནི། །ལྷ་རྣམས་ཀྱིས་ནི་ཁྲུས་གསོལ་ལྟར། །ལྷ་ཡི་ཆུ་ནི་དག་པ་ཡིས། །དེ་བཞིན་བཅོམ་ལྡན་སྐུ་ཁྲུས་གསོལ། །ས་གཞི་སྤོས་ཀྱིས་བྱུགས་ཤིང་མེ་ཏོག་བཀྲམ། །རི་རབ་གླིང་བཞི་ཉི་ཟླས་བརྒྱན་པ་འདི། །སངས་རྒྱས་ཞིང་དུ་དམིགས་ཏེ་ཕུལ་བ་ཡིས། །འགྲོ་ཀུན་རྣམ་དག་ཞིང་ལ་སྤྱོད་པར་ཤོག   །ཨི་དཾ་གུ་རུ་རཏྣ་མཎྜལ་ཁཾ་ནི་རྻ་དཱ་ཡ་མི། །སརྦ་མངྒ་ལཾ། ། །།");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
    public boolean onOptionsItemSelected(MenuItem item)
	{switch (item.getItemId()) {
	case R.id.da:
		jiazhuo01.setTextSize(35);
		break;
	case R.id.zhun:
		jiazhuo01.setTextSize(25);
		break;
	case R.id.xiao:
		jiazhuo01.setTextSize(18);
		break;
	case R.id.muzhi:
		jiazhuo01.setBackgroundResource(R.drawable.back);
		break;
	case R.id.yangpi:
		jiazhuo01.setBackgroundResource(R.drawable.back1);
		break;
	case R.id.jinshu:
		jiazhuo01.setBackgroundResource(R.drawable.back2);
		break;
	case R.id.hei:
		jiazhuo01.setBackgroundColor(Color.BLACK);
		break;
	case R.id.bai:
		jiazhuo01.setBackgroundColor(Color.WHITE);
		break;
	case R.id.baise:
		jiazhuo01.setTextColor(Color.WHITE);
		break;
	case R.id.heise:
		jiazhuo01.setTextColor(Color.BLACK);
		break;
	case R.id.hongse:
		jiazhuo01.setTextColor(Color.RED);
		break;
	case R.id.huangse:
		jiazhuo01.setTextColor(Color.YELLOW);
		break;
	case R.id.lanse:
		jiazhuo01.setTextColor(Color.BLUE);
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
