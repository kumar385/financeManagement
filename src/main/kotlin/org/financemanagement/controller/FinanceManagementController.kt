package org.financemanagement.controller

import org.CreditInfo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Pradeep on 7/16/2017.
 */
@RestController
open class FinanceManagementController {

    @GetMapping("/getCreditInfo")
    fun verifyData(creditInfo: CreditInfo) : CreditInfo{
        return CreditInfo(success = "true")
    }
}


