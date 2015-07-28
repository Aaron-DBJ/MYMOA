package com.uestc.mymoa.ui;

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
public class NewsContentActivity extends BaseActivity {
    @Override
    protected void initLayout() {
        Button backBtn01=(Button)findViewById(R.id.backButton01) ;
        TextView text01=(TextView)findViewById(R.id.realeseText);
        TextView text02=(TextView)findViewById(R.id.titleText03);
        TextView text03=(TextView)findViewById(R.id.authorText02);
        TextView text04=(TextView)findViewById(R.id.dateText02);
        TextView text05=(TextView)findViewById(R.id.commentText);
        ListView lv=(ListView)findViewById(R.id.commentList);

    }

    @Override
    protected void initListener() {
        ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String,Object>>();
        ListView lv=(ListView)this.findViewById(R.id.commentList);
        SimpleAdapter mSimpleAdapter = new SimpleAdapter
                (this,listItem, R.layout.layout_comment_item, new String[] {"commentorText","dateText03", "commentText01"},
                        new int[] {R.id.commentorText,R.id.dateText03,R.id.commentText01});
        lv.setAdapter(mSimpleAdapter);//ΪListView��������
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
                setTitle("�����˵�"+arg2+"������");//���ñ�������ʾ�������
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
            map.put("commentorText", "�ܱܽ�");
            map.put("dateText03","2015-07-28    20:58:33");
            map.put("commentText01", "�úúã�˵������ô�ã���������û������ô�������׵Ļ�������������");
            listItem.add(map);
        }
    }

    @Override
    protected int setRootView() {
        return R.layout.layout_content;
    }
}
