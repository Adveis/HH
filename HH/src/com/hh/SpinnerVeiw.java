package com.hh;


import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SpinnerVeiw extends Spinner {

	String[] data = { "123" };
	int i = 0;
	Resources res = getResources();

	public SpinnerVeiw(Context context, AttributeSet attrs) {

		super(context, attrs);
		try {
			i = Integer.valueOf(attrs.getAttributeValue(0).substring(1,
					attrs.getAttributeValue(0).length()));
			data = res.getStringArray(i);
		} catch (Exception e) {
			Log.d("my", "Error");
			// TODO: handle exception
		}
		init();
	}

	ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getContext(),
			R.layout.activity_hh , data) {
		// Выбранный элемент
		public View getView(int position, View convertView, ViewGroup parent) {
			View v = super.getView(position, convertView, parent);
			((TextView) v).setText(data[0]);
			((TextView) v).setTextColor(getResources().getColorStateList(
					android.R.color.darker_gray));
			return v;
		}

		// Раскрытый список
		public View getDropDownView(int position, View convertView,
				ViewGroup parent) {
			View v = super.getDropDownView(position, convertView, parent);
			((TextView) v).setTextColor(getResources().getColorStateList(
					android.R.color.darker_gray));
			return v;
		}

	};

	public void init() {
		setAdapter(adapter1);
		invalidate();
	}

}

