package com.tjoeun.a2019_10_31_01_androidfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        intent에 첨부된 데이터를 찾아주는 코드

        var receivedName=intent.getStringExtra("name")
        var receivedNumber=intent.getStringExtra("memberNumber")
        var receivedId=intent.getStringExtra("memberId")

        memberNumTxt.text="${receivedNumber}번 회원"
        memberNameTxt.text="${receivedName}(${receivedId})"


    }
}
