package geonui.Todays_Hot_Stock_Daily_Report.dto.header

/**
 * [한투 거래 API 이용 시 기본 헤더]
 */
data class AuthBaseHeader(
    val contentType: String = "application/json",
    val accept: String = "text/plain",
    val charset: String = "UTF-8",
    val userAgent: String = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36"
)

