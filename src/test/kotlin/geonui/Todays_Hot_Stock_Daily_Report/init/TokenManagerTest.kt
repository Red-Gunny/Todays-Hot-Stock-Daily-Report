package geonui.Todays_Hot_Stock_Daily_Report.init

import geonui.Todays_Hot_Stock_Daily_Report.dto.body.AuthBody
import geonui.Todays_Hot_Stock_Daily_Report.dto.header.AuthBaseHeader
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.web.reactive.function.client.WebClient
import kotlin.test.Test


@SpringBootTest(classes = [TokenManager::class, AuthBody::class])
class TokenManagerTest {

    private val webClient = WebClient.create("https://openapivts.koreainvestment.com:29443")

    @Autowired
    private lateinit var tokenManager: TokenManager

    @Autowired
    private lateinit var authBody: AuthBody

    @Test
    fun normal_api_send_test() {

        val responseDto = webClient.post()
            .uri("/oauth2/tokenP")
            .headers { headers ->
                headers.set("Content-Type", AuthBaseHeader().contentType)
                headers.set("Accept", AuthBaseHeader().accept)
                headers.set("charset", AuthBaseHeader().charset)
                headers.set("User-Agent", AuthBaseHeader().userAgent)
            }
            .bodyValue(authBody)
            .retrieve()
            .bodyToMono(TokenResponseDto::class.java)
            .block()


        println(responseDto?.access_token)
        println(responseDto?.token_type)
        println(responseDto?.expires_in.toString())
        println(responseDto?.access_token_token_expired)



    }

}