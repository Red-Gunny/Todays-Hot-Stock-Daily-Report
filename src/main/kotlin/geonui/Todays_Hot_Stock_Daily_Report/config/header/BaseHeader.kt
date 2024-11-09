package geonui.Todays_Hot_Stock_Daily_Report.config.header

/**
 * [한투 거래 API 이용 시 기본 헤더]
 * "Content-Type": "application/json",
 *     "Accept": "text/plain",
 *     "charset": "UTF-8",
 *     'User-Agent': _cfg['my_agent']
 */
data class BaseHeader(val contentType: String,
    val accept: String,
    val charset: String,
    val userAgent: String)

