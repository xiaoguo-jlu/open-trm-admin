import {createRouter, createMemoryHistory} from 'vue-router'
import HomePage from "@/components/HomePage";
import HelloWorld from "@/components/HelloWorld";

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
    ]
});

export default router;
