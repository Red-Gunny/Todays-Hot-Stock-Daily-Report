package geonui.Todays_Hot_Stock_Daily_Report.init

import geonui.Todays_Hot_Stock_Daily_Report.dto.header.AuthBaseHeader
import org.springframework.web.reactive.function.client.WebClient



class TokenManager {


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
            .baseUrl("")
            .build()

        // 베이스 헤더
        val authBaseHeader = AuthBaseHeader()



        // API 호출
        webClient.get().uri("/oauth2/tokenP")

    }

}