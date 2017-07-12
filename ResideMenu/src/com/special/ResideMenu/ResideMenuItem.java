package com.special.ResideMenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * 锟洁滑锟斤拷锟叫的讹拷态menu
 *
 * @author 123
 *
 */
public class ResideMenuItem extends LinearLayout {

    /** menu item icon */
    private ImageView iv_icon;

    /** menu item title */
    private TextView tv_title;
    private TextView tv_count;
    private RelativeLayout re;
    private LinearLayout li, li2;
    private TextView user_name;

    public ResideMenuItem(Context context) {
        super(context);
        initViews(context);
    }

    public ResideMenuItem(Context context, int icon, String title) {
        super(context);
        initViews(context);
        if (icon == R.drawable.setting_head) {
            li.setVisibility(View.VISIBLE);
            re.setVisibility(View.GONE);
            user_name.setText(title);


        } else {
            iv_icon.setImageResource(icon);
            tv_title.setText(title);

        }
    }

    public ResideMenuItem(Context context, String title, String count) {
        super(context);
        initViews(context);
        System.out.println(title + count);
        tv_title.setText(title);
        tv_count.setText(count);
        // iv_icon.setImageResource(icon);

    }

    public ResideMenuItem(Context context, String title) {
        super(context);
        initViews(context);
        System.out.println(title);
        tv_title.setText(title);
        // iv_icon.setImageResource(icon);

    }

    private void initViews(Context context) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.residemenu_item, this);
        iv_icon = (ImageView) findViewById(R.id.iv_icon);
        tv_title = (TextView) findViewById(R.id.title);
        tv_count = (TextView) findViewById(R.id.count);
        re = (RelativeLayout) findViewById(R.id.re1);
        li = (LinearLayout) findViewById(R.id.li1);
        user_name = (TextView) findViewById(R.id.person_name);
    }

    /**
     * set the icon color;
     *
     * @param icon
     */
    // public void setIcon(int icon){
    // iv_icon.setImageResource(icon);
    // }

    /**
     * set the title with resource ;
     *
     * @param title
     */
    // public void setTitle(int title){
    // tv_title.setText(title+"");
    // }

    /**
     * set the title with string;
     *
     * @param title
     */
    public void setTitle(String title) {
        tv_title.setText(title);
    }

    public void setCount(String count) {
        tv_count.setText(count);

    }

}
