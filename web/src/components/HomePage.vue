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
                            @open="handleOpen"
                            @close="handleClose"
                    >
                        <el-sub-menu index="1">
                            <template #title>
                                <el-icon><icon-menu /></el-icon>
                                <span>Cash Management</span>
                            </template>
                            <el-menu-item-group title="Group One">
                                <el-menu-item index="1-1">item one</el-menu-item>
                                <el-menu-item index="1-2">item two</el-menu-item>
                            </el-menu-item-group>
                            <el-menu-item-group title="Group Two">
                                <el-menu-item index="1-3">item three</el-menu-item>
                            </el-menu-item-group>
                            <el-sub-menu index="1-4">
                                <template #title>item four</template>
                                <el-menu-item index="1-4-1">item one</el-menu-item>
                            </el-sub-menu>
                        </el-sub-menu>
                        <el-sub-menu index="2">
                            <template #title>
                                <el-icon><icon-menu /></el-icon>
                                <span>Data</span>
                            </template>
                            <el-menu-item-group title="Static Data">
                                <el-menu-item index="1-1" @click="chooseMenu('/static-data/currency')">
                                    Currency
                                </el-menu-item>
                                <el-menu-item index="1-2">Country</el-menu-item>
                            </el-menu-item-group>
                            <el-menu-item-group title="Group Two">
                                <el-menu-item index="1-3">item three</el-menu-item>
                            </el-menu-item-group>
                            <el-sub-menu index="1-4">
                                <template #title>item four</template>
                                <el-menu-item index="1-4-1">item one</el-menu-item>
                            </el-sub-menu>
                        </el-sub-menu>
                    </el-menu>
                </el-aside>
                <el-container>
                    <el-header id="header"></el-header>
                    <el-main>
                        <router-view />
                    </el-main>
                    <el-footer>Footer</el-footer>
                </el-container>
        </el-container>
    </div>

</template>

<script>
    import router from "../router";

    export default {
        name: 'homePage',
        props: {
            msg: String
        },
        data() {
            return {
                "menu": {
                    "Cash Management": {

                    },
                    "Deal": {

                    },
                    "Settlement": {

                    },
                    "Report": {

                    },
                    "Instrument": {

                    },
                    "Rule": {

                    },
                    "Data": [
                        {"name": "Currency", "path": "/currency"},
                        {"name": "Country", "path": "/country"},
                    ],
                    "Config": {

                    },
                    "User": {

                    },
                }
            }
        },
        methods: {
            chooseMenu(path) {
                router.push(path)
            }
        },
        computed: {},
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
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
