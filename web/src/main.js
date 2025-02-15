import { createApp } from 'vue'
import App from './App.vue'
import ElementPlus from 'element-plus'
import 'element-plus/theme-chalk/index.css'
import router from "@/router";
import axios from "axios";

const app = createApp(App);
app.use(ElementPlus);
app.use(router);
app.config.globalProperties.$axios = axios
app.mount('#app')

const debounce = (callback, delay) => {
    let tid = null
    return function () {
        const ctx = self
        tid && clearTimeout(tid);
        tid = setTimeout(() => {
            callback.apply(ctx, arguments)
        }, delay)
    }
}

export default () => {
    const _ResizeObserver = window.ResizeObserver;
    window.ResizeObserver = class ResizeObserver extends _ResizeObserver {
        constructor(callback) {
            callback = debounce(callback, 20)
            super(callback);
        }
    }
}