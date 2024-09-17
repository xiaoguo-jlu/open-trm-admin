<template>
    <div>
        <el-container>
            <el-header class="homeHeader">
                <div>
                    <h1>主页</h1>
                </div>
            </el-header>
            <el-container height="400px" width="400px">
                <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
                    <el-menu :default-openeds="['1', '3']">
                        <el-submenu index="1">
                            <el-menu-item-group>
                                <el-menu-item index="1-1">选项1</el-menu-item>
                                <el-menu-item index="1-2">选项2</el-menu-item>
                            </el-menu-item-group>
                            <el-menu-item-group title="分组2">
                                <el-menu-item index="1-3">选项3</el-menu-item>
                            </el-menu-item-group>
                            <el-submenu index="1-4">
                                <el-menu-item index="1-4-1">选项4-1</el-menu-item>
                            </el-submenu>
                        </el-submenu>
                    </el-menu>
                </el-aside>
            </el-container>
        </el-container>
    </div>
</template>

<script>
    export default {
        name: "HomePage",
        data() {
            return {}
        },
        components: {}
    }
</script>

<style scoped>
    .homeHeader {
        background-color: #2c3e50;
        display: flex;
        align-items: center;
        padding: 0px 15px;
        box-sizing: border-box;
    }
</style>