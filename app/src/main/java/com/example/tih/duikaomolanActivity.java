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

public class duikaomolanActivity extends Activity{
private TextView duikaomolanl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.duikaomolanmain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		duikaomolanl = (TextView)findViewById(R.id.duikaomolanl);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		duikaomolanl.setTypeface (face);
		duikaomolanl.setBackgroundColor(Color.BLACK);
		duikaomolanl.setTextColor(Color.WHITE);
		duikaomolanl.setMovementMethod(ScrollingMovementMethod.getInstance());
		duikaomolanl.setText("༄༅། །ༀ་བདེ་ལེགས་སུ་གྱུར་ཅིག བླ་མ་དང་དཔལ་དུས་ཀྱི་འཁོར་ལོའི་ལྷ་ཚོགས་རྣམས་ལ་གུས་པས་ཕྱག་འཚལ་ལོ། །དེ་ལྟར་ལྷག་བསམ་དག་པའི་གངས་རི་ལས། །བསྒོམ་བཟླས་མཆོད་པའི་ཆུ་རྒྱུན་དྲི་མ་མེད། །བདག་བློའི་ཆུ་མཚོར་ཡང་ཡང་བསགས་པ་ལས། །དགེ་ཚོགས་རྒྱ་མཚོ་ཆེས་ཆེར་རྒྱས་པ་དང་། །གཞན་ཡང་དུས་གསུམ་དང་འབྲེལ་དགེ་བའི་ཚོགས། །མ་ལུས་བློ་ཡིས་གཅིག་ཏུ་བསྡོམས་པའི་མཐུས། །སྐྱེ་དང་སྐྱེ་བར་ཐེག་མཆོག་དགེ་བའི་བཤེས། །དམ་པའི་མགོན་གྱིས་རྗེས་སུ་འཛིན་པར་ཤོག །དེ་ཡིས་དགྱེས་བཞིན་བསྩལ་པའི་གདམས་པ་ལས། །ཐེག་པ་གསུམ་གྱི་ཆོས་རྣམས་བསྡུ་བའི་ཚུལ། །ཤེས་ཤིང་དེ་དོན་ཉམས་སུ་བླངས་པ་ལས། །ཐུན་མོང་ལམ་གྱིས་བདག་རྒྱུད་སྨིན་པར་ཤོག །རྣམ་དག་དབང་བདུན་ཐོབ་པས་ས་བདུན་གྱི། །ནུས་པ་ལེགས་བཞག་ཁམས་སོགས་དྲི་མ་བདུན། །འཁྲིད་ཅིང་རིམ་པ་དང་པོའི་རྣལ་འབྱོར་དང་། །ཐུན་མོང་དངོས་གྲུབ་བསྒྲུབ་ལ་དབང་བར་ཤོག །འཇིག་རྟེན་འཇིག་རྟེན་འདས་པའི་དབང་མཆོག་བཞི། །སྐུ་བཞི་རྡོ་རྗེ་བཞི་ཡི་ས་བོན་བཞག །རིམ་པ་གཉིས་པའི་བསྙེན་བསྒྲུབ་ཡན་ལག་བཞི། །ཉན་དང་འཆད་དང་བསྒོམ་ལ་དབང་བར་ཤོག །རྡོ་རྗེ་ཐེག་པའི་གཞལ་མེད་ཁང་མཆོག་ཏུ། །མ་ཉམས་དམ་ཚིག་སྡོམ་པའི་རྐང་རྟེན་དང་། །རྣམ་དག་དབང་བཞིའི་ཁྲི་ལ་ལེགས་འདུག་སྟེ། །རིམ་གཉིས་ཆོས་ཀྱི་འཁོར་ལོས་བསྒྱུར་བར་ཤོག །སྐུ་དང་གསུང་ཐུགས་ཡེ་ཤེས་སྦྱངས་ཤིང་དག །རིགས་དྲུག་ཡན་ལག་དྲུག་བསྒོམ་རྣལ་འབྱོར་དང་། །ལུས་གནས་སོ་སོར་བཀོད་པའི་རྡོ་རྗེའི་འོད། །རབ་འབར་དྲག་པོས་བདུད་བགེགས་བསྲེག་པར་ཤོག །མཁའ་དབྱིངས་དབུས་སུ་འབྱུང་བའི་དཀྱིལ་འཁོར་བཞི། །བསྐྱེད་ཅིང་གཅིག་ཏུ་འདྲེས་ལས་རྡོ་རྗེ་ཡི། །ར་བ་རིམ་ལྔ་དང་རིམ་པ་གསུམ། །ཁང་བརྩེགས་གདན་དང་བཅས་པ་འགྲུབ་པར་ཤོག །དེ་དབུས་རང་ཉིད་དཔལ་ལྡན་རྡོ་རྗེ་ཤུགས། །ཁྲོ་བོའི་དབང་བོའི་ཏིང་འཛིན་བརྟན་པོ་ཡིས། །སྒོ་རྣམས་ཀུན་ལས་བསྲུང་མ་དྲུག་ཅུའི་ཚོགས། །སྤྲོས་པས་ཕྱི་ནང་བདུད་བགེགས་ཚར་གཅོད་ཤོག །སྤྲོ་དང་བསྡུ་བའི་སྦྱོར་བས་ཚོགས་ཀྱི་ཞིང་། །ནམ་མཁའི་དབྱིངས་ཀུན་ཁྱབ་པར་རྟོགས་བྱས་ཏེ། །སྦྱོར་བ་ཚོགས་བསགས་ཆོ་ག་བཞིན་བྱས་པས། །རླབས་ཆེན་ཚོགས་རྣམས་ཡོངས་སུ་རྗོགས་པར་ཤོག །འཆི་རིམ་ཇི་བཞིན་ཁམས་དྲུག་ཐིམ་པའི་མཐར། །ཆོས་ཀྱི་སྐུ་ཡི་ང་རྒྱལ་གོམས་བྱས་པས། །སྐད་ཅིག་གཅིག་ལ་མངོན་པར་བྱང་ཆུབ་པའི། །རྣམ་ཐར་སྒོ་བཞིའི་ཏིང་འཛིན་མཐར་ཕྱིན་ཤོག །ནམ་མཁའ་རླུང་མེ་ཆུ་ས་རི་རབ་རྣམས། །བསྒོམས་པས་གཙུག་ཏོར་དཔྲལ་མགྲིན་སྙིང་ག་དང་། །ལྟེ་བ་གསང་བའི་གནས་ཀྱི་རྩ་འཁོར་སོགས། །རྡོ་རྗེའི་ལུས་ཀྱི་གནས་ལུགས་རྟོགས་པར་ཤོག །པདྨ་ཟླ་ཉི་སྒྲ་གཅན་དུས་མེའི་སྟེང་། །རྡོ་རྗེའི་གུར་དང་བཅས་པ་ལེགས་བསྒོམས་པས། །རོ་རྐྱང་རླུང་གི་ཚོགས་རྣམས་དུང་ཅན་མར། །རྡོ་རྗེ་རྣལ་འབྱོར་མཆོག་གིས་འགོག་པར་ཤོག །དྲི་མེད་ནོར་བུའི་འོད་ཅན་གཞལ་ཡས་ཁང་། །རྡོ་རྗེའི་གུར་གྱི་ནང་དུ་བསྒོམས་པའི་མཐུས། །གང་དུ་འཚང་རྒྱའི་ཞིང་ཀུན་དག་པ་དང་། །རང་གི་ལུས་རྟེན་སྒྲིབ་པ་བྲལ་བར་ཤོག །ཟླ་ཉི་དབྱངས་གསལ་རླུང་སེམས་ཡི་གེ་གཉིས། །གཅིག་ཏུ་འདྲེས་པའི་ཧཾ་ཡིག་བསྒོམས་བྱས་པས། །དཀར་དམར་ཁམས་དང་ཕྲ་བའི་རླུང་སེམས་རྣམས། །དབུ་མར་ཚོགས་ལས་བདེ་ཆེན་སྐྱེ་བར་ཤོག །དེ་ལས་རྣམ་པ་ཀུན་གྱི་མཆོག་ལྡན་པའི། །བདེ་ཆེན་རང་བཞིན་དུས་ཀྱི་འཁོར་ལོའི་སྐུ། །ཆ་ཤས་ཡོངས་རྫོགས་རང་གི་རིག་མར་བཅས། །བདེ་ཆེན་འཁོར་ལོའི་ལྷ་རྣམས་བསྒོམས་པའི་མཐུས། །རྣམ་བཅས་རྣམ་མེད་ཕྱག་རྒྱའི་རིམ་པ་བཞིན། །དངོས་སུ་འཁྱུད་པའི་སྟོང་གཟུགས་ཕྱག་རྒྱ་ཆེ། །མི་འགྱུར་ལྷན་སྐྱེས་བདེ་བའི་རོས་གང་བའི། །རྫོགས་རིམ་མཆོག་རྣམས་སྐྱེ་བའི་རྒྱུར་གྱུར་ཅིག །ཡབ་ཡུམ་སྙོམས་པར་ཞུགས་པའི་ས་བོན་ལས། །མངལ་དུ་ཡོངས་རྫོགས་ལྷ་ཡི་འཁོར་ལོ་མཆོག །བསྐྱེད་ཅིང་རང་རང་གནས་སུ་ལེགས་བཀོད་པའི། །བསྙེན་པའི་ཡན་ལག་དཀྱིལ་འཁོར་རྒྱལ་པོ་མཆོག །རྣམ་པ་ལྔ་ཡིས་མངོན་པར་བྱང་ཆུབ་པ། །བསྒོམས་པས་ཕུང་བོ་ཁམས་དང་དབང་བོ་ཡུལ། །ལས་དབང་བྱ་བར་བཅས་རྣམས་སྦྱོང་བ་ཡི། །ལམ་གྱི་རྟོགས་པ་མཆོག་རྣམས་སྐྱེ་བར་ཤོག །བདེ་ཆེན་འཁོར་ལོའི་པདྨར་གནས་པ་ཡི། །རིག་མར་བཅས་པའི་བཅོམ་ལྡན་རྡོ་རྗེ་ཅན། །ལྟེ་བའི་གཏུམ་མོའི་མེ་ཡིས་བཞུས་པའི་མཐུས། །བདེ་ཆེན་ཐིག་ལེའི་གཟུགས་སུ་གནས་པ་ལ། །ལྷ་མོ་རྣམས་ཀྱི་སྙན་པའི་གླུ་དབྱངས་ཀྱིས། །བསྐུལ་བ་ལྔ་དང་དེ་བཞིན་བཞེངས་པ་ལྔ། །ཁྲོ་བོ་ལྔ་ཡིས་དམ་ཚིག་འཁོར་ལོ་ལ། །དགུག་གཞུག་བཅིངས་མཉེས་རོ་མཉམ་གྱུར་པ་ལྔ། །དེ་ལྟར་རྣམ་པ་ཉི་ཤུས་བྱང་ཆུབ་དང་། །དབང་བསྐུར་རྒྱས་གདབ་དག་པ་དྲན་པ་ཡིས། །ཉེར་བསྒྲུབས་ཡན་ལག་ལས་ཀྱི་རྒྱལ་པོ་མཆོག །བསྒོམས་པས་དེ་དོན་མངོན་དུ་འགྱུར་བར་ཤོག །མཁའ་གསང་བྱིན་གྱིས་བརླབས་ཏེ་སྙོམས་ཞུགས་པས། །ཐུར་སེལ་རླུང་གིས་བསྐུལ་པའི་གཏུམ་མོའི་མེ། །དྷཱུ་ཏཱིའི་ལམ་ནས་གྱེན་དུ་འབར་བ་ཡིས། །གཡས་གཡོན་རླུང་གི་རྒྱུ་བ་འགོག་པ་དང་། །སྤྱི་བོའི་དྷཱུ་ཡིག་ཞུ་བའི་བྱང་ཆུབ་སེམས། །རིམ་བཞིན་བབས་པས་ལུགས་འབྱུང་དགའ་བ་བཞི། །ལེགས་པར་མཚོན་པའི་བསྒྲུབ་པའི་ཡན་ལག་མཆོག །ཐིག་ལེའི་རྣལ་འབྱོར་མངོན་དུ་འགྱུར་བར་ཤོག །སླར་ཡང་ཇི་ལྟར་བྱོན་པའི་རིམ་པ་བཞིན། །སྟེང་དུ་གཤེགས་པའི་མས་བརྟན་དགའ་བ་བཞི། །སྒྲུབ་ཆེན་ཡན་ལག་ཕྲ་མོའི་རྣལ་འབྱོར་དང་། །སྒྱུ་འཕྲུལ་དྲ་བའི་མངོན་བྱང་མཐར་ཕྱིན་ཤོག །མདོར་ན་ཐ་མལ་སྣང་ཞེན་དག་བྱེད་ཆུ། །རྫོགས་རིམ་ཡོངས་རྫོགས་སྐྱེ་བའི་སྨིན་བྱེད་ལམ། །ཕྱི་ནང་སྦྱང་གཞི་སྦྱོང་བའི་བསྐྱེད་རིམ་མཆོག །ཐུན་བཞིར་བསྒོམ་ལ་བརྩོན་པ་མཐར་ཕྱིན་ཤོག །གཞན་ཡང་བཟླས་བརྗོད་སྦྱིན་སྲེག་མཆོད་སྦྱིན་ལ། །འབད་པས་འོག་མིན་གནས་ཀྱི་མཐར་ཐུག་པའི། །གྲུབ་པའི་དངོས་གྲུབ་སྒྲུབ་ལ་ཐོགས་མེད་པས། །མཐའ་ཡས་འགྲོ་བ་སྨིན་པར་བྱེད་པར་ཤོག །ཐོག་མར་དགེ་བའི་རྣལ་འབྱོར་སོར་བསམ་གཉིས། །བར་དུ་དགེ་བ་སྲོག་རྩོལ་འཛིན་པའི་ལམ། །ཐ་མར་དགེ་བ་རྗེས་དྲན་ཏིང་འཛིན་གྱི། །ཡན་ལག་དྲུག་ལ་གོམས་པར་བྱེད་པར་ཤོག །མིག་ཕྱེད་གྱེན་དུ་ལྡོག་པའི་ལྟ་སྟངས་ཀྱིས། །མིག་ཟུར་དྷཱུ་ཏཱིའི་ཡར་སྣའི་ནང་ཉིད་དུ། །ཆུད་པར་བསམ་པའི་གནས་དེར་རང་གི་ཡིད། །བྱིང་རྒོད་བྲལ་བས་རྩེ་གཅིག་འཇོག་པར་ཤོག །དེ་ལས་གཡས་གཡོན་རོ་རྐྱང་རླུང་གི་ཚོགས། །དྷཱུ་ཏཱིའི་གནས་དེར་འདུས་པའི་འཁྲུལ་མེད་རྟགས། །དུ་བ་སྨིག་རྒྱུ་མཁའ་སྣང་མར་མེ་ལྟའི། །མཚན་མོའི་རྟགས་བཞི་མངོན་དུ་འགྱུར་བར་ཤོག །སླར་ཡང་ཆུ་འཛིན་བྲལ་བའི་ནམ་མཁའ་ལ། །བལྟ་བའི་ཚུལ་གྱིས་སྔར་བཞིན་ལེགས་བསྒོམས་པས། །འབར་དང་ཟླ་བ་ཉི་མ་སྒྲ་གཅན་གློག །ཐིག་ལེར་བཅས་པའི་རྟགས་དྲུག་རྫོགས་པར་ཤོག །སྐུ་ཡི་ཐིག་ལེའི་གནས་སུ་སྟོང་གཟུགས་རྣམས། །རིམ་གྱིས་བསྡུས་ཏེ་ཇི་ལྟར་འདོད་པ་ཡི། །གཟུགས་ལ་རྩེ་གཅིག་དམིགས་པའི་བསམ་བཏན་གྱིས། །ལུས་སེམས་ཤིན་སྦྱངས་བདེ་བ་འདྲེན་པར་ཤོག །དེ་ལྟར་སྟོང་བའི་གཟུགས་རྣམས་བསྒྲུབ་པ་དང་། །གྲུབ་ཟིན་བརྟན་པར་བྱེད་པའི་རྣལ་འབྱོར་གཉིས། །རྩེ་གཅིག་གོམས་པའི་མཐུ་ལས་བདེན་པའི་ཚིག །མངོན་ཤེས་ལྔ་དང་བཅས་པ་འགྲུབ་པར་ཤོག །སྒྲ་གཅན་ལམ་ནས་རླུང་སྔགས་མི་ཕྱེད་པའི། །ལྷུན་གྲུབ་རྡོ་རྗེ་བཟླས་པའི་སྲོག་རྩོལ་དང་། །སྟེང་འོག་རླུང་རྣམས་ལྟེ་བར་འགོག་པ་ཡི། །བུམ་པ་ཅན་གྱི་སྲོག་རྩོལ་གོམས་པ་ཡིས། །སྤྲུལ་པའི་འཁོར་ལོའི་དབུས་སུ་རླུང་གི་ཚོགས། །མ་ལུས་ཞུགས་ཤིང་ཅུང་ཟད་གནས་པའི་རྟགས། །ཁྱད་པར་ཅན་རྣམས་ཤར་ཏེ་བྱང་སེམས་ཀྱིས། །བསྔགས་པའི་སྒྲ་དབྱངས་མངོན་དུ་འགྱུར་བར་ཤོག །འཁོར་ལོ་དྲུག་གི་ལྟེ་བར་སྲོག་ཐུར་གཉིས། །གཅིག་ཏུ་འདྲེས་པའི་དབུས་སུ་རང་གི་སེམས། །གཡོ་མེད་བརྟན་པར་འཛིན་པའི་རྣལ་འབྱོར་གྱིས། །ཡས་བབས་མས་བརྟན་དགའ་བཞི་བསྐྱེད་པའི་མཐར། །ཡིད་ངོར་སྟོང་གཟུགས་སྐུར་ནི་ལྡང་བ་དང་། །དུས་མིན་འཆི་བའི་བདུན་ཚོགས་ཉམས་པར་ཤོག །འདོད་དགུར་གཟུགས་དང་སྲོག་ལ་དབང་བའི་མཐུ། །ལེགས་པར་ཐོབ་ནས་སླར་ཡང་གཏུམ་མོའི་མེ། །འབར་བས་དྲངས་པའི་ལྷན་སྐྱེས་བདེ་ཆེན་ལས། །སྟོང་གཟུགས་ཡབ་ཡུམ་མཉམ་པར་སྦྱོར་བའི་སྐུར། །དངོས་སུ་བཞེངས་ཏེ་བ་སྤུའི་ཁུང་བུ་ནས། །འོད་ཟེར་ཁ་དོག་སྣ་ཚོགས་འགྱེད་པར་ཤོག །དེ་ལྟའི་སྟོང་གཟུགས་ཕྱག་རྒྱ་ཆེན་མོ་དང་། །མཉམ་པར་སྦྱོར་བས་ཕྱག་རྒྱའི་རང་སྟོབས་ཀྱིས། །ལེགས་པར་དྲངས་པའི་འགྱུར་མེད་བདེ་བ་ཆེ། །སྟོང་བ་ཉིད་དང་སྦྱར་ཏེ་བསྒོམ་པར་ཤོག །ཉི་ཁྲི་ཆིག་སྟོང་དྲུག་བརྒྱའི་གྲངས་ཀྱི་ཁམས། །དཀར་དམར་དྷཱུ་ཏཱིའི་ལམ་ནས་སྟེང་འོག་ཏུ། །བརྩེགས་པའི་མཐུ་ལས་ལུས་ཀྱི་བེམ་པོའི་ཁམས། །དངུལ་ཆུས་ལྕགས་ལ་ཇི་བཞིན་ཟ་བར་ཤོག །སྟོང་ཉིད་རྟོགས་པས་འགྱུར་མེད་བདེ་བ་ཆེ། །ཉི་ཁྲི་ཆིག་སྟོང་དྲུག་བརྒྱས་ལུས་ཀྱི་རླུང་། །དེ་སྙེད་འགོག་ཅིང་སྒྲིབ་པའི་བག་ཆགས་རྣམས། །མྱུར་དུ་སྦྱངས་ཏེ་རྒྱལ་བའི་སྐུ་ཐོབ་ཤོག །དེ་ལྟར་སྨོན་པའི་གནས་རྣམས་གེགས་མེད་པར། །བདེ་བླག་ཉིད་དུ་གྲུབ་ཏེ་ལམ་མཆོག་འདིས། །འགྲོ་རྣམས་རྒྱལ་བའི་རིན་ཆེན་གླིང་མཆོག་ཏུ། །སྒྲོལ་བའི་དེད་དཔོན་མཆོག་ཏུ་བདག་གྱུར་ཅིག །");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			duikaomolanl.setTextSize(35);
			break;
		case R.id.zhun:
			duikaomolanl.setTextSize(25);
			break;
		case R.id.xiao:
			duikaomolanl.setTextSize(18);
			break;
		case R.id.muzhi:
			duikaomolanl.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			duikaomolanl.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			duikaomolanl.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			duikaomolanl.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			duikaomolanl.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			duikaomolanl.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			duikaomolanl.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			duikaomolanl.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			duikaomolanl.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			duikaomolanl.setTextColor(Color.BLUE);
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
