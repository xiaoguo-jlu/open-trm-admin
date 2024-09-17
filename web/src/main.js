import Vue from 'vue'
import App from './App.vue'
import router from './router'
import {
    Container,
    Aside,
    Header,
    Menu,
    MenuItem,
    Submenu,
    Button
} from 'element-ui'

Vue.use(Container)
Vue.use(Aside)
Vue.use(Header)
Vue.use(Button)
Vue.use(Menu)
Vue.use(MenuItem)
Vue.use(Submenu)

new Vue({
    router,
    render: h => h(App)
}).$mount('#app')