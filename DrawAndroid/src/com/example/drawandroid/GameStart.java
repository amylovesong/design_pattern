package com.example.drawandroid;

import android.app.Activity;
import android.os.Bundle;

public class GameStart extends Activity {

	private GameView mGameView = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.mGameView = new GameView(this);
		setContentView(mGameView);
	}
}