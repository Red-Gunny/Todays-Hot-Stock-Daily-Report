package geonui.Todays_Hot_Stock_Daily_Report.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TempController {

    @GetMapping("/hello")
    fun heelo() = "Hello, World"

}