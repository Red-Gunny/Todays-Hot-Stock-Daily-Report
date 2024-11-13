package geonui.Todays_Hot_Stock_Daily_Report.dto

import geonui.Todays_Hot_Stock_Daily_Report.dto.body.AuthBody
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.context.annotation.Import
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig
import kotlin.test.assertNotNull


@ContextConfiguration(classes = [AuthBody::class])
@ActiveProfiles("dev")
class AuthBodyTest {


    @Autowired
    private lateinit var authBody: AuthBody

    @Test
    fun AuthBody_Binding_Success() {
        assertNotNull(authBody.appkey)


    }

}