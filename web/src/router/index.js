import {createRouter, createWebHashHistory} from 'vue-router'
import HomePage from "@/components/HomePage";
import SpecialMenu from "@/components/SpecialMenu";
import CurrencyView from "@/view/Data/Currency";
import CountryView from "@/view/Data/Country";
import ActualCashFlowView from "@/view/CashManagement/ActualCashFlow";
import MoneyMarketView from "@/view/Deal/MoneyMarketDeal";
import SettlementView from "@/view/Settlement/Settlement";
import UserManagementView from "@/view/User/UserManagement";

const router = createRouter({
    history: createWebHashHistory(),
    routes: [
        {
            path: '/home',
            component: HomePage
        },
        {
            path: '/demo',
            component: SpecialMenu
        },
        {
            path: '/:w+',
            component: HomePage
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
        },
        {
            path: '/cash-management',
            children: [
                {
                    path: "ac",
                    component: ActualCashFlowView
                },
            ]
        },
        {
            path: '/deal',
            children: [
                {
                    path: "mm",
                    component: MoneyMarketView
                },
            ]
        },
        {
            path: '/settlement',
            children: [
                {
                    path: "settlement",
                    component: SettlementView
                },
            ]
        },
        {
            path: '/user-management',
            children: [
                {
                    path: "user",
                    component: UserManagementView
                },
            ]
        },
        {
            path: '/:pathMatch(.*)',
            component: HomePage
        },
    ]
});

export default router;
