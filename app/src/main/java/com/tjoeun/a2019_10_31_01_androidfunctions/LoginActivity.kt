package com.tjoeun.a2019_10_31_01_androidfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    // 연습문제

    // 이름과 회원번호를 입력하고 로그인 버튼을 누르면
    // ex 10번 김민경 회원님 환영합니다. 라는 toast를 띄우자


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn.setOnClickListener {
            var userName = nameEdt.text.toString()
            var userNumber = memberNumEdt.text.toString()

            var userId = idEdt.text.toString()


            Toast.makeText(this, "${userNumber} 번 ${userName} 회원님 환영합니다.", Toast.LENGTH_SHORT)
                .show()

            var myIntent = Intent(this, MainActivity::class.java)
            myIntent.putExtra("name", userName)
            myIntent.putExtra("memberNumber", userNumber)
            myIntent.putExtra("memberId", userId)

            startActivity(myIntent)


        }

        signBtn.setOnClickListener {

            var myIntent = Intent(this, SignUp::class.java)
            startActivity(myIntent)
        }


    }
}


// 연습문제
// 회원가입 (signup) 화면을 만들고  배경을 초록색 (#00FF00) 으로만 설정하자
// 회원가입 버튼을 누르면 해당 엑티비티로 이동하도록


