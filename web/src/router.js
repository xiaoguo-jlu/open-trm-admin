import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/HomePage.vue'
import HelloWorld from "@/components/HelloWorld";

Vue.use(Router)

export default new Router({
    routes: [
        {
            path: '/home',
            name: 'Home',
            component: Home,
            hidden: true,
            meta: {
                roles: ['admin', 'user']
            },
            children: [
                {
                    path: '/hello',
                    name: '在线聊天',
                    component: HelloWorld,
                    hidden: true
                }
            ]
        }, {
            path: '*',
            redirect: '/home'
        }
    ]
})