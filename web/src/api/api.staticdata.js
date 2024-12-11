import {Service} from "@/api/service";

export function getCurrencyList(param) {
    return Service({
        method:'get',
        url:'/static-data/currency/getAll',
        param: param,
    })
}