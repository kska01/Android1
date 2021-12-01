package com.example.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // 1. 일반적인 반복문 사용으로 열 번 반복하기
        for (index in 1..10) {
            Log.d("for", "현재 숫자는 ${index}")
        }
        // 2. 마지막 숫자 제외하기
        var array = arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
        for (index in 0 until array.size) {
            Log.d("For", "현재 월은 ${array.get(index)}입니다.")
        }
        // 3. 건너뛰기
        for (index in 0..10 step 3) {
            Log.d("For", "건너뛰기: ${index}")
        }
        // 4. 감소시키기
        for (index in 10 downTo 0) {
            Log.d("For", "감소시키기: ${index}")
        }
        // 4.1 건너뛰면서 감소시키기
        for (index in 10 downTo 0 step 3) {
            Log.d("For", "건너뛰면서 감소시키기: ${index}")
        }
        // 5.1 배열, 컬렉션 사용하기
        for (month in array) {
            Log.d("For", "현재 월은 ${month}입니다.")
        }

    // InheritanceAndExtension 프로젝트: 상속과 확장

        // 1. 부모 클래스 직접 호출하기
        var parent = Parent()
        parent.sayHello()
        // 2. 자식 클래스 호출해서 사용하기
        var child = Child()
        child.myHello()

        testStringExtension()
    }

    // String 익스텐션 테스트 하기
    fun testStringExtension() {
        var original = "Hello"
        var added = " Guys~"
        // plus 메서드를 사용해서 문자열을 더할 수 있다
        Log.d("Extension", "added를 더한 값은 ${original.plus(added)}입니다.")
    }
}

// 상속 연습
open class Parent {
    var hello: String = "안녕하세요."
    fun sayHello() {
        Log.d("Extension", "${hello}")
    }
}
class Child: Parent() {
    fun myHello() {
        hello = "Hello"
        sayHello()
    }
}
// 메서드 오버라이드 연습
open class BaseClass {
    open fun opened() {

    }
    fun notOpened() {

    }
}
class ChildClass: BaseClass() {
    override fun opened() {

    }
}
// 프로퍼티 오버라이드 연습
open class BaseClass2 {
    open var opened: String = "i am"
}
class ChildClass2: BaseClass2() {
    override var opened: String = "You are"
}
fun String.plus(word: String): String {
    return this + word
}