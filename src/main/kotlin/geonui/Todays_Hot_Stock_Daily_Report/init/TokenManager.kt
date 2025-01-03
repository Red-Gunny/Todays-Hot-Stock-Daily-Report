package geonui.Todays_Hot_Stock_Daily_Report.init

import geonui.Todays_Hot_Stock_Daily_Report.dto.body.AuthBody
import geonui.Todays_Hot_Stock_Daily_Report.dto.header.AuthBaseHeader
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient


@Configuration
class TokenManager {

    @Autowired
    private lateinit var authBody: AuthBody


    /**
     *
     * [토큰을 하나 받아온다]
     * 헤더는 BaseHeader에 있는 부분
     *
     * body는  appkey :
     *         appsecret :
     *         grant_type : "client_credentials"
     *
     */
    fun getToken() {


        // WebClient 생성
        val webClient = WebClient.builder()
            .baseUrl("https://openapivts.koreainvestment.com:29443")
            .build()

        // API 호출
        webClient
            .post()
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
            .subscribe {
                response -> println(response)
            }

    }

}