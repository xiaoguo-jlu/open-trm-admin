import {Service} from "@/api/service";

export function getList(param) {
    return Service({
        method:'post',
        url:'/static-data/currency/findAll',
        param: param,
    })
}

export function getPagedResult(param, pageParam) {
    return Service({
        method:'post',
        url:'/static-data/currency/findPagedResult',
        param: {
            "queryParam": param,
            "pageParam": pageParam,
        },
    })
}