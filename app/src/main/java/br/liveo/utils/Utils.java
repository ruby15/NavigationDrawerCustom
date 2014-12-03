package br.liveo.utils;

import android.content.Context;
import br.liveo.navigationliveo.R;

public class Utils {

	//Set all the navigation icons and always to set "zero 0" for the item is a category
	public static int[] iconNavigation = new int[] { 

            R.drawable.ic_beam,
            0,
            0,
            0,
            R.drawable.ic_column,
            0,
            0,
            0,
            R.drawable.ic_wall2,
            0,
            0,
            R.drawable.ic_slab,
            0,
            0,
            R.drawable.ic_action_done,
            0};
	
	//get title of the item navigation
	public static String getTitleItem(Context context, int position){
		String[] title = context.getResources().getStringArray(R.array.nav_menu_items);
		return title[position];
	} 
	
}
