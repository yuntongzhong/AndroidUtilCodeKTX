package luyao.util.ktx.ext

import android.util.Log

/**
 * Created by luyao
 * on 2019/7/3 15:37
 */

const val TAG = "ktx"

private enum class LEVEL {
    V, D, I, W, E
}

fun String.logV(tag: String = TAG) = log(LEVEL.V, tag, this)
fun String.logD(tag: String = TAG) = log(LEVEL.D, tag, this)
fun String.logI(tag: String = TAG) = log(LEVEL.I, tag, this)
fun String.logW(tag: String = TAG) = log(LEVEL.W, tag, this)
fun String.logE(tag: String = TAG) = log(LEVEL.E, tag, this)

private fun log(level: LEVEL, tag: String, message: String) {
    when (level) {
        LEVEL.V -> Log.v(tag, message)
        LEVEL.D -> Log.d(tag, message)
        LEVEL.I -> Log.i(tag, message)
        LEVEL.W -> Log.w(tag, message)
        LEVEL.E -> Log.e(tag, message)
    }
}