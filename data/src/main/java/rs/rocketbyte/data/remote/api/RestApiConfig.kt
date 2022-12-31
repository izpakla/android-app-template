package rs.rocketbyte.data.remote.api

import android.content.Context
import rs.rocketbyte.template.data.R
import java.io.File

data class RestApiConfig(
    val baseUrl: String,
    val cacheDir: File
) {
    companion object {
        fun loadConfig(context: Context): RestApiConfig = RestApiConfig(
            context.getString(R.string.data_config_rest_api_base_url),
            context.cacheDir
        )
    }
}
