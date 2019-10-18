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

public class duojuedexieActivity extends Activity{
private TextView duojuedexiel;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.duojuedexiemain);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		duojuedexiel = (TextView)findViewById(R.id.duojuedexial);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/himalaya.ttf" );
		duojuedexiel.setTypeface (face);
		duojuedexiel.setBackgroundColor(Color.BLACK);
		duojuedexiel.setTextColor(Color.WHITE);
		duojuedexiel.setMovementMethod(ScrollingMovementMethod.getInstance());
		duojuedexiel.setText("༄༅། །ༀ་བདེ་ལེགས་སུ་གྱུར་ཅིག འཇིག་རྟེན་མཐོ་རིས་བྱང་གྲོལ་ལྟ་བའི་མིག  །སྲིད་ལམ་འཁྱམས་པས་དུབ་པའི་ངལ་གསོའི་གནས། །བདེ་ལེགས་རྩ་བ་དྲིན་ཆེན་བླ་མ་དང་། །རྗེ་བཙུན་མཁྱེན་པའི་གཏེར་གྱི་ཞབས་ལ་འདུད། །འབད་པ་ཆུང་ངུས་རླབས་ཆེན་ཚོགས་སྡུད་ལ། །དགེ་ལ་རྗེས་སུ་ཡི་རང་མཆོག་ཏུ་གསུངས། །ཁྱད་པར་རང་གིས་སྔོན་བྱས་དགེ་བ་ལ། །རློམ་སེམས་བྲལ་བས་དགའ་བ་ཆེར་བསྐྱེད་ན། །སྔོན་བྱས་དགེ་བ་གོང་དུ་འཕེལ་ལོ་ཞེས། །རྒྱལ་བས་གསུངས་པའི་དོན་དེ་སྒྲུབ་ཕྱིར་དང་། །དགོས་པ་གཞན་ཡང་མང་དུ་མཐོང་བས་ན། །སེམས་ཁྱོད་དགའ་བ་འདི་ལྟར་བསྐྱེད་ན་ལེགས། །དང་པོར་རྒྱ་ཆེན་ཐོས་པ་མང་དུ་བཙལ། །བར་དུ་གཞུང་ལུགས་ཐམས་ཅད་གདམས་པར་ཤར། །ཐ་མར་ཉིན་མཚན་ཀུན་ཏུ་ཉམས་སུ་བླངས། །ཀུན་ཀྱང་བསྟན་པ་རྒྱས་པའི་ཆེད་དུ་བསྔོས། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །བླང་དོར་གནས་ལ་ཀུན་ནས་འཐོམས་པའི་མུན། །ཡང་དག་ཐོས་པའི་སྒྲོན་མེ་མ་བསལ་བར། །ལམ་མི་ཤེས་ན་ཐར་པའི་གྲོང་མཆོག་ཏུ། །འཇུག་པར་འགྱུར་བ་སྨོས་ཀྱང་ཅི་ཞིག་དགོས། །དེ་ཉིད་ཕྱིར་ན་མི་ཕམ་ཆོས་རྗེ་དང་། །འཛམ་གླིང་རྒྱན་དྲུག་མཆོག་གཉིས་ཞེས་གྲགས་པའི། །གཞུང་ལ་ཕྱོགས་རེ་བ་དང་རགས་པ་རེས། །ཚིམ་པར་མ་བྱས་ཀུན་ལ་ཞིབ་ཏུ་སྦྱངས། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །ཁྱད་པར་ཚུ་རོལ་མཐོང་བས་དངོས་པོ་ཡིས། །དེ་ཉིད་གཏན་ལ་འབེབས་པའི་སྒོ་གཅིག་པུ། །ཡང་དག་རིགས་པའི་གཞུང་གི་དཀའ་གནས་ལ། །འབད་པ་དུ་མས་ཡང་དང་ཡང་དུ་སྦྱངས། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །མདོ་སྔགས་གཞུང་ལ་ངལ་བ་མང་བྱས་ཀྱང་། །ཟབ་དོན་ཉམས་སུ་ལེན་དང་སྨྲ་བ་ན། །གང་ཡང་མ་བསླབས་ཅི་ཡང་མི་ཤེས་པའི། །ལྟ་བའི་ཚུལ་ལས་རིང་དུ་མ་སོང་བར། །མཐོང་ནས་ལྷག་པར་ཀླུ་སྒྲུབ་གཞུང་ལུགས་ཀྱི། །ཟབ་མོ་འབྱེད་པའི་ཕྲ་བའི་རིགས་ལམ་ནས། །ཡང་དག་ལྟ་བ་འདྲེན་པའི་གནད་ཀུན་ལ། །ལེགས་པར་སྦྱངས་ཏེ་ཐེ་ཚོམ་ཆོད་པར་བྱས། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །འདི་ན་རྫོགས་སངས་རྒྱས་སུ་བགྲོད་པ་ལ། །ཟབ་མོ་རྡོ་རྗེ་ཐེག་དང་ཕར་ཕྱིན་ཐེག  །རྣམ་པ་གཉིས་ཡོད་གསང་སྔགས་ཕར་ཕྱིན་ལས། །ཤིན་ཏུ་ཁྱད་པར་འཕགས་པ་ཡིན་ནོ་ཞེས། །ཉི་མ་ཟླ་བ་ལྟ་བུར་ཀུན་ཏུ་གྲགས། །ཚིག་དེ་བདེན་པའི་ཚིག་ཏུ་འདོད་བཞིན་དུ། །ཟབ་མོའི་ཐེག་དེ་ཇི་ལྟ་བུ་ཞིག་ཞེས། །འཚོལ་བར་མི་བྱེད་མཁས་པའི་ཁུར་འཛིན་པ། །དེ་འདྲ་དེ་ཡང་ཤེས་རབ་ཅན་ཡིན་ན། །དེ་ལས་གཞན་པའི་དབང་པོ་རྟུལ་བོ་གང་། །ཤིན་ཏུ་ཕྲད་དཀའ་གོང་ན་མེད་པའི་ལམ། །འདི་འདྲ་ཡལ་བར་འདོར་བ་ཀྱེ་མའོ་མཚར། །དེ་ཉིད་ཕྱིར་ན་རྒྱལ་བའི་ཐེག་པ་མཆོག  །སངས་རྒྱས་ལས་ཀྱང་དཀོན་པའི་རྡོ་རྗེ་ཐེག  །དངོས་གྲུབ་གཉིས་ཀྱི་གཏེར་གྱུར་ཟབ་མོ་དེར། །ཞུགས་ནས་འབད་པ་མང་པོས་རིང་དུ་སྦྱངས། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །རྒྱུད་སྡེ་འོག་མ་གསུམ་གྱི་ལམ་གྱི་ཚུལ། །མི་ཤེས་དེ་ཡིས་རྣལ་འབྱོར་བླ་མེད་རྒྱུད། །རྒྱུད་སྡེ་ཀུན་གྱི་མཆོག་ཏུ་ཐག་བཅད་ཀྱང་། །དམ་བཅའ་ཙམ་དུ་ཟད་པར་ལེགས་མཐོང་ནས། །གསང་བ་སྤྱི་རྒྱུད་ལེགས་པར་གྲུབ་པ་དང་། །དཔུང་བཟང་གིས་ཞུས་བསམ་གཏན་ཕྱི་མ་སོགས། །བྱ་རྒྱུད་རིགས་གསུམ་སྤྱི་དང་བྱེ་བྲག་གི །རྒྱུད་སྡེ་རྣམས་ལ་རིང་དུ་འདྲིས་པར་བྱས། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །རྒྱུད་སྡེ་གཉིས་པ་སྤྱོད་པའི་རྒྱུད་རྣམས་ཀྱི། །གཙོ་བོར་གྱུར་པ་རྣམ་སྣང་མངོན་བྱང་གི །རྒྱུད་ལ་སྦྱངས་པས་སྤྱོད་པའི་རྒྱུད་ཀྱི་ཕྱོགས། །གང་ཡིན་དེ་ཡང་ལེགས་པར་ངེས་པར་བྱས། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །རྒྱུད་སྡེ་གསུམ་པ་རྣལ་འབྱོར་རྒྱུད་རྣམས་ཀྱི། །གཙོ་བོ་དཔལ་ལྡན་དེ་ཉིད་བསྡུས་པའི་རྒྱུད། །བཤད་རྒྱུད་རྡོ་རྗེ་རྩེ་མོ་ལ་སོགས་ལ། །སྦྱངས་པས་རྣལ་འབྱོར་རྒྱུད་ཀྱི་དགའ་སྟོན་མྱོང་། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །བཞི་བ་རྣལ་འབྱོར་བླ་ན་མེད་པ་ལ། །འཕགས་ཡུལ་མཁས་པ་རྣམས་ལ་ཉི་ཟླ་ལྟར། །ཡོངས་སུ་གྲགས་པའི་ཕ་རྒྱུད་འདུས་པ་དང་། །རྣལ་འབྱོར་མ་རྒྱུད་ཀྱཻ་རྡོར་བདེ་མཆོག་གི  །རྩ་རྒྱུད་བཤད་པའི་རྒྱུད་ལ་སོགས་པ་དང་། །མདོ་རྒྱུད་གཞན་དང་བཤད་སྲོལ་མི་འདྲ་བའི། །ཤིང་རྟའི་སྲོལ་འབྱེད་དུས་ཀྱི་འཁོར་ལོའི་རྒྱུད། །གསལ་བྱེད་དྲི་མ་མེད་པའི་འོད་ལ་སྦྱངས། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །དང་པོར་རྒྱ་ཆེན་པོའི་མང་དུ་ཐོས་པ་བཙལ་བའི་སྐབས་ཏེ་དང་པོའོ། །\nདེ་ནས་གདུལ་བྱའི་བློ་མུན་སེལ་བའི་མཆོག །འཇམ་པའི་དབྱངས་ལ་ཤུགས་དྲག་རྒྱུན་རིང་གི །དད་པ་བརྟན་པོས་གཞུང་ལུགས་གདམས་པ་རུ། །འཆར་ཕྱིར་གསོལ་བཏབ་རྒྱུ་ཚོགས་ཀུན་ལ་འབད། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །དེ་ལྟར་འབད་པས་ཀླུ་སྒྲུབ་ཐོགས་མེད་ལས། །རིམ་བཞིན་བརྒྱུད་པའི་བྱང་ཆུབ་ལམ་རིམ་ལ། །ཐུན་མོང་མིན་པའི་ངེས་པ་རྙེད་གྱུར་པས། །ཟབ་མོའི་གཞུང་མཆོག་ཕར་ཕྱིན་གདམས་པར་ཤར། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །བྱང་ཕྱོགས་འདི་ན་ཚད་མའི་གཞུང་ལུགས་ལ། །སྦྱངས་དང་མ་སྦྱངས་དུ་མ་མགྲིན་གཅིག་ཏུ། །མདོ་དང་སྡེ་བདུན་ཀུན་ལ་བྱང་ཆུབ་ཏུ། །བགྲོད་པའི་ཉམས་ལེན་རིམ་པ་ཡོད་མིན་ཟེར། །འཇམ་པའི་དབྱངས་ཀྱིས་ཕྱོགས་ཀྱི་གླང་པོ་ལ། །དངོས་སུ་འདི་རྩོམས་འདི་ནི་མ་འོངས་དུས། །འགྲོ་བ་ཀུན་གྱི་མིག་ཏུ་འགྱུར་རོ་ཞེས། །གསུང་གི་གནང་བ་བསྩལ་པའང་ཚད་མར་བྱེད། །དེ་ནི་མི་རིགས་སྨྲ་བའི་ཕུལ་བྱུང་དུ། །མཐོང་ནས་ལྷག་པར་ཚུལ་དེར་དཔྱད་པ་ན། །ཚད་མ་ཀུན་ལས་བཏུས་པའི་མཆོད་བརྗོད་དོན། །ཚད་མ་གྲུབ་པར་ལུགས་འབྱུང་ལུགས་ལྡོག་གིས། །རྣམ་གྲོལ་དོན་དུ་གཉེར་ལ་བཅོམ་ལྡན་འདས། །ཚད་མར་བསྒྲུབས་ཤིང་དེ་ལས་དེ་ཡིས་ནི། །བསྟན་པ་ཁོ་ན་ཐར་འདོད་འཇུག་ངོགས་སུ། །ངེས་པ་གཏིང་ནས་རྙེད་པས་ཐེག་གཉིས་ཀྱི། །ལམ་གྱི་གནད་ཀུན་འདྲིལ་བར་རིགས་ལམ་ནས། །ལེགས་པར་ཐོན་པས་ལྷག་པར་དགའ་བ་རྙེད། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །དེ་ནས་བྱང་ས་མདོ་སྡེའི་རྒྱན་གཉིས་པོ། །ལེགས་པར་སྦྱར་ཏེ་ཚུལ་བཞིན་རབ་འབད་པས། །མི་ཕམ་ཆོས་རྗེའི་གཞུང་དང་རྗེས་འབྲང་གི  །གཞུང་ཀུན་ཉམས་སུ་ལེན་པའི་གདམས་པར་ཤར། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །ལྷག་པར་ཟབ་དང་རྒྱ་ཆེའི་གསུང་རབ་ཚོགས། །བསྒྲིགས་པའི་གོ་རིམ་ཉིད་ལ་ལམ་གྱི་གནད། །ཀུན་ལ་ངེས་སྟེར་བསླབ་པ་ཀུན་བཏུས་ལ། །བརྟེན་ནས་མདོ་སྡེ་ཀུན་ལས་བཏུས་པ་སོགས། །ཀླུ་སྒྲུབ་ལུགས་ཀྱི་གཞུང་ལུགས་དུ་མའི་དོན། །ཉམས་སུ་ལེན་པའི་རིམ་པ་ལེགས་པར་མཐོང་། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །དེ་ནས་བསམ་གཏན་ཕྱི་མ་རྣམ་སྣང་ནི། །མངོན་པར་བྱང་ཆུབ་སངས་རྒྱས་གསང་བ་ཡིས། །ལེགས་པར་བཤད་པའི་མན་ངག་ལ་བརྟེན་ནས། །ལམ་གྱི་གནད་ཀུན་ལེགས་པར་གདམས་པར་ཤར། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །དཔལ་ལྡན་དེ་ཉིད་བསྡུས་པའི་ལམ་གྱི་གནད། །ཏིང་འཛིན་གསུམ་གྱིས་བསྡུས་པར་མཐོང་བ་ནི། །ཅུང་ཟད་སླ་ཡང་ལམ་དེར་ཟབ་མོའི་དོན། །སྒོམ་ཚུལ་རྟོགས་པར་དཀའ་བ་པཎ་ཆེན་ནི། །སངས་རྒྱས་གསང་བས་རྩ་བཤད་ཆ་མཐུན་རྒྱུད། །རྣམ་གསུམ་སྦྱར་ཏེ་ཚུལ་བཞིན་བཤད་པ་དང་། །རྒྱུད་སྡེ་གསུམ་གྱི་ཟབ་མོའི་ཉམས་ལེན་རྣམས། །སྒོམ་རིམ་ཇི་བཞིན་བཤད་པས་བློ་མུན་བསལ། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །ཐུབ་པའི་ལེགས་བཤད་ཀུན་གྱི་མཐར་ཐུག་པ། །དཔལ་ལྡན་རྣལ་འབྱོར་བླ་ན་མེད་པའི་རྒྱུད། །དེ་ཡི་ནང་ནས་ཤིན་ཏུ་ཆེས་ཟབ་པ། །དཔལ་ལྡན་གསང་བ་འདུས་པའི་རྒྱུད་རྒྱལ་ལ། །སྨྲ་བའི་དམ་པ་ཀླུ་སྒྲུབ་འདི་སྐད་གསུང་། །རྩ་བའི་རྒྱུད་དུ་ལམ་གྱི་གནད་རྣམས་ནི། །མཐའ་དྲུག་ཚུལ་བཞིའི་རྒྱ་ཡིས་བཏབ་སྟེ་གནས། །དེ་ཕྱིར་བཤད་པའི་རྒྱུད་ཀྱི་རྗེས་འབྲངས་ནས། །བླ་མའི་མན་ངག་ལས་ནི་ཤེས་བྱར་གསུངས། །ཚུལ་དེ་གནད་དུ་བཟུང་ནས་མན་ངག་གི །མཐར་ཐུག་མདོར་བྱས་སྤྱོད་བསྡུས་རྣམ་བཞག་སོགས། །འདུས་པ་འཕགས་པའི་སྐོར་གྱི་ཕྲན་ཀུན་ལ། །རིང་དུ་འདྲིས་པར་བྱས་ཏེ་རྩ་བའི་རྒྱུད། །སྒྲོན་མེ་ལྟ་བུར་གསལ་བར་བྱེད་པ་ལ། །བརྟེན་ནས་བཤད་རྒྱུད་ཆེན་པོ་ལྔ་དང་ནི། །ལེགས་པར་སྦྱར་ལ་འབད་པ་ཆེན་པོས་སྦྱངས། །སྦྱངས་ལས་འདུས་པའི་རིམ་གཉིས་སྤྱི་དང་ནི། །ཁྱད་པར་རྫོགས་པའི་རིམ་པའི་གནད་ཀུན་རྙེད། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེེར། །དེ་ཡི་མཐུ་ལས་བདེ་དགྱེས་དུས་འཁོར་སོགས། །རྒྱུད་སྡེ་མང་པོའི་གནད་དོན་གདམས་པར་ཤར། །དེ་དག་བདག་གིས་གཞན་དུ་བཤད་པས་ན། །འདིར་ནི་རྣམ་དཔྱོད་ཅན་ལ་སྒོ་ཙམ་ཞིག །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །བར་དུ་གཞུང་ལུགས་ཐམས་ཅད་གདམས་པར་ཤར་བའི་སྐབས་ཏེ་གཉིས་པའོ། །\nདེ་ལྟར་གདམས་པའི་གཏེར་དུ་གྱུར་པ་ན། །ཐེག་ཆེན་གཉིས་ཀྱི་ཐུན་མོང་ལམ་དང་ནི། །ཐུན་མོང་མིན་པའི་ལམ་གྱི་རིམ་པ་གཉིས། །གནད་བསྡུས་ཚང་བའི་ལམ་ལ་འདྲིས་པར་སྦྱངས། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །རྒྱལ་སྲས་སྨོན་ལམ་གང་གཱའི་ཀླུང་རྣམས་ནི། །དམ་ཆོས་འཛིན་པའི་སྨོན་ལམ་ནང་འདུས་པར། །གསུངས་ཕྱིར་དགེ་རྩ་ཇི་སྙེད་བསགས་པ་ནི། །ཀུན་ཀྱང་ཐུབ་བསྟན་རྒྱས་པའི་ཆེད་དུ་བསྔོས། །ཚུལ་འདི་བསམས་ཤིང་འདུན་མ་ལེགས་ནས་གདའ། །བཀའ་དྲིན་ཆེའོ་རྗེ་བཙུན་མཁྱེན་པའི་གཏེར། །ཐ་མར་ཉིན་མཚན་ཀུན་ཏུ་ཉམས་སུ་བླངས་པ་དང་། ཀུན་ཀྱང་བསྟན་པ་རྒྱས་པའི་ཆེད་དུ་བསྔོས་པའི་སྐབས་ཏེ་གསུམ་པའོ། །\nརང་གི་དགེ་བ་རྒྱ་ཆེར་སྤེལ་ཕྱིར་དང་། །རྣམ་དཔྱོད་ལྡན་པའི་སྐལ་བཟང་མང་པོ་ལ། །འཇུག་སྒོ་མ་ནོར་ཚུལ་བཞིན་བསྟན་པའི་ཕྱིར། །རང་གི་རྟོགས་པ་བརྗོད་པ་འདི་བྱས་སོ། །དེ་ལས་ཐོབ་པའི་དགེ་བའི་ཚོགས་རྣམས་ཀྱི། །རིམ་པ་འདི་ཡིས་འགྲོ་བ་མ་ལུས་ཀུན། །ཐུབ་པའི་བརྟུལ་ཞུགས་བླ་ན་མེད་བཟུང་ནས། །རྒྱལ་བ་དགྱེས་པའི་ལམ་ལ་འཇུག་པར་ཤོག  །ཅེས་པ་འདི་ནི་རྗེ་ཙོང་ཁ་པ་བློ་བཟང་གྲགས་པས་མཛད་པའོ།  །");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	  public boolean onOptionsItemSelected(MenuItem item)
	  {switch (item.getItemId()) {
		case R.id.da:
			duojuedexiel.setTextSize(35);
			break;
		case R.id.zhun:
			duojuedexiel.setTextSize(25);
			break;
		case R.id.xiao:
			duojuedexiel.setTextSize(18);
			break;
		case R.id.muzhi:
			duojuedexiel.setBackgroundResource(R.drawable.back);
			break;
		case R.id.yangpi:
			duojuedexiel.setBackgroundResource(R.drawable.back1);
			break;
		case R.id.jinshu:
			duojuedexiel.setBackgroundResource(R.drawable.back2);
			break;
		case R.id.hei:
			duojuedexiel.setBackgroundColor(Color.BLACK);
			break;
		case R.id.bai:
			duojuedexiel.setBackgroundColor(Color.WHITE);
			break;
		case R.id.baise:
			duojuedexiel.setTextColor(Color.WHITE);
			break;
		case R.id.heise:
			duojuedexiel.setTextColor(Color.BLACK);
			break;
		case R.id.hongse:
			duojuedexiel.setTextColor(Color.RED);
			break;
		case R.id.huangse:
			duojuedexiel.setTextColor(Color.YELLOW);
			break;
		case R.id.lanse:
			duojuedexiel.setTextColor(Color.BLUE);
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