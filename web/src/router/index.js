import {createRouter, createMemoryHistory} from 'vue-router'
import HomePage from "@/components/HomePage";
import HelloWorld from "@/components/HelloWorld";
import CurrencyView from "@/view/Data/Currency";

const router = createRouter({
    history: createMemoryHistory(),
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
            path: '/static-data/currency',
            component: CurrencyView
        }
    ]
});

export default router;
