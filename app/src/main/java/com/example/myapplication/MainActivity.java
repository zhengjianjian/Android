package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final int FONT_10 = 0x111;
    final int FONT_16 = 0x112;
    final int FONT_20 = 0x113;

    //定义普通菜单的标识
    final int PLAIN_ITEM = 0x11b;
    //定义颜色菜单项的标识
    final int FONT_RED = 0x114;
    final int FONT_BLACK = 0x115;
    private EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = findViewById(R.id.aaa);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //------------像menu添加字体大小的子菜单----------
        SubMenu fontMenu = menu.addSubMenu("字体大小");
        fontMenu.setHeaderIcon(R.drawable.cat);
        fontMenu.setHeaderIcon(R.drawable.cat);
        fontMenu.setHeaderTitle("选择字体大小");
        fontMenu.add(0,FONT_10,0,"10号字体");
        fontMenu.add(0, FONT_16, 0, "16号字体");
        fontMenu.add(0, FONT_20, 0, "20号字体");
        //添加普通菜单项
        menu.add(0, PLAIN_ITEM, 0, "普通菜单项");
        //选择字体的颜色
        SubMenu colorMenu = menu.addSubMenu("字体颜色");
        colorMenu.setHeaderTitle("选择文字颜色");
        colorMenu.add(0, FONT_RED, 0, "红颜色");
        colorMenu.add(0, FONT_BLACK, 0, "黑颜色");
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem mi){
        switch (mi.getItemId())
        {
            case FONT_10: edit.setTextSize(10 * 2);	break;
            case FONT_16: edit.setTextSize(16 * 2); break;
            case FONT_20: edit.setTextSize(20 * 2); break;
            case FONT_RED: edit.setTextColor(Color.RED); break;
            case FONT_BLACK:edit.setTextColor(Color.BLACK); break;
            case PLAIN_ITEM:
                Toast toast = Toast.makeText(MainActivity.this, "您单击了普通菜单项", Toast.LENGTH_LONG);
                toast.show();
                break;
        }
        return true;
    }
}