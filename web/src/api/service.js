import axios from 'axios'
import { ElMessage, ElLoading } from 'element-plus'
const ConfigBaseURL = '/open-trm/services' //默认路径，这里也可以使用env来判断环境
let loadingInstance = null //这里是loading
// 使用create方法创建axios实例
export const Service = axios.create({
    timeout: 10000, // 请求超时时间
    baseURL: ConfigBaseURL,
    method: 'post',
    headers: {
        'Content-Type': 'application/json;charset=UTF-8'
    }
})

// 请求拦截器配置
Service.interceptors.request.use(config => {
    loadingInstance = ElLoading.service({
        lock: true,
        text: 'loading...'
    })
    console.log(loadingInstance);
    return config
})
// 响应拦截器配置
Service.interceptors.response.use(response => {
    loadingInstance.close()
    // console.log(response)
    return response.data
}, error => {
    console.log('request failed', error)
    const msg = error.Message !== undefined ? error.Message : ''
    ElMessage({
        message: 'error network' + msg,
        type: 'error',
        duration: 5 * 1000
    })
    loadingInstance.close()
    return Promise.reject(error)
})

