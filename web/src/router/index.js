import {createRouter, createWebHistory} from 'vue-router'
import HomePage from "@/components/HomePage";
import HelloWorld from "@/components/HelloWorld";
import CurrencyView from "@/view/Data/Currency";
import CountryView from "@/view/Data/Country";

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/home',
            component: HomePage
        },
        {
            path: '/demo',
            component: HelloWorld
        },
        {
            path: '/static-data',
            children: [
                {
                    path: "currency",
                    component: CurrencyView
                },
                {
                    path: "country",
                    component: CountryView
                },
            ]
        }
    ]
});

export default router;
