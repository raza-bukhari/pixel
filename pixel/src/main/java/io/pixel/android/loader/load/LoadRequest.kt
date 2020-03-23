package io.pixel.pixel.loader.load

import kotlinx.coroutines.Job

internal data class LoadRequest(val task: Job) {
    fun cancel() = task.cancel()
}