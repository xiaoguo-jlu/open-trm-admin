<template>
    <div id="app" clas>
        <el-container class="common-layout">
            <el-header id="header">
                <el-row>
                    <el-col :span="24" id="logo"><p></p></el-col>
                </el-row>
                <el-row>
                    <el-col :span="3" id="logo">Open TRM</el-col>
                    <el-menu>
                        <el-col :span="2" class="menu">Home</el-col>
                        <el-col :span="2" class="menu">Cash Management</el-col>
                        <el-col :span="2" class="menu">Deal</el-col>
                        <el-col :span="2" class="menu">Settlement</el-col>
                        <el-col :span="2" class="menu">Report</el-col>
                        <el-col :span="2" class="menu">Instrument</el-col>
                        <el-col :span="2" class="menu">Rule</el-col>
                        <el-col :span="2" class="menu">Data</el-col>
                        <el-col :span="2" class="menu">Config</el-col>
                        <el-col :span="3" class="User">User</el-col>
                    </el-menu>
                </el-row>
            </el-header>
            <el-main id="main">Main</el-main>
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
    #app {
        font-family: Avenir, Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
    }

    #header {
        background-color: #67C23A;
    }

    #footer {
        background-color: #000000;
        color: white;
    }
</style>
