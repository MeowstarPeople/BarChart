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
					new BarChartView.BarChartItemBean("工业", 30),
					new BarChartView.BarChartItemBean("旅游娱乐", 20),
					new BarChartView.BarChartItemBean("交通运输", 27),
					new BarChartView.BarChartItemBean("渔业", 11),
					new BarChartView.BarChartItemBean("公共服务", 12), };
			barChartView.setItems(items);
		} catch (Exception e) {
			e.getStackTrace();
		}

	}
}
