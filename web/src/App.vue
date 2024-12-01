<template>
    <div id="app">
        <el-container class="common-layout">
            <el-header id="header">
                <el-row>
                    <el-col :span="24" id="logo"><p></p></el-col>
                </el-row>
                <el-row>
                    <el-col :span="3" id="logo">Open TRM</el-col>
                    <el-col :span="2" class="menu">
                        <router-link to="/home">Home</router-link>
                    </el-col>
                    <el-col :span="2" class="menu">
                        Cash Management
                    </el-col>
                    <el-col :span="2" class="menu">
                        Deal
                    </el-col>
                    <el-col :span="2" class="menu">
                        Settlement
                    </el-col>
                    <el-col :span="2" class="menu">
                        Report
                    </el-col>
                    <el-col :span="2" class="menu">
                        Instrument
                    </el-col>
                    <el-col :span="2" class="menu">
                        Rule
                    </el-col>
                    <el-col :span="2" class="menu">
                        <router-link to="/static-data/currency">Data</router-link>
                    </el-col>
                    <el-col :span="2" class="menu">
                        Config
                    </el-col>
                    <el-col :span="3" class="User">
                        User
                    </el-col>
                </el-row>
            </el-header>
            <el-main id="main">
                <router-view/>
            </el-main>
            <el-footer id="footer">Footer</el-footer>
        </el-container>
    </div>
</template>

<script>

    export default {
        name: 'App',
        components: {}
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
