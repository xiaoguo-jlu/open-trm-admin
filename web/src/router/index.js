import {createRouter, createWebHistory} from 'vue-router'
import HomePage from "@/components/HomePage";
import SpecialMenu from "@/components/SpecialMenu";
import CurrencyView from "@/view/Data/Currency";
import CountryView from "@/view/Data/Country";
import ActualCashFlowView from "@/view/CashManagement/ActualCashFlow";
import MoneyMarketView from "@/view/Deal/MoneyMarketDeal";
import SettlementView from "@/view/Settlement/Settlement";

const router = createRouter({
    history: createWebHistory(),
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
    ]
});

export default router;
