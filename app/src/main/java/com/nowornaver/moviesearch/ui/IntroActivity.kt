package com.nowornaver.moviesearch.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.nowornaver.moviesearch.R

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        startActivity()

    }

    private fun startActivity(){
        /* TODO Intro start 시 분기처리
            0. Intro 에서 넘어갈땐 5초 달레이
            1. 로그인이 돼어있는 경우 검색(메인)화면 (자동 로그인 기능구현)
            2. 로그인이 안 돼어있으면 로그인 화면으로 이동
        */
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 500L)
    }
}