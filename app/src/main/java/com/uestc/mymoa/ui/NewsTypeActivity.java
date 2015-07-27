package com.uestc.mymoa.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.uestc.mymoa.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by DBJ_MAC on 2015/7/27.
 */
public class NewsTypeActivity extends BaseActivity {
    @Override
    protected void initLayout() {
        Button btn=(Button)this.findViewById(R.id.backButton);
        ListView lv=(ListView)this.findViewById(R.id.newsList);
        TextView nt=(TextView)this.findViewById(R.id.newsText);
    }

    @Override
    protected void initListener() {
        //��Ҫ�󶨵�����
        //ÿһ�еĲ���//��̬�����е�����Դ�ļ���Ӧ�����岼�ֵ�View��new
        ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String,Object>>();
        ListView lv=(ListView)this.findViewById(R.id.newsList);
        SimpleAdapter mSimpleAdapter = new SimpleAdapter
                (this,listItem, R.layout.layout_item, new String[] {"titleText01","managerText01", "dateText01","item_Image"},
        new int[] {R.id.titleText01,R.id.managerText01,R.id.dateText01,R.id.item_Image});
    lv.setAdapter(mSimpleAdapter);//ΪListView��������
    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
        long arg3) {
            setTitle("�����˵�"+arg2+"��");//���ñ�������ʾ�������
        }
    });
    }

    @Override
    protected void initValue() {
        /*�������д������*/
        ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String,Object>>();
        for(int i=0;i<10;i++)
        {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("titleText01", "��"+i+"��");
            map.put("item_Image", R.mipmap.ic_launcher);//����ͼƬ
            map.put("managerText01","����");
            map.put("dateText", "2015-07-28 16:13:25");
            listItem.add(map);
        }
    }

    @Override
    protected int setRootView() {
        return R.layout.layout_listview;
    }
}
