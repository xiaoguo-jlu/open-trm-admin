<template>
    <div class="common-layout">
        <el-container>
            <el-container>
                <el-header>Open TRM</el-header>
                <el-main>Main</el-main>
            </el-container>
        </el-container>
    </div>
</template>

<script>
    export default {
        name: 'homePage',
        props: {
            msg: String
        }
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>


    .homeWelcome {
        text-align: center;
        font-size: 30px;
        font-family: 微软雅黑;
        color: #000000;
        padding-top: 50px;
    }

    .homeHeader {
        text-align: left;
        font-size: 30px;
        font-family: 微软雅黑;
        color: #000000;
        padding-top: 50px;
    }

    .homeHeader .title {
        font-size: 30px;
        font-family: 华文行楷;
        color: #ffffff;
    }

    .homeHeader .userInfo {
        cursor: pointer;
    }

    .el-dropdown-link img {
        width: 48px;
        height: 48px;
        border-radius: 24px;
        margin-left: 8px;
    }

</style>
