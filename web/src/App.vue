<template>
    <div id="app"  class="common-layout">
        <el-container>
            <el-aside width="200px">
                <el-menu
                        active-text-color="#ffd04b"
                        background-color="#545c64"
                        class="el-menu-vertical-demo"
                        default-active="2"
                        text-color="#fff"
                        :unique-opened="uniqueOpened"
                        @open="handleOpen"
                        @close="handleClose"
                >
                    <el-sub-menu v-for="(value, key, index) in menu" :key="index" :index="index">
                        <template #title>
                            <el-icon><icon-menu /></el-icon>
                            <span>{{ key }}</span>
                        </template>
                        <el-menu-item-group title="value">
                            <el-menu-item  v-for="(subValue) in value" :key = "subValue" @click="chooseMenu(subValue.path)">
                                {{ subValue.name }}
                            </el-menu-item>
                        </el-menu-item-group>
                    </el-sub-menu>
                </el-menu>
            </el-aside>
            <el-container>
                <el-header id="header">
                </el-header>
                <el-main>
                    <router-view />
                </el-main>
                <el-footer>Footer</el-footer>
            </el-container>
        </el-container>
    </div>
</template>

<script>

    import router from "./router";

    export default {
        name: 'App',
        components: {},
        data() {
            return {
                isCollapse: false,
                menuDisplayMode: 'horizontal',
                uniqueOpened: true,
                config: {
                    uniqueOpened: true,
                },
                "menu": {
                    "Cash Management":[
                        {"name": "ActualCashFlowView", "path": "/cash-management/ac"},
                    ],
                    "Deal": [
                        {"name": "MoneyMarketView", "path": "/deal/mm"},
                    ],
                    "Settlement": [
                        {"name": "SettlementView", "path": "/settlement/settlement"},
                    ],
                    "Report": [
                        {"name": "MoneyMarketView", "path": "/mm"},
                    ],
                    "Instrument": [
                        {"name": "MoneyMarketView", "path": "/mm"},
                    ],
                    "Rule": [
                        {"name": "MoneyMarketView", "path": "/mm"},
                    ],
                    "Data": [
                        {"name": "Currency", "path": "/static-data/currency"},
                        {"name": "Country", "path": "/static-data/country"},
                    ],
                    "Config": [
                        {"name": "MoneyMarketView", "path": "/mm"},
                    ],
                    "User": [
                        {"name": "MoneyMarketView", "path": "/mm"},
                    ],
                }
            }
        },
        methods: {
            chooseMenu(path) {
                router.push(path)
            }
        },
        computed: {},
        mounted(){
            window.addEventListener('hashchange',()=>{
                var currentPath = window.location.hash.slice(1); // 获取输入的路由
                if(this.$router.path !== currentPath){
                    this.$router.push(currentPath); // 动态跳转
                }
            },false);
        },
    }
</script>

<style>
    #logo {
        text-align: left;
    }

    #app {
        font-family: Avenir, Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
    }

    #header {
        margin-top: 0;
        border-top-width: 0;
        background-color: #67C23A;
    }

    #footer {
        background-color: #000000;
        color: white;
        text-align: center;
        alignment: center;
    }
</style>
