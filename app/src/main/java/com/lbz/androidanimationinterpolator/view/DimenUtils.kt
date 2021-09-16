package com.lbz.androidanimationinterpolator.view

import android.content.Context

/**
 * @author: laibinzhi
 * @date: 2021-09-16 12:35
 */
object DimenUtils {
    fun dp2px(context: Context, dp: Float): Float = dp * context.resources.displayMetrics.density
    fun px2dp(context: Context, px: Float): Float = px / context.resources.displayMetrics.density
}