/*
   Copyright [2011] [Chris McClanahan]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.fptd.sensorlogger;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SensorLogger extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		final ArrayList<String> list = new ArrayList<String>();
		list.add("SensorLogger");
		list.add("Settings");
		this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));

	}

	@Override
	protected void onListItemClick(final ListView l, final View v, final int position, final long id) {
		switch (position) {

			// main application screen
		case 0:
			this.startActivity(new Intent(this, Sensors.class));
			break;

			// setting screen
		case 1:
			this.startActivity(new Intent(this, Settings.class));
			break;
		}
	}

}
