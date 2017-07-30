package com.example.samsung.ttmintro;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by SAMSUNG on 2017-06-07.
 */

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);


        }
    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.postManage:
                Toast.makeText(getApplicationContext(),"관리할 게시물이 없습니다.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.modifyProfile:
                Toast.makeText(getApplicationContext(),"수정할 프로필정보가 없습니다.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.outMember:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);     // 여기서 this는 Activity의 this

                builder.setTitle("회원탈퇴")        // 제목 설정
                        .setMessage("정말로 회원탈퇴 하시겠습니까?")        // 메세지 설정
                        .setCancelable(false)        // 뒤로 버튼 클릭시 취소 가능 설정
                        .setPositiveButton("네", new DialogInterface.OnClickListener(){
                            // 확인 버튼 클릭시 설정
                            public void onClick(DialogInterface dialog, int whichButton){
                                Toast.makeText(getApplicationContext(),"회원 탈퇴 되었습니다.",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(SettingActivity.this, LoginActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("아니오", new DialogInterface.OnClickListener(){
                            // 취소 버튼 클릭시 설정
                            public void onClick(DialogInterface dialog, int whichButton){
                                dialog.cancel();
                            }
                        });

                AlertDialog dialog = builder.create();    // 알림창 객체 생성
                dialog.show();    // 알림창 띄우기

                break;
            case R.id.event:
                Toast.makeText(getApplicationContext(),"현재 진행중인 이벤트가 없습니다.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.notice:
//                Intent noticeIntent = new Intent(SettingActivity.this,  Notice.class);
//                startActivity(noticeIntent);
                break;
            case R.id.faq:
//                Intent faqIntent = new Intent(SettingActivity.this, Faq.class);
//                startActivity(faqIntent);
                break;
            case R.id.callCenter:
                String officeNum = "01077209831";
                String telOffice = "tel:" + officeNum;
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(telOffice)));
                break;

            case R.id.rule:
//                Intent useRuleIntent = new Intent(SettingActivity.this, UseRule.class);
//                startActivity(useRuleIntent);
                break;
            case R.id.dealInfo:
//                Intent personRuleIntent = new Intent(SettingActivity.this, PersonRule.class);
//                startActivity(personRuleIntent);
                break;

            default:
                break;
        }
    }
}
