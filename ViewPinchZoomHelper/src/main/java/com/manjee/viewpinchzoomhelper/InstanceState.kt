package com.manjee.viewpinchzoomhelper

internal object InstanceState {
    private var helper: ZoomHelper? = null

    fun getZoomHelper(): ZoomHelper {
        if (helper == null) helper = ZoomHelper()
        return helper!!
    }

    fun release() {
        helper = null
    }
}