package geonui.Todays_Hot_Stock_Daily_Report.dto.body

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component


@Component
data class AuthBody(
    @Value("\${spring.appkey}") val appkey: String,
    @Value("\${spring.appsecret}") val appsecret: String,
) {
    val grant_type: String = "client_credentials"
}
