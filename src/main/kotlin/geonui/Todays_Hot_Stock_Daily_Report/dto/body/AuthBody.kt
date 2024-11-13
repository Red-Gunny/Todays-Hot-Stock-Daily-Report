package geonui.Todays_Hot_Stock_Daily_Report.dto.body

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

/**
 * Kotlin에서는 클래스의 생성자 파라미터에 val 또는 var 키워드를 붙이면
 * 해당 파라미터가 클래스의 프로퍼티로 선언된다.
 *
 * val 빼면 클래스 프로퍼티로 선언되지 않는다. 클래스 내 다른 메소드에서는 사용 불가.
 */
@Component
data class AuthBody(
    @Value("\${spring.appkey}") val appkey: String,
    @Value("\${spring.appsecret}") val appsecret: String,
) {
    private val grant_type: String = "client_credentials"
}
