package geonui.Todays_Hot_Stock_Daily_Report.dto

import geonui.Todays_Hot_Stock_Daily_Report.dto.body.AuthBody
import org.assertj.core.api.Assertions

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles


@SpringBootTest(classes = [AuthBody::class])    // 클래스,함수,프로퍼티 참조
@ActiveProfiles("dev")
class AuthBodyTest {

    @Autowired
    private lateinit var authBody: AuthBody

    @Value("\${spring.appkey}")
    private lateinit var appKey: String

    @Test
    fun AuthBody_Binding_Success() {
        Assertions.assertThat(authBody.appkey).isEqualTo(appKey)
        Assertions.assertThat(authBody.grant_type).isEqualTo("client_credentials")
    }

}