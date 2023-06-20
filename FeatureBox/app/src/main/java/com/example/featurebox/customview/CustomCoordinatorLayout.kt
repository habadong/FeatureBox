package com.example.featurebox.customview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.NestedScrollingParent

class CustomCoordinatorLayout(context: Context, attrs: AttributeSet) : CoordinatorLayout(context, attrs),
    NestedScrollingParent {
    // NestedScrollingParent 인터페이스의 메서드를 구현합니다.
    override fun onStartNestedScroll(child: View, target: View, nestedScrollAxes: Int): Boolean {
        // 스크롤이 시작되면 true를 반환하여 스크롤 이벤트를 받도록 합니다.
        return true
    }

    override fun onNestedScrollAccepted(child: View, target: View, nestedScrollAxes: Int) {
        // 스크롤이 시작될 때 호출됩니다.
    }

    override fun onNestedPreScroll(target: View, dx: Int, dy: Int, consumed: IntArray) {
        // 스크롤 전에 호출됩니다. 이곳에서 스크롤 전의 동작을 수행할 수 있습니다.
        // consumed 배열을 통해 자식 뷰에게 얼마나 스크롤을 소비했는지 전달할 수 있습니다.
    }

    override fun onNestedScroll(
        target: View, dxConsumed: Int, dyConsumed: Int, dxUnconsumed: Int, dyUnconsumed: Int
    ) {
        // 스크롤 중에 호출됩니다. 이곳에서 스크롤 중의 동작을 수행할 수 있습니다.
    }

    override fun onStopNestedScroll(target: View) {
        // 스크롤이 종료될 때 호출됩니다.
    }
}
