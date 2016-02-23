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

	private static final String[] str_cooperateType = { "�����շ�", "��300��100",
			// "��7��", "��5��",
			"��8��" };
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
				// �����ȷ����
				if (v.equals(btn_ok)) {
					try {
						double totalPrices = 0d;
						double price = Double.parseDouble(edt_price.getText()
								.toString());
						double num = Double.parseDouble(edt_num.getText()
								.toString());

						/**** ����ģʽ��1�� Begin ****/
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
						/**** ����ģʽ��1�� End ****/

						/**** ����ģʽ��2�� Begin ****/
						// // ���ü򵥹���ģʽ��������ѡ���������Ӧ�Ķ���
						// CashSuper cSuper = CashFactory
						// .createCashAccpet(spn_cooperateType
						// .getSelectedItem().toString());
						// totalPrices = cSuper.acceptCash(price * num);
						/**** ����ģʽ��2�� End ****/

						/**** ����ģʽ��3�� Begin ****/
						CashContext cc = null;
						// ��������ѡ����Context���ò�ͬ���շ��㷨
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
						/**** ����ģʽ��3�� End ****/

						// �ۼ��շ�����
						total += totalPrices;
						// ���շ���ϸ��ʾ����
						txt_detail.append("���ۣ�" + edt_price.getText() + " ������"
								+ edt_num.getText() + " "
								+ spn_cooperateType.getSelectedItem() + " �ϼƣ�"
								+ df.format(totalPrices) + "\n");
						// ��ʾ�ܼ�
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
				} else if (v.equals(btn_reset)) {// ��������á�
					edt_price.setText("");
					edt_num.setText("");
					edt_price.requestFocus();
				}
			}
		};

		btn_ok.setOnClickListener(clickListener);
		btn_reset.setOnClickListener(clickListener);

		spn_cooperateType = (Spinner) findViewById(R.id.spinner_cooperate_type);
		// ����ѡ������ArrayAdapter��������
		adapter_cooperateType = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, str_cooperateType);
		// ���������б�ķ��
		adapter_cooperateType
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// ��adapter ��ӵ�spinner��
		spn_cooperateType.setAdapter(adapter_cooperateType);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
