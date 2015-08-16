package com.miaoxingren.barchartview;

import com.example.barchartview.R;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class BarChartActivity extends ActionBarActivity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		try {
			BarChartView barChartView = (BarChartView) findViewById(R.id.bar_chart);
			BarChartView.BarChartItemBean[] items = new BarChartView.BarChartItemBean[] {
					new BarChartView.BarChartItemBean("��ҵ", 30),
					new BarChartView.BarChartItemBean("��������", 20),
					new BarChartView.BarChartItemBean("��ͨ����", 27),
					new BarChartView.BarChartItemBean("��ҵ", 11),
					new BarChartView.BarChartItemBean("��������", 12), };
			barChartView.setItems(items);
		} catch (Exception e) {
			e.getStackTrace();
		}

	}
}
