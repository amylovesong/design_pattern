package com.strategy.example;

import java.text.DecimalFormat;

import com.example.strategy.R;
import com.strategy.standard.CashContext;
import com.strategy.sun.CashFactory;
import com.strategy.sun.CashNormal;
import com.strategy.sun.CashRebate;
import com.strategy.sun.CashReturn;
import com.strategy.sun.CashSuper;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
	private double total = 0.0d;

	private Button btn_ok;
	private Button btn_reset;

	private EditText edt_price;
	private EditText edt_num;

	private TextView txt_detail;
	private TextView txt_total;

	private static final String[] str_cooperateType = { "正常收费", "满300返100",
			// "打7折", "打5折",
			"打8折" };
	private Spinner spn_cooperateType;
	private ArrayAdapter<String> adapter_cooperateType;
	private float rebate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btn_ok = (Button) findViewById(R.id.btn_ok);
		btn_reset = (Button) findViewById(R.id.btn_reset);
		edt_price = (EditText) findViewById(R.id.edt_price);
		edt_num = (EditText) findViewById(R.id.edt_num);
		txt_detail = (TextView) findViewById(R.id.txt_detail);
		txt_total = (TextView) findViewById(R.id.txt_total);
		final DecimalFormat df = new DecimalFormat(".00");

		OnClickListener clickListener = new OnClickListener() {

			@Override
			public void onClick(View v) {
				// 点击“确定”
				if (v.equals(btn_ok)) {
					try {
						double totalPrices = 0d;
						double price = Double.parseDouble(edt_price.getText()
								.toString());
						double num = Double.parseDouble(edt_num.getText()
								.toString());

						/**** 策略模式第1版 Begin ****/
						// switch (spn_cooperateType.getSelectedItemPosition())
						// {
						// case 0:
						// rebate = 1;
						// break;
						// case 1:
						// rebate = 0.8f;
						// break;
						// case 2:
						// rebate = 0.7f;
						// break;
						// case 3:
						// rebate = 0.5f;
						// break;
						//
						// default:
						// break;
						// }
						// totalPrices = price * num * rebate;
						/**** 策略模式第1版 End ****/

						/**** 策略模式第2版 Begin ****/
						// // 利用简单工厂模式根据下拉选择框，生成相应的对象
						// CashSuper cSuper = CashFactory
						// .createCashAccpet(spn_cooperateType
						// .getSelectedItem().toString());
						// totalPrices = cSuper.acceptCash(price * num);
						/**** 策略模式第2版 End ****/

						/**** 策略模式第3版 Begin ****/
						CashContext cc = null;
						// 根据下拉选择框给Context配置不同的收费算法
						switch (spn_cooperateType.getSelectedItemPosition()) {
						case 0:
							cc = new CashContext(new CashNormal());
							break;
						case 1:
							cc = new CashContext(new CashReturn("300", "100"));
							break;
						case 2:
							cc = new CashContext(new CashRebate("0.8"));
							break;

						default:
							break;
						}
						totalPrices = cc.getResult(price * num);
						/**** 策略模式第3版 End ****/

						// 累计收费总数
						total += totalPrices;
						// 将收费明细显示出来
						txt_detail.append("单价：" + edt_price.getText() + " 数量："
								+ edt_num.getText() + " "
								+ spn_cooperateType.getSelectedItem() + " 合计："
								+ df.format(totalPrices) + "\n");
						// 显示总计
						txt_total.setText(df.format(total) + "");
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (NullPointerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (v.equals(btn_reset)) {// 点击“重置”
					edt_price.setText("");
					edt_num.setText("");
					edt_price.requestFocus();
				}
			}
		};

		btn_ok.setOnClickListener(clickListener);
		btn_reset.setOnClickListener(clickListener);

		spn_cooperateType = (Spinner) findViewById(R.id.spinner_cooperate_type);
		// 将可选内容与ArrayAdapter连接起来
		adapter_cooperateType = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, str_cooperateType);
		// 设置下拉列表的风格
		adapter_cooperateType
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// 将adapter 添加到spinner中
		spn_cooperateType.setAdapter(adapter_cooperateType);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
