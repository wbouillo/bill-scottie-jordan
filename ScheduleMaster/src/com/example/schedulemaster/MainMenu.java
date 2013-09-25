package com.example.schedulemaster;


import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;

public class MainMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

	// Just a simple popup for now, will need to be New Event Item Wizard
	public void CreateNewEventItem(View view)
	{
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
		
		alertDialogBuilder
			.setTitle("Temporary Message")
			.setMessage("Insert New Event Item Wizard fragment here.")
			.setCancelable(false)
			.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					// If this button is closed, close the dialog
					dialog.cancel();
				}
			  });

		AlertDialog alertDialog = alertDialogBuilder.create();
		alertDialog.show();
	}
}
