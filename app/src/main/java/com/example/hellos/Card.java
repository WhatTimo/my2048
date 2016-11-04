package com.example.hellos;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Gravity;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {

	private int num;
	private TextView label;
	private String[] strs;
	private static final String[] nums = {"2", "4", "8", "16", "32", "64", "128", "256", "512", "1024", "2048", "4096", "8192"};
	private static final String[] qings = {"努尔哈赤", "皇太极", "顺治", "康熙", "雍正", "乾隆", "嘉庆", "道光", "咸丰", "同治", "光绪", "宣统", "民国"};
	private static final String[] xx = {"神皇", "天尊", "主宰", "闻道", "开光", "灵智", "消融", "神动", "元婴", "出窍", "灵虚", "玄灵", "渡劫成仙"};
	private static final String[] mm = {"一个宇宙", "八大行星", "200国家", "609岛屿", "77亿人", "而你", "连", "对象", "都", "找不到", "2048", "4096", "8192"};
	public Card(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		label = new TextView(context);
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		params.setMargins(10, 10, 0, 0);
		label.setGravity(Gravity.CENTER);
		label.setTextSize(32);
		
		label.setTypeface(Typeface.DEFAULT_BOLD);
		label.setBackgroundColor(0xffeee4da);
		label.setAnimation(AnimationUtils.loadAnimation(context, android.R.anim.fade_in));
		label.setAnimation(AnimationUtils.loadAnimation(context, android.R.anim.fade_out));
		addView(label, params);
		setNum(0);
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		Log.d("winson", "类型" + DataUtil.loadType(getContext()));
		switch (DataUtil.loadType(getContext())) {
		case 0:
//			strs = nums;
			strs=mm;
			break;
		case 1:
			strs = qings;
			break;
		default:
			break;
		}
	
		this.num = num;
		if (num <= 0) {
			label.setText("");
			label.setBackgroundColor(Color.WHITE);
			label.setTextColor(Color.BLACK);
		}
		else {
			
			if(num == 2){
				label.setText(strs[0]);
				label.setBackgroundColor(Color.WHITE);
				label.setTextColor(Color.BLACK);
			}
			if(num == 4){
				label.setText(strs[1]);
				label.setBackgroundColor(Color.BLUE);
				label.setTextColor(Color.WHITE);
			}
			if(num == 8){
				label.setText(strs[2]);
				label.setBackgroundColor(Color.CYAN);
				label.setTextColor(Color.BLACK);
			}
			if(num == 16){
				label.setText(strs[3]);
				label.setBackgroundColor(Color.DKGRAY);
				label.setTextColor(Color.WHITE);
			}
			if(num == 32){
				label.setText(strs[4]);
				label.setBackgroundColor(Color.GRAY);
				label.setTextColor(Color.WHITE);
			}
			if(num == 64){
				label.setText(strs[5]);
				label.setBackgroundColor(Color.GREEN);
				label.setTextColor(Color.WHITE);
			}
			if(num == 128){
				label.setText(strs[6]);
				label.setBackgroundColor(Color.LTGRAY);
				label.setTextColor(Color.WHITE);
			}
			if(num == 256){
				label.setText(strs[7]);
				label.setBackgroundColor(Color.MAGENTA);
				label.setTextColor(Color.WHITE);
			}
			if(num == 512){
				label.setText(strs[8]);
				label.setBackgroundColor(Color.RED);
				label.setTextColor(Color.WHITE);
			}
			if(num == 1024){
				label.setText(strs[9]);
				label.setBackgroundColor(Color.YELLOW);
				label.setTextColor(Color.BLACK);
			}
			if(num == 2048){
				label.setText(strs[10]);
				label.setBackgroundColor(Color.rgb(34, 26, 92));
				label.setTextColor(Color.WHITE);
			}
			if(num == 4096){
				label.setText(strs[11]);
				label.setBackgroundColor(Color.rgb(62, 52, 63));
				label.setTextColor(Color.WHITE);
			}
			
		}
	}
	
	public boolean equals(Card card) {
		return getNum() == card.getNum();
	}
}
